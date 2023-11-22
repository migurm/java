/*
Pedir dos números por pantalla y realizar la división.
*/

package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejemploExcepciones {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        double arra [] = new double [5];
        
        for (int i =0 ; i<arra.length;i++){
            System.out.println("Introduzca el valor "+(i+1));
            
            try{ arra[i]=input.nextDouble();
            
            }catch(InputMismatchException e){
                System.out.println("Solo numeros, por favor.");
                
            }  
            
        }
  

        
        

    }

}
