
package RepasoPractica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Agenda {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        boolean salir=false;
        int opcion=0;
        boolean opcionCorrecta;
        String path="src/RepasoPractica/agenda.txt", copiaAgenda="";
        String [] registros = new String [20];//Array para quedarnos con los registros.
        String [] nombres = new String [20];
        int [] numeros = new int [20];
        int contadorLineas=0;
        //Leemos el fichero existente (y lo copiamos) 
        try(FileReader lector = new FileReader (path);BufferedReader bufferLector = new BufferedReader(lector)){
            
            String linea=" ";
            while (linea != null) {//Estructura while para copiar el archivo original en una copia local
                linea = bufferLector.readLine();
                if (linea != null) {
                    registros[contadorLineas]=linea;
                    nombres[contadorLineas]=linea.substring(linea.indexOf("-")+1, linea.lastIndexOf("-")).trim();
                    numeros[contadorLineas]=Integer.parseInt(linea.substring(linea.indexOf("- ")+3));//El formato es un poco raro
                    contadorLineas++;
                    //Aquí ya tenemos copiado el fichero copiado
                }
                //Convertimos la copia del fichero en dos arrays, uno de nombres y otro de numeros.
            }

        }catch(FileNotFoundException e){
            //En caso de no existir el fichero, creamos el contenido del nuevo, dentro de un array de 20 posiciones.
            System.out.println("Agenda no encontrada, crearemos una nueva con los datos introducidos ahora.");

        }catch(IOException errorLectura){
            System.out.println("Ocurrió un error inesperado."+errorLectura.getMessage());            
        }

        //Aquí ya siempre vamos a trabajar con el fichero local.
        System.out.println("Agenda telefonica");
        System.out.println("-----------------");

        do{
            opcionCorrecta=false;
            System.out.println("Funciones:");
            System.out.println("1. Nuevo contacto");
            System.out.println("2. Busqueda por nombre");
            System.out.println("3. Mostrar todo");
            System.out.println("4. Salir");
            System.out.print("Que necesitas?: ");
            //Parte del codigo para quedarnos con una opción correcta
            try{
                opcion=input.nextInt();
                if ((opcion<1)||(opcion>4)) throw new Exception ("Opciones del 1 al 4");
                opcionCorrecta=true;
            
            }catch(InputMismatchException e){
                System.out.println("Indique la funcion con uno de los numeros disponibles.");
                input.nextLine();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            //Una vez la opcion es correcta, vamos con las funciones
            if(opcionCorrecta){
                input.nextLine();//Limpieza de buffer.

                switch (opcion){
                    case 1:
                        System.out.println("Nuevo contacto.");
                        boolean pasoCompletado=false;
                        String nombre;
                        int numero=0;
                        if(contadorLineas<registros.length){
                            do{
                                System.out.print("Introduzca el nombre: ");
                                nombre=input.nextLine().trim();
                                if(!comprobarExistente(nombre, nombres)){
                                    pasoCompletado=true;
                                }else{
                                    System.out.println("Ya tienes a "+nombre+" en la agenda.");   
                                }                               
                            }while(!pasoCompletado);
                            
                            pasoCompletado=false;
                            
                            do{
                                System.out.print("Introduzca el telefono: ");
                                try{
                                    numero=input.nextInt();
                                    if((numero<100000000)||(numero>999999999))throw new InputMismatchException();
                                    pasoCompletado=true;
                                }catch(InputMismatchException e){
                                    System.out.println("Recuerde, formato 123456789");
                                    input.nextLine();
                                }
                                
                            }while(!pasoCompletado);
                        nombres[contadorLineas]=nombre;
                        numeros[contadorLineas]=numero;
                        contadorLineas++;   
                        System.out.println("Contacto agregado con exito.");

                        }else{
                            System.out.println("Agenda completa.");
                        }
                        break;
                    case 2://Mostrar todos los telefonos que coindicen con una cadena.
                        boolean coincidencia=false;
                        String busqueda="";
                        System.out.println("Buscar por nombre.");
                        System.out.print("Introduzca la busqueda: ");
                        busqueda=input.nextLine().trim();
                        for(int i=0; i<registros.length ; i++){
                            if(nombres[i]!=null){
                                if(nombres[i].toLowerCase().contains(busqueda.toLowerCase())){
                                    System.out.println("Nombre: "+nombres[i]+" telefono: "+numeros[i]);
                                    coincidencia=true;
                                }
                            }
                        }
                        if (!coincidencia)System.out.println("No hubo coindicendias.");
                        break;
                    case 3:
                        int contactos=0;
                        System.out.println("Mostrar listado.");
                        for(int i=0; i<registros.length;i++){
                            if(nombres[i]!=null){
                                System.out.println("-"+nombres[i]+" - "+numeros[i]);
                                contactos++;
                            }
                        }
                        System.out.println("La agenda esta formada por "+contactos+" contactos.");
                        break;
                    case 4:
                        System.out.println("Hasta luego!");
                        salir=true;
                }
            }
            
        }while(!salir);
        for(int i = 0; i < registros.length; i++){
            if(nombres[i]!=null){
                copiaAgenda+="-"+nombres[i]+" - "+numeros[i]+"\n";
            }
        }
        //Tenemos el fichero de la agenda, vamos a sobreescribir el existente o crearlo de no existir.
        try(FileWriter escritor = new FileWriter (path); BufferedWriter bufferEscritor = new BufferedWriter (escritor)){
            bufferEscritor.write(copiaAgenda);
        }catch(IOException e){
            System.out.println("Ocurrió un error inesperado"+e.getMessage());
        }
       

    }
    
    public static boolean comprobarExistente (String nombre, String [] nombres){
        boolean encontrado=false;
        for(int i=0; (i< nombres.length&&!encontrado); i++){
            if (nombre.equalsIgnoreCase(nombres[i])) encontrado=true;
        }
        return encontrado;
    }

}
