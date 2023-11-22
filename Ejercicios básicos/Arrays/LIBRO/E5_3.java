/*5.3 Introducir por teclado un número n; a continuación solicitar al usuario que teclee n
números. Realizar la media de los números positivos, la media de los negativos y contar el
número de ceros introducidos.
 */
package LIBRO;

import java.util.Scanner;

public class E5_3 {

    public static void main(String[] args) {
        int num, contapos = 0, contaneg = 0, contacero = 0, sumapos = 0, sumaneg = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("¿Cuántos números desea introducir? ");
            num = teclado.nextInt();
            if (num <= 0) {
                System.out.println("Números de verdad...");
            }
        } while (num <= 0);
        int arra1[];
        arra1 = new int[num];
        for (int i = 0; i < (arra1.length); i++) {
            System.out.print("Introduzca el valor " + (i + 1) + ": ");
            arra1[i] = teclado.nextInt();
            if (arra1[i] > 0) {
                contapos++;
                sumapos += arra1[i];
                //Esto es lo mismo que sumapos=sumapos+arra[i];
            } else if (arra1[i] < 0) {
                contaneg++;
                sumaneg += arra1[i];
            } else {
                contacero++;
            }

        }
        if (contapos == 0) {
            System.out.println("No has introducido números positivos.");

        } else {
            System.out.println("\nLa media de los números positivos es: " +/*Casteo de un int a un double*/ ((double)sumapos / contapos));
        }
        if (contaneg == 0) {
            System.out.println("No has introducido números negativos.");

        } else {
            System.out.println("La media de los números negativos es: " + ((double)sumaneg / contaneg));
        }
        if (contacero == 0) {
            System.out.println("No has introducido ningún cero. ");
        } else {

            System.out.println("El número de ceros es: " + contacero);
        }
        teclado.close();
    }
}
