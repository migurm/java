/*
103.- Crea un programa que lance y capture una excepci�n del tipo
RuntimeException. Para ello el programa har� lo siguiente:
a) Mostrar el texto: Programa autom�tico
b) Crear una excepci�n del tipo indicado con el mensaje: soy una excepcion.
c) Lanzar la excepci�n (throw).
A?ade el c�digo necesario para que, pase lo que pase, se muestre el mensaje: Programa
terminado.
*/


package Excepciones;


public class E103 {

    public static void main(String[] args) {
        System.out.println("Programa autom�tico");
        throw new RuntimeException ("soy una excepcion");
        

    }

}
