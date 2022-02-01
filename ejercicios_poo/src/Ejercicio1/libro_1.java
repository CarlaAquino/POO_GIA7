
package Ejercicio1;

import java.util.Scanner;


public class libro_1 {
    
    private int isbn;
    private String titulo;
    private String autor;
    private int numPag;
     //constructor vacio
    public void libro1 (){
        
    }
    // constructor con parametros
    public void libro1(int isbn, String titulo, String autor, int numPag){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }
    //cargar
    public void cargarLibro(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese numero de ISBN: ");
        this.isbn = entrada.nextInt();
        System.out.println("Ingrese titulo: ");
        this.titulo = entrada.next();
        System.out.println("Ingrese autor: ");
        this.autor = entrada.next();
        System.out.println("Ingrese numero de pagina: ");
        this.numPag = entrada.nextInt();
                
    }
    //mostrar
    public void mostrarLibro() {
        System.out.println("Los datos del libro son: ");
        System.out.println("N° de ISBN: " + this.isbn);
        System.out.println("El titulo es: " + this.titulo);
        System.out.println("El autor es: " + this.autor);
        System.out.println("El numero de pagina es: " + this.numPag);
    }
}

