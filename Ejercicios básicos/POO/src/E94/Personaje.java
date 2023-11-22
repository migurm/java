package E94;

public class Personaje {

    protected String nombrePersonaje;
    protected int[] coordenadas = new int[2];
    protected double puntosDeVida;
    protected double puntosEscudo;
    protected double puntosAtaque;

    public Personaje(String nombre, int posVertical, int posHorizontal,
            double puntosDeVida, double puntosEscudo, double puntosAtaque) {
        this.nombrePersonaje = nombre;
        this.coordenadas[0] = posVertical;
        this.coordenadas[1] = posHorizontal;
        this.puntosDeVida = puntosDeVida;

    }

    public void desplazarse(int x, int y) {
        if ((this.coordenadas[0] += x) >= 0)
        {
            this.coordenadas[0] += x;
        } else
        {
            this.coordenadas[0] = 0;
        }
        if ((this.coordenadas[1] += y) >= 0)
        {
            this.coordenadas[1] += y;
        } else
        {
            this.coordenadas[1] = 0;
        }

    }

    protected double calcularAleatorio(double max, double min) {//Método para ahorrar chorizos innecesarios.
        return ((Math.random() * (max - min + 1)) + 1);
    }
    
    public void atacar(Personaje defensor){
        
    /*Ataque del atacande se le resta a la vida + el escudo ?? del defensor.*/
    /*?Y las habilidades?*/
    
        
    }
    public void atacarHabilidad(Personaje defensor, Habilidad habilidad){
        /*Ataque para caso de ataque con habilidad, la hostia es la habilidad no el ataque*/
    }
    

    @Override
    public String toString() {
        String res = "Nombre del personaje: " + this.nombrePersonaje + "\n";
        res += "Posición actual, eje horizontal: " + this.coordenadas[0] + ", eje vertical: " + this.coordenadas[1] + "\n";
        res += "Puntos de vida: " + this.puntosDeVida + ". Escudo: " + this.puntosEscudo + ". Ataque: " + this.puntosAtaque + "\n";
        return res;
    }

}
