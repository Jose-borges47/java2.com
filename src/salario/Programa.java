package salario;

import java.io.*;
import java.util.*;

public class Programa {
    public static void main(String[] args) {
        double totalImpFem = 0;
        double totalImpMasc = 0;
        double totalImp = 0;

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

                System.out.println(f.mostraFuncionario());

                double imposto = f.impostoRenda();
                if (sexo == 'F') {
                    totalImpFem += imposto;
                } else if (sexo == 'M') {
                    totalImpMasc += imposto;
                }
                totalImp += imposto;
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }

        System.out.println("Total de imposto (F): " + totalImpFem);
        System.out.println("Total de imposto (M): " + totalImpMasc);
        System.out.println("Total geral de imposto: " + totalImp);
    }
}
