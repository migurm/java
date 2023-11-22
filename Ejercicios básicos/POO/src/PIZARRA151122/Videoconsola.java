package PIZARRA151122;

public class Videoconsola {
    //Definimos la clase Videoconsola
    String nombre;//Esta es inventada, el nombre de la consola en sí
    String company;//Compañia creadora.
    String modelo;//Modelo.
    int gen;//Generación a la que pertenece.
    int bus;//Bus de datos.
    boolean produccion;//Está o no en producción.

    //Abrimos el método Constructor.
    public Videoconsola(String nombre, String company, String modelo, int gen, int bus, boolean produccion) {
        this.nombre = nombre;
        this.company = company;
        this.modelo = modelo;
        this.gen = gen;
        this.bus = bus;
        this.produccion = produccion;
  

        // string nombre, string compañia, string modelo, int generacion, int bus, boolean produccion
        
        
    }
        public Videoconsola(String nombre, String company, String modelo, int gen, boolean produccion) {
        this.nombre = nombre;
        this.company = company;
        this.modelo = modelo;
        this.gen = gen;
        this.bus = 256;
        this.produccion = produccion;

        // string nombre, string compañia, string modelo, int generacion, int bus, boolean produccion
    }

}
