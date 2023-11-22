/*
64.- Se dice que una matriz M es simétrica perfecta si tiene el mismo número de filas y
de columnas (MxM) y si todos sus elementos cumplen que el elemento de la posición [i]
[j] es el mismo que el de la posición [j][i].
Implementa un programa que analice una matriz (creala y ponle valores tú) e indique si
es simétrica perfecta o no.
 */
package RelArraBi;

import java.util.Scanner;

public class E64 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N, M;
        boolean simperfecta = true;
        System.out.println("A continuación le pediremos datos para completar una matriz.");
        System.out.println("La analizaremos y le diremos si su matriz tiene simetría perfecta.");
        do {
            System.out.println("Indique el número de filas: ");
            N = teclado.nextInt();
            if (N < 1) {
                System.out.println("Error! Tiene que ser mínimo 2.");
            }
        } while (N < 1);
        do {
            System.out.println("Ahora indique el número de columnas: ");
            M = teclado.nextInt();
            if (M < 1) {
                System.out.println("Error! Tiene que ser mínimo 2.");
            }
        } while (M < 1);
        int arra[][] = new int[N][M];
        System.out.println("A continuación le pediremos números enteros para rellenar el array.");
        System.out.println("Introduzca el valor para la posición...");
        for (int i = 0; i < arra.length; i++) {
            for (int k = 0; k < arra[i].length; k++) {
                System.out.print("Fila " + i + ". Columna " + k + ": ");
                arra[i][k] = teclado.nextInt();
            }
        }
        for (int i = 0; (i < arra.length) && (simperfecta); i++) {
            for (int k = 0; k < arra.length; k++) {
                if (i != k) {
                    if (arra[i][k] != arra[k][i]) {
                        simperfecta = false;
                    }
                }
            }
        }
        if (!simperfecta) {
            System.out.println("No tiene simetría perfecta.");
        } else {
            System.out.println("Si tiene simetría perfecta.");
        }
        teclado.close();

    }

}
