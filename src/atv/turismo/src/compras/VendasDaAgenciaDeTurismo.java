package atv.turismo.src.compras;

import java.util.ArrayList;
import java.util.List;

public class VendasDaAgenciaDeTurismo {
    public List<VendaDeTurismoIF> vendas = new ArrayList<>();

    public int adicionaVenda(VendaDeTurismoIF item) {
        vendas.add(item);
        return 0;
    }

    public double getPrecoDeVenda(int posicao) {
        return vendas.get(posicao).getPreco();
    }

    public double getPrecoTotal() {
        double total = 0;

        for (VendaDeTurismoIF venda : vendas) {
            total += venda.getPreco();
        }

        return total;
    }

    public String listagemDeVendas() {
        return vendas.toString();
    }
}
