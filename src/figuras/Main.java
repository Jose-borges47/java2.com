package figuras;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(4);
        Retangulo retangulo = new Retangulo(5, 3);
        Triangulo triangulo = new Triangulo(6, 4, 5, 4);
        Circulo circulo = new Circulo(2.5);

        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(quadrado);
        figuras.add(retangulo);
        figuras.add(triangulo);
        figuras.add(circulo);

        for (Figura f : figuras) {
            System.out.println("Classe: " + f.getClass().getSimpleName());
            System.out.println("Área: " + f.calcularArea());
            System.out.println("Perímetro: " + f.calcularPerimetro());

            if (f instanceof Desenho) {
                System.out.println(((Desenho) f).desenhar());
            }

            System.out.println("-----------------------------");
        }
    }
}
