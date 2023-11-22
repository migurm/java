

package com.mycompany.relacionbucles;
import java.util.Scanner;
public class E33 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i, base, expo;
        int res=1;
        System.out.print("Introduzca la base: ");
        base=teclado.nextInt();
        System.out.print("Ahora el exponente: ");
        expo=teclado.nextInt();
        for(i=1;i<=expo;i++){
            res=res*base;
        }
        System.out.println(base+" elevado a "+expo+" da: "+res);
        
        
       
        
        
    
    }

}
