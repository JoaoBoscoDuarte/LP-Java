//Objetos são tipos definidos pela sua classe, um objetos contem métodos e o objeto é definido e segue a sua classe
/*
 * "Classe" é um gabarito/projeto/especificação (como a planta de uma casa)
 * "Objeto" é a concretização do gabarito (casas feitas a partir da mesma planta) - dizemos que é uma instância da classe
 *
 * Se a classe define que uma conta correte deve ter um número, o CPF do titular, o nome do titular, o saldo e a data de criação,
 *  então todos os objetos do tipo conta corrente devem ser capazes de armazenar estas informações. A classe também define as
 * operações que um objeto desse tipo pode realizar. A classe ContaCorrente pode definir por exemplo operações tais como sacar,
 *  transferir, verSaldo, etc.
 */

package atividades.contato.src;

import java.time.LocalDate;
import java.util.ArrayList;

public class ListaDeContatos {
    public static void main(String[] args) {
        //Um ArrayList chamado contatos é criado para armazenar objetos do tipo Contato.
        ArrayList<Contato> contatos = new ArrayList<>();
        //Um objeto Contato chamado raquel é instanciado com os valores iniciais e adicionado à lista contatos.
        Contato raquel = new Contato("Raquel", "83 99000099", "raquel@gmail.com", LocalDate.of(1990, 11,23));
        contatos.add(raquel); //adicionando raquel a lista

        System.out.println(raquel);
        System.out.println(contatos);

        Contato raquel2 = new Contato("Raquel", "83 99000099", "raquel@gmail.com", LocalDate.of(1990, 11,23));

        Contato guilherme = new Contato("Guilherme", "83 99888899", "guizzzao@gmail.com", LocalDate.of(2010, 5, 11));
        Contato italo = new Contato("Italo", "83 99669966", "italo@gmail.com", LocalDate.of(2011, 2, 20));
        Contato samuel = new Contato("Samuel", "83 99777799", "samuel@gmail.com", LocalDate.of(2011, 9, 9));

        contatos.add(guilherme);
        contatos.add(samuel);

        System.out.println(raquel.equals(raquel2));

        System.out.println(contatos);

        raquel2.setNome("Raquel V. Lopes");
        System.out.println(raquel);

        for (int i = 0; i < contatos.size(); i++) {

        }

        for(Contato contato : contatos) {
            System.out.println(contato.getDataNascimento());
        }

        System.out.println(contatos.contains(italo));

        contatos.add(italo);
        contatos.add(samuel);

        System.out.println(contatos.contains(italo));
        System.out.println(contatos.indexOf(samuel));
    }
}