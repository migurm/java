

package com.mycompany.relacionbucles;
import java.util.Scanner;
public class E31 {

    
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    int i=0;
    int num=0;
        System.out.print("Introduzca un número entero: ");
        num=teclado.nextInt();
        for(i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
               
            }
        }
        
    }

}
