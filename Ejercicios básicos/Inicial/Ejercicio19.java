package com.mycompany.relacionesjdk11;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca 5 números ENTEROS por pantalla. ");
        System.out.print("Valor 1:");
        int num1 = teclado.nextInt();
        System.out.print("Valor 2:");
        int num2 = teclado.nextInt();
        System.out.print("Valor 3:");
        int num3 = teclado.nextInt();
        System.out.print("Valor 4:");
        int num4 = teclado.nextInt();
        System.out.print("Valor 5:");
        int num5 = teclado.nextInt();
        int aux=num1;
        if((aux<num2)){
            aux=num2;
        }
        if((aux<num3)){
            aux=num3;
        }
        if((aux<num4)){
            aux=num4;
        }
        if((aux<num5)){
            aux=num5;
        }
        System.out.println("El número mayor es: "+aux);
        teclado.close();
        
        
       
    

    }

}
