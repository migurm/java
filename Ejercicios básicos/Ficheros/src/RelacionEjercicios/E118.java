/*
118. Realiza un programa que solicite al usuario el nombre de un fichero de texto
y muestre su contenido por pantalla. Si no proporciona ningún nombre de fichero,
la aplicación abrirá el fichero aurora.txt por defecto (u otro que tu elijas y
tenga contenido).
*/
package RelacionEjercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class E118 {

    public static void main(String[] args) {
        String path = "src/RelacionEjercicios/";
        Scanner input = new Scanner (System.in);
        System.out.print("Escriba nombre de fichero (si no indica nada aurora.txt): ");
        path+=input.nextLine();
        input.close();
        String linea=" ";
        try(FileReader lector = new FileReader (path); BufferedReader buffer = new BufferedReader (lector)){
            while(linea!=null){
                linea=buffer.readLine();
                if(linea!=null)System.out.print(linea+"\n");         
            }          
        }catch (IOException e){
            System.out.println("Abriendo aurora.txt");
            path="src/RelacionEjercicios/aurora.txt";
            try(FileReader lector = new FileReader (path); BufferedReader buffer = new BufferedReader (lector)){
                while(linea!=null){
                linea=buffer.readLine();
                if(linea!=null)System.out.print(linea+"\n");          
                 }
            }catch(IOException e2){
                System.out.println("Error fatal.");
            }
        }
    }
}
