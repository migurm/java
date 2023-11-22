
package E76;


public class TestUrna {

    public static void main(String[] args) {
        //Creamos urna con bolas blancas y negras aleatorias del 1 al 10.
        Urna urna1= new Urna ((int)((Math.random()*(10-1+1))+1), (int)((Math.random()*(10-1+1))+1));
        urna1.inicio();
        
        while(urna1.numerobolas>0){
        if(urna1.numerobolas>1){
        urna1.extraerBola();
        urna1.extraerBola();
        
        }
                
        
        
        
        
        
        
        
    }
    }
}


