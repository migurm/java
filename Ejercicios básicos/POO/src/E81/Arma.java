

package E81;


public class Arma {
    private String nombre;
    private int resistencia;
    private int poder;
    private int nivel;//Atributo para el nivel del arma
    
    
    public Arma (String nombre, int resistencia, int poder){
        this.nombre=nombre;
        this.resistencia=resistencia;
        this.poder=poder;
        this.nivel=1;//Siempre va a empezar el nivel del arma en 1
    }

    
    public String toString(){
        String res="";
        res+="Nombre: "+this.nombre+"\n";
        res+="Resistencia: "+this.resistencia+"\n";
        res+="Poder: "+this.poder+"\n";
        res+="El arma es de nivel: "+this.nivel;
        
        return res;
        
    }
    
    //Metodos para sacar y establecer los atributos privados desde la clase guerrero.
    public int getPoder(){
        return this.poder;
    }
    public int getResistencia(){
        return this.resistencia;
    }
    public void setResistencia(int nuevaResistencia){
        this.resistencia=nuevaResistencia;
    }
    public void serPoder(int nuevoPoder){
        this.poder=nuevoPoder;
    }
    //Método para subir de nivel.
    public void subirNivel(){
        this.nivel++;
        this.poder++;
        this.resistencia=+2;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    
    
}
