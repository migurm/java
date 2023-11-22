

package com.mycompany.timetoarraybitch;

public class RARRE49 {

    
    public static void main(String[] args) {
        int arra[]=new int[100];
        int mayor=0;
        int menor=100;
        System.out.print("Array aleatorio: |");
        for(int i=0;i<arra.length;i++){
            arra[i]=(int)((Math.random()*(100-1+1))+1);
            if(arra[i]>mayor){
                mayor=arra[i];
            }
            if(arra[i]<menor){
                menor=arra[i];
            }
            System.out.print(arra[i]+"|");
        }
        System.out.println("\nEl menor es: "+menor);
        System.out.println("El mayor es: "+mayor);
    
    }

}
