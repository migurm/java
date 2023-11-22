

package com.mycompany.timetoarraybitch;

public class RARRE48 {

    
    public static void main(String[] args) {
    int flags[]={0,1,0,-1,0,-1,-1,-1,0,0,-1};
    int tivic[];
    tivic =new int[flags.length];
        System.out.print("Array tivic:            |");
    for(int i=0;i<tivic.length;i++){
        tivic[i]=flags[i];
        if(flags[i]<0){
            flags[i]=8;
        }
        System.out.print(tivic[i]+"|");
    }
        System.out.print("\nArray flags modificado: |");
    for(int i=0;i<flags.length;i++){
        System.out.print(flags[i]+"|");
    }
    }

}
