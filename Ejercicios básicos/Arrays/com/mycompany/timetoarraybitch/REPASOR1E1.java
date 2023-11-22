package com.mycompany.timetoarraybitch;

import java.util.Scanner;

public class REPASOR1E1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, m;
        System.out.println("Introduzca el primer valor: ");
        m = teclado.nextInt();
        System.out.println("Introduzca el segundo valor: ");
        n = teclado.nextInt();
        System.out.println("a)" + (m / n * (m - n)));
        System.out.println("b)" + (12.3 / m + 5 - n * 9));
        System.out.println("c)" + (m * 2048 / n * 1024 - (Math.pow(m, n))));
        System.out.println("d) El resto de la división: " + ((Math.pow(3203 / m - n, n) / ((Math.pow(n, 2) * (Math.pow(m, 3)))))));

    }

}
