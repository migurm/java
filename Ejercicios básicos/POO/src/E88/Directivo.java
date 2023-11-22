
package E88;


public class Directivo extends Empleado {//Clase Directivo hija de clase Empleado
    //No tiene atributos propios por ahora.
    
    
    public Directivo (String nombreDirectivo){
        super(nombreDirectivo);//Pedimos únicamente el parámetro necesario para Empleado y lo enviamos a su constructor.
    }
    
    @Override//Al haber heredado el toString de la superclase, este sobreescribe al anterior.
    public String toString(){
        
        String res="Soy "+this.getNombre()+", directivo de la empresa.";
        
        return res;
    }

}
