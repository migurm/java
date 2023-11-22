/*
104.-Implementa un programa que cree un array de números decimales cuyo tama?o
debe indicarlo el usuario por teclado. A continuación, utilizando un bucle, debe pedir
tantos valores por teclado como tama?o tenga el array y los debe ir guardando en cada
celda del array. Hay que manejar todas posibles excepciones y seguir pidiendo valores
hasta rellenar completamente el vector.
 */
package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E104 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean longitudCompletada = false;//Booleano para comprobar si hemos colocado la longitud del array
        int longitudArray = 0;//Me pide que la inicialice desde el principio
        do
        {
            try
            {
                System.out.print("Introduzca una longitud para el array: ");
                longitudArray = input.nextInt();
                if (longitudArray <= 0)
                {
                    System.out.println("Tienen que ser posiciones positivas.");
                } else
                {
                    longitudCompletada = true;
                }

            } catch (InputMismatchException e)
            {
                System.out.println("Vamos a ver, persona especial, la longitud ha de ser un número entero.");
                input.nextLine();//Limpiamos el buffer del teclado en caso erróneo.
            }
        } while (!longitudCompletada);

        double arra[] = new double[longitudArray];

        for (int i = 0; i < arra.length; i++)
        {
            try
            {
                System.out.print("Introduzca un valor para la posicion " + (i + 1) + ": ");
                arra[i] = input.nextDouble();

            } catch (InputMismatchException e)
            {
                System.out.println("Solo numeros, preferiblemente decimales.");
                i--;
                input.nextLine();
            }
            //No contemplatos la IndexOutOfBoundsException porque el usuario no va a elegir el indice donde mete el valor.
        }
        input.close();

    }

}
