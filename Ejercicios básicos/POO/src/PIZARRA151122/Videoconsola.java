package PIZARRA151122;

public class Videoconsola {
    //Definimos la clase Videoconsola
    String nombre;//Esta es inventada, el nombre de la consola en s�
    String company;//Compa�ia creadora.
    String modelo;//Modelo.
    int gen;//Generaci�n a la que pertenece.
    int bus;//Bus de datos.
    boolean produccion;//Est� o no en producci�n.

    //Abrimos el m�todo Constructor.
    public Videoconsola(String nombre, String company, String modelo, int gen, int bus, boolean produccion) {
        this.nombre = nombre;
        this.company = company;
        this.modelo = modelo;
        this.gen = gen;
        this.bus = bus;
        this.produccion = produccion;
  

        // string nombre, string compa�ia, string modelo, int generacion, int bus, boolean produccion
        
        
    }
        public Videoconsola(String nombre, String company, String modelo, int gen, boolean produccion) {
        this.nombre = nombre;
        this.company = company;
        this.modelo = modelo;
        this.gen = gen;
        this.bus = 256;
        this.produccion = produccion;

        // string nombre, string compa�ia, string modelo, int generacion, int bus, boolean produccion
    }

}
