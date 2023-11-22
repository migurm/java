/*
102.- Crea un programa que pida al usuario una cadena de texto y un numero entero N.
A continuaci�n, el programa indicar� el car�cter de la cadena situado en la posici�n N.
En caso de que no se pueda realizar dicha acci�n debe mostrarse el mensaje: ?No existe
la posici�n N en la cadena� (Siendo N el n�mero indicado por el usuario).
*/
package Excepciones;

import java.util.Scanner;


public class E102 {

    public static void main(String[] args) {
        //Para hacer este ejercicio necesitamos el m�todo .CharAt();
        //nombreVabiableString.CharAt(posici�nQueQueramos);
        Scanner input = new Scanner (System.in);
        boolean completado=false;
        System.out.print("Introduzca un conjunto de caract�res a su gusto: ");
        String cadena=input.nextLine();
        do{
            System.out.print("Introduzca el n�mero del caracter de la cadena introducida que quiera: ");
            try{
                System.out.println(cadena.charAt(input.nextInt()));//La posici�n de los caracteres es como los arrays, la primera es cero.
                completado=true;
            }catch(Exception e){
                System.out.println("Esa posici�n no existe en la cadena!!");
                
            }
            
            
            
        }while(!completado);

    }

}
