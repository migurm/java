/*
60.- Crea un programa que cree una matriz de 10x10 e introduzca los resultados de las
tablas de multiplicar del 1 al 10 (cada tabla en una fila). Luego muestra la matriz por
pantalla (en forma de matriz).
 */
package RelArraBi;

import java.util.Scanner;

public class E60 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 1, tabla = 1;
        int arra[][] = new int[10][10];
        for (int i = 0; i < arra.length; i++) {
            for (int k = 0; k < arra[i].length; k++) {
                arra[i][k] = num * tabla;
                num++;
            }
            tabla++;
            num = 1;
        }
        for (int i = 0; i < arra.length; i++) {
            for (int k = 0; k < arra[i].length; k++) {
                System.out.print(arra[i][k] + " ");
            }
            System.out.println("");
        }
        teclado.close();
    }

}
