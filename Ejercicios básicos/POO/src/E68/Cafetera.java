/*
68.- Crea la clase Cafetera con los atributos capacidadMaxima y cantidadActual.
También se necesitan los siguientes métodos:
? El constructor debe indicar la capacidad máxima en 1000 cc y la capacidad
actual en 0 (cafetera vacía).
? echarCafe: recibe una cantidad de café y lo anota en la capacidad actual. Hay
que controlar que la cantidad recibida no sea mayor que la capacidad máxima (si
es así, la cafetera se llena completamente y se desecha el sobrante)
? llenarCafetera: pone la cafetera a su valor máximo de cantidad.
? VaciarCafetera: tira todo el café de la cafetera.
? servirTaza: recibe un numero que indica la capacidad de la taza y hace que la
cafetera pierda esa cantidad de café. Hay que controlar si la cafetera puede servir
la taza.
? cantidadCafe: muestra cuanto café queda en la cafetera: Queda xxxxxxx cc de
café en la cafetera.
 */
package E68;

public class Cafetera {

    int capacidadMaxima;
    int capacidadActual;

    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.capacidadActual = 0;
    }

    public void echarCafe(int cc) {
        if ((capacidadActual + cc > capacidadMaxima) || (cc > capacidadMaxima)) {
            capacidadActual = capacidadMaxima;
            System.out.println("La cafetera está al completo, se desechó el sobrante.");
        } else {
            capacidadActual += cc;
        }
    }

    public void llenarCafetera() {
        if (this.capacidadActual == 1000) {
            System.out.println("La cafetera ya estaba llena...");
        } else {
            System.out.println("Se ha llenado la cafetera.");
            this.capacidadActual = capacidadMaxima;
        }
    }

    public void vaciarCafetera() {
        if (this.capacidadActual == 0) {
            System.out.println("La cafetera ya estaba vacía...");
        } else {
            System.out.println("Has vaciado la cafetera.");
            capacidadActual = 0;
        }
    }

    public void servirTaza(int cc) {
        if (cc > 0) {
            if (this.capacidadActual >= cc) {
                System.out.println("Se ha servido su taza de " + cc + " cc, disfrute.");
                this.capacidadActual -= cc;
            } else {
                System.out.println("No queda café para una taza de esa cantidad, lo siento.");
            }
        }else{
            System.out.println("No podemos servir tazas vacías o negativas, política de empresa.");
        }
    }
    public void cantidadCafe(){
        System.out.println("Queda "+this.capacidadActual+" cc de café en la cafetera.");
    }

}
