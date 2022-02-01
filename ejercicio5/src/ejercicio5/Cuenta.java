package ejercicio5;

import java.util.Scanner;

public class Cuenta {

    int numeroCuenta;
    long dni;
    double saldo_Actual;
    float interes;
    private Object entrada;

    //connstructor por defecto(vacio)
    public void Cuenta() {

    }

    //constructor parametizado
    public void Cuenta(int numeroCuenta, long dni, double saldo_Actual, float interes) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo_Actual = saldo_Actual;
        this.interes = interes;
    }

    //metodos getters y setters
    public int getnumeroCuenta() {
        return numeroCuenta;
    }

    public void setnumeroCuenta() {
        this.numeroCuenta = numeroCuenta;
    }

    public int getdni() {
        return (int) dni;
    }

    public void setdni() {
        this.dni = dni;
    }

    public double getsaldo_Actual() {
        return saldo_Actual;
    }

    public void setsaldo_Actual() {
        this.saldo_Actual = saldo_Actual;
    }

    public float getinteres() {
        return interes;
    }

    public void setinteres() {
        this.interes = interes;
    }

    //pedir datos al usuario.
    public void datosCuenta() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese numero de cuenta: ");
        this.numeroCuenta = entrada.nextInt();
        System.out.println("Ingrese su DNI: ");
        this.dni = entrada.nextLong();
        System.out.println("Ingrese saldo actual: ");
        this.saldo_Actual = entrada.nextDouble();

    }
    //metodo para ingresar dinero y sumar al saldo actual.

    public void ingresar_Dinero(double ingresarDinero) {

        saldo_Actual += ingresarDinero;

    }
    //motodo para retirar dinero y descontar saldo actual.  

    public void retirarDinero(double retirar) {

        if (retirar > saldo_Actual) {
            saldo_Actual = 0;

        } else {
            saldo_Actual -= retirar;

        }

    }

    public void extraccionRapida() {
        double extraccion = 0;
        while (extraccion > saldo_Actual * 0.2) {

        }

        saldo_Actual -= extraccion;

    }

    public void consultar_Saldo() {

        System.out.printf(" El saldo actual es %.2f \n ", saldo_Actual);
    }
     public  void  consultarDatos (){
        System.out.printf( " El numero de cuenta es %d \n " ,numeroCuenta);
         System.out.printf( " El DNI es %d \n " , dni );     
  
     }
     
}
