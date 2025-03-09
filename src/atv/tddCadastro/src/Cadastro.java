package stv.tddCadastro.src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Cadastro {
    private List<String> colecao;

    public Cadastro() {
        colecao = new ArrayList<>();
    }

    public boolean adiciona(String item) {
        if (item == null) {
            return false;
        }

        colecao.add(item);
        return true;
    }

    public int getNumeroDeItens() {
        return colecao.size();
    }

    public boolean remove(String texto) {
        for (int i = 0; i < colecao.size(); i++) {
            if (colecao.get(i).equals(texto)) {
                colecao.remove(i);
                return true;
            }
        }

        return false;
    }

    public void remove(int indice) {
        if (indice < 0 || indice >= colecao.size()) {
            throw new IndexOutOfBoundsException("Honestamente, eu não entendi o porque dessa exeção aqui, pelo amor de deus, o que carambolas indica (no teste) a nescessidade dessa exceção");
        }

        colecao.remove(indice);
    }

    public boolean contem(String texto) {
        return colecao.contains(texto);
    }

    public String recupera(int indice) {
        if (indice < 0 || indice >= colecao.size()) {
            throw new IndexOutOfBoundsException("Índice fora dos limites.");
        }
        return colecao.get(indice);
    }

    public int recuperaIndice(String texto) {
        for (int k = 0; k < colecao.size(); k++) {
            if (colecao.get(k).equals(texto)) {
                return k;
            }
        }
        return -1;
    }

    public void ordena() {
        Collections.sort(colecao);
    }

    @Override
    public String toString() {
        String resultado = "";
        for (String item: colecao) {
            resultado += item + "\n";
        }

        return resultado;
    }
}