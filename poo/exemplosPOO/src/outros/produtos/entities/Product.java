package produtos.entities;

public class Product {
    private String nome;
    private double preco;
    private int quantidade;

    //Criando um construtor padrão (com ele criado, o instanciamento pode ser feito do tipo Classe nome = new Classe();
    public Product() {
    }

    //Criando um construtor
    public Product(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Product(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        quantidade = 0;
    }

    public double valorTotalEmEstoque() {
        return preco * quantidade;
    }

    public void adicionarItem(int quantidade) {
        //this é usado para referenciar o atributo da classe
        this.quantidade += quantidade;
    }

    public void removerItens(int quantidade) {
        this.quantidade -= quantidade;
    }

    //setter para modificar o atributo nome da classe
    public void setNome(String nome) {
        this.nome = nome;
    }

    //getter para retornar o nome do atributo
    public String getNome() {
        return nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String toString() {
        return nome
                + ", $ "
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " units, Total: $ "
                + String.format("%.2f", valorTotalEmEstoque());
    }
}
