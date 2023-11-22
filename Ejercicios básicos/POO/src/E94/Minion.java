

package E94;


public class Minion extends Personaje{
    String tipo;
    
    public Minion(String nombre, int posVertical, int posHorizontal,
            double puntosDeVida, double puntosEscudo, double puntosAtaque, String tipo){
        
        super(nombre, posVertical, posHorizontal, puntosDeVida, puntosEscudo, puntosAtaque);
        
        this.nombrePersonaje="minion";
        
        switch(tipo){
            case "mago":
                this.tipo=tipo;
                this.puntosDeVida=12;
                this.puntosEscudo=40;
                this.puntosAtaque=30;
                break;
            case "ca?on":
                this.tipo=tipo;
                this.puntosDeVida=75;
                this.puntosEscudo=5;
                this.puntosAtaque=25;
                break;
            default:
                this.tipo="melee";
                this.puntosDeVida=50;
                this.puntosEscudo=10;
                this.puntosAtaque=10; 
                break;
        }
                
        this.coordenadas[0]=(int)calcularAleatorio(1520,400);   
        this.coordenadas[1]=(int)calcularAleatorio(1520,400); 
                
        }
    }
 


