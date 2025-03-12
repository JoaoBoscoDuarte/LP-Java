package atv.transportes.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();

        Random rand = new Random();

        for(int i = 0; i < 10; i++){
            int escolha = rand.nextInt(4);
            Veiculo veiculo;

            if (escolha == 0){
                veiculo = new Aviao(rand.nextBoolean(), "Ok", rand.nextInt(100), rand.nextInt(100), rand.nextInt(5));

            } else if (escolha == 1) {
                veiculo = new Carro(10, 60, 20);

            } else if (escolha == 2) {
                veiculo = new Moto(10, 40, 35);

            } else {
                veiculo = new Bicicleta();
                boolean trem = rand.nextBoolean();
                if (trem)
                    ((Bicicleta) veiculo).tirarDescanso();
            }

            veiculos.add(veiculo);
        }

        for(Veiculo veiculo : veiculos){
            if (veiculo.getClass() == Carro.class) {
                ((Carro) veiculo).abaixarFreioDeMao();
                ((Carro) veiculo).ligarCarro();
                ((Carro) veiculo).colocarCintoMotorista();

            } else if (veiculo.getClass() == Moto.class) {
                ((Moto) veiculo).girarChave();
                ((Moto) veiculo).ligarMoto();
                ((Moto) veiculo).colocarCintoMotorista();
            }

            try{
                System.out.println(veiculo.toString());
                veiculo.andar();
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

    }
}
