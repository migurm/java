package com.mycompany.timetoarraybitch;
import java.util.Scanner;
public class PIZA2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lar = 0;
        int suma = 0;
        int media = 0;
        int i = 0;
        do {
            System.out.println("Indique la longitud del <array> (mín 1, máx 12) :");
            lar = teclado.nextInt();
            if ((lar < 1) || (lar > 12)) {
                System.out.println("Lea las indicaciones, por favor.");
            }
        } while ((lar < 1) || (lar > 12));
        int lista[];
        lista = new int[lar];
        System.out.println("Introduzca datos entre el 0 y el 10 para rellenar el <array>");
        for (i = 0; i < (lista.length); i++) {
            do {
                System.out.println("Introduzca un valor para la posición " + i + ": ");
                lista[i] = teclado.nextInt();
                if ((lista[i] < 0) || (lista[i] > 10)) {
                    System.out.println("Valor incorrecto.");
                }
            } while ((lista[i] < 0) || (lista[i] > 10));
            suma = suma + lista[i];
        }
        teclado.close();
        System.out.println("La suma del contenido del <array> es: " + suma);
        System.out.println("La media de los valores del <array> es: " + (suma / (lista.length)));
    }

}
