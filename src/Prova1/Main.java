package Prova1;

import javax.swing.JOptionPane;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        String nome1 = JOptionPane.showInputDialog("Digite o nome do primeiro usuário:");
        int idade1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do primeiro usuário:"));
        Usuario usuario1 = new Usuario(nome1, idade1);

        String nome2 = JOptionPane.showInputDialog("Digite o nome do segundo usuário:");
        int idade2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do segundo usuário:"));
        Usuario usuario2 = new Usuario(nome2, idade2);

        String descEvento1 = JOptionPane.showInputDialog("Digite a descrição do primeiro evento:");
        Evento evento1 = new Evento(descEvento1);

        String descEvento2 = JOptionPane.showInputDialog("Digite a descrição do evento patrocinado:");
        String patrocinador = JOptionPane.showInputDialog("Digite o nome do patrocinador:");
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do patrocínio:"));
        EventoPatrocinado evento2 = new EventoPatrocinado(descEvento2, patrocinador, valor);

        for (int i = 1; i <= 3; i++) {
            String nomePalestra = JOptionPane.showInputDialog("Digite o nome da palestra " + i + ":");
            Palestra palestra = new Palestra(nomePalestra, new Date());

            evento1.adicionarPalestra(palestra);
            evento2.adicionarPalestra(palestra);
        }

        usuario1.adicionarEvento(evento1);
        usuario1.adicionarEvento(evento2);
        usuario2.adicionarEvento(evento1);
        usuario2.adicionarEvento(evento2);

        JOptionPane.showMessageDialog(null, usuario1.toString());
        JOptionPane.showMessageDialog(null, usuario2.toString());
    }
}