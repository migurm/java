/*
116. Implemente un programa que muestre la linea mas larga de un fichero y:
a) Si hay mas de una, solo muestre la primera.
b) Si hay más de una, sólo muestre la última.
c) Si hay mas de una, muestre todas.
*/
package RelacionEjercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//Error en este programa, ejecuta la linea 43 si o si.
public class E116 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String fraseMasLarga="";
        String path ="src/RelacionEjercicios/";
        System.out.println("Introduzca el nombre del archivo (con su extension): ");
        path+=input.nextLine();
        String copiaFichero="", linea=" ";
        try(FileReader lector = new FileReader (path);BufferedReader buffer = new BufferedReader (lector)){
            while(linea!=null){
                linea=buffer.readLine();
                if(linea!=null){
                    copiaFichero+=linea;
                    copiaFichero+="\n";
                }
            }
        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado.");
        }catch(IOException e){
            System.out.println("Ocurrió un error.");
        }
        String [] frases = copiaFichero.split("\n");
        for (int i = 0 ; i < frases.length ; i++){
            if(frases[i].length()>fraseMasLarga.length())fraseMasLarga=frases[i];           
        }
        //a)Solo la primera.
        System.out.println("La frase más larga es: "+fraseMasLarga);
        //b)Solo la ultima cambiando el > por >= en la linea 40.
        //c)Todas con la misma longitud mas larga.
        for (int i = 0 ; i < frases.length ; i++){
            if(frases[i].length()==fraseMasLarga.length()){
                System.out.println(frases[i]);
            }
        }
    }
}
