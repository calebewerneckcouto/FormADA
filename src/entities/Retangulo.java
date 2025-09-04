package entities;

import repository.Desenhavel;

public class Retangulo extends Forma implements Desenhavel {

    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double area() {
        return largura * altura;
    }

    @Override
    public void desenhar() {
        int w = (int) Math.round(largura);
        int h = (int) Math.round(altura);

        System.out.println("Desenhando retângulo:");
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
