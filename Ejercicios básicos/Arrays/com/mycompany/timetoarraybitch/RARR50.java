

package com.mycompany.timetoarraybitch;

public class RARR50 {

    
    public static void main(String[] args) {
        int mayor=0;
        int pos=0;
        int arra[]=new int[100];
        System.out.print("a)Los múltiplos de 5 del array son: |");
        for(int i=0;i<arra.length;i++){
            arra[i]=(int)((Math.random()*(100-1+1))+1);
            if(arra[i]>mayor){
                mayor=arra[i];
                pos=i;
            }
            if(arra[i]%5==0){
                System.out.print(arra[i]+"|");
            }
        }
        System.out.print("\nb)Los números pares del array son: |");
        for(int i=0;i<arra.length;i++){
            if(arra[i]%2==0){
                System.out.print(arra[i]+"|");
            }
        }
        System.out.println("\nEl mayor de los elementos del array es: "+mayor+" y se encuentra en la posición "+pos+".");
        
    
    }

}
