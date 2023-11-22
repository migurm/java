package E91;

public class ProductoRefrigerado extends Producto {

    private String fechaDeEnvasado;
    private String paisDeOrigen;
    private int codigoOSA;
    private double temperaturaMantenimiento;

    public ProductoRefrigerado(String caducidad, int lote, String envasado, String pais, int cosa, double temperatura) {
        super(caducidad, lote);
        this.fechaDeEnvasado = envasado;
        this.paisDeOrigen = pais;
        this.codigoOSA = cosa;
        this.temperaturaMantenimiento = temperatura;

    }

    public String getFechaDeEnvasado() {
        return this.fechaDeEnvasado;
    }

    public String getPaisDeOrigen() {
        return this.paisDeOrigen;
    }

    public int getCodigoOSA() {
        return this.codigoOSA;
    }
    public double getTemperaturaMantenimiento(){
        return this.temperaturaMantenimiento;
    }
    @Override
    public String toString(){
        String res=super.toString();
        res+="Fecha de envasado: "+this.fechaDeEnvasado+"|| Pais de origen: "+this.paisDeOrigen+"\n";
        res+="Temperatura de mantenimiento: "+this.temperaturaMantenimiento+"\n";
        res+="Codigo del Organismo de Supervisión Alimentaria: "+this.codigoOSA+"\n";
        return res;
    }

}
