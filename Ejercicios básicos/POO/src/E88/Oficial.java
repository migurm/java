
package E88;


public class Oficial extends Operario {
    
    
   public Oficial (String nombreOficial, int numeroOperario){
       
        super(nombreOficial,numeroOperario);
       
   }
   
   @Override
   public String toString(){
       
       String res="Soy el oficial "+this.getNombre()+" con el c�digo "+this.getNumeroOperario()+".";
       
       return res;
   }

}
