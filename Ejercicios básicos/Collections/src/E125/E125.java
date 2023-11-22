/*125.- Crea un programa que, haciendo uso de un ArrayList de números enteros,
muestre por pantalla un menú con las siguientes opciones:*/
package E125;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class E125 {

    public static void main(String[] args) {
        //Creamos la estructura ArrayList para almacenar
        ArrayList <Integer> listaNumeros = new ArrayList <> ();
        //El booleano que nos dice si salimos del programa:
        boolean salir = false, encontrado=false;//encontrado lo usaremos en el case 2
        //La variable donde almacenaremos la opcion elegida por el usuario.
        String opcion="";
        int valor=0, posicion=-1;//Para el caso tres, de eliminar un valor. Posicion para el case 5 un indice.
        //Creamos el menú con un switch dentro de un do-while.       
        do{
            System.out.println("Estas son las funciones disponibles:");
            System.out.println("1. Agregar.");
            System.out.println("2. Buscar.");
            System.out.println("3. Eliminar.");
            System.out.println("4. Modificar.");
            System.out.println("5. Insertar en posicion.");
            System.out.println("6. Mostrar.");
            System.out.println("7. Salir.");
            Scanner input = new Scanner (System.in);
            try{
                System.out.print("Que opcion desea? ");
                opcion=input.nextLine().toLowerCase().trim();//Almacenamos lo que sea en String, minuscula, sin espacios.
                
            }catch(InputMismatchException e){
                System.out.println("Error!"+e.getMessage());
                input.nextLine();
            }catch(RuntimeException e){
                System.out.println("Error!"+e.getMessage());
                input.nextLine();
            }
            
            //A este punto, todo controlado.
            //Creamos la estructura switch. Aceptaremos tanto la palabra como el numero.
            switch (opcion){
                case "agregar":
                case "1":
                    //Bloque de codigo
                    System.out.println("Inserte un numero entero para agregarlo a la estructura: ");
                    try{
                        listaNumeros.add(input.nextInt());
                        System.out.println("Se agrego su numero correctamente.");
                    }catch(InputMismatchException e){
                        System.out.println("No pudimos agregar el valor");
                        System.out.println("Necesitamos un numero entero!");
                        input.nextLine();
                    }catch(RuntimeException e){
                        System.out.println("No pudimos agregar el valor");
                        System.out.println("Ocurrio un error inesperado "+e.getMessage());
                        input.nextLine();
                    }
                    break;
                case "buscar":
                case "2":
                    //Bloque de codigo
                    encontrado=false;
                    System.out.print("Indique un numero entero y le diremos si existe en la estructura:");
                    try{
                        encontrado = buscarValor(listaNumeros, input.nextInt());//llamamos a la funcion de busqueda
                    }catch(InputMismatchException e){
                        System.out.println("No pudimos buscar ese valor, necesitamos numeros enteros.");
                        input.nextLine();
                    }catch(RuntimeException e){
                        System.out.println("Ocurrio un error inesperado, no pudimos buscar ese valor");
                        System.out.println(e.getMessage());
                        input.nextLine();
                    }
                    if(encontrado){
                        System.out.println("Ese numero existe en la esctructura.");
                    }else{
                        System.out.println("No tenemos ese numero almacenado en la esctructura.");
                    }
                    break;
                case "eliminar":
                case "3":
                    //Bloque de codigo
                    
                    encontrado=false;
                    System.out.print("Indique un numero entero y si esta en la estructura se eliminara: ");
                    try{
                        valor=input.nextInt();
                        encontrado = buscarValor(listaNumeros, valor);//llamamos a la funcion de busqueda
                        if(encontrado){
                        listaNumeros.remove(listaNumeros.indexOf(valor));
                        System.out.println("Se elimino el "+valor+" de la lista.");
                        }else{
                        System.out.println("No tenemos el valor "+valor+" en la lista.");
                        }
                    }catch(InputMismatchException e){
                        System.out.println("No pudimos buscar ese valor, necesitamos numeros enteros.");
                        input.nextLine();
                    }catch(RuntimeException e){
                        System.out.println("Ocurrio un error inesperado, no pudimos buscar ese valor");
                        System.out.println(e.getMessage());
                        input.nextLine();
                    }                  
                    break;
                case "modificar":
                case "4":
                    //Bloque de codigo
                    encontrado=false;
                    System.out.print("Introduzca el valor que quiera modificar: ");
                    try{
                        valor=input.nextInt();
                        encontrado=buscarValor(listaNumeros, valor);
                        if(encontrado){
                            System.out.print("Indique el valor por el que quiere sustituir el "+valor+"=");
                            try{
                                listaNumeros.set(listaNumeros.indexOf(valor), input.nextInt());
                                System.out.println("Se actualizó el valor correctamente.");
                            }catch(InputMismatchException e){
                                System.out.println("Error: Solo numeros enteros, no se ha cambiado ningun valor.");
                                input.nextLine();
                            }catch(RuntimeException e){
                                System.out.println("Error inesperado: "+e.getMessage());
                                input.nextLine();  
                            }            
                        }else{
                            System.out.println("Este valor no esta en la lista.");
                        }
                        
                    }catch(InputMismatchException e){
                        System.out.println("Error: Necesitamos como valor un numero entero.");
                        input.nextLine();
                    }catch(RuntimeException e){
                        System.out.println("Error inesperado: "+e.getMessage());
                        input.nextLine();
                    }
                    break;
                case "insertar en posicion":
                case "insertar":
                case "5":
                    //Bloque de codigo
                    try{
                        System.out.print("Introduzca el valor que quiere insertar: ");
                        valor=input.nextInt();
                        System.out.print("En que posicion lo quiere: ");//Vamos a suponer que el usuario sabe que empiezan en 0.
                        posicion=input.nextInt();
                        if(posicion<0)throw new InputMismatchException();
                        listaNumeros.set(posicion, valor);
                        System.out.println("Su numero se agrego correctamente.");
                        
                    }catch(InputMismatchException e){
                        System.out.println("El indice debe ser un numero entero, minimo 0.");
                        input.nextLine();
                    }catch(IndexOutOfBoundsException e){//Caso que se pase de los indices existentes
                        System.out.println("No existe ese indice en la estructura.");
                        System.out.println("Tenemos "+listaNumeros.size()+" indices.");  
                        input.nextLine();
                    }catch(RuntimeException e){
                        System.out.println("Error inesperado: "+e.getMessage());
                        input.nextLine();
                    }
                    break;
                case "mostrar":
                case "6":
                    //Bloque de codigo
                    for (int i = 0 ; i < listaNumeros.size() ; i++){
                        System.out.println("Indice: "+i+". Valor: "+listaNumeros.get(i));
                    }
                    //System.out.println(listaNumeros.toString());
                    //La linea anterior muestra el toString ordenado que tiene por defecto el ArrayList.
                    
                    break;
                case "salir":
                case "7":
                    //Bloque de codigo
                    salir=true;
                    System.out.println("Gracias por usar la app, hasta luego!");
                    break;
                default:
                    System.out.println("Su opción no es correcta, compruebe las opciones disponibles.");              
            }
 
        }while(!salir);
    }
    //Metodo estatico para devolver true o false si existe el valor en la lista
    public static boolean buscarValor (ArrayList lista, int valor){
        return lista.contains(valor);  
    }

}
