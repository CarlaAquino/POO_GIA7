
package ejercicio2;

import java.util.Scanner;


public class Cincurferencia {
   
     Scanner entrada = new Scanner(System.in);
    private double radio;
    private final double pi = 3.14;
    public Cincurferencia() {
        
    }
    public Cincurferencia(double radio){
        this.radio = radio;
    }
    public void crearCincurferencia(){
        System.out.println("Ingrese el radio: ");
        this.radio = entrada.nextInt();
    }
    public double getradio(){
         return this.radio;  
    }
    public void setradio(double radio) {
        this.radio = radio;
    }
    public void area(double pi, double radio) {
        double area = (this.pi * (Math.pow(this.radio, 2)));
        System.out.println("El area es: " + area);
    }
    public void perimetro(){
        double perimetro = (2 * this.pi * this.radio);
        System.out.println("El perimetro es: " + perimetro);
    }
}
