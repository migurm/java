/*
109- Crea la clase Impar. Dicha clase tendr� como variable de clase numero (un
n�mero entero). Adem�s, los m�todos que va a tener la clase son:
? constructor: Recibe como argumento un n�mero entero. Si el argumento
es un n�mero par, lanza una excepci�n con un mensaje indicando que el n�mero
no es impar. En caso contrario, asigna ese n�mero a la variable de clase.
? toString: muestra el numero que tiene almacenada la variable de clase.
Crea un archivo MAIN que sea capaz de usar correctamente la siguiente l�nea de
c�digo: System.out.println(new Impar(24))
 */
package RepasoExcepciones;

public class E109 {

    public static void main(String[] args) {
        try{
        System.out.println(new Impar(24));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
