

package E75;


public class Cuenta {
    private String titular;
    private double cantidad;
    
    
    public Cuenta(String titular, double cantidad){//La cantidad es opcional
        this.titular=titular;
        this.cantidad=cantidad;
    }
    //Creamos dos constructores para dar ocpciones.
    public Cuenta (String titular){//El titular es obligatorio
        this.titular=titular;
        this.cantidad=0;
    }
    
    public String getTitular(){
        return this.titular;
    }
    public double getCantidad(){
        return this.cantidad;
    }
    public void setTitular(String nuevotitular){
        this.titular=nuevotitular;
    }
    public void setCantidad(double nuevacantidad){
        this.cantidad=nuevacantidad;
    }
    public void ingresar(double ingreso){
        if(ingreso>0){
            this.cantidad+=ingreso;
        }
    }
    public void retirar(double retirada){
        if(retirada>=this.cantidad){
            this.cantidad-=retirada;
           
        }else{
            System.out.println("Error! No hay suficiente cantidad.");
        }
    }
    public String toString(){
        String res="Esta cuenta pertenece a "+this.titular+" y posee actualmente una cantidad de "+this.cantidad+" ¤.";
        return res;
    }

}
