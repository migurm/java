package E91;

public class ProductoCongelado extends Producto {

    private String fechaDeEnvasado;
    private String paisDeOrigen;
    private double temperaturaMantenimiento;

    public ProductoCongelado(String caducidad, int lote, String envasado, String pais, double temperatura) {
        super(caducidad, lote);
        this.fechaDeEnvasado = envasado;
        this.paisDeOrigen = pais;
        this.temperaturaMantenimiento = temperatura;

    }

    public String getFechaDeEnvasado() {
        return this.fechaDeEnvasado;
    }

    public String getPaisDeOrigen() {
        return this.paisDeOrigen;
    }

    public double getTemperaturaMantenimiento() {
        return this.temperaturaMantenimiento;
    }

    @Override
    public String toString() {
        String res = super.toString();
        res += "Fecha de Envasado: " + this.fechaDeEnvasado + "|| Pais de origen: " + this.paisDeOrigen + "\n";
        res += "Temperatura de mantenimiento: " + this.temperaturaMantenimiento + "\n";
        return res;
    }

}
