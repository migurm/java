/*A continuación:
a) Muestra el contenido de la lista.
b) Intercambia la primera posición con la última.
c) Pide otra lista de números distinta como se indica al principio y añade todos sus
elementos a la lista inicial. Nota: al final sólo debe existir un arrayList con todos los
valores juntos.
d) Calcula la suma de todos los elementos de la lista.
e) Calcula la media aritmética de los elementos de la lista.
f) Muestra todos los valores de la lista que sean menores a la media antes
calculada.*/
package E123;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class E123 {

    public static void main(String[] args) {
    /*123.- Pide por teclado un número. Dicho número indica cuantos elementos se van a
    pedir a continuación. Almacena esas números en un ArrayList.*/
    boolean correcto=false;
    int numeroElementos=0, sumatorioElementos=0;
    int mediaAritmetica;
    
    Scanner input = new Scanner (System.in);
    do{    
        System.out.print("Indica el numero de elementos que vamos a almacenar: ");
        try{
            numeroElementos=input.nextInt();
            if(numeroElementos<1)throw new IOException ("Al menos un valor.");
            correcto=true;
        }catch(InputMismatchException e){
            System.out.println("Necesitamos un numero entero "+e.getMessage());
            input.next();
            
        }catch(IOException e){
            System.out.println(e.getMessage());
            input.nextLine();
        }
    }while(!correcto);
    //Declaramos el ArrayList y almacenamos los valores.
    ArrayList <Integer> listaNumeros = new ArrayList <> ();
    int contadorElementos=0;//Se puede hacer solo con numeroElementos, pero quiero que salga que valor es.
    while(contadorElementos<numeroElementos){
        System.out.print("Introduzca el valor "+(contadorElementos+1)+"o: ");
        try{
            listaNumeros.add(input.nextInt());
            contadorElementos++;
            
        }catch(InputMismatchException e){
            System.out.println("Necesitamos numeros enteros!");
            input.nextLine();
        }
        
    }
        System.out.println("a)Muestra el contenido de la lista: ");
        for(int numero:listaNumeros){
            System.out.println(numero);
        }
        System.out.println("b)Intercambia la primera posicion con la ultima: ");
        int primeraPosicion=listaNumeros.get(0);
        listaNumeros.set(0, listaNumeros.get(listaNumeros.size()-1));
        listaNumeros.set(listaNumeros.size()-1, primeraPosicion);
        for(int numero:listaNumeros){
            System.out.println(numero);
        }
        System.out.println("c)Pide otra lista de numeros como al principio y agrega"
                + "todos sus elementos a la lista inicial, al final solo debe existir"
                + "un arrayList con todos los valores juntos.");
        //Copiamos y pegamos el codigo del principio para pedir un nuevo ArrayList.
    correcto=false;
    do{    
        System.out.print("Indica el numero de elementos para la segunda lista: ");
        try{
            numeroElementos=input.nextInt();
            if(numeroElementos<1)throw new IOException ("Al menos un valor.");
            correcto=true;
        }catch(InputMismatchException e){
            System.out.println("Necesitamos un numero entero "+e.getMessage());
            input.next();
            
        }catch(IOException e){
            System.out.println(e.getMessage());
            input.nextLine();
        }
    }while(!correcto);
    //Declaramos el ArrayList y almacenamos los valores.
    ArrayList <Integer> segundaLista = new ArrayList <> ();
    contadorElementos=0;//Se puede hacer solo con numeroElementos, pero quiero que salga que valor es.
    while(contadorElementos<numeroElementos){
        System.out.print("Introduzca el valor "+(contadorElementos+1)+"o: ");
        try{
            segundaLista.add(input.nextInt());
            contadorElementos++;
            
        }catch(InputMismatchException e){
            System.out.println("Necesitamos numeros enteros!");
            input.nextLine();
        }
    }
    //Agregamos al arrayList original los nuevos valores.
    //Aprovechamos también para ir eliminando los valores de la segunda lista.(Solo debe quedar una)
    for(int i = 0 ; i < segundaLista.size(); i++){
        listaNumeros.add(segundaLista.get(i));
        segundaLista.remove(i);
    }//Se puede usar aun for each supongo, pero este me gusta mas
    System.out.println("Lista original con los numeros agregados: ");
    //Lo hacemos con un for normal, porque vamos a aprovechar y hacer las operaciones de los siguientes apartados.
    //el for each es limitado para estas cosas...
    for(int i = 0; i<listaNumeros.size(); i++){
        System.out.println(listaNumeros.get(i));//Sacamos por pantalla la lista entera.
        sumatorioElementos+=listaNumeros.get(i);        
    }
    System.out.println("d)Calcula la suma de todos los elementos de la lista: "+sumatorioElementos);
    System.out.println("e)Calcula la media aritmética de los elementos de la lista: "+(double)sumatorioElementos/listaNumeros.size()); 
    System.out.println("f)Muestra todos los valores de la lista que sean menores a la media antes calculada: ");
    for (int numero:listaNumeros){//Si el numero es menor que la media lo sacamos por pantalla.
        if(numero<(double)sumatorioElementos/listaNumeros.size())System.out.println(numero);
    }   

    }

}
