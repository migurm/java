/*
113. Crea un programa que vaya pidiendo frases por teclado al usuario hasta que
introduzca una frase vacía.
Para cada frase que el usuario introduzca, se almacenará una debajo de otra en un
fichero te texto llamado EJ112.dat.
Este fichero no debe existir al ejecutarse el programa.
*/
package RelacionEjercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class E113 {

    public static void main(String[] args) {
        //Creamos la variable String con la ruta del archivo.
        String path = "src/RelacionEjercicios/EJ112.dat";
        //Creamos la variable para almacenar las frases.
        String frase=" ";
        //Creamos el bucle que irá añadiendo las frases hasta que se introduzca
        //una frase vacía.
        int indice=1;//La usaremos para indicar al usuario el número de frases
        //Abrimos el teclado
        Scanner input = new Scanner (System.in);
        while (!frase.equals("")){   
            //Iniciamos el try con las herramientas necesarias
            try(FileWriter escritor = new FileWriter(path, true); BufferedWriter buffer = new BufferedWriter(escritor)){
                //Antes en el parámetro del FileWriter solo puse el path y no el true y no escribía nada
                System.out.print("Introduzca la "+indice+"a frase:");
                frase=input.nextLine();
                buffer.write(frase);
                buffer.newLine();
                indice++;
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
            
        }

    }

}
