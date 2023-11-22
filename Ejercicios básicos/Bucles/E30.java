package com.mycompany.relacionbucles;

import java.util.Scanner;

public class E30 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mayor, menor, aux, i;
        System.out.print("Introduzca el primer número: ");
        mayor = teclado.nextInt();
        System.out.print("Introduzca el segundo número: ");
        menor = teclado.nextInt();
        int valor;
        int contador;
        if (mayor < menor) {
            aux = mayor;
            mayor = menor;
            menor = aux;
        }
        for (i = menor; i <= mayor; i++) {
            //El siguiente if es la modificación del ejercicio.
            //Quitándola (y sus llaves) se queda el ejercicio básico.
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
