
package E91;


public class ProductoCongeladoAgua extends ProductoCongelado {

    private double salinidadAgua;
    private int tiempoExpuestoNitrogeno;

    public ProductoCongeladoAgua(String caducidad, int lote, String envasado, String pais, double temperatura,double salinidad, int tiempo) {
        super(caducidad, lote, envasado, pais, temperatura);
        this.salinidadAgua=salinidad;
        this.tiempoExpuestoNitrogeno=tiempo;

    }
    
    public double getSalinidadAgua(){
        return this.salinidadAgua;
    }
    
    public int getTiempoExpuestoNitrogeno(){
        return this.tiempoExpuestoNitrogeno;
    }
    
        @Override
    public String toString(){
        
        String res=super.toString();
        res+="Salinidad del agua: "+this.salinidadAgua+"\n";
        res+="Tiempo expuesto a Nitrógeno: "+this.tiempoExpuestoNitrogeno+"\n";
        res+=this.getPaisDeOrigen();
        
        return res;
    }

    

}
