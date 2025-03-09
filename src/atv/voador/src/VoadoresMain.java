package atv.voador.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VoadoresMain {
    private List<Voador> arrayVoadores;
    private Random voadorAleatorio;

    public VoadoresMain() {
        arrayVoadores = new ArrayList<>();
        voadorAleatorio = new Random();
    }

    public static void main(String[] args) {
        VoadoresMain voadoresMain = new VoadoresMain();
        voadoresMain.arrayVoadores = voadoresMain.gerarVoadoresAleatorios();

        for (Voador voador : voadoresMain.arrayVoadores) {
            voador.planar();
            voador.voar();
            voador.pousar();
            System.out.println();
        }
    }

    public ArrayList<Voador> gerarVoadoresAleatorios() {
        ArrayList<Voador> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista.add(gerarVoadoresAleatorio());
        }

        return lista;
    }

   public Voador gerarVoadoresAleatorio() {
        int escolha = voadorAleatorio.nextInt(3);

        switch (escolha) {
            case 0:
                return new Drone("Drone do corinthians");

            case 1:
                return new GalinhaVoadora();

            case 2:
                return new TapeteVoador("Azul");

            default:
                return null;
        }
   }
}