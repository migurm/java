
package com.mycompany.relacionbucles;
import java.util.Scanner;
public class E39 {

    
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        int num,i;
        int res=1;
        do{System.out.print("Introduzca un número mayor de 1 por pantalla: ");
        num=teclado.nextInt();
        if(num<1){
            System.out.println("¿Eres tonto?");
        }
        }while(num<1);
        System.out.print(num+"! = ");
        for(i=num;i>=1;i--){
            if(i==1){
                System.out.print(i+" = ");
            }
            else{
            System.out.print(i+"*");
            }
            res=res*i;
        }
        System.out.print(res);
    }

}
