/*112. Diseña una aplicación que pida al usuario su nombre y edad. Estos datos deben
guardarse en el fichero de texto "datos.txt". Si este fichero ya existe, debe borrarse 
su contenido, y en caso de no existir, debe crearse.*/
package RelacionEjercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class E112 {

    public static void main(String[] args) {
        boolean datoCorrecto=false;
        String nombre="";
        int edad=0;
        Scanner input = new Scanner (System.in);
        do{//Bucle para asegurar que introduce el dato correctamente.
            System.out.print("Introduzca su nombre: ");
            try{
                nombre=input.nextLine();
                datoCorrecto=true;
            }catch(RuntimeException e){//No parece necesaria, todo se puede convertir a String.
                System.out.println("Error"+e.getMessage());
                input.nextLine();
            }
            
        }while (!datoCorrecto);
        
        do{//Bucle para asegurar que introduce el dato correctamente.
            datoCorrecto=false;
            System.out.print("Introduzca su edad: ");
            try{
                edad=(int)input.nextDouble();
                datoCorrecto=true;
            }catch(InputMismatchException e){//No parece necesaria, todo se puede convertir a String.
                System.out.println("Error al guardar su edad!");
                input.nextLine();
            }
            
        }while (!datoCorrecto);
        input.close();//Cerramos teclado
        String path="src/RelacionEjercicios/texto.txt";
        //Abrimos las herramientas FileWriter y BufferedWriter (Las de escritura)
        try(FileWriter escritor = new FileWriter(path); BufferedWriter buffer = new BufferedWriter(escritor)){
          buffer.write("Nombre: "+nombre);
          buffer.newLine();
          buffer.write("Edad: "+edad);//Introducimos el texto en el documento
        }catch(IOException e) {//Capturamos la excepción obligatoria.
            System.out.println(e.getMessage());
        }

    }

}
