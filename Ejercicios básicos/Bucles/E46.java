
package com.mycompany.relacionbucles;
import java.util.Scanner;
public class E46 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int bolas, turno, jug; 
        int hum=0;
        int maq=0;
        System.out.println("Bienvenido al juego de las bolas. ");
        do{System.out.println("¿Con cuántas bolas quieres jugar?");
        bolas=teclado.nextInt();
        if(bolas<=0){
            System.out.println("Tienen que ser reales, por favor...");
        }
        }while(bolas<=0);
        System.out.println("Ahora aleatoriamente veremos quién empieza...");
        turno=(int)((Math.random()*(2-1+1))+1);
        if(turno==1){
            System.out.println("¡Usted comienza!");
        }
        else{
            System.out.println("¡Comienzo yo!");
        }
        do{
            if((turno==1)||(turno==0)){
            System.out.println("Cuántas bolas desea retirar?: ");
            hum=teclado.nextInt();
            while ((hum<1)||(hum>3)){
                System.out.print("Recuerde... 1, 2 ó 3: ");
                hum=teclado.nextInt();
            } 
            System.out.println("Retiras "+hum);
            turno=0;
            bolas=bolas-hum;
                System.out.println("Quedan "+bolas+" bolas.");
        }
            if ((turno==2)||(turno==0)){
            maq=(int)((Math.random()*(3-1+1))+1);
            System.out.println("Retiro "+maq);
        }
            turno=0;
            bolas=bolas-maq;
            System.out.println("Quedan "+bolas+" bolas.");
        }while(bolas>=1);
        System.out.println("Se acabaron las bolas, el último en tirar perdió.");
    }             
}