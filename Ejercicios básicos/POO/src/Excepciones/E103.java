/*
103.- Crea un programa que lance y capture una excepción del tipo
RuntimeException. Para ello el programa hará lo siguiente:
a) Mostrar el texto: Programa automático
b) Crear una excepción del tipo indicado con el mensaje: soy una excepcion.
c) Lanzar la excepción (throw).
A?ade el código necesario para que, pase lo que pase, se muestre el mensaje: Programa
terminado.
*/


package Excepciones;


public class E103 {

    public static void main(String[] args) {
        System.out.println("Programa automático");
        throw new RuntimeException ("soy una excepcion");
        

    }

}
