package cartaxo.ef09.ex05;

public class ContaCorrente {
    private int numeroConta;
    private double saldo;

    public ContaCorrente(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor < this.saldo) saldo -= valor;
        consultarSaldo();

    }

    public void consultarSaldo() {
        System.out.println(this.numeroConta + ": saldo atual: " + this.saldo);
    }
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

}
