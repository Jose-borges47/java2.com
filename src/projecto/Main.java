package projecto;

import projecto.view.CadastroCliente;
import projecto.view.CadastroVeiculo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sistema de Locação de Carros");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new java.awt.FlowLayout());

        JButton botaoCliente = new JButton("Cadastrar Cliente");
        JButton botaoVeiculo = new JButton("Cadastrar Veículo");

        frame.add(botaoCliente);
        frame.add(botaoVeiculo);

        botaoCliente.addActionListener(e -> new CadastroCliente());
        botaoVeiculo.addActionListener(e -> new CadastroVeiculo());

        frame.setVisible(true);
    }
}
