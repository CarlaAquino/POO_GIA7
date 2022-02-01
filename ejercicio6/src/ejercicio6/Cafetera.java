package ejercicio6;

public class Cafetera {

    private int cantidad_Actual;
    private int capacidad_Maxima;

    public Cafetera() {

    }

    public Cafetera(int cantidad_Maxima, int capacidad_Actual) {
        this.cantidad_Actual = capacidad_Actual;
        this.capacidad_Maxima = capacidad_Maxima;
    }

    public int getcntidad_Actual() {
        return cantidad_Actual;
    }

    public void setcantidad_Actual() {
        this.cantidad_Actual = cantidad_Actual;
    }

    public int getcantidad_Maxima() {
        return capacidad_Maxima;
    }

    public void setcapacidad_Maima() {
        this.capacidad_Maxima = capacidad_Maxima;
    }

    public void llenarCafetera() {
        this.cantidad_Actual = this.capacidad_Maxima;
    }

    public void servirTaza(int servir) {
        if (servir > this.cantidad_Actual) {
            servir = this.cantidad_Actual;
            System.out.printf("La taza se lleno con %d : ", servir);
            this.cantidad_Actual = 0;
        } else {
            this.cantidad_Actual -= servir;
        }
    }

    public void vaciarCafetera() {
        System.out.println("Se vacio la cafetera");
        this.cantidad_Actual = 0;
    }

    public void agregarCafe(int cafe) {
        if (cafe + this.cantidad_Actual > this.capacidad_Maxima) {
            System.out.printf("La cafetera se lleno por completo, sobrando %d \n", (cafe + this.cantidad_Actual) - this.capacidad_Maxima);
            this.cantidad_Actual = this.capacidad_Maxima;
        } else {
            this.cantidad_Actual += cafe;
            System.out.printf("Se agrego el cafe y hay %d \n", this.cantidad_Actual);
        }

    }
    public void mostrarCantidadDeCafe(){
          System.out.printf(" La cantidad de cafe que hay es %d \n",this.cantidad_Actual);
    }  
}


