package atv.transportes.src;

public class Helicoptero implements Voadores {
    private final int CAPACIDADE_MAXIMA;
    private final int KM_POR_LITRO;
    private int gasolinaLitros;

    public Helicoptero(int CAPACIDADE_MAXIMA, int KM_POR_LITRO, int gasolinaLitros) {
        this.CAPACIDADE_MAXIMA = CAPACIDADE_MAXIMA;
        this.KM_POR_LITRO = KM_POR_LITRO;
        this.gasolinaLitros = gasolinaLitros;
    }

    public void voar() {
        System.out.println("Voando");
    }

    public void planar() {
        System.out.println("Planando");
    }

    public void decolar() {
        System.out.println("Decolando");
    }

    public void pousar() {
        System.out.println("Pousar");
    }
}
