/*
59.- Crea un programa que cree una matriz de tamaño 5x5 que almacene los números
del 1 al 25 y luego muestre la matriz por pantalla (en forma de matriz).
*/
package RelArraBi;

import java.util.Scanner;
public class E59 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        int arra[][]=new int[5][5];
        int valores=1;
        
        for(int i=0;i<arra.length;i++){
            for(int k=0;k<arra.length;k++){
                arra[i][k]=valores;
                valores++;
            }           
        }
        for(int i=0;i<arra.length;i++){
            for(int k=0;k<arra.length;k++){
                System.out.print(arra[i][k]+" ");
            }
            System.out.println("");
        }
        teclado.close();
    }
}
