

package com.mycompany.relacionbucles;
import java.util.Scanner;
public class E35 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i;
        int alt;
        System.out.print("Introduce el primer número: ");
        int n=teclado.nextInt();
        System.out.print("Introduce el segundo número: ");
        int m=teclado.nextInt();
        alt=n*m;
        System.out.print("Los múltiplos de "+n+" entre "+n+" y "+alt+" son: ");
        for(i=1;i<=alt;i++){
            if(i%n==0){
                System.out.print(i+",");
            }
        }
        
        
    
    }

}
