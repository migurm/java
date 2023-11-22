/*
Define la clase videoconsola. De una videoconsola se necesita conocer su compa��a creadora, el modelo (cadena alfanum�rica), la generaci�n a la
que pertenece (entero), el bus de datos (8,16,32,64,128 o 256) y si est� en producci�n o no.
Crea el m�todo Constructor con los par�metros que creas conveniente y piensa (implementa) c�mo hacer que si no se mete un valor de los indicados
en el bus de datos, se ponga por defecto 256.
 */
package PIZARRA151122;

public class PIZARRA151122 {

    public static void main(String[] args) {

        Videoconsola PlayStation;
        PlayStation = new Videoconsola("PlayStation", "Sony", "PS5", 9, 256, true);
        System.out.println("Consola: " + PlayStation.nombre);
        System.out.println("Compa��a: " + PlayStation.company);
        System.out.println("Modelo: " + PlayStation.modelo);
        System.out.println("Generaci�n: " + PlayStation.gen + "�");
        System.out.println("Bus de datos: " + PlayStation.bus);
        System.out.println("�En producci�n? : " + PlayStation.produccion);
        

        System.out.println("-------------------------------");
        
        
        // string nombre, string compa�ia, string modelo, int generacion, int bus, boolean produccion
        
        
        System.out.println("-------------------------------");
        

        Videoconsola Xbox;
        Xbox = new Videoconsola("Xbox", "Microsoft", "Serie X", 9, 128, true);//Hay que probar si al meter un dato erroneo en el bus sale sale 256.
        System.out.println("Consola: " + Xbox.nombre);
        System.out.println("Compa��a: " + Xbox.company);
        System.out.println("Modelo: " + Xbox.modelo);
        System.out.println("Generaci�n: " + Xbox.gen + "�");
        System.out.println("Bus de datos: " + Xbox.bus);
        System.out.println("�En producci�n? : " + Xbox.produccion);

        
        System.out.println("----------------------------");
        
        
        Videoconsola Sega;//No poner el nombre con la may�scula.
        Sega = new Videoconsola("Sega", "Sega", "Megadrive", 4, false);//Hay que probar si al meter un dato erroneo en el bus sale sale 256.
        System.out.println("Consola: " + Sega.nombre);
        System.out.println("Compa��a: " + Sega.company);
        System.out.println("Modelo: " + Sega.modelo);
        System.out.println("Generaci�n: " + Sega.gen + "�");
        System.out.println("Bus de datos: " + Sega.bus);
        System.out.println("�En producci�n? : " + Sega.produccion);
    }

}
