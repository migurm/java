package E91;

public class ProductoCongeladoAire extends ProductoCongelado {

    private double porcentajeNitrogeno;
    private double porcentajeOxigeno;
    private double porcentajeDioxidoC;
    private double porcentajeVaporAgua;

    public ProductoCongeladoAire(String caducidad, int lote, String envasado, String pais, double temperatura, double oxi, double nitro, double dioxi, double vapor) {
        super(caducidad, lote, envasado, pais, temperatura);
        this.porcentajeNitrogeno = nitro;
        this.porcentajeDioxidoC = dioxi;
        this.porcentajeVaporAgua = vapor;
        this.porcentajeOxigeno = oxi;

    }

    private double getPorcentajeNitrogeno() {
        return this.porcentajeNitrogeno;
    }

    private double getPorcentajeOxigeno() {
        return this.porcentajeOxigeno;
    }

    private double getPorcentajeDioxido() {
        return this.porcentajeDioxidoC;
    }

    private double getPorcentajeVapor() {
        return this.porcentajeVaporAgua;
    }
    
    @Override
    public String toString(){
        String res=super.toString();
        res+="% de Nitrógeno: "+this.porcentajeNitrogeno+"\n";
        res+="% de Oxígeno: "+this.porcentajeOxigeno+"\n";
        res+="% de CO2: "+this.porcentajeDioxidoC+"\n";
        res+="% de Vapor de agua: "+this.porcentajeVaporAgua+"\n";
        return res;
    }
    

}
