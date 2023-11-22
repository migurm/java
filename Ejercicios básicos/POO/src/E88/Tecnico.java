

package E88;


public class Tecnico extends Operario {
    
    
   public Tecnico (String nombreTecnico, int numeroTecnico){
       
        super(nombreTecnico,numeroTecnico);
       
   }
   
   @Override
   public String toString(){
       
       String res="Soy el técnico "+this.getNombre()+" con el código "+this.getNumeroOperario()+".";
       
       return res;
   }

}
