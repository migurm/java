/*
62.- Crea un programa que encuentre el elemento de mayor valor de una matriz y…
a) … muestre la posición de su primera aparición.
b) … muestre una lista con las posiciones de todas sus apariciones.
 */
package RelArraBi;

public class E62 {

    public static void main(String[] args) {
        int mayor = 0, filamayor = 0, columnamayor = 0;
        int N = (int) ((Math.random() * (6 - 3 + 1)) + 3);
        int M = (int) ((Math.random() * (6 - 3 + 1)) + 3);
        System.out.println("La matriz es de " + N + " filas y " + M + " columnas.");
        int arra[][] = new int[N][M];
        System.out.println("Rellenamos la matriz con números aleatorios de entre -10 y 20 incluidos");
        for (int i = 0; i < arra.length; i++) {
            for (int k = 0; k < arra[i].length; k++) {
                arra[i][k] = (int) ((Math.random() * (20 - (-10) + 1)) + (-10));
                if (arra[i][k] > mayor) {
                    mayor = arra[i][k];
                    filamayor = i;
                    columnamayor = k;
                }
            }
        }
        //Mostramos la matriz por gusto.
        for (int i = 0; i < arra.length; i++) {
            for (int k = 0; k < arra[i].length; k++) {
                System.out.print(arra[i][k] + " ");
            }
            System.out.println("");
        }
        System.out.println("El mayor es: " + mayor);
        System.out.println("a) Aparece por primera vez en la fila " + filamayor + " y en la columna " + columnamayor);
        System.out.println("");
        System.out.println("Este número aparece en las siguientes posiciones: ");
        for (int i = 0; i < arra.length; i++) {
            for (int k = 0; k < arra[i].length; k++) {
                if (arra[i][k] == mayor) {
                    System.out.println("En la fila " + i + " columna " + k);

                }
            }
        }      
    }
}
