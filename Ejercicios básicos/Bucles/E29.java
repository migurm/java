package com.mycompany.relacionbucles;

import java.util.Scanner;

public class E29 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Copio entero el ejercicio 14:
        int minuto = 0;
        int segundos;
        do {
            System.out.println("A continuación diga el segundo de partido y le diremos en qué minuto se encuentra.");
            System.out.print("Indique un segundo del partido: ");
            segundos = teclado.nextInt();
            if (segundos >= 5400) {
                System.out.println("No puedes poner los segundos máximos.");
                System.out.print("Introduzca un segundo del partido: ");
                segundos = teclado.nextInt();
            } else if (segundos < 0) {
                System.out.println("Ciao");
            } else {
                minuto = Math.round(segundos / 60) + 1;
                System.out.println("Ese segundo está en el minuto: " + minuto);
            }
            
        } while (segundos > 0);

    }

}