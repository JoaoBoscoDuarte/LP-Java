package atv.interfacePolimorfismo;

import java.util.Objects;

public class Tartaruga implements Corredor {

    private double velocidadeEmMPorSegundo;
    private int idade;
    private boolean feminino;
    private String nome = "Tartaruga";

    public Tartaruga(double velocidadeEmMPorSegundo, int idade, boolean sexo) {
        this.velocidadeEmMPorSegundo = velocidadeEmMPorSegundo;
        this.idade = idade;
        this.feminino = feminino;
    }

    public void setVelocidadeEmMPorSegundo(double velocidadeEmMPorSegundo) {
        this.velocidadeEmMPorSegundo = velocidadeEmMPorSegundo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setFeminino(boolean feminino) {
        this.feminino = feminino;
    }

    public double getVelocidadeEmMPorSegundo() {
        return velocidadeEmMPorSegundo;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isFeminino() {
        return feminino;
    }

    @Override
    public String getIdentificacao() {
        return nome;
    }

    @Override
    public double corre(double distanciaEmMetros) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tartaruga tartaruga = (Tartaruga) o;
        return Double.compare(velocidadeEmMPorSegundo, tartaruga.velocidadeEmMPorSegundo) == 0 && idade == tartaruga.idade && feminino == tartaruga.feminino;
    }

    @Override
    public int hashCode() {
        return Objects.hash(velocidadeEmMPorSegundo, idade, feminino);
    }

    @Override
    public String toString() {
        return "Tartaruga{" +
                "velocidadeEmMPorSegundo=" + velocidadeEmMPorSegundo +
                ", idade=" + idade +
                ", feminino=" + feminino +
                '}';
    }
}
