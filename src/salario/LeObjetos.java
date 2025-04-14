package salario;

import java.io.*;

public class LeObjetos {
    public static void main(String[] args) {
        double totalImpFem = 0;
        double totalImpMasc = 0;
        double totalImp = 0;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("funcionarios.obj"))) {
            while (true) {
                try {
                    Funcionario f = (Funcionario) ois.readObject();
                    System.out.println(f.mostraFuncionario());

                    double imposto = f.impostoRenda();
                    if (f.sexo == 'F') {
                        totalImpFem += imposto;
                    } else if (f.sexo == 'M') {
                        totalImpMasc += imposto;
                    }
                    totalImp += imposto;

                } catch (EOFException e) {
                    break; // fim do arquivo
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Total de imposto (F): " + totalImpFem);
        System.out.println("Total de imposto (M): " + totalImpMasc);
        System.out.println("Total geral de imposto: " + totalImp);
    }
}
