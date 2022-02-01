
package ejercicio6;

import java.util.Scanner;


public class Principal {

    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       Cafetera cafetera = new Cafetera(0,1000);
       int opcion,opcionSubMenu;
        System.out.println("------------MENU---------------");
        System.out.println(" 1. Llenar cafetera");
        System.out.println(" 2. Servir taza");
        System.out.println(" 3. Vaciar cafetera");
        System.out.println(" 4. Agregar cafe");
        System.out.println(" 5. Mostrar cantidad de cafe");
        System.out.println(" 6. salir");
        opcion=entrada.nextInt();
        switch(opcion){
            case 1:
                cafetera.llenarCafetera();
                break;
            case 2:
                do{
                    System.out.println("-----SUB MENU-----");
                    System.out.println(" 1) taza de 150cc");   
                    System.out.println(" 2) taza de 250cc");
                    System.out.println(" 3) taza de 350cc");
                    opcionSubMenu = entrada.nextInt();
                    switch(opcionSubMenu){
                        case 1:
                            cafetera.servirTaza(150);
                            break;
                        case 2:
                            cafetera.servirTaza(250);
                            break;
                        case 3:
                            cafetera.servirTaza(350);
                            break;
                        default:
                            System.out.println("Ingresar opcion correcta!");
                    }
                }while(opcionSubMenu<1 || opcionSubMenu>3);
              
            case 3:
                cafetera.vaciarCafetera();;
                break;
            case 4:
                System.out.println("Ingrese cafe a la cafetera: ");
               int agregar = entrada.nextInt();
                break;
            case 5:
                cafetera.mostrarCantidadDeCafe();
                break;
            case 6:
                System.out.println("Salir");
            default:
                System.out.println("Opcion incorrecta");
           
        }
    }
    
}
