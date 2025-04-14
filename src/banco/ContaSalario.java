package banco;

public class ContaSalario extends ContaCorrente {
    private static final double TAXA = 0.01;

    public ContaSalario(int numero, Cliente dono) {
        super(numero, dono);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor + TAXA - 0.05); // Corrige o valor herdado da ContaCorrente
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor - TAXA + 0.05); // Corrige o valor herdado da ContaCorrente
    }

    @Override
    public void transferir(double valor, Conta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }
}
