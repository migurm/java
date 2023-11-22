/*
103.- Crea un programa que lance y capture una excepci�n del tipo
RuntimeException. Para ello el programa har� lo siguiente:
a) Mostrar el texto: Programa autom�tico
b) Crear una excepci�n del tipo indicado con el mensaje: soy una excepcion.
c) Lanzar la excepci�n (throw).
A?ade el c�digo necesario para que, pase lo que pase, se muestre el mensaje: Programa
terminado.
*/
package RepasoExcepciones;

import java.util.Scanner;


public class E103 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int edad=16;
        System.out.println("Muestra un texto programa autom�tico.");
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
