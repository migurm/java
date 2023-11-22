

package com.mycompany.relacionbucles;
import java.util.Scanner;
public class E45 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, intento;
        System.out.println("Vamos a jugar a un juego...;)");
        System.out.println("Yo pensaré un número del 1 al 100 y usted deberá adivinarlo...");
        System.out.println("Le iré dando pistas.");
        System.out.println("Pensando número...");
        System.out.println("...");
        System.out.println("Número pensado ;).");
        num=(int)((Math.random()*(100-1+1))+1);
        do{System.out.print("Introduzca un número del 1 al 100: ");
        intento=teclado.nextInt();
        if((intento<1)||(intento>100)){
            System.out.println("Creo que no estás entendiendo el juego...");
        }
        else if (intento<num){
            System.out.println("Te has quedado corto!!");
        }
        else if(intento>num){
            System.out.println("Te has pasado!!");
        }
        else if(intento==num){
            System.out.println("Lo lograste!!");
        }
        }while((intento<1)||(intento>100)||(intento!=num));
    }

}
