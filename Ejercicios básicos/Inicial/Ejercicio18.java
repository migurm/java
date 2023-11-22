package com.mycompany.relacionesjdk11;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        double num1 = teclado.nextDouble();
        System.out.print("Introduzca un segundo número: ");
        double num2 = teclado.nextDouble();
        if ((num1 > num2)) {
            System.out.println(num1 + " es mayor que " + num2);
            System.out.println("Resta: " + (num1 - num2) + " División: " + num1 / num2);
        } else {
            System.out.println(num2 + " Es mayor o igual que " + num1);
            System.out.println("Suma: " + (num1 + num2) + " Producto: " + (num1 * num2));
        }
    }

}
