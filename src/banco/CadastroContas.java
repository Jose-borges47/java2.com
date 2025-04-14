package banco;

import javax.swing.*;
import java.util.ArrayList;

public class CadastroContas {
    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<>();

        while (true) {
            String[] opcoes = {"Cadastrar Conta", "Listar Contas", "Sacar", "Depositar", "Transferir", "Sair"};
            int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

            if (escolha == 0) {
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Número da conta:"));
                if (numero == 0) break;

                String nome = JOptionPane.showInputDialog("Nome do cliente:");
                String telefone = JOptionPane.showInputDialog("Telefone do cliente:");
                Cliente cliente = new Cliente(nome, telefone);

                String tipoConta = JOptionPane.showInputDialog("Tipo da conta:\n1 - Corrente\n2 - Salário\n3 - Poupança");
                Conta conta = null;

                switch (tipoConta) {
                    case "1":
                        conta = new ContaCorrente(numero, cliente);
                        break;
                    case "2":
                        conta = new ContaSalario(numero, cliente);
                        break;
                    case "3":
                        conta = new ContaPoupanca(numero, cliente);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Tipo inválido.");
                        continue;
                }

                contas.add(conta);
                JOptionPane.showMessageDialog(null, "Conta criada com sucesso!");

            } else if (escolha == 1) {
                StringBuilder sb = new StringBuilder("Contas cadastradas:\n");
                for (Conta c : contas) {
                    sb.append(c.toString()).append("\n");
                }
                JOptionPane.showMessageDialog(null, sb.toString());

            } else if (escolha == 2) {
                Conta conta = buscarConta(contas, "sacar");
                if (conta != null) {
                    double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do saque:"));
                    conta.sacar(valor);
                    JOptionPane.showMessageDialog(null, "Saque realizado. Novo saldo: R$ " + conta.getSaldo());
                }

            } else if (escolha == 3) {
                Conta conta = buscarConta(contas, "depositar");
                if (conta != null) {
                    double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do depósito:"));
                    conta.depositar(valor);
                    JOptionPane.showMessageDialog(null, "Depósito realizado. Novo saldo: R$ " + conta.getSaldo());
                }

            } else if (escolha == 4) {
                Conta origem = buscarConta(contas, "transferir (origem)");
                Conta destino = buscarConta(contas, "transferir (destino)");
                if (origem != null && destino != null) {
                    double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor da transferência:"));
                    origem.transferir(valor, destino);
                    JOptionPane.showMessageDialog(null, "Transferência realizada!");
                }

            } else {
                break;
            }
        }

        JOptionPane.showMessageDialog(null, "Programa encerrado.");
    }

    public static Conta buscarConta(ArrayList<Conta> contas, String operacao) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta para " + operacao + ":"));
        for (Conta c : contas) {
            if (c.numero == numero) return c;
        }
        JOptionPane.showMessageDialog(null, "Conta não encontrada.");
        return null;
    }
}
