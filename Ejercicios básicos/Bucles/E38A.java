package com.mycompany.relacionbucles;

import java.util.Scanner;

public class E38A {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Creamos la variable total para que sea el contador del número de notas introducidas.
        //La variable sumanotas para el total de la suma de las notas.
        //La variable nota para las notas correctas introducidas.
        //La variable media para la media.
        int media = 0;
        double total = 0;
        double sumanotas = 0;
        double nota = 0;
        do {
            System.out.print("Introduzca la nota correspondiente: ");
            nota = teclado.nextDouble();
            if ((nota >= 0) && (nota <= 10)) {
                sumanotas = sumanotas + nota;
                total++;
            } else if (nota == -1) {
            } else {
                System.out.println("Nota errónea");
            }
        } while (nota != -1);
        media =(int)Math.round(sumanotas/total);
        System.out.println("La nota media es de: " + media);
    }
}
