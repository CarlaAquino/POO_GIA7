/*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
 
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] argr)  {
        int imc1, imc2, imc3, imc4, opcion;
        double cantMayores = 0, cantDebajoPesoIdeal = 0, cantPesoIdeal = 0;
        boolean edad1, edad2, edad3, edad4;
        Scanner entrada = new Scanner(System.in);
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();
        
        persona1.crearPersona();
        persona2.crearPersona();
        persona3.crearPersona();
        persona4.crearPersona();
        
        imc1 = persona1 . calcularImc();
        imc2 = persona2 . calcularImc();
        imc3 = persona3 . calcularImc();
        imc4 = persona4 . calcularImc();
        
        edad1 = persona1 .esMayorDeEdad();
        edad2 = persona2.esMayorDeEdad();
        edad3 = persona3.esMayorDeEdad();
        edad4 = persona4.esMayorDeEdad();
        
       
        do {
            System.out.println(" --------- MENÚ ---------- ");
            System.out.println(" 1-Ver IMC de la persona 1 y si es mayor de edad ");
            System.out.println(" 2-Ver IMC de la persona 2 y si es mayor de edad ");
            System.out.println(" 3-Ver IMC de la persona 3 y si es mayor de edad ");
            System.out.println(" 4-Ver IMC de la persona 4 y si es mayor de edad ");
            System.out.println(" 5-Salir y ver porcentajes totales ");

            opcion = entrada.nextInt();
            switch (opcion) {

                case 1:
                    if (imc1 == - 1) {
                        System.out.println(" La persona 1 esta por debajo de su peso ideal ");
                        cantDebajoPesoIdeal++;
                    }
                    if (imc1 == 0) {
                        System.out.println(" La persona 1 esta en su peso ideal ");
                        cantPesoIdeal++;
                    } else {
                        System.out.println(" La persona  esta con sobrepeso ");
                    }
                    if (edad1) {
                        System.out.println(" y es mayor de edad ");
                        cantMayores++;
                    } else {
                        System.out.println(" y no es mayor de edad ");
                    }
                    break;
                case 2:
                    if (imc2 == - 1) {
                        System.out.println(" La persona 2 esta por debajo de su peso ideal ");
                        cantDebajoPesoIdeal++;
                    }
                    if (imc2 == 0) {
                        System.out.println(" La persona 2 esta en su peso ideal ");
                        cantPesoIdeal++;
                    } else {
                        System.out.println(" La persona 2 esta con sobrepeso ");
                    }
                    if (edad2) {
                        System.out.println(" y es mayor de edad ");
                        cantMayores++;
                    } else {
                        System.out.println(" y no es mayor de edad ");
                    }
                    break;
                case 3:
                    if (imc3 == - 1) {
                        System.out.println(" La persona 3 esta por debajo de su peso ideal ");
                        cantDebajoPesoIdeal++;
                    }
                    if (imc3 == 0) {
                        System.out.println(" La persona 3 esta en su peso ideal ");
                        cantPesoIdeal++;
                    } else {
                        System.out.println(" La persona 3 esta con sobrepeso ");
                    }
                    if (edad3) {
                        System.out.println(" y es mayor de edad ");
                        cantMayores++;
                    } else {
                        System.out.println(" y no es mayor de edad ");
                    }
                    break;
                case 4:
                    if (imc3 == - 1) {
                        System.out.println(" La persona 4 esta por debajo de su peso ideal ");
                        cantDebajoPesoIdeal++;
                    }
                    if (imc4 == 0) {
                        System.out.println(" La persona 4 esta en su peso ideal ");
                        cantPesoIdeal++;
                    } else {
                        System.out.println(" La persona 4 esta con sobrepeso ");
                    }
                    if (edad4) {
                        System.out.println(" y es mayor de edad ");
                        cantMayores++;
                    } else {
                        System.out.println(" y no es mayor de edad ");
                    }
                    break;
                case 5:
                    System.out.println("opcion incorrecta");

            }
        } while (opcion != 5);
        System.out.printf(" El porcentaje de personas con su peso por debajo del ideal es %.0f %% \n ", (cantDebajoPesoIdeal / 4) * 100);
        System.out.printf(" El porcentaje de personas con su peso ideal es %.0f %% \n ", (cantPesoIdeal / 4) * 100);
        System.out.printf(" El porcentaje de personas con sobrepeso es %.0f %% \n ", ((4 - (cantPesoIdeal + cantDebajoPesoIdeal)) / 4) * 100);
        System.out.printf(" El porcentaje de personas mayores de edad es %.0f %% \n ", ((cantMayores) / 4) * 100);
        System.out.printf(" El porcentaje de personas menores de edad es %.0f %% \n ", ((4 - cantMayores) / 4) * 100);

    }

}
