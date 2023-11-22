/*
Supongamos que tienes un mapa HashMap que almacena el nombre de un país y su 
capital. Quieres imprimir los nombres de los países que tienen una capital que 
comienza con una letra específica. Puedes utilizar Iterator para recorrer las 
entradas del mapa y comprobar si la capital de cada país comienza con la letra 
deseada.
*/
package E128;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class hashMap_and_iterator {

    public static void main(String[] args) {
        Map<String, String> paises = new HashMap<>();
        paises.put("Argentina", "Buenos Aires");
        paises.put("Brasil", "Brasilia");
        paises.put("Chile", "Santiago");
        paises.put("Colombia", "Bogota");
        paises.put("Costa Rica", "San Jose");
        paises.put("Cuba", "La Habana");
        paises.put("Mexico", "Ciudad de Mexico");
        paises.put("Panama", "Ciudad de Panama");
        paises.put("Peru", "Lima");
        paises.put("Uruguay", "Montevideo");

        String letter = "S";
        //Creamos el iterador.
        Iterator<Map.Entry<String,String>> iterador = paises.entrySet().iterator();
        
        while(iterador.hasNext()){
            Map.Entry<String, String> entrada = iterador.next();
            String capital = entrada.getValue();
            if(capital.startsWith(letter)){
                System.out.println(entrada.getKey());
            }
            
        }

    }

}
