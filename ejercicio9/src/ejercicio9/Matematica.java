package ejercicio9;

public class Matematica {

    public double num1;
    public double num2;
    
    public Matematica() {
    }
    
    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public double getNum1() {
        return num1;
    }
    
    public double getNum2() {
        return num2;
    }
    
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double devolverMayor() {
        if (this.num1 > this.num2) {
            return this.num1;
        } else {
            return this.num2;            
        }
        
    }

    public void calcularPotencia() {
        double redondeo1 = Math.round(this.num1);
        double redondeo2 = Math.round(this.num2);
        if (this.num1 > this.num2) {
            System.out.print("la potencia elevada es: " + Math.pow(num1, num2));
            
        } else {
            System.out.println("la potenci elevada es:" + Math.pow(num2, num1));
        }
    }    

    public void calculaRaiz() {
        double valorAbsoluto = 0;
        if (this.num1 > this.num2) {
            valorAbsoluto = Math.abs(num1);
            System.out.println("el valor absoluto es: " + valorAbsoluto);
            System.out.printf("La raiz cuadrada %f es: %f \n", num1, Math.sqrt(valorAbsoluto));
            
        } else {
            valorAbsoluto = Math.abs(num2);
            System.out.printf("La raiz cuadrada %f es: %f \n", num2, Math.sqrt(valorAbsoluto));
        }
        
    }
}
