/*105.- Escribe un programa que lea dos números por teclado, numerador y denominador
respectivamente. A continuación se debe comprobar que numerador es menor que 100
y denominador mayo de -5. Si esto no es así se lanzará una excepción de tipo Exception.
A continuación se calculará el cociente y se mostrará por pantalla.
Ten en cuenta que, aparte de la excepción indicada, también se puede producir una
división entre cero y también que al pedir los números por teclado se introduzcan
caracteres no numéricos.
 */
package RepasoExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E105 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean numeradorCorrecto = false, denominadorCorrecto = false;
        double numerador = 0;
        double denominador = 0;
        do{
            System.out.print("Introduzca el numerador: ");
            try{
                numerador = input.nextDouble();
                if (numerador < 100) throw new Exception("Numerador menor de 100.");
                
                numeradorCorrecto = true;
            }catch (InputMismatchException e){
                System.out.println("Tiene que ser un número, gracias!");
                input.nextLine();
            } catch (Exception e){
                System.out.println(e.getMessage());
                input.nextLine();
            }
        }while (!numeradorCorrecto);
        System.out.println("Perfecto, ahora...");
        do{
            System.out.print("Introduzca el denominador: ");
            try{
                denominador = input.nextDouble();
                if (denominador > -5) throw new Exception("Denominador mayor de -5.");               
                denominadorCorrecto = true;
            }catch (InputMismatchException e){
                System.out.println("Tiene que ser un número, gracias!");
                input.nextLine();
            }catch (Exception e){
                System.out.println(e.getMessage());
                input.nextLine();
            }
        }while(!denominadorCorrecto);
        input.close();
        System.out.println("Muy bien! Ahora probaremos a calcular su cociente...");
        try{
            System.out.println("El cociente es: " + numerador / denominador);
        }catch (ArithmeticException e){
            System.out.println("Operación matemática no válida... a cascarla!");
        }
    }
}
