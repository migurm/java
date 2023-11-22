/*
109- Crea la clase Impar. Dicha clase tendrá como variable de clase numero (un
número entero). Además, los métodos que va a tener la clase son:
? constructor: Recibe como argumento un número entero. Si el argumento
es un número par, lanza una excepción con un mensaje indicando que el número
no es impar. En caso contrario, asigna ese número a la variable de clase.
? toString: muestra el numero que tiene almacenada la variable de clase.
Crea un archivo MAIN que sea capaz de usar correctamente la siguiente línea de
código: System.out.println(new Impar(24))
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
