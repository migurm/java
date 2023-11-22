package com.mycompany.relacionesjdk11;
import java.util.Scanner;
public class Ejercicio20 {
    
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        System.out.println("Introduzca el primer número: ");
        int num1=teclado.nextInt();
        System.out.println("Introduzca el segundo número: ");
        int num2=teclado.nextInt();
        System.out.println("Introduzca el tercero: ");
        int num3=teclado.nextInt();
        if((num1<0)&&(num2<0)&&(num3<0)){
            int mayor=num1;
            int menor=num2;
            if(num2>num1){
                mayor=num2;
            }
            else if(num3>num2){
                mayor=num3;
            }
            if (num1<menor){
                menor=num1;
            }
            else if (num3<menor){
                menor=num3;    
            }
            System.out.println("Los números son: "+num1+num2+num3);
            System.out.println("El mayor es: "+mayor);
            System.out.println("El menor es: "+menor);
            teclado.close(); 
    }
        else{
            System.out.println("Los números no son válidos.");
        }
    
    }

}
