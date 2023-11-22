/*
58.- Realizar un programa que pida al usuario un numero N entre 3 y 5 y, a
continuación, cree una matriz NxN (N filas, N columnas) cuyos elementos se le van a ir
pidiendo al usuario.
*/
package RelArraBi;

import java.util.Scanner;


public class E58 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        int N;
        System.out.println("A continuación introduzca un número entre 3 y 5 incluídos.");
        do{System.out.print("Introduzca el número: ");
        N=teclado.nextInt();
        if((N<3)||(N>5)){
            System.out.println("Número erróneo, entre 3 y 5 incluidos.");
        }
        }while((N<3)||(N>5));       
            System.out.println("Crearemos una matriz cuya dimensión será de "+N+" por "+N);
            System.out.println("Se le solicitarán datos para rellenarla.");
        int arra[][]=new int[N][N];
        for(int i=0;i<arra.length;i++){
            for(int k=0;k<arra[i].length;k++){
                System.out.println("Introduzca el valor Fila "+i+" Columna "+k+": ");
                arra[i][k]=teclado.nextInt();
            }
        }
        System.out.println("Esta es su matriz dibujada: ");
        for(int i=0;i<arra.length;i++){
            for(int k=0;k<arra[i].length;k++){
                System.out.print(arra[i][k]+" ");
            }
            System.out.println("");
        }
        teclado.close();
    }

}
