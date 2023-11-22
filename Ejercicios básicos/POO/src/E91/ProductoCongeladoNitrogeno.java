
package E91;


public class ProductoCongeladoNitrogeno extends ProductoCongelado {

    private String metodoCongelacion;
    private int tiempoExpuestoNitrogeno;
    

    public ProductoCongeladoNitrogeno(String caducidad, int lote, String envasado, String pais, double temperatura,String metodo, int tiempo) {
        super(caducidad, lote, envasado, pais, temperatura);
        this.metodoCongelacion=metodo;
        this.tiempoExpuestoNitrogeno=tiempo;

    }
     
    public String metodoCongelacion(){
        return this.metodoCongelacion;
    }
    
    public int getTiempoExpuestoNitrogeno(){
        return this.tiempoExpuestoNitrogeno;
    }
    
        @Override
    public String toString(){
        
        String res=super.toString();
        res+="Método de congelación: "+this.metodoCongelacion+"\n";
        res+="Tiempo expuesto a Nitrógeno: "+this.tiempoExpuestoNitrogeno+"\n";
        
        return res;
    }

}