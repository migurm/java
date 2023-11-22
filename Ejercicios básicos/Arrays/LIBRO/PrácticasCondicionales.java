/* Pides 5 numeros por teclado y busca el mayor con el metodo del candidato. Hay que controlar que los valores
sean correctos, números positivos.*/
package LIBRO;

import java.util.Scanner;

public class PrácticasCondicionales {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int mayor, num1, num2, num3, num4, num5;
        System.out.println("A continuación, introduzca 5 números y le diremos cuál es el mayor.");
        System.out.println("Introduzca el primero; ");
        num1 = teclado.nextInt();
        do {
            System.out.println("Introduzca el primer valor: ");
            num1 = teclado.nextInt();
            if (num1 <= 0) {
                System.out.println("Número erróneo.");
            }
        } while (num1 <= 0);
        
        mayor = num1;
        
        do {
            System.out.println("Introduzca el primer valor: ");
            num2 = teclado.nextInt();
            if (num2 <= 0) {
                System.out.println("Número erróneo.");
            }
        } while (num2 <= 0);
        
        if(num2>mayor){
            mayor=num2;
        }

    }

}
