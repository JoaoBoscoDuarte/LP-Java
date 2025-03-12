package atv.transportes.src;

public class Carro implements Veiculo {
    private final int CAPACIDADE_MAXIMA;
    private final int KM_POR_LITRO;
    private int gasolinaLitros;

    private boolean carroLigado = false;
    private boolean colocarCintoMotorista = false;
    private boolean abaixarFreioDeMao = false;

    public Carro(int gasolinaLitros, int CAPACIDADE_MAXIMA, int KM_POR_LITRO) {
        if (gasolinaLitros <= 0) {
            throw new IllegalArgumentException("A quantidade de gasolina não pode ser negativa ou nula");
        }

        if (CAPACIDADE_MAXIMA < gasolinaLitros || CAPACIDADE_MAXIMA == 0) {
            throw new IllegalArgumentException("A capacidade máxima não pode ser nula ou menor que a quantidade de gasolina");
        }

        if (KM_POR_LITRO <= 0) {
            throw new IllegalArgumentException("A qunatidade km por litro não pode ser nula ou negativa");
        }

        this.gasolinaLitros = gasolinaLitros;
        this.CAPACIDADE_MAXIMA = CAPACIDADE_MAXIMA;
        this.KM_POR_LITRO = KM_POR_LITRO;
    }

    public int getCAPACIDADE_MAXIMA() {
        return CAPACIDADE_MAXIMA;
    }

    public int getKM_POR_LITRO() {
        return KM_POR_LITRO;
    }

    public int getGasolinaLitros() {
        return gasolinaLitros;
    }

    public void setGasolinaLitros(int gasolinaLitros) {
        this.gasolinaLitros = gasolinaLitros;
    }

    public void abastecer(int litros) {

        if (this.gasolinaLitros + gasolinaLitros > CAPACIDADE_MAXIMA) {
            throw new IllegalArgumentException("A quantidade informada excede o limite do tanque");
        }

        if (litros <= 0) {
            throw new IllegalArgumentException("A quantidade de litros não pode ser nula ou menor que zero");
        }

        this.gasolinaLitros += litros;
        System.out.println("Abastecendo carro");
    }

    public void ligarCarro() {
        this.carroLigado = true;
        System.out.println("Ligando o carro");
    }

    public void colocarCintoMotorista() {
        this.colocarCintoMotorista = true;
        System.out.println("Colocando Cinto de motorista");
    }

    public void abaixarFreioDeMao() {
        this.abaixarFreioDeMao = true;
        System.out.println("Abaixando freio de mão");
    }

    public void andar() {
        if (carroLigado != true) {
            throw new IllegalArgumentException("Ligue o carro para andar");
        }

        if (gasolinaLitros == 0) {
            throw new IllegalArgumentException("Sem gasolina no tanque para andar");
        }

        if (abaixarFreioDeMao != true) {
            throw new IllegalArgumentException("Abaixe o freio de mão para andar");
        }

        if (colocarCintoMotorista != true) {
            throw new IllegalArgumentException("Coloque o cinto para andar");
        }

        double quantoAndou = gasolinaLitros * KM_POR_LITRO;
        System.out.println("O carro andou " + quantoAndou + "km");
    }

    @Override
    public String toString() {
        return "Carro: \n" +
                "\tCapacidade máxima: " + CAPACIDADE_MAXIMA + "\n" +
                "\tKm por litro: " + KM_POR_LITRO + "\n" +
                "\tGasolina litros: " + gasolinaLitros + "\n" +
                "\tLigado: " + carroLigado + "\n" +
                "\tCinto de motorista: " + colocarCintoMotorista + "\n" +
                "\tFreio de mão baixo: " + abaixarFreioDeMao + "\n";
    }
}
