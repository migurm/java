

package E88;


public class Tecnico extends Operario {
    
    
   public Tecnico (String nombreTecnico, int numeroTecnico){
       
        super(nombreTecnico,numeroTecnico);
       
   }
   
   @Override
   public String toString(){
       
       String res="Soy el t�cnico "+this.getNombre()+" con el c�digo "+this.getNumeroOperario()+".";
       
       return res;
   }

}
