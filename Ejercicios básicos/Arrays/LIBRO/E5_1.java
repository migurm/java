/*5.1 Diseñar un programa que solicite al usuario que introduzca por teclado 5 números decimales a continuación,
debe mostrar los números en el mismo orden que se han introducido.
 */
package LIBRO;
import java.util.Arrays;
import java.util.Scanner;

public class E5_1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i;
        double arra1[];
        arra1 = new double[5];
        System.out.println("A continuación introduzca cinco números decimales. ");
        for (i = 0; i < (arra1.length); i++){
            System.out.print("Introduzca el valor " + (i+1)+": ");
            arra1[i] = teclado.nextDouble();
        }
        /*for (i = 0; i < (arra1.length); i++){
            System.out.println(arra1[i]);
        }
*/
        //Usando Arrays.toString()
        System.out.println(Arrays.toString(arra1));
        
        
        
    }

}
