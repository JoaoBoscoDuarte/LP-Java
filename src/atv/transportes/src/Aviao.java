package atv.transportes.src;

import java.util.ArrayList;
import java.util.List;

public class Aviao implements Veiculo, Voadores {

    private boolean tremDePouso = true;
    private String sinalTorre;
    private double gasolinaLitros = 0;
    private double capacidadeMaximaGasolina = 0;
    private double gastoPorLitro = 0;
    private boolean decolou = false;
    private boolean planar = false;

    public Aviao(boolean tremDePouso, String sinalTorre, double gasolinaLitros, double capacidadeMaximaGasolina, double gastoPorLitro) {
        this.tremDePouso = tremDePouso;
        this.sinalTorre = sinalTorre;
        this.gasolinaLitros = gasolinaLitros;
        this.capacidadeMaximaGasolina = capacidadeMaximaGasolina;
        this.gastoPorLitro = gastoPorLitro;
    }

    public double getGastoPorLitro() {
        return gastoPorLitro;
    }

    public void setGastoPorLitro(double gastoPorLitro) {
        this.gastoPorLitro = gastoPorLitro;
    }

    public double getCapacidadeMaximaGasolina() {
        return capacidadeMaximaGasolina;
    }

    public void setCapacidadeMaximaGasolina(double capacidadeMaximaGasolina) {
        this.capacidadeMaximaGasolina = capacidadeMaximaGasolina;
    }

    public boolean isTremDePouso() {
        return tremDePouso;
    }

    public void setTremDePouso(boolean tremDePouso) {
        this.tremDePouso = tremDePouso;
    }

    public String getSinalTorre() {
        return sinalTorre;
    }

    public void setSinalTorre(String sinalTorre) {
        this.sinalTorre = sinalTorre;
    }

    public double getGasolinaLitros() {
        return gasolinaLitros;
    }

    public void setGasolinaLitros(double gasolinaLitros) {
        this.gasolinaLitros = gasolinaLitros;
    }

    @Override
    public void andar() throws Exception {

        List<String> sinaisDeTorrePermitidos = new ArrayList<>();
        sinaisDeTorrePermitidos.add("Pista livre");
        sinaisDeTorrePermitidos.add("Ok");

        if(!tremDePouso)
            throw new Exception("O trem de pouso precisa estar ativado para que o avião possa andar");

        if(gasolinaLitros < capacidadeMaximaGasolina/2)
            throw new Exception("O avião não tem gasolina suficiente para andar");

        if(!sinaisDeTorrePermitidos.contains(sinalTorre))
            throw new Exception("A torre não deu permissão para que o avião possa andar");

        setGasolinaLitros(getGasolinaLitros() - gastoPorLitro);
    }

    @Override
    public void voar() {

        if (tremDePouso) {
            throw new IllegalArgumentException("O trem de pouso precisa estar desativado para que o avião possa voar");
        }

        //se a quantidade de gasolina não estive em pelo menos 80% do tanque, o avião não pode voar
        if (!(gasolinaLitros > (0.8 * capacidadeMaximaGasolina))) {
            throw new IllegalArgumentException("O avião não tem gasolina suficiente para voar");
        }

        if (!decolou) {
            throw new IllegalArgumentException("O avião ainda não pode decolar");
        }

        gasolinaLitros = 0;
        double valor = gasolinaLitros * gasolinaLitros;
        System.out.println("O Avião está voando");
        System.out.println("O valor da viagem foi de: " + valor);

    }

    @Override
    public void planar() {
        System.out.println("O avião está planando, rumo a aterrissagem");
        this.planar = true;
    }

    @Override
    public void decolar() {
        List<String> sinaisDeTorrePermitidos = new ArrayList<>();
        sinaisDeTorrePermitidos.add("Pista livre");
        sinaisDeTorrePermitidos.add("Ok");

        if (!sinaisDeTorrePermitidos.contains(sinalTorre)) {
            throw new IllegalArgumentException("A torre não deu permissão para que o avião possa andar");
        }

        System.out.println("Vaião pronto para a decolagem...");
    }

    @Override
    public void pousar() {
        List<String> sinaisDeTorrePermitidos = new ArrayList<>();
        sinaisDeTorrePermitidos.add("Pista livre");
        sinaisDeTorrePermitidos.add("Ok");

        if (!planar) {
            throw new IllegalArgumentException("O avião não pode pousar sem antes estar planando");
        }

        if(!sinaisDeTorrePermitidos.contains(sinalTorre)) {
            throw new IllegalArgumentException("A torre não deu permissão para que o avião possa andar");
        }

        System.out.println("O avião pousou corretamente.");
    }

    @Override
    public String toString() {
        return "Avião: \n" + "\tTrem de pouso: " + tremDePouso + "\n\tsinalTorre: " + sinalTorre + "\n\tlitros de gasolina: " + gasolinaLitros + "\n\tcapacidade máxima: " + capacidadeMaximaGasolina + "\n\tgasto por litro: " + gastoPorLitro + "\n";
    }
}
