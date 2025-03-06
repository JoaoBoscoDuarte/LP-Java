package ListaDeTarefas;

import java.util.Scanner;
import java.util.ArrayList;

public class ListaDeTarefas {
    private static ArrayList<Tarefa> tarefas = new ArrayList<>();
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            int entrada = receberEntrada(sc);
            continuar = funcionalidade(entrada, sc);
        }
    }

    private static boolean funcionalidade (int entrada, Scanner sc) {
        if (entrada == 1) {
            adicionarNovaTarefa(sc, tarefas);

        } else if (entrada == 2) {
            marcarTarefaConcluida(sc, tarefas);

        } else if (entrada == 3) {
            listarTarefas(sc, tarefas);

        } else if (entrada == 4) {
            return false;
        }

        return true;
    }

    private static void listarTarefas(Scanner sc, ArrayList <Tarefa> tarefas) {
        if (tarefas.isEmpty()) {
            System.err.println("Não há tarefas no momento");

        } else {
            for (int i = 0; i <tarefas.size(); i++) {
                System.out.println(i + ": " + tarefas.get(i).toString());
            }
        }
    }

    private static void marcarTarefaConcluida(Scanner sc, ArrayList <Tarefa> tarefas) {
        System.out.println("Digite o índice da tarefa que deseja marcar como concluída:");
        int indice = sc.nextInt();
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).setConcluida(true);
            System.out.println("Tarefa marcada como concluída");

        } else {
            System.err.println("Tarefa inválida!");
        }
    }

    private static void adicionarNovaTarefa(Scanner sc, ArrayList<Tarefa> tarefas) {
        System.out.println("Digite o dia da tarefa:");
        int dia = sc.nextInt();
        System.out.println("Digite o mês da tarefa:");
        int mes = sc.nextInt();
        System.out.println("Digite o ano da tarefa:");
        int ano = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite a descrição da tarefa:");
        String descricao = sc.nextLine();

        Tarefa novaTarefa = new Tarefa(dia, mes, ano, descricao);
        tarefas.add(novaTarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    private static int receberEntrada(Scanner sc) {
        System.out.println("1 - para adicionar uma nova tarefa");
        System.out.println("2 - para marcar tarefa como concluída (por índice)");
        System.out.println("3 - para listar todas as tarefas atrasadas com seus respectivos índices ");
        System.out.println("4 - para sair do programa.");

        int entrada = sc.nextInt();
        while (entrada < 1 || entrada > 4) {
            System.err.println("Opção inválida!");
            entrada = sc.nextInt();
        }

        return entrada;
    }
}