package com.mycompany.timetoarraybitch;

import java.util.Scanner;

public class posibleExamen {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Creamos los 2 arrays para las plazas de aparcamiento grandes y pequeñas.
        String g[] = {"L", "L", "L", "L", "L", "L", "L", "L", "L", "L"};
        String p[] = {"L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L"};
        String tamaño;
        String res;
        //Creamos la variable n para la elección del menú principal.
        int n;
        System.out.println("APARCAMIENTOS WEB NOVA");
        System.out.println("----------------------");
        System.out.println("1)Aparcar vehículo.");
        System.out.println("2)Sacar vehículo.");
        System.out.println("3)Mostrar aparcamiento.");
        System.out.println("4)Salir.");
        do {
            System.out.print("Opción? ");
            n = teclado.nextInt();
            if ((n < 1) || (n > 4)) {
                System.out.println("Opción incorrecta. Elija entre las 4 disponibles.");
            }
        } while ((n < 1) || (n > 4));
        switch (n) {
            case 1:
                tamaño = teclado.nextLine();

                do {
                    System.out.println("Tamaño del vehículo (G/P)?");
                    tamaño = teclado.nextLine();
                    while (!tamaño.equalsIgnoreCase("G") && (!tamaño.equalsIgnoreCase("P"))) {
                        tamaño = teclado.nextLine();
                    }
                    if (tamaño.equalsIgnoreCase("P")) {
                        for (int i = 0; i < p.length; i++) {

                            if (p[i].equals("L")) {
                                p[i].equals("O");
                                System.out.println("Vehículo aparcado en " + "P" + i);
                                i = p.length;
                            }
                        }
                    }
                    System.out.println("Aparcar otro (S/N)?: ");
                    res = teclado.nextLine();
                } while (!res.equalsIgnoreCase("N"));

                

                
        }

        

    }

}




