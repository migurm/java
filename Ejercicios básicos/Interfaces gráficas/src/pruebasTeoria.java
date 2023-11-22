
import java.util.LinkedList;



public class pruebasTeoria {

    public static void main(String[] args) {
        LinkedList <String> listaEnlazada = new LinkedList <> () ;
        listaEnlazada.add("Paco");
        listaEnlazada.add("Juan");
        listaEnlazada.add("Maria");
        listaEnlazada.add("Fernando");
        
        System.out.println("Contenido de la lista: "+listaEnlazada);
        
        System.out.println("Agregamos con el .add(valor):");
        listaEnlazada.add("Duke");//Vemos que se inserta al final.
        System.out.println("Mostramos de nuevo la lista: "+listaEnlazada);
        System.out.println("Agregamos ahora otro nuevo elemento, especificando el indice con .add(indice, valor)");
        listaEnlazada.add(1, "Jessy");//Lo va a agregar en segunda posición.
        System.out.println("Mostramos el resultado final: "+listaEnlazada);
        System.out.println("Tamaño: "+listaEnlazada.size());
        System.out.println("En la posicion cuatro esta: "+listaEnlazada.get(3));
        System.out.println("Aplastamos la primera posición con Joaquin: "+listaEnlazada.set(0, "Joaquin"));
        System.out.println("Existe Joaquin en la lista?: "+listaEnlazada.contains("Joaquin"));
        
        try{
            System.out.println(dividir(6, 0));
        }catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
        
        System.out.println(Double.parseDouble(dividirControlado(6,2)));
        try{
        System.out.println(Double.parseDouble(dividirControlado(6,0)));//Tenemos que controlar el NumberFormatException.
        }catch(NumberFormatException e){
            System.out.println("Error: "+e.getMessage());
        }
    }   
    
    public static double dividir (int a, int b) throws ArithmeticException {
        return a/b;
    }
    
    public static String dividirControlado (int a, int b){
        try{
            return String.valueOf(a/b);
        }catch(ArithmeticException e){
            return "Error:"+e.getMessage();
        }
    }

}
