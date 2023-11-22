
package RepasoExcepciones;


public class NivelAguaException extends RuntimeException {
    public NivelAguaException (){
        super();
    }
    public NivelAguaException (String mensaje){
        super(mensaje);
    }

}
