
package RepasoExcepciones;


public class CreacionGatoException extends RuntimeException {
    public CreacionGatoException (){
        super();
    }
    public CreacionGatoException (String mensaje){
        super(mensaje);
    }

}
