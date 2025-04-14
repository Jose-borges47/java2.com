package salario;

import java.io.*;
import java.util.*;

public class GravaObjetos {
    public static void main(String[] args) {
        List<Funcionario> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/salario/funcionarios.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split("#");
                String nome = campos[0];
                char sexo = campos[1].charAt(0);
                double salario = Double.parseDouble(campos[2]);
                int dependentes = Integer.parseInt(campos[3]);

                Funcionario f = new Funcionario(nome, sexo, salario, dependentes);
                lista.add(f);
            }

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("funcionarios.obj"));
            for (Funcionario f : lista) {
                oos.writeObject(f);
            }
            oos.close();
            System.out.println("Objetos gravados com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
