package voador;

public class Drone implements Voador {

    private String tipo;

    public Drone(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }

    @Override
    public double voar() {
        System.out.println("Voa drone");
        return 0;
    }

    @Override
    public void planar() {
        System.out.println("Plana drone");
    }

    @Override
    public boolean pousar() {
        System.out.println("Pousa drone");
        return true;
    }
}
