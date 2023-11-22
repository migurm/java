/*
115. Realiza un programa que lea el fichero numeros.txt. que contendrá un número
entero en cada linea.
a) Calcula el mayor y el menor numero del fichero.
b) Amplia el programa para que además cuente cuantas veces aparece el mayor y el menor.
*/
package RelacionEjercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class E115 {

    public static void main(String[] args) {
        int contadorMayor=0, contadorMenor=0;
        int menor=900, mayor=-900;
        String linea=" ", copiaTexto="";
        try(FileReader lector = new FileReader("src/RelacionEjercicios/numeros.txt.txt");
            BufferedReader buffer = new BufferedReader (lector)){
            while(linea!=null){//Hacemos una copia del archivo completo
                linea=buffer.readLine();
                if(linea!=null){
                copiaTexto+=linea;
                copiaTexto+="\n";                
                }                
            }                
            }catch(FileNotFoundException e){
                System.out.println("Archivo no encontrado.");               
            }catch(IOException e){
                System.out.println("Hubo un error.");
            }
        //System.out.println(copiaTexto);//Lo imprimimos para ver si funcionó
        String [] valores = copiaTexto.split("\n");//Creamos un array de String con los datos separados
        int [] valoresEnteros = new int [valores.length];//Creamos un nuevo array de enteros para copiarlo
        for(int i = 0 ; i < valores.length;i++){
            try{
                valoresEnteros[i]=Integer.parseInt(valores[i]);//Asignamos los valores pasados a int
            }catch(RuntimeException e){
                System.out.println("Valor incorrecto en la línea "+i);
            }
        }
        for (int i = 0 ; i < valoresEnteros.length ; i++){//Bucle para buscar el mayor y el menor
            if(valoresEnteros[i]<menor)menor=valoresEnteros[i];
            if(valoresEnteros[i]>mayor)mayor=valoresEnteros[i];
        }
        for(int i = 0; i < valoresEnteros.length ; i++){//Bucle para ver cuántas veces se repiten ambos
            if(valoresEnteros[i]==mayor)contadorMayor++;
            if(valoresEnteros[i]==menor)contadorMenor++;           
        }
        System.out.println("El mayor es: "+mayor+" y el menor: "+menor);
        System.out.println(mayor+" se repite "+contadorMayor+" veces.");
        System.out.println(menor+" se repite "+contadorMenor+" veces.");
    }
    
}
