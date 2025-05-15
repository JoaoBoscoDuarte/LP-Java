package atv.ListaDeTarefas;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Um objeto desta classe representa uma tarefa a ser realizada, que traz informações
 * de data limite (deadline) da tarefa, a descrição da tarefa e se a tarefa já foi
 * concluída.
 */
public class Tarefa{

    /**
     * Data limite para concluir a tarefa.
     */
    //yyyy-MM-dd
    private LocalDate deadline;

    /**
     * Descrição da tarefa.
     */
    private String descricao;

    /**
     * Indica se a tarefa está concluída. Por padrão, é inicializada como {@code false}.
     */
    private boolean concluida = false;

    /**
     * Constrói uma nova tarefa com uma data limite e uma descrição.
     *
     * @param dia       o dia da data limite.
     * @param mes       o mês da data limite.
     * @param ano       o ano da data limite.
     * @param descricao a descrição da tarefa.
     */
    public Tarefa(int dia, int mes, int ano, String descricao) {
        deadline = LocalDate.of(ano, mes, dia);
        this.descricao = descricao;
    }

    /**
     * Verifica se a tarefa está atrasada em relação à data atual.
     *
     * @return {@code true} se a data limite for anterior à data atual, caso contrário {@code false}.
     */
    public boolean tarefaAtrasada() {
        return deadline.isBefore(LocalDate.now());
    }

    /**
     * Obtém a data limite da tarefa.
     *
     * @return a data limite da tarefa.
     */
    public LocalDate getDeadline() {
        return deadline;
    }

    /**
     * Define uma nova data limite para a tarefa. Esta nova data só será
     * considerada se for uma data futura.
     *
     * @param dia       o novo dia da data limite.
     * @param mes       o novo mês da data limite.
     * @param ano       o novo ano da data limite.
     */
    public void setDeadline(int dia, int mes, int ano) {
        LocalDate novoDeadline = LocalDate.of(ano, mes, dia);
        if(novoDeadline.isAfter(LocalDate.now()))
            this.deadline = deadline;
    }

    /**
     * Obtém a descrição da tarefa.
     *
     * @return a descrição da tarefa.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define uma nova descrição para a tarefa.
     *
     * @param descricao a nova descrição.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Verifica se a tarefa está concluída.
     *
     * @return {@code true} se a tarefa estiver concluída, caso contrário {@code false}.
     */
    public boolean isConcluida() {
        return concluida;
    }

    /**
     * Define o estado de conclusão da tarefa.
     *
     * @param concluida o novo estado de conclusão.
     */
    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    /**
     * Retorna uma representação textual da tarefa.
     *
     * @return uma string contendo os detalhes da tarefa.
     */
    @Override
    public String toString() {
        return "Tarefa{" +
                "data=" + deadline +
                ", descricao='" + descricao + '\'' +
                ", concluida=" + concluida +
                '}';
    }

    /**
     * Compara esta tarefa com outro objeto.
     *
     * @param o o objeto a ser comparado.
     * @return {@code true} se os objetos forem iguais, caso contrário {@code false}.
     */
    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;

        return isConcluida() == tarefa.isConcluida() &&
                Objects.equals(getDeadline(), tarefa.getDeadline()) &&
                Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    /**
     * Retorna o código hash da tarefa.
     *
     * @return o valor do código hash.
     */
    @Override
    public int hashCode() {
        int result = Objects.hashCode(getDeadline());
        result = 31 * result + Objects.hashCode(getDescricao());
        result = 31 * result + Boolean.hashCode(isConcluida());
        return result;
    }
}