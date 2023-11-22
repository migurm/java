
package E92;


public class Asignatura {
    private int codigoAsignatura;
    private double horasPorSemana;
       
    public Asignatura (){
        this.codigoAsignatura=(int)((Math.random()*(200-100+1))+1);
        this.horasPorSemana=(int)((Math.random()*(8-3+1))+1);        
    } 
    
    public double getHorasSemana(){
        return this.horasPorSemana;
    }
    
    public int getCodigo(){
        return this.codigoAsignatura;
    }   
    
    public String toString(){
        String res="Código de asignatura: "+this.codigoAsignatura+"\n";
        res+="Se imparte "+this.horasPorSemana+" a la semana.\n";
        return res;
    }
    
}
