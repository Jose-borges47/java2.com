package projecto.view;

import projecto.model.Cliente;

import javax.swing.*;
import java.awt.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CadastroCliente extends JFrame {
    private JTextField campoNome;
    private JTextField campoCpf;
    private static ArrayList<Cliente> clientes = new ArrayList<>();

    public CadastroCliente() {
        setTitle("Cadastro de Cliente");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Nome:"));
        campoNome = new JTextField();
        add(campoNome);

        add(new JLabel("CPF:"));
        campoCpf = new JTextField();
        add(campoCpf);

        JButton botaoSalvar = new JButton("Salvar");
        add(botaoSalvar);

        botaoSalvar.addActionListener(e -> {
            String nome = campoNome.getText();
            String cpf = campoCpf.getText();
            Cliente cliente = new Cliente(nome, cpf);
            clientes.add(cliente);
            salvarClientes();
            JOptionPane.showMessageDialog(this, "Cliente salvo!");
            campoNome.setText("");
            campoCpf.setText("");
        });

        setVisible(true);
    }

    private void salvarClientes() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("clientes.ser"))) {
            out.writeObject(clientes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
