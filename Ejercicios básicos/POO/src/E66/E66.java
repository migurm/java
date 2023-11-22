package E66;

public class E66 {

    public static void main(String[] args) {

        Coche focus;
        
        
        focus = new Coche("focus", "rojo", 1.7, 1.65, 3);
        
        
        Coche nuevoCoche= new Coche(focus);
        
        //Coche nuevoCoche = focus;
        
        nuevoCoche.pintar("Verde");
        
        System.out.println(focus);
        
        
        
        
        int numero = 7;
        
        int copianumero=numero;
        /*
        // String nombre, String color, double anchura, double altura, int puertas; son los pasos para enviar al constructor.
        System.out.println("El " + focus.nombre);
        System.out.println("de color " + focus.color);
        System.out.println(focus.anchura + " de ancho");
        System.out.println(focus.altura + " de alto");
        System.out.println(focus.puertas + " puertas");
        System.out.println(focus.ruedas + " ruedas");
        System.out.println("Tiene "+focus.gasolina+" litros en el tanque.");

        System.out.println("------------------------------------");
        
        Coche giulietta;
        giulietta = new Coche("guilietta", "gris", 1.6, 1.6, 3);
        // String nombre, String color, double anchura, double altura, int puertas; son los pasos para enviar al constructor.

        System.out.println("El " + giulietta.nombre);
        System.out.println("de color " + giulietta.color);
        System.out.println(giulietta.anchura + " de ancho");
        System.out.println(giulietta.altura + " de alto");
        System.out.println(giulietta.puertas + " puertas");
        System.out.println(giulietta.ruedas + " ruedas");
        System.out.println("Tiene "+giulietta.gasolina+" litros en el tanque.");
        
        System.out.println("------------------------------------");
        
        focus.arrancar();
        focus.desplazarse();
        focus.parar();
        focus.chequear();
        
        
        System.out.println("------------------------------------");
        System.out.println(focus.toString());
        System.out.println(giulietta.toString());
    
     
*/
    }
 
    
    

}
//nombre, color, anchura, altura, puertas.

// String nombre, String color, double anchura, double altura, int puertas;
