

package RepasoExcepciones;


public class Impar {
    int numero;
    
    
    public Impar(int numero){       
        if(numero%2==0)throw new RuntimeException ("No es un número impar.");
        this.numero=numero;
    }
    public String toString(){
        return "El valor de este impar es: "+this.numero;
    }

}
