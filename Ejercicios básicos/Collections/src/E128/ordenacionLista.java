
package E128;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;


public class ordenacionLista {

    public static void main(String[] args) {
        //Tenemos un conjunto con palabras.Completamente desordenado.
        HashSet<String>palabras = new HashSet<>();
        palabras.add("Coche");
        palabras.add("Moto");
        palabras.add("Camion");
        palabras.add("Helicpotero");
        palabras.add("Barco");
        palabras.add("Avion");
        palabras.add("Submarino");
        palabras.add("Tanque");
        palabras.add("Grua");
        //Queremos ordenarlo, para ello volvamos el contenido en un TreeSet.
        //Para ello en el constructor le pasamos como parametros la lista original.
        TreeSet<String> palabrasOrdenadas = new TreeSet <> (palabras);
        //Imprimimos el TreeSet para ver si ha funcionado.
        System.out.println(palabrasOrdenadas);
        //Si este TreeSet por lo que sea no es valido y la respuesta se requiere
        //en HashSet, solo volvamos este TreeSet en uno, usaremos el mismo.
        palabras.clear();//clear lo vacia por completo
        palabras.addAll(palabrasOrdenadas);//Agrega todo el contenido de esa coleccion
        
        System.out.println(palabras);//Al echarlo al conjunto se desordena.
        //Lo volcamos en un ArrayList.
        palabras.clear();
        ArrayList<String>arrayListOrdenado = new ArrayList<>(palabrasOrdenadas);
        System.out.println(arrayListOrdenado);
        
        //Recorremos la colección con un iterador para que si el String es Moto, lo cambie por otro.
        ListIterator<String>iteradorPalabras = arrayListOrdenado.listIterator();
        //Ya tenemos el iterador apuntando a la posicion anterior al primer valor.
        while(iteradorPalabras.hasNext()){
            String palabra=iteradorPalabras.next();
            if(palabra.equalsIgnoreCase("moto")){
                iteradorPalabras.set("Todoterreno");
            }
        }
        System.out.println(arrayListOrdenado);
        
        
        
        
        
        

    }

}
