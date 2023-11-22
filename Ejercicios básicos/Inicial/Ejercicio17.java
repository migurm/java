package com.mycompany.relacionesjdk11;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Indique su contraseña: ");
        String pass1 = teclado.nextLine();
        System.out.print("Repita la misma contraseña: ");
        String pass2 = teclado.nextLine();
        if (pass1.equals(pass2)) {
            System.out.println("Las dos contraseñas son iguales.");
        }
        else{
            System.out.println("Las dos contraseñas con diferentes.");
        }

    }
}