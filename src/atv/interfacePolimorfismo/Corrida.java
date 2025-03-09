package atv.interfacePolimorfismo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Corrida {

    private List<Corredor> corredores = new ArrayList<>();
    private double distanciaEmMetros;

    public Corrida(Double distanciaEmMetros) {
        this.distanciaEmMetros = distanciaEmMetros;
    }

    public String adicionarCorredor(Corredor corredor) {
        corredores.add(corredor);
        return corredor.getIdentificacao();
    }

    public List<String> realizaCorriada() {
        List<String> linhaDeChegada = new ArrayList<>();
        for (int i = 0; i < corredores.size(); i++) {
            String linha = "";
            linha += corredores.get(i).corre(distanciaEmMetros);
            linha += " - ";
            linha += corredores.get(i).getIdentificacao();

            linhaDeChegada.add(linha);
        }

        Collections.sort(linhaDeChegada);
        return linhaDeChegada;
    }

//    public static void main(String[] args) {
//        Corrida corrida = new Corrida(200);
//        corrida.adicionarCorredor()Corredor(new Tartaruga(0.001, 100, true));
//        corrida.adicionarCorredor(new Drone("XRTW7000", 3, 4, 50));
//        System.out.println(corrida.realizaCorrida());
//    }
}
