
package E68;


public class E68 {

    public static void main(String[] args) {
        Cafetera nespresso = new Cafetera();
        nespresso.echarCafe(900);
        nespresso.llenarCafetera();
        nespresso.llenarCafetera();
        nespresso.vaciarCafetera();
        nespresso.vaciarCafetera();
        nespresso.echarCafe(250);
        nespresso.servirTaza(300);
        nespresso.servirTaza(250);
        nespresso.cantidadCafe();
        nespresso.llenarCafetera();
        nespresso.servirTaza(600);
        nespresso.cantidadCafe();

    }

}
