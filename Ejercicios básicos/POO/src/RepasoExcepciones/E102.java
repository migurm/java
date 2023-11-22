/*
102.- Crea un programa que pida al usuario una cadena de texto y un numero entero N.
A continuaci�n, el programa indicar� el car�cter de la cadena situado en la posici�n N.
En caso de que no se pueda realizar dicha acci�n debe mostrarse el mensaje: ?No existe
la posici�n N en la cadena� (Siendo N el n�mero indicado por el usuario).
 */
package RepasoExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E102 {

    public static void main(String[] args) {
        int N=0;
        boolean enteroCorrecto = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca una cadena de texto: ");
        String cadenaDeTexto = input.nextLine();
        do
        {
            System.out.print("Ahora introduzca un n�mero entero: ");
            try
            {
                N = input.nextInt();
                enteroCorrecto = true;

            } catch (InputMismatchException e)
            {
                System.out.println("Error! No es un n�mero entero.");
                input.nextLine();
            }
        } while (!enteroCorrecto);        
        try{
            System.out.println(cadenaDeTexto.charAt(N));
            
        }catch(IndexOutOfBoundsException e){
            System.out.println("No existe la posici�n "+N+" en la cadena.");           
        }
    }
}
