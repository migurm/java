
package E89;


public class Gato extends Mamifero{
    String razaDelGato;
    String nombreDelGato;
    private String pelajeDelGato;
    
    
    public Gato(int numeroDePatas, int mediaDeVida, String raza, String nombre){  
        super(numeroDePatas, mediaDeVida);
        this.razaDelGato=raza;
        this.nombreDelGato=nombre;
        this.pelajeDelGato="Corto";
        
    }
    
    public void setPelajeDelGato(String nuevoPelajeGato){
        this.pelajeDelGato=nuevoPelajeGato;
    }
    
    public String getPelajeDelGato(){
        return this.pelajeDelGato;
    }
    
    @Override
    public String comunicarse(){//Sobreescribimos el método
        return "Miau, miau";
    }
    
    public void dormir(){
        System.out.println("Duerme en torno a 15 horas al día.");
    }
    
    public void cazar(){
        System.out.println("Mi gato de "+getNumeroDePatas()+" está cazando.");
    }
    
    @Override
    public String toString(){
        String res="Nombre del gato: "+this.nombreDelGato+"\n";
        res+="Raza: "+this.razaDelGato+"\n";
        res+="Tipo de pelaje: "+this.pelajeDelGato;
        
        return res;
        
    }
    
    

}
