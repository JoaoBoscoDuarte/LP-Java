package atv.transportes.src;

public class Moto implements Veiculo {
    private final int CAPACIDADE_MAXIMA;
    private final int KM_POR_LITRO;
    private int gasolinaLitros;
    private boolean motoLigada = false;
    private boolean colocarCapacete = false;
    private boolean girarChave = false;

    public Moto(int CAPACIDADE_MAXIMA, int KM_POR_LITRO, int gasolinaLitros) {
        this.CAPACIDADE_MAXIMA = CAPACIDADE_MAXIMA;
        this.KM_POR_LITRO = KM_POR_LITRO;
        this.gasolinaLitros = gasolinaLitros;
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
        this.gasolinaLitros += litros;
        System.out.println("Abastecendo carro");
    }

    public void ligarMoto() {
        this.motoLigada = true;
        System.out.println("Ligando a moto");
    }

    public void colocarCintoMotorista() {
        this.colocarCapacete = true;
        System.out.println("Colocando Capacete");
    }

    public void girarChave() {
        this.girarChave = true;
        System.out.println("Girando a chave para a partida");
    }

    public void andar() {
        if (!motoLigada) {
            throw new IllegalArgumentException("Ligue a moto para andar");
        }

        if (gasolinaLitros == 0) {
            throw new IllegalArgumentException("Sem gasolina no tanque para andar");
        }

        if (!girarChave) {
            throw new IllegalArgumentException("Gire a chave da moto para prosseguir");
        }

        if (colocarCapacete) {
            double quantoAndou = gasolinaLitros * KM_POR_LITRO;
            System.out.println("A moto andou " + quantoAndou + "km");

        } else {
            throw new IllegalArgumentException("Coloque o capacete para andar");
        }

    }

    @Override
    public String toString() {
        return "Moto: " + "\n" +
                "\tCapacidade máxima: " + CAPACIDADE_MAXIMA + "\n" +
                "\tKm por litros: " + KM_POR_LITRO + "\n" +
                "\tGasolina: " + gasolinaLitros + "\n" +
                "\tLigada: " + motoLigada + "\n" +
                "\tCapacete colocado: " + colocarCapacete + "\n" +
                "\tChave girada:" + girarChave + "\n";
    }
}
