package voador;

import java.util.Random;

public class VoadoresMain {
    public static void main(String[] args) {
        Voador qqVoador = new GalinhaVoadora();
        qqVoador.voar();//chamada polimórfica
        qqVoador.planar();//chamada polimórfica
        qqVoador.pousar();//chamada polimórfica

        Voador qqVoador2 = new Drone("do tipo bom!");
        qqVoador2.voar();//chamada polimórfica
        qqVoador2.planar();//chamada polimórfica
        qqVoador2.pousar();//chamada polimórfica
    }
}