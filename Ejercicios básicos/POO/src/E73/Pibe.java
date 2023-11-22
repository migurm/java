/*
73.- Queremos crear un juego en el que vamos a tener unas criaturas llamadas ?Pibes?.
Para ello hay que crear una clase que represente estas criaturas.
De cada Pibe necesitamos guardar su nombre, sus puntos de esfuerzo, sus vidas totales,
sus puntos de hambre y su estado (vivo o muerto). Además, cada Pibe puede comer,
comunicarse, jugar y dormir.
De momento, las reglas que rigen el juego son:
? El constructor sólo necesita el nombre del Pibe.
? Un Pibe empieza con 10 puntos de esfuerzo, 3 puntos de hambre, 7 vidas y,
obviamente, VIVO.
? Los valores de esfuerzo, hambre y vidas no pueden superar los valores iniciales.
? Al jugar gasta 3 puntos de esfuerzo y 1 de hambre.
? Al comunicarse gasta 1 punto de esfuerzo.
? Si come, gasta dos puntos de esfuerzo y gana dos de hambre. Pero si además
come su comida favorita, ganará 3 puntos de hambre.
? Al dormir gana 5 puntos de esfuerzo.
? Si los puntos de esfuerzo o de hambre llegan a cero, el Pibe perderá una vida y
volverá a vivir con los valores por defecto.
? Si el Pibe pierde todas las vidas, muere, todos sus atributos tomarán el valor -1 y
no podrá realizar ninguna acción .
 */
package E73;

public class Pibe {

    String nombre;
    int ptosEsfuerzo; 
    int ptosHambre;
    int vidas;
    boolean estado;

    public Pibe(String nombre) {
        this.nombre = nombre;//Se requiere el nombre solo, por defecto va:
        this.ptosEsfuerzo = 10;//10 ptos de esfuerzo
        this.ptosHambre = 3;//3 ptos de hambre
        this.vidas = 7;//7 vidas
        this.estado = true;//estado vivo true
    }

    //Los valores de hambre, esfuerzo y vidas nunca pueden exceder los de base.
    /*
    if(ptosHambre>3){
    ptosHambre=3;
    }
    if(ptosEsfuerzo>10){
    ptosEsfuerzo=10;
    }
     */
    //Metodo jugar:
    public void jugar() {
        if (this.estado) {
            if ((this.ptosEsfuerzo >= 3) && (this.ptosHambre >= 1)) {//Si tiene los ptos necesarios
                //Puede jugar, gasta 3 de esfuerzo y uno de hambre
                System.out.println(this.nombre+" está jugando.");
                this.ptosEsfuerzo -= 3;
                this.ptosHambre -= 1;
                muerte();

            } else {//Si no tiene los puntos necesarios
                if ((this.ptosEsfuerzo < 3) && (this.ptosHambre < 1)) {
                    System.out.println("A "+this.nombre+" le fantan ptos de esfuerzo y hambre.");
                    //Le faltan los dos
                } else if ((this.ptosEsfuerzo >= 3) && (this.ptosHambre < 1)) {
                    System.out.println("A "+this.nombre+" le fantan ptos hambre.");
                    //Le faltan solo los de hambre
                } else if ((this.ptosEsfuerzo < 3) && (this.ptosHambre >= 1)) {
                    System.out.println("A "+this.nombre+" le fantan ptos hambre.");
                    //Le fantal solo los de esfuerzo

                }
            }

        } else {
            //Si el booleano estado es falso no puede hacer nada.
            System.out.println(this.nombre + " ya no está entre nosotros, no puede hacer nada.");
        }
    }

    public void comunicarse() {
        if (this.estado) {//Si el boolean estado es true puede
            if (this.ptosEsfuerzo >= 1) {//Si tiene los puntos de esfuerzo necesarios.
                this.ptosEsfuerzo -= 1;
                muerte();

            } else {
                //No tiene ptosEsfuerzo para comunicarse
            }

        } else {//Si el booleano estado es falso no puede hacer nada.
            System.out.println(this.nombre + " ya no está entre nosotros, no puede hacer nada.");

        }
    }

    public void comer(boolean favorita) {
        if (this.estado) {//Si el boolean estado es true puede
            if (this.ptosEsfuerzo >= 2) {//Tiene esfuerzo para comer
                if (favorita) {//El parametro de entrada es "favorita"
                    System.out.println("Que bueno, su favorita.");
                    this.ptosEsfuerzo -= 2;
                    this.ptosHambre += 3;

                } else {
                    System.out.println("Sienta bien la comida, aunque las hay mejores.");
                    //El parametro string no es "favorita", es comida normal
                    this.ptosEsfuerzo -= 2;
                    this.ptosHambre += 2;//Son dos en caso de no favorita
                }
                muerte();

            } else {
                //No tiene los suficientes puntos de esfuerzo
            }

        } else {//Si el booleano estado es falso no puede hacer nada.
            System.out.println(this.nombre + " ya no está entre nosotros, no puede hacer nada.");

        }
    }

    public void dormir() {
        if (this.estado) {//Si el boolean estado es true puede
            this.ptosEsfuerzo += 5;
            if (this.ptosEsfuerzo > 10) {
                this.ptosEsfuerzo = 10;//Los cambiamos
            }
        } else {//Si el booleano estado es falso no puede hacer nada.
            System.out.println(this.nombre + " ya no está entre nosotros, no puede hacer nada.");

        }
    }

    public void muerte() {
        if ((this.ptosEsfuerzo <= 0) || (this.ptosHambre <= 0)) {//Si al terminar la acción resulta q ha muerto.
            this.vidas -= 1;
            System.out.println(this.nombre + " ha perdido una vida, le quedan " + this.vidas + " vidas.");
            this.ptosHambre = 3;
            this.ptosEsfuerzo = 10;
            finDelJuego();

        } else {//Si no ha muerto pero tiene algún contador de puntos por encima de lo permitido.
            if (this.ptosHambre > 3) {
                this.ptosHambre = 3;
            }
            if (this.ptosEsfuerzo > 10) {
                this.ptosEsfuerzo = 10;//Los cambiamos
            }

        }

    }

    public void finDelJuego() {//Esto se comprobará cada vez que se ejecute el metodo muerte.
        if (this.vidas <= 0) {
            System.out.println(this.nombre + " ha agotado todas sus vidas, ya no podrá hacer nada.");
            this.estado = false;
            this.ptosEsfuerzo = -1;
            this.ptosHambre = -1;
            this.vidas = -1;
        }
    }

    public String toString() {
        String res = "";
        res += "Pibe de nombre: " + this.nombre + ".\n";
        res += "Tiene: " + this.ptosEsfuerzo + " puntos de esfuerzo.\n";
        res += "Tiene: " + this.ptosHambre + " puntos de hambre. \n";
        if (this.estado) {
            res += "Le quedan: " + this.vidas + " vidas.";
        } else {
            res += "Está muerto.";
        }
        return res;
    }
    
    
    /*
    public void alimentarse(boolean favorita){
    if
    player1.alimentarse(false);
    */

}
