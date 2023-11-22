package E81;

public class Guerrero {

    private String nombre;
    private int saludMaxima;
    private int ataque;
    private int escudo;
    private int saludActual;
    private boolean muerto;
    private Arma arma;
    private int nivelGuerrero;
    private int experienciaActual;
    private int siguienteNivel;

    public Guerrero(String nombre, int saludMaxima, int ataque, int escudo, Arma arma) {
        this.nombre = nombre;
        this.saludMaxima = saludMaxima;
        this.ataque = ataque;
        this.escudo = escudo;
        this.saludActual = this.saludMaxima;
        this.muerto = false;
        this.arma = arma;
        this.nivelGuerrero=1;
        this.experienciaActual=0;
        this.siguienteNivel=(int)(Math.ceil((this.nivelGuerrero*10)+(this.nivelGuerrero*1.5)));
    }

    /*   public int atacar(){
        int hostia;
        if(!muerto){
        hostia=this.ataque+this.arma.getPoder();
        }else{
        hostia=0;
        }
        return hostia;       
        
    }*/
    public String toString() {
        String res = "";
        res += "Guerrero: " + this.nombre + "\n";
        res += this.saludActual + " puntos de salud de " + this.saludMaxima + " máximos.\n";
        res += "Ataque: " + this.ataque + " | Escudo: " + this.escudo;
        res += "\n ----- \n";
        res += "Arma: ";
        res += this.arma.toString();
        return res;
    }

    public String atacarA(Guerrero defensor) {
        String hostia = "";//El String que va a devolver el método
        int sumaAtaque;//La variable en la que vamos a meter el daño de la hostia
        if (!muerto) {//Si está vivo puede atacar.
            if (this.arma.getResistencia()  > 0) {//Si el arma tiene resistencia

                sumaAtaque = this.ataque + this.arma.getPoder() - defensor.escudo;//La hostia es el ataque + el arma - la defensa.

                this.arma.setResistencia(this.arma.getResistencia() - 1);//Ha usado el arma, así que le quitamos un punto de resistencia.
                this.experienciaActual+=3;
                this.subidaNivel();
                

            } else {//No tiene resistencia el arma

                sumaAtaque = this.ataque - defensor.escudo;//La hostia en caso de no tener arma es el ataque del atacante - la defensa del defensor
                this.experienciaActual+=5;
                this.subidaNivel();

            }

            defensor.saludActual -= sumaAtaque;//Dependiendo del caso que haya sido, le restamos a la salud del defensor la cantidad de la hostia.

            hostia += this.nombre + " ataca a " + defensor.nombre + " recibe " + sumaAtaque + " de daño.";//Plantilla de ataque.

            if (defensor.saludActual <= 0) {//Comprobamos si ha resultado muerto
                defensor.saludActual = 0;
                defensor.muerto = true;
                hostia += "\nEl pobre " + defensor.nombre + " ha cascado...";
            } else {
                hostia += "\nSigue con vida";
            }

        } else {//La opcion alterna al if de la linea 47
            hostia = "No puede atacar, está muerto.";
        }
        return hostia;
    }
    public void mejorarArma(String arma){
        if(arma.equalsIgnoreCase(this.arma.getNombre())){
            this.arma.subirNivel();
            System.out.println("El arma "+this.arma.getNombre()+" subió un nivel");
        }
        
        
    }
    public boolean subir(){
        boolean subida=false;
        if(this.experienciaActual==this.siguienteNivel){
            subida=true;
        }
        return subida; 
    }
    public void subidaNivel(){
        boolean subida=this.subir();
        if(subida){
            this.nivelGuerrero++;
            this.experienciaActual=0;
            this.siguienteNivel=(int)(Math.ceil((this.nivelGuerrero*10)+(this.nivelGuerrero*1.5)));
            this.ataque++;
            this.escudo++;
            this.saludMaxima+=10;
        }
        
            
        
    }
    

}
