package banco;

public class TestaConta {
    public static void main(String[] args) {
        Cliente joao = new Cliente("João", "1111-1111");
        Cliente maria = new Cliente("Maria", "2222-2222");

        ContaCorrente cc = new ContaCorrente(1, joao);
        ContaPoupanca cp = new ContaPoupanca(2, maria);

        cc.depositar(100);
        cp.depositar(200);

        cc.sacar(50);
        cp.sacar(70);

        cp.atualizaSaldo(5); // Atualiza saldo da poupança em 5%

        System.out.println(cc);
        System.out.println(cp);
    }
}
