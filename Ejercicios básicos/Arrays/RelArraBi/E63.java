/*
63.- Dada una matriz MxM, crear un programa que muestre:
a) El mayor elemento de la diagonal principal.
b) La media de los valores de la diagonal principal.
*/
package RelArraBi;

public class E63 {

    public static void main(String[] args) {
        //Variable mayor para el mayor valor de la diagonal principal.
        //Sumatorio de valores y de posiciones de la diagonal para la media.
        int mayor = 0, posiciones = 0, sumvalores = 0;
        //Creamos un array cuadrado de lado aleatorio de entre 5 y 7, y lo llenamos de valores aleatorios de entre 5 y 1.
        int M = (int) ((Math.random() * (7 - 5 + 1)) + 5);
        int arra[][] = new int[M][M];
        for (int i = 0; i < arra.length; i++) {
            for (int k = 0; k < arra[i].length; k++) {
                arra[i][k] = (int) ((Math.random() * (5 - 1 + 1)) + 1);
            }
        }
        //Enseñamos el array aleatorio.
        for (int i = 0; i < arra.length; i++) {
            for (int k = 0; k < arra[i].length; k++) {
                System.out.print(arra[i][k] + " ");
            }
            System.out.println("");
        }
        System.out.println("\nAhora vamos a mostrar los valores que tenemos en la diagonal de la matriz.");
        //Vamos a mostrar los valores que hay en la diagonal.
        for (int i = 0; i < arra.length; i++) {
            for (int k = 0; k < arra.length; k++) {
                if (i == k) {
                    sumvalores += arra[i][k];
                    posiciones++;
                    System.out.print(arra[i][k] + " ");
                    if (arra[i][k] > mayor) {
                        mayor = arra[i][k];
                    }
                }
            }
        }
        System.out.println("\na) El mayor valor de la diagonal es: " + mayor);
        System.out.println("b) La media de los valores de la diagonal es: " + ((double)sumvalores / posiciones));
        //Media calculada en int... bueno...capa los decimales.
    }
}
