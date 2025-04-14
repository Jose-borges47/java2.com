package projecto.view;

import projecto.model.Veiculo;

import javax.swing.*;
import java.awt.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CadastroVeiculo extends JFrame {
    private JTextField campoModelo;
    private JTextField campoPlaca;
    private static ArrayList<Veiculo> veiculos = new ArrayList<>();

    public CadastroVeiculo() {
        setTitle("Cadastro de Veículo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Modelo:"));
        campoModelo = new JTextField();
        add(campoModelo);

        add(new JLabel("Placa:"));
        campoPlaca = new JTextField();
        add(campoPlaca);

        JButton botaoSalvar = new JButton("Salvar");
        add(botaoSalvar);

        botaoSalvar.addActionListener(e -> {
            String modelo = campoModelo.getText();
            String placa = campoPlaca.getText();
            Veiculo veiculo = new Veiculo(modelo, placa);
            veiculos.add(veiculo);
            salvarVeiculos();
            JOptionPane.showMessageDialog(this, "Veículo salvo!");
            campoModelo.setText("");
            campoPlaca.setText("");
        });

        setVisible(true);
    }

    private void salvarVeiculos() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("veiculos.ser"))) {
            out.writeObject(veiculos);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
