
package com.mycompany.timetoarraybitch;

public class PIZA1 {

    public static void main(String[] args) {
        int i=0;
        int aux=0;
        int lista [];
        lista=new int [10];
        for (i=0;i<(lista.length);i++){
            lista[i]=(int)((Math.random()*(23-10+1))+1);  
        }
        aux=lista[0];
        lista[0]=lista[(lista.length-1)];
        lista[(lista.length-1)]=aux;
        for(i=0;i<(lista.length);i++){
            System.out.print(" "+lista[i]+" " );
        }
    }
}
