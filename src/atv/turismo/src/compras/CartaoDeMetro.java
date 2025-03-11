package atv.turismo.src.compras;

public class CartaoDeMetro implements VendaDeTurismoIF{
    private int qtdeViagens = 0;
    public static final double VALOR_DE_UMA_VIAGEM = 7;

    public CartaoDeMetro(int qtdeViagens) {
        if (qtdeViagens < 0) {
            throw new IllegalArgumentException("Quantidade de viagens deve ser maior que zero");

        } else if (qtdeViagens == 0) {
            throw new IllegalArgumentException("Quantidade de viagens deve ser maior que zero");

        } else {
            this.qtdeViagens = qtdeViagens;
        }
    }

    public int getQtdeViagens() {
        return qtdeViagens;
    }

    public void setQtdeViagens(int qtdeViagens) {
        this.qtdeViagens = qtdeViagens;
    }

    public double getPreco() {
        if (qtdeViagens < 20) {
            return VALOR_DE_UMA_VIAGEM * qtdeViagens;

        } else {
            return VALOR_DE_UMA_VIAGEM * qtdeViagens * 0.8;
        }
    }

    public String getDescricao() {
        return qtdeViagens + " viagens de metro.";
    }

    @Override
    public String toString() {
        return "CartaoDeMetro [" +
                "qtdeViagens=" + qtdeViagens +
                ']';
    }
}
