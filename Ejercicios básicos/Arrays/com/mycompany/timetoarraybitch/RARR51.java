package com.mycompany.timetoarraybitch;

import java.util.Scanner;

public class RARR51 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contazul = 0, contarrojo = 0;
        String arra[] = new String[10];
        for (int i = 0; i < arra.length; i++) {
            System.out.print("Diga el color " + (i + 1) + ": ");
            arra[i] = teclado.nextLine();
            if (arra[i].equals("rojo")) {
                contarrojo++;
            }
            if (arra[i].equals("azul")) {
                contazul++;
            }
        }
        System.out.println("\nEl color 'rojo' aparece "+contarrojo+" veces en el array.");
        System.out.println("El color 'azul' aparece "+contazul+" veces en el array.");
        teclado.close();
    }
}
