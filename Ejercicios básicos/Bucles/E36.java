//36. Desarrolla un algoritmo que pida 5 elementos por teclado y continuación muestre la 
//suma de todos los elementos, la suma de aquellos números mayores a 36 y la suma de 
//aquellos números menores a 10. Nota: no puedes usar 5 variables.


package com.mycompany.relacionbucles;
import java.util.Scanner;
public class E36 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Creamos un array ([]), lo llamamos numeros, y decimos que tendrá una cantidad de 5 valores.
        int [] num= new int [5];
        for (int i=0;i<5; i++){
            System.out.println("Escriba el número "+(i+1)+":");
            num[i]=teclado.nextInt();
        }
        
        
        
        
    
    }

}
