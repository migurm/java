/*
119. Supongamos un fichero de texto que se usa como inventario de un juego, el 
cual tiene los datos en cada linea estructurados de la siguiente forma:
amuleto:200:5
pocion:50:20
espada:1000:1
antorcha:30:9
cuerda:120:3
Diseña un programa que, tomando un fichero con la estructura antes indicada, muestre
por pantalla de forma clara el inventario que representa.
*/
package RelacionEjercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class E119 {

    public static void main(String[] args) {
        String path="src/RelacionEjercicios/inventario.txt";
        try(FileReader lector = new FileReader (path); BufferedReader buffer = new BufferedReader (lector)){
            String linea=" ";
            while(linea!=null){
                linea=buffer.readLine();
                if(linea!=null){
                System.out.println("Item:     "+linea.substring(0,linea.indexOf(":")));
                System.out.println("Precio:   "+linea.substring(linea.indexOf(":"), linea.lastIndexOf(":")));
                System.out.println("Cantidad: "+linea.substring(linea.lastIndexOf(":")));
                }
                System.out.println("");
            }

        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado.");
        }catch(IOException e){
            System.out.println("Ocurrió un error inesperado.");
        }

    }

}
