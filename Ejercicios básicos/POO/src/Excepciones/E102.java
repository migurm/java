/*
102.- Crea un programa que pida al usuario una cadena de texto y un numero entero N.
A continuación, el programa indicará el carácter de la cadena situado en la posición N.
En caso de que no se pueda realizar dicha acción debe mostrarse el mensaje: ?No existe
la posición N en la cadenaµ (Siendo N el número indicado por el usuario).
*/
package Excepciones;

import java.util.Scanner;


public class E102 {

    public static void main(String[] args) {
        //Para hacer este ejercicio necesitamos el método .CharAt();
        //nombreVabiableString.CharAt(posiciónQueQueramos);
        Scanner input = new Scanner (System.in);
        boolean completado=false;
        System.out.print("Introduzca un conjunto de caractéres a su gusto: ");
        String cadena=input.nextLine();
        do{
            System.out.print("Introduzca el número del caracter de la cadena introducida que quiera: ");
            try{
                System.out.println(cadena.charAt(input.nextInt()));//La posición de los caracteres es como los arrays, la primera es cero.
                completado=true;
            }catch(Exception e){
                System.out.println("Esa posición no existe en la cadena!!");
                
            }
            
            
            
        }while(!completado);

    }

}
