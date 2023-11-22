

package com.mycompany.relacionesjdk11;
import java.util.Scanner;
public class R2E21 {

    
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        System.out.print("Introduzca un año para determinar si es bisiesto:");
        int year=teclado.nextInt();
        if((year%4==0)&&(year%100!=0)||(year%400==0)){
            System.out.println("Es un año bisiesto.");
        }
        else{
            System.out.println("No es un año bisiesto.");
        }
        teclado.close();
    
    }

}
