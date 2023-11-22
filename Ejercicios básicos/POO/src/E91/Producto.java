

package E91;


public class Producto {//Creamos esta clase para los atributos comunes de los tres tipos de productos.
    private String fechaDeCaducidad;
    private int numeroDeLote;
    
    public Producto (String fechaDeCaducidad, int numeroDeLote){
        this.fechaDeCaducidad=fechaDeCaducidad;
        this.numeroDeLote=numeroDeLote;
    }
    
    public String getFechaCaducidad(){
        return this.fechaDeCaducidad;
    
}
    public int getNumeroDeLote(){
        return numeroDeLote;
    }
    @Override
    public String toString(){
        String res="-------------------------------\n";
        res+="Información del producto:\n";
        res+="Fecha de caducidad: "+this.fechaDeCaducidad+" || Lote: "+this.numeroDeLote+"\n";
        return res;
    }
    
}
