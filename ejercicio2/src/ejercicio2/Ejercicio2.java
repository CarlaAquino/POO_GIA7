/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
*/
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

     static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args ) {
        Cincurferencia cincurferencia = new Cincurferencia();
        System.out.println("Ingrese el calculo que desea realizar: ");
        System.out.println("1.calcular el area.\n2. calcular el perimetro.");
       int opciones = entrada.nextInt();
       switch(opciones){
           case 1:
               cincurferencia.crearCincurferencia();
               cincurferencia.area(opciones, opciones);
               break;
           case 2:
               cincurferencia.crearCincurferencia();
               cincurferencia.perimetro();
       }
    }
    
}   

 
  

