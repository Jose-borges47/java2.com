package banco;

import java.text.DecimalFormat;

public abstract class Conta {
    protected int numero;
    protected Cliente dono;
    protected double saldo;

    public Conta(int numero, Cliente dono) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = 0.0;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public abstract void transferir(double valor, Conta destino);

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double valor) {
        saldo = valor;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("#0.00");
        return "Número: " + numero + " - Cliente: " + dono.getNome() +
                " - Telefone: " + dono.getTelefone() +
                " - Saldo: R$ " + df.format(saldo);
    }
}
