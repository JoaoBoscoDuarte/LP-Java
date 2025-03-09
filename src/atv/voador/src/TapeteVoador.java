package atv.voador.src;

public class TapeteVoador implements Voador{
    private String corDotapete;

    public TapeteVoador(String corDotapete) {
        this.corDotapete = corDotapete;
    }

    public String getCorDotapete() {
        return corDotapete;
    }

    public void setCorDotapete(String corDotapete) {
        this.corDotapete = corDotapete;
    }

    public void chamaAladin() {
        System.out.println("Aladin acabou de ser chamado para o tapete");
    }

    @Override
    public double voar() {
        System.out.println("Voa tapete!");
        return 0;
    }

    @Override
    public void planar() {
        System.out.println("Tapete voador está planando");
    }

    @Override
    public boolean pousar() {
        System.out.println("Pousa tepete voador");
        return true;
    }
}
