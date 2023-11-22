/*
61.- Crea un programa que cree una matriz de tamaño NxM (tamaños introducido por
teclado) e introduzca en ella los valores también a través del teclado teclado. A
continuación deberá mostrar por pantalla cuántos valores son mayores que cero, cuántos
son menores que cero y cuántos son igual a cero (es decir, se muestran 3 números).
 */
package RelArraBi;

import java.util.Scanner;

public class E61 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mayorcero = 0, menorcero = 0, cero = 0, N, M;
        do {
            System.out.print("Introduzca por pantalla de cuántas filas quiere su matriz: ");
            N = teclado.nextInt();
            if (N <= 0) {
                System.out.println("Números positivos, por favor.");
            }
        } while (N <= 0);
        do {
            System.out.print("Introduzca por pantalla de cuántas columnas quiere su matriz: ");
            M = teclado.nextInt();
            if (M <= 0) {
                System.out.println("Números positivos, por favor.");
            }
        } while (M <= 0);
        int arra[][]=new int [N][M];
        System.out.println("A continuación se le pedirán los valores para la matriz.");
        for (int i=0;i<arra.length;i++){
            for (int k=0;k<arra.length;k++){
                System.out.println("Valor fila "+i+" columna "+k+": ");
                arra[i][k]=teclado.nextInt();
                if(arra[i][k]==0){
                    cero++;
                }
                else if(arra[i][k]>0){
                    mayorcero++;
                }
                else{
                    menorcero++;
                }
            }
        }
        teclado.close();
        System.out.println("Son mayores de cero: "+mayorcero+" números.");
        System.out.println("Son menores de cero: "+menorcero+" números.");
        System.out.println("Son iguales a cero: "+cero+" números.");

    }

}
