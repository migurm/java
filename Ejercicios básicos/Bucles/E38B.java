

package com.mycompany.relacionbucles;
import java.util.Scanner;
public class E38B {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int total=0;
        double sumanotas=0;
        double nota=0;
        int i;
        int media;
        do{System.out.print("Indique cuántas notas va a introducir(mínimo 2): ");
        total=teclado.nextInt();
        }while(total<2);
        for(i=1;i<=total;i++){
            System.out.println("Introduzca la nota "+i+": ");
            nota=teclado.nextDouble();
            sumanotas=sumanotas+nota;
        }
        media=(int)Math.round(sumanotas/total);
        System.out.println("Su nota media es de: "+media);    
            
        
        
    
    }

}
