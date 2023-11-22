
package E101;


abstract class InstrumentoDePercusion extends Instrumento{
    protected boolean usaBaquetas;
    
    public InstrumentoDePercusion(boolean usaBaquetas, String string, int entero, int entero2){
        super(string, entero, entero2);
        this.usaBaquetas=usaBaquetas;
    }


}
