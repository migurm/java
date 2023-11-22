package E94;

public class Habilidad {

    String nombreHabilidad;
    private double costePuntosMana;
    int nivelHabilidad;
    char teclaAsignada;
    private double damageBasico;

    
    public Habilidad(String nombre, char tecla) {
        this.nombreHabilidad = nombre;
        this.teclaAsignada = tecla;
        this.nivelHabilidad = 1;
        this.costePuntosMana=calcularAleatorio((10+(this.nivelHabilidad/2)),1);
        this.damageBasico= calcularAleatorio((20+(this.costePuntosMana/3)),5);  
    }

    
    private double calcularAleatorio(double max, double min) {//Método para ahorrar chorizos innecesarios.
        return ((Math.random() * (max - min + 1)) + 1);
    }
    
    public String toString(){
        String res="Nombre de habilidad: "+this.nombreHabilidad+" de nivel: "+this.nivelHabilidad+"\n";
        res+="Coste de maná: "+this.costePuntosMana+" | Daño: "+this.damageBasico+"\n";
        return res;    
    }
    
    public void subirDeNivel(){
        this.nivelHabilidad++;
        this.costePuntosMana=calcularAleatorio((10+(this.nivelHabilidad/2)),1);
        this.damageBasico= calcularAleatorio((20+(this.costePuntosMana/3)),5);         
    }

}
