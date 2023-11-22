/*
68.- Crea la clase Cafetera con los atributos capacidadMaxima y cantidadActual.
Tambi�n se necesitan los siguientes m�todos:
? El constructor debe indicar la capacidad m�xima en 1000 cc y la capacidad
actual en 0 (cafetera vac�a).
? echarCafe: recibe una cantidad de caf� y lo anota en la capacidad actual. Hay
que controlar que la cantidad recibida no sea mayor que la capacidad m�xima (si
es as�, la cafetera se llena completamente y se desecha el sobrante)
? llenarCafetera: pone la cafetera a su valor m�ximo de cantidad.
? VaciarCafetera: tira todo el caf� de la cafetera.
? servirTaza: recibe un numero que indica la capacidad de la taza y hace que la
cafetera pierda esa cantidad de caf�. Hay que controlar si la cafetera puede servir
la taza.
? cantidadCafe: muestra cuanto caf� queda en la cafetera: Queda xxxxxxx cc de
caf� en la cafetera.
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
            System.out.println("La cafetera est� al completo, se desech� el sobrante.");
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
            System.out.println("La cafetera ya estaba vac�a...");
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
                System.out.println("No queda caf� para una taza de esa cantidad, lo siento.");
            }
        }else{
            System.out.println("No podemos servir tazas vac�as o negativas, pol�tica de empresa.");
        }
    }
    public void cantidadCafe(){
        System.out.println("Queda "+this.capacidadActual+" cc de caf� en la cafetera.");
    }

}
