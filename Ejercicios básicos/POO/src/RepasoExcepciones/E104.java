/*
104.-Implementa un programa que cree un array de números decimales cuyo tama?o
debe indicarlo el usuario por teclado. A continuación, utilizando un bucle, debe pedir
tantos valores por teclado como tama?o tenga el array y los debe ir guardando en cada
celda del array. Hay que manejar todas posibles excepciones y seguir pidiendo valores
hasta rellenar completamente el vector.
*/
package RepasoExcepciones;
import java.util.InputMismatchException;
import java.util.Scanner;
public class E104 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        boolean correctSize=false;
        double [] arrayNumerosDecimales;
        int size=0;       
        do{
            System.out.print("Introduzca, en número entero, una lontigud para el array: ");
            try{
                size=input.nextInt();
                if(size<=0) throw new RuntimeException("Tiene que ser una longitud positiva, mayor de cero.");
                correctSize=true;
            }catch(InputMismatchException e){
                System.out.println("Error! siga las indicaciones del programa, por favor.");
                input.nextLine();
            }catch(RuntimeException e){
                System.out.println(e.getMessage());
            }
            
        }while(!correctSize);   
        arrayNumerosDecimales= new double [size];        
        for (int i = 0 ; i < arrayNumerosDecimales.length ; i++){
            System.out.print("Introduzca un valor para la "+(i+1)+"a posición: ");
            try{
                arrayNumerosDecimales[i]=input.nextDouble();
                
            }catch(InputMismatchException e){
                System.out.println("Necesitamos números, preferiblemente decimales, por favor!!");
                i--;
                input.nextLine();
            }
        }
        input.close();
    }
}
