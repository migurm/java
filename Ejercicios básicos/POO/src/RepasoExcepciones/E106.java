/*
106.- Desarrolla el juego ?Adivina el n�mero? (ejercicio 45 de esta relaci�n de
problemas) pero controlando que se introducen n�meros.
Recordatorio de las reglas:
El ordenador debe generar un n�mero entre 1 y 100, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, el ordenador debe decirle al usuario si el n�mero
introducido es mayor o menor que el pensado. Cuando consiga adivinarlo, debe indicarlo e imprimir
en pantalla el n�mero de veces que el usuario ha intentado adivinar el n�mero.
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
        System.out.println("A continuaci�n yo pensar� en un n�mero de entre 1 y 100, y usted tendr� que adivinarlo.");
        System.out.println("Dispondr� de tantos intentos como necesite, en el caso de que introduzca algo que no sea un numero, contar� como intento falllido.");
        System.out.println("Pensando el n�mero...");
        System.out.println("Ya tengo el n�mero!");
        while(!numeroAdivinado){
            System.out.print("El n�mero que he pensado es...: ");
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
