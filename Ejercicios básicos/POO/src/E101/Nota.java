
package E101;

public class Nota {
    String valor;
    int segundosDuracion;
    
    
    public Nota (String valor, int duracion){//El constructor necesita estos datos aunq no lo especifique el enunciado
        this.valor=valor;
        this.segundosDuracion=duracion;  
    }
    
    public String toString(){
        String res="["+this.valor+","+this.segundosDuracion+"]";//M�todo toString con la plantilla pedida ( ejemplo= [nombre,duraci�n] )
        return res;
    }
}
