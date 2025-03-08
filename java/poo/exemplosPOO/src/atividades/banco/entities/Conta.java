package banco.entities;

public class Conta {
    public String nome;
    private double saldo;
    private int numeroConta;

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valor) {
        saldo += valor;
    }

    public void saque(double valor) {
        saldo -= valor;
    }

    public String toString() {
        return nome + saldo + numeroConta;
    }
}
