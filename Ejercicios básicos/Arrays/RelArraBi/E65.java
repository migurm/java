/*
65.- Implementar el juego de Piedra-Papel-Tijeras para dos jugadores humanos usando
una matriz de comprobaciones: Cada fila corresponde a uno de los tres elementos de
juego. Igual para las columnas. Las celdas de esa matriz tendrá algunos de los
siguientes valores:
• 0 : si el elemento de la fila y el de la columna son el mismo (empate).
• 1: si el elemento de la fila gana al elemento de la columna.
• -1 : si el elemento de la fila pierde contra el elemento de la columna.
 */
package RelArraBi;

import java.util.Scanner;

public class E65 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contadorj1=0, contadorj2=0;
        //Creamos el array de 3x3 y rellenamos quién ganaría en cada caso, no veo patrón mas allá de la diagonal para rellenarlo.
       /* int arra[][] = new int[3][3];*/
        
        int arra[][]={{0,-1,1},{1,0,-1},{-1,1,0}};
        
        /*La forma de arriba es la mas limpia.
        
        arra[0][0] = 0;                     
        arra[0][1] = -1;
        arra[0][2] = 1;
        arra[1][0] = 1;
        arra[1][1] = 0;
        arra[1][2] = -1;
        arra[2][0] = -1;
        arra[2][1] = 1;
        arra[2][2] = 0;*/ 
        
     //Comprobamos q la matriz es correcta.
      
      for(int i=0;i<arra.length;i++){
          for(int k=0;k<arra[i].length;k++){
              System.out.print(arra[i][k]+" ");
          }
          System.out.println("");
      }      
        //Creamos dos variables string para el nombre de los jugadores:
        String nombre1, nombre2;
        System.out.println("Bienvenidos a piedra, papel o tijeras.");
        System.out.println("Es un juego para dos jugadores, introducid vuestros nombres a continuacion...");
        System.out.println("Nombre del primer jugador: ");
        nombre1 = teclado.next();
        System.out.println("Nombre del segundo jugador: ");
        nombre2 = teclado.next();
        //Creamos una variable para las jugadas de cada jugador.
        int jugada1, jugada2;
        //Abrimos un bucle de tres vueltas para el juego.
        System.out.println("Ahora jugaréis al mejor de tres, en caso de empate esa tirada no cuenta.");
        for (int i = 0; i < 3; i++) {
            System.out.println("0 para piedra, 1 para papel, 2 para tijeras...");
            do {
                System.out.println(nombre1 + "... ¿qúe elijes?: ");
                jugada1 = teclado.nextInt();
                if ((jugada1 < 0) || (jugada1 > 2)) {
                    System.out.println("Recuerda...0-PIEDRA, 1-PAPEL, 2-TIJERAS!!!");
                }
            } while ((jugada1 < 0) || (jugada1 > 2));
            do {
                System.out.println(nombre2 + "...¿qúe elijes?: ");
                jugada2 = teclado.nextInt();
                if ((jugada2 < 0) || (jugada2 > 2)) {
                    System.out.println("Recuerda...0-PIEDRA, 1-PAPEL, 2-TIJERAS!!!");
                }
            } while ((jugada2 < 0) || (jugada2 > 2));
            //En caso de los 3 resultados posibles que pase una u otra cosa.
            switch (arra[jugada1][jugada2]){
                case -1:
                    System.out.println("Ha ganado "+nombre2);
                    contadorj2++;
                    break;
                case 0:
                    System.out.println("Ha habiendo un empate.");
                    i--;
                    break;
                case 1:
                    System.out.println("Ha ganado "+nombre1);
                    contadorj1++;                    
                    break;
                    //Imprimimos el marcador en cada ronda.
            }
            System.out.println("El marcador es:");
            System.out.println(nombre1+ " lleva "+contadorj1+" victoria/s.");
            System.out.println(nombre2+" lleva "+contadorj2+" victoria/s");
            //Cuando acabe la partida, el que su marcador sea mayor, gana.
        }
        if(contadorj1>contadorj2){
            System.out.println("Ha ganado "+nombre1+". ");            
        }
        else{
          System.out.println("Ha ganado "+nombre2+". ");  
        }
        teclado.close();
    }
}
