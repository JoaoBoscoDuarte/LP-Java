package atv.turismo.src.compras;

public class PasseioDeLancha implements VendaDeTurismoIF {
    private int numeroDePessoas = 0;
    private int qtdeDeHoras = 0;
    public final double PRECO_POR_PESSOA = 60;

    public PasseioDeLancha(int qtdeDeHoras, int numeroDePessoas) {
        this.numeroDePessoas = numeroDePessoas;
        this.qtdeDeHoras = qtdeDeHoras;
    }

    public int getNumeroDePessoas() {
        return numeroDePessoas;
    }

    public void setNumeroDePessoas(int novaQtde) {
         if (numeroDePessoas < 1) {
            throw new IllegalArgumentException("Deve ter no mínimo 1 pessoa!");
        }
        
        this.numeroDePessoas = novaQtde;
    }

    public int getQtdeDeHoras() {
        return qtdeDeHoras;
    }

    public void setQtdeDeHoras(int novaQtde) {
        if (qtdeDeHoras < 1 && qtdeDeHoras > 10) {
            throw new IllegalArgumentException("O tempo deve ser no mínimo 1 hora e no máximo 10h!");
        }
        
        this.qtdeDeHoras = novaQtde;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(numeroDePessoas) + Integer.hashCode(qtdeDeHoras);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass != obj.getClass()) return false;
        PasseioDeLancha that = (PasseioDeLancha) obj;
        return numeroDePessoas == that.numeroDePessoas && qtdeDeHoras == that.qtdeDeHoras;
    }

    @Override
    public double getPreco() {
        return numeroDePessoas * qtdeDeHoras * PRECO_POR_PESSOA;
    }

    @Override
    public String getDescricao() {
        return "Número de pessoas na viagem: " + numeroDePessoas + "\n" +
                "Preço da viagem: " + getPreco() + "/n";
    }

    @Override
    public int compareTo(VendaDeTurismoIF o) {
        return Double.compare(this.getPreco(), o.getPreco());
    }
}
