package empresa;

public class Main {
    public static void main(String[] args) {
        Endereco end = new Endereco("Av. Botafogo", 808, "1º andar", "74820-010", "Setor Pedro Ludovico", "Goiânia", "GO");
        Empresa emp = new Empresa("12.345.678/0001-99", "CEIA", end);
        Empregado func = new Empregado("Carlos Henrique", "EMP123", emp);

        System.out.println(func);
    }
}
