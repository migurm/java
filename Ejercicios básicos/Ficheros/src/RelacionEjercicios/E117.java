/*
117. Realiza un programa que dado un fichero de texto, muestre el numero de 
caracteres, el numero de palabras y el número de líneas del fichero. Suponemos que
las palabras están separadas de otra siempre por un espacio en blanco.
*/
package RelacionEjercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class E117 {

    public static void main(String[] args) {
        String path="src/RelacionEjercicios/";
        System.out.print("Introduzca el nombre del archivo (con la extension): ");
        Scanner input = new Scanner (System.in);
        path+=input.nextLine();
        String copiaTexto="", linea=" ";
        try (FileReader lector = new FileReader(path);BufferedReader buffer=new BufferedReader(lector)){
            while(linea!=null){
                linea=buffer.readLine();
                if(linea!=null){
                    copiaTexto+=linea;
                    copiaTexto+="\n";
                }
            }
            System.out.println("");
            System.out.println(copiaTexto);
            String [] caracteres = copiaTexto.split("");
            String [] palabras = copiaTexto.split(" ");
            String [] lineas = copiaTexto.split("\n");
            System.out.println("Número de caracteres: "+caracteres.length);
            System.out.println("Numero de palabras: "+palabras.length);
            System.out.println("Numero de lineas: "+lineas.length);
        }catch(FileNotFoundException e){
                System.out.println("Archivo no encontrado.");               
        }catch(IOException e){
            System.out.println("Ocurrió un error.");
        }
    }
}
