
package E96;


public abstract class Robot {
    protected double aguanteRobot;
    protected double velocidad;
    protected double potencia;
    
    
    public Robot (double aguante, double velocidad, double potencia){
        this.aguanteRobot=aguante;
        this.velocidad=velocidad;
        this.potencia=potencia;
    }
    
    
    public abstract String combatir(Robot defensor);
    
    public abstract void mostrar();

}
