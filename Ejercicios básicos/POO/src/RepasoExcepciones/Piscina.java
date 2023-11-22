package RepasoExcepciones;

public class Piscina {

    public final int MAXNIVEL;
    private int nivel;

    public Piscina(int tope) {
        if (tope < 0)tope = 0;
        this.MAXNIVEL = tope;
        this.nivel = 0;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void quitarAgua(int cantidad) {
        if(this.nivel<cantidad) throw new NivelAguaException ("No hay tanta agua para sacar esa cantidad.");
        this.nivel -= cantidad;
    }

    public void ponerAgua(int cantidad) {
        if(this.nivel+cantidad>this.MAXNIVEL) throw new NivelAguaException ("No cabe tanta agua.");
        this.nivel += cantidad;
    }
}
