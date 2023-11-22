/*
Implementa un programa que, dado un fichero de texto, muestre todas sus líneas
precedidas por el numero de línea correspondiente y el carácter dos puntos (:).
*/
package RelacionEjercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class E114 {

    public static void main(String[] args) {
        System.out.print("Escriba nombre de fichero: ");
        Scanner input = new Scanner (System.in);
        String path = "src/RelacionEjercicios/"+input.nextLine();
        try(FileReader lector = new FileReader (path);BufferedReader buffer = new BufferedReader (lector)){
            String linea=" ";//Creamos esta variable para almacenar las lineas que vamos a imprimir
            int indice=1;//Este será el indice de los renglones
            do{
                linea=buffer.readLine();
                if(linea!=null){//Si la línea no está vacía imprimimos lo que se pide.
                    System.out.println(indice+":"+linea);
                    indice++;
                }
                
            }while(linea!=null);

        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado.");
        }catch(IOException e){
            System.out.println("Hubo un error en la ejecución.");
        }
            
        

    }

}
