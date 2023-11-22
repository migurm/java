
package com.mycompany.relacionbucles;
import java.util.Scanner;
public class E37 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        int num;
        int cont=0;
        int ini=0;
        int aux=0;
        int fin=0;
        final int prueba;
        do{System.out.print("Dame un número: ");
        num=teclado.nextInt();
        cont++;
        if(num==12){
            ini=aux;
            aux=cont;
            fin=cont;  
        }
        }while(num!=0);
        System.out.println("El número 12 apareción en la posición: "+ini);
        System.out.println("última aparición en posición: "+fin);
    }

}
