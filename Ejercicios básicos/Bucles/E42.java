package com.mycompany.relacionbucles;
import java.util.Scanner;
public class E42 {

    public static void main(String[] args) {
        int n = 0;
        int k = 0;
        int i = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número y le dibujaré un cuadrado con el lado de ese número.");
        System.out.println("Obviamente un número positivo y máximo 10, no te pases...");
        do {
            System.out.print("Introduzca el número: ");
            n = teclado.nextInt();
            if ((n < 0) || (n > 10)) {
                System.out.println("Joder, mira que te lo he dicho... ");
            }
        } while ((n < 0) || (n > 10));
        for (i = n; i >= 1; i--) {
            for (k = n; n >= 1; k--) {
                System.out.print( i );
            }
            System.out.println(" ");
        }
        System.out.println("Su cuadrado.");

    }

}
