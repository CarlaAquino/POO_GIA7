/*Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cadena cadena = new Cadena();
        String caracter, frasee;
        System.out.println("-------------OPCIONES---------------------");
        System.out.println("1. Mostrar cantidad de vocales en la frase: ");
        System.out.println("2. Mostrar frase invertida: ");
        System.out.println("3. Mostrar cuantas veces se repite un caracter ingresado: ");
        System.out.println("4. Comparar longitud con otra nueva frase: ");
        System.out.println("5. Unir frase ingresada con otra frase nueva ingresada: ");
        System.out.println("6. Reemplazar letras a por otro caracter selecionado por el usuario: ");
        System.out.println("7. Comprobar si la frase tienen el caracter ingresado por el usuario: ");
        System.out.println("8. Salir");
        System.out.println("---------------------------------------------");
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                cadena.mostrarVocales();
                break;
            case 2:
                cadena.invertirFrase();
                break;
            case 3:
                System.out.println("Ingrese caracter a buscar: ");
                caracter = entrada.next();
                cadena.vecesRepetido();
                break;
            case 4:
                System.out.println("Ingrese una nueva frase: ");
                frasee = entrada.next();
                cadena.compararLongitud();
                break;
            case 5:
                System.out.println("Ingrese frase que desae unir a la anterior: ");
                frasee = entrada.next();
                cadena.unirFrases();
                break;
            case 6:
                System.out.println("Ingrese una letra que reemplace la letra (a): ");
                frasee = entrada.next();
                cadena.reemplazar(frasee);
                break;
            case 7:
                System.out.println("Ingrese letra a buscar en la frase: ");
                frasee = entrada.next();
                if (cadena.contiene(frasee)) {
                    System.out.println("La frase contiene la letra buscada");
                } else {
                    System.out.println("La frase no contiene la letra buscada");
                }

        }

    }

}
