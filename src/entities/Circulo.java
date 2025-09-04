package entities;

import repository.Desenhavel;

public class Circulo extends Forma implements Desenhavel {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }

    @Override
    public void desenhar() {
        int r = (int) Math.round(raio);
        System.out.println("Desenhando círculo:");

        // fator de escala horizontal para ficar mais proporcional
        double aspectRatio = 2.0;

        for (int y = -r; y <= r; y++) {
            for (int x = -r; x <= r; x++) {
                if ((x / aspectRatio) * (x / aspectRatio) + y * y <= r * r) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
