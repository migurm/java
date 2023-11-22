package com.mycompany.relacionbucles;

import java.util.Scanner;

public class E32 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int i;
        System.out.print("Introduzca un número por teclado: ");
        num = teclado.nextInt();
        while ((num % 2 != 0) || (num % 3 != 0)) {
            System.out.println("Error.");
            System.out.println("Introduzca un número por teclado: ");
            num = teclado.nextInt();
        }
        for(i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(num+ " entre "+i+" es: "+(num/i));
            }
        }
    }

}