package musica;

public class Main {
    public static void main(String[] args) {
        Compositor comp1 = new Compositor("Chico Buarque", "Brasileiro");
        Compositor comp2 = new Compositor("Beethoven", "Alemão");

        Musica musica1 = new Musica("Construção", 1971, "MPB", comp1);
        Musica musica2 = new Musica("5ª Sinfonia", 1808, "Clássica", comp2);

        System.out.println(musica1);
        System.out.println();
        System.out.println(musica2);
    }
}