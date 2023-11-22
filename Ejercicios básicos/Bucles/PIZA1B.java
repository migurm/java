package com.mycompany.relacionbucles;

import java.util.Scanner;

public class PIZA1B {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i = 0;
        int n = 0;
        int fin = 0;
        do {
            System.out.print("Introduzca un número mayor de 1: ");
            n = teclado.nextInt();
            if (n <= 1) {

                System.out.println("Número erróneo");
            }
        } while (fin <= 1);
        for (i = 1; i <= fin; i++) {
            fin = fin + i;

        }
        System.out.println("La suma total es: "+fin);

    }

}

