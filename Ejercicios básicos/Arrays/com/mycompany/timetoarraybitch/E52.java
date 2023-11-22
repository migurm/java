package com.mycompany.timetoarraybitch;

import java.util.Scanner;

public class E52 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean iguales = true;
        int largo =2; /*(int) ((Math.random() * (6 - 3 + 1)) + 3);*/
        System.out.println("El largo del array aleatoriamente (entre 3 y 6) es de: " + largo + ".");
        System.out.println("Los valores del primer array serán aleatorios de 3 al 6 incluídos.");
        System.out.println("Los valores del segundo array los introducirá usted, de valores entre el 3 y el 6 incluídos. ");
        int arra1[] = new int[largo];
        int arra2[] = new int[largo];
        for (int i = 0; i < arra1.length; i++) {
            arra1[i] = (int) ((Math.random() * (2 - 1 + 1)) + 1);
            do {
                System.out.print("Introduzca el valor " + (i + 1) + ": ");
                arra2[i] = teclado.nextInt();
                if ((arra2[i] < 1) || (arra2[i] > 2)) {
                    System.out.println("Valores entre el 3 y el 6 incluidos, por favor.");
                }
            } while ((arra2[i] < 1) || (arra2[i] > 2));
            if(arra1[i]!=arra2[i]){
                iguales=false;
            }
        }
        System.out.print("\nEl primer array era: |");
        for (int i = 0; i < arra2.length; i++) {
            System.out.print(arra1[i]+"|");
        }
        if(iguales==true){
            System.out.println("\nSon iguales.");
        }else{
            System.out.println("\nNo somos lo mismo ;-).");
        }
teclado.close();
    }

}
