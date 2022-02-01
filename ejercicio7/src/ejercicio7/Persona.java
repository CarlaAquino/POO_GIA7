
package ejercicio7;

import java.util.Scanner;

public class Persona {
   public String nombre;
   public int edad;
   String sexo;
   public long peso;
   public long altura;

    
    public Persona(){
        
    }

    public Persona(String nombre, int edad, String sexo, long peso, long altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public long getPeso() {
        return peso;
    }

    public long getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(long peso) {
        this.peso = peso;
    }

    public void setAltura(long altura) {
        this.altura = altura;
    }
    public void crearPersona() {
        
       Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        this.nombre = entrada.next();
        System.out.println("Ingrese su edad: ");
        this.edad = entrada.nextInt();
        System.out.println("Ingrese genero: ");
        if (sexo.equals("H") || sexo.equals("M") || sexo.equals("O")){
            this.sexo = entrada.next();
        }else {
            System.out.println("Ingrese opcon posible: ");
        }
        System.out.println("Ingrese su peso: ");
        this.peso = entrada.nextLong();
        System.out.println("Ingrese su altura: ");
        this.altura = entrada.nextLong();
    }
    
    public int calcularImc(){
        double pesoActual = peso / (Math.pow(altura, 2));
        if (pesoActual >= 20 && pesoActual <= 25) {
            System.out.println("tiene un PESO IDEAL");
            return -1;
        }else if(pesoActual>25){
            System.out.println("tiene SOBREPESO"); 
            return 0;
        }else{
            return 1;
        }
    }
     public boolean esMayorDeEdad() {

        boolean mayor = false;
        if (edad >= 18) {

            mayor = true;
        }
        return mayor;
    }
    
}
