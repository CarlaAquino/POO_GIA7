/*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package ejercicio5;

import java.util.Scanner;


public class Principal {

   
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
        cuenta.datosCuenta();
        int cont=0,opcion=0;
       do{
           System.out.println("Por favor seleccione una opcion: ");
           System.out.println("1. Cantidad de dinero a ingresar: ");
           System.out.println("2. Cntidad de dinero a retirar: .");
           System.out.println("3. Extraccion rapida.");
           System.out.println("4. Consulta de saldo.");
           System.out.println("5. Consultar datos de la cuenta.");
           System.out.println("6. Salir.");
           opcion = entrada.nextInt();
           if( opcion>=1 &&  opcion<=6){
               cont=1;
               
           }else{
               System.out.println("--------------------------------------------");
               System.out.println("Opcion no encontrada, ingrese opcion valida.");
               System.out.println("---------------------------------------------");
           }
       }while(cont==0);
           
    switch(opcion){
        case 1:
            System.out.println("Selecciono la opcion 1: ");
            cuenta.ingresar_Dinero(opcion);
            break;
            
        case 2:
            System.out.println("Selecciono la opcion 2: ");
            cuenta.ingresar_Dinero(opcion);
            break;
            
        case 3:
            System.out.println("Selecciono la opcion 3: ");  
            cuenta.extraccionRapida();
            break;
        case 4:
            System.out.println("Selecciono la opcion 4: ");
            cuenta.consultar_Saldo();
            break;
            
        case 5:
            System.out.println("Selecciono la opcion 5: ");
            cuenta.consultarDatos();
            break;
            
        case 6:
            System.out.println("------------------------");
            System.out.println("Selecciono salir, vuelva pronto."); 
            System.out.println("-------------------------");
            
    }
   
}
}