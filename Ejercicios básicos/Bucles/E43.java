package com.mycompany.relacionbucles;

import java.util.Scanner;

public class E43 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 0;
        int k = 0;
        int i = 0;
        System.out.println("Introduzca un número y le dibujaré un triangulo con los lados de ese valor.");
        System.out.println("Obviamente un número positivo y máximo 20, no te pases...");
        do {
            System.out.print("Introduzca el número: ");
            n = teclado.nextInt();
            if ((n < 0) || (n > 20)) {
                System.out.println("Joder, mira que te lo he dicho... ");
            }
        } while((n < 0) || (n > 20));
        for(i=1;i<n;i++){
            System.out.println(i);
            for(i=1;i<n;i++){
                System.out.println(" "+i);
                if(i%2!=0){
                    System.out.print("");
                }
            }
        }
        for(k=1;k<n;k++){
            System.out.print(k);
        }
    }

}
