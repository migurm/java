/*105.- Escribe un programa que lea dos n�meros por teclado, numerador y denominador
respectivamente. A continuaci�n se debe comprobar que numerador es menor que 100
y denominador mayo de -5. Si esto no es as� se lanzar� una excepci�n de tipo Exception.
A continuaci�n se calcular� el cociente y se mostrar� por pantalla.
Ten en cuenta que, aparte de la excepci�n indicada, tambi�n se puede producir una
divisi�n entre cero y tambi�n que al pedir los n�meros por teclado se introduzcan
caracteres no num�ricos.
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
                System.out.println("Tiene que ser un n�mero, gracias!");
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
                System.out.println("Tiene que ser un n�mero, gracias!");
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
            System.out.println("Operaci�n matem�tica no v�lida... a cascarla!");
        }
    }
}
