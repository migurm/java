

package E91;


public class ProductoFresco extends Producto {
    private String fechaDeEnvasado;
    private String paisDeOrigen;
    private String metodoDeConservacion;
    
    
    public ProductoFresco (String caducidad, int lote, String envasado, String pais, String conserva){
        super(caducidad, lote);
        this.fechaDeEnvasado=envasado;
        this.paisDeOrigen=pais;
        this.metodoDeConservacion=conserva;
    }
    
    public String getFechaDeEnvasado(){
        return this.fechaDeEnvasado;
    }
    public String getPaisDeOrigen(){
        return this.paisDeOrigen;
    }
    public String getMetodoDeConservacion(){
        return this.metodoDeConservacion;
    }
    @Override
    public String toString(){
        String res=super.toString();
        res+="Fecha de Envasado: "+this.fechaDeEnvasado+"|| Pais de origen: "+this.paisDeOrigen+"\n";
        res+="Método de conservación: "+this.metodoDeConservacion+"\n";
        return res;
    }

}
