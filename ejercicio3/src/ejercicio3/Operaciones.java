package ejercicio3;

import java.util.Scanner;

public class Operaciones {

    private double num1;
    private double num2;

    public Operaciones() { //constructor vacio

    }

    //metodos pasados por parametros:
    public Operaciones(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getnum1() {
        return num1;
    }

    public void setnum1() {
        this.num1 = num1;
    }

    public double getnum2() {
        return num2;
    }

    public void setnum2() {
        this.num2 = num2;
    }

    public void crearOperaciones() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese primer numero: ");
        this.num1 = entrada.nextInt();

        System.out.println("Ingrese segundo numero: ");
        this.num2 = entrada.nextInt();
    }

    public double sumar() {
        return num1 + num2;

    }

    public double restar() {
        return num1 - num2;

    }

    public double multiplicacion() {
        if (num1 == 0 || num2 == 0) {
            return 0;
        } else {
            return num1 * num2;
        }

    }

    public double dividir() {
        if (num1 == 0 || num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }

    }

}
