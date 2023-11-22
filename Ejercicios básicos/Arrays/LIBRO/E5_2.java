/*5.2 Escribir una aplicación que solicite al usuario cuántos números desea introducir. A continuación,
se introducirá por teclado esa cantidad de números enteros, y por último, los mostrará en el orden inverso
al introducido.
*/

package LIBRO;
import java.util.Scanner;
public class E5_2 {

    
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        int num;
        do{System.out.println("Diga cuántos números desea introducir: ");
        num=teclado.nextInt();
        if(num<=0){
            System.out.println("Números de verdad, listo.");
        }
        }while(num<=0);
        int arra1[];
        arra1=new int[num];
        for(int i=0;i<(arra1.length);i++){
            System.out.print("Introduzca el valor "+(i+1)+": ");
            arra1[i]=teclado.nextInt();
        }
        for(int i=arra1.length-1;i>=0;i--){
            System.out.println(arra1[i]);
            
        }
        
        
       
       
        
        
        
        
    }

}
