/*
106.- Desarrolla el juego ?Adivina el número? (ejercicio 45 de esta relación de
problemas) pero controlando que se introducen números.
Recordatorio de las reglas:
El ordenador debe generar un número entre 1 y 100, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, el ordenador debe decirle al usuario si el número
introducido es mayor o menor que el pensado. Cuando consiga adivinarlo, debe indicarlo e imprimir
en pantalla el número de veces que el usuario ha intentado adivinar el número.
*/
package RepasoExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;
public class E106 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int azarMaquina = (int)((Math.random()*(100-1+1))+1);
        boolean numeroAdivinado=false;
        int contadorIntentos=0;
        System.out.println("BIENVENIDO AL JUEGO ADIVINA EL NUMERO");
        System.out.println("A continuación yo pensaré en un número de entre 1 y 100, y usted tendrá que adivinarlo.");
        System.out.println("Dispondrá de tantos intentos como necesite, en el caso de que introduzca algo que no sea un numero, contará como intento falllido.");
        System.out.println("Pensando el número...");
        System.out.println("Ya tengo el número!");
        while(!numeroAdivinado){
            System.out.print("El número que he pensado es...: ");
            try {
                int intento=(int)input.nextDouble();
                contadorIntentos++;
                if(intento==azarMaquina)numeroAdivinado=true;
                else if(intento<azarMaquina)System.out.println("Te has quedado corto!");
                else System.out.println("Te pasaste");
            }catch(InputMismatchException e){
                System.out.println("Error! Tiras un intento a la basura, keep trying!!");
                input.nextLine();
            }
            
        }
        System.out.println("Enhorabuena!!");
        System.out.println("Necesitaste "+contadorIntentos+" intentos.");
        System.out.println("Vuelve cuando quieras!");

    }

}
