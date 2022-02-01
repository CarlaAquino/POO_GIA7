package ejercicio4;

import java.util.Scanner;

public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo() {

    }

    public double getbase() {
        return this.base;
    }

    public void setbase(double base) {
        this.base = base;
    }

    public double getaltura() {
        return this.altura;
    }

    public void setaltura(double altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese valor de base: ");
        this.base = entrada.nextInt();
        System.out.println("Igrese valor de altura: ");
        this.altura = entrada.nextInt();
    }

    public void superficieDelRectanfulo() {
        double superficie = this.base * this.altura;
        System.out.println("La superficie del rectangulo es: " + superficie);
    }

    public void perimetroDelRectangulo(double base, double altura) {
        double perimetro = (this.base + this.altura) * 2;
        System.out.println("El perimetro del rectangulo es : " + perimetro);
    }

    public void dibujoDelRectangulo() {
        System.out.println("El dibujo del rectangulo dibujado es: ");
        for (int i = 0; i < base; i++) {
            System.out.print("*");
            for (int j = 0; j < altura; j++) {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}