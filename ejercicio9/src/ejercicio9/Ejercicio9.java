/*Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/
package ejercicio9;




public class Ejercicio9 {

    
    public static void main(String[] args) {
        
        Matematica matematica = new Matematica();
        matematica.setNum1(Math.random()*10);
        matematica.setNum2(Math.random()*10);
        
        System.out.println("El primer numero es: "+ matematica.getNum1());
        
        System.out.println("El segundo numero es: "+ matematica.getNum2());
        
        System.out.println("El numero mayor es: "+ matematica.devolverMayor());
        
        System.out.println("la potencia es: ");
        matematica.calcularPotencia();
        System.out.println("La raiz es: ");
        matematica.calculaRaiz();
    }
    
}
