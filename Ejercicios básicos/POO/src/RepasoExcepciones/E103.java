/*
103.- Crea un programa que lance y capture una excepción del tipo
RuntimeException. Para ello el programa hará lo siguiente:
a) Mostrar el texto: Programa automático
b) Crear una excepción del tipo indicado con el mensaje: soy una excepcion.
c) Lanzar la excepción (throw).
A?ade el código necesario para que, pase lo que pase, se muestre el mensaje: Programa
terminado.
*/
package RepasoExcepciones;

import java.util.Scanner;


public class E103 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int edad=16;
        System.out.println("Muestra un texto programa automático.");
        /*System.out.print("Indique su edad: ");       
        edad=input.nextInt();*/
        try{
        if(edad<18) throw new RuntimeException("soy una excepcion");        
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
        System.out.print("Programa terminado.");
    }
}
