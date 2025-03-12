package atv.transportes.src;

public class Drone implements Voadores {

    private String modelo;
    private String velocidade;

    public Drone(String modelo, String velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public void voar() {
        System.out.println("O drone do tipo: " + modelo + " de velocidade: " + velocidade + " está voando");
    }

    public void planar() {
        System.out.println("Drone está planando");
    }

    public void decolar() {
        System.out.println("O drone está decolando");
    }

    public void pousar() {
        System.out.println("o drone pousou");
    }
}
