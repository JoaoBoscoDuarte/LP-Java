package atv.turismo.src.compras;

public class PasseioDeLancha implements VendaDeTurismoIF {
    private int numeroDePessoas = 0;
    private int qtdeDeHoras = 0;
    public final double PRECO_POR_PESSOA = 60;

    public int getNumeroDePessoas() {
        return numeroDePessoas;
    }

    public void setNumeroDePessoas(int novaQtde) {
        this.numeroDePessoas = novaQtde;
    }

    public int getQtdeDeHoras() {
        return qtdeDeHoras;
    }

    public void setQtdeDeHoras(int novaQtde) {
        this.qtdeDeHoras = novaQtde;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public double getPreco() {
        return numeroDePessoas * qtdeDeHoras * PRECO_POR_PESSOA;
    }

    public String getDescricao() {
        return "Número de pessoas na viagem: " + numeroDePessoas + "\n" +
                "Preço da viagem: " + getPreco() + "/n";
    }
}
