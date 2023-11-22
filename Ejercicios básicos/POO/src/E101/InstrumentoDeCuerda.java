

package E101;


abstract class InstrumentoDeCuerda extends Instrumento {//Tenemos otra clase abstracta
    protected int numeroDeCuerdas;
    protected boolean pulsadas;//Si pulsadas es false, se trata de percutidas.

    public InstrumentoDeCuerda (boolean pulsadas, String string, int entero, int entero2){
        super(string, entero, entero);
        this.pulsadas=pulsadas;
    }
    
    
    
    
}
