/*
Escribe un programa que cuente la cantidad de veces que aparece cada letra en 
una cadena dada, y que guarde el resultado en un mapa, donde la clave es la 
letra y el valor es la cantidad de veces que aparece. Después, imprime por 
pantalla el mapa resultante.

Por ejemplo, si la cadena es "hola mundo", el mapa resultante sería:
{h=1, o=2, l=1, a=1, m=1, u=1, n=1, d=1}
*/

package propuestosChatGPT;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class mapas1 {

    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.print("Introduzca una cadena de texto: ");
        //Almacenamos la entrada por teclado todo minuscula, sin espacios.
        String cadenaTexto = input.nextLine().replaceAll(" ", "").toLowerCase();
        System.out.println(cadenaTexto);
        //Creamos el mapa.
        Map <Character, Integer> mapaTexto = new HashMap <> ();
        char [] arrayString = cadenaTexto.toCharArray();
        for (int i=0 ; i< arrayString.length ; i++){
            mapaTexto.put(arrayString[i],vecesQueAparece(arrayString, arrayString[i]));
        }
        System.out.println(mapaTexto);
    }
    
    public static int vecesQueAparece(char [] array, char caracter){
        int veces=0;
        for(char valor:array){
            if(valor==caracter)veces++;
        }
        return veces;
    }
}
