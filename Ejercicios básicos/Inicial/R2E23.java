

package com.mycompany.relacionesjdk11;
import java.util.Scanner;
public class R2E23 {

    
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        System.out.println("Introduzca un número por pantalla.");
        int num=teclado.nextInt();
        if((num>9999)&&(num<100000)&&(num%2==0)){
            System.out.println("Se trata de un número de 5 cifras y par.");
        }else{
            System.out.println("No es un número de 5 cifras.");
        }
        if((num%2==0)){
            System.out.println("Se trata de un número par.");
        }else{
            System.out.println("Se trata de un número impar.");
        }
    }

}
