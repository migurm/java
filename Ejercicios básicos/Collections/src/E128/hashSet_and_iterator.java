
package E128;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class hashSet_and_iterator {

    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Pera");
        frutas.add("Banana");
        frutas.add("Kiwi");
        frutas.add("Manzana");
        frutas.add("Naranja");
        
        HashSet<String> frutasUnicas = new HashSet<String>(frutas);
        
        ArrayList<String> arrayListFrutasUnicas = new ArrayList<>();
        
        //Creamos el iterador
        Iterator<String> iterador = frutasUnicas.iterator();
        
        while(iterador.hasNext()){
            arrayListFrutasUnicas.add(iterador.next());
           
        }
        System.out.println("Lista original: "+frutas);
        System.out.println("Lista de frutas unicas: "+arrayListFrutasUnicas);
        

    }

}
