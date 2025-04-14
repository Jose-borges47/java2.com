package cliente;

public class Main {
    public static void main(String[] args) {
        Endereco e = new Endereco("Avenida Botafogo", 808, "Ap 101", "74820-010", "Setor Pedro Ludovico", "Goiânia", "GO");
        Cliente c = new Cliente("José", "123.456.789-00", e);

        System.out.println(c);
    }
}
