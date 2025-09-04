package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circulo;
import entities.Forma;
import entities.Retangulo;
import repository.Desenhavel;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {

            List<Forma> formas = new ArrayList<>();

            System.out.print("Digite o número de formas: ");
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.println("\nForma #" + i + " dados:");

                char tipo;
                while (true) {
                    System.out.print("Retângulo ou Círculo (r/c)? ");
                    tipo = Character.toLowerCase(sc.next().charAt(0));
                    if (tipo == 'r' || tipo == 'c') break;
                    System.out.println("Opção inválida. Digite 'r' ou 'c'.");
                }

                if (tipo == 'r') {
                    System.out.print("Largura: ");
                    double largura = sc.nextDouble();
                    System.out.print("Altura: ");
                    double altura = sc.nextDouble();
                    formas.add(new Retangulo(largura, altura));
                } else {
                    System.out.print("Raio: ");
                    double raio = sc.nextDouble();
                    formas.add(new Circulo(raio));
                }
            }

            System.out.println("\n--- DESENHOS E ÁREAS DAS FORMAS ---");
            for (Forma f : formas) {
                if (f instanceof Desenhavel d) {
                    d.desenhar();
                }
                System.out.printf("Área: %.2f%n%n", f.area());
            }
        }
    }
}
