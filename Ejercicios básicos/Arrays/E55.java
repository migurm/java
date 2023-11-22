/*55.- Usando arrays: escribe un programa que pida 10 números naturales y a
continuación, indique cuál es el valor máximo de esa sucesión de números, el número
de veces que aparece y sus respectivas posiciones. Ejemplo:
7 10 143 10 52 143 72 10 143 7
El valor máximo es el 143
Aparece 3 veces en las posiciones 2,5,8*/

import java.util.Scanner;

public class E55 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        int mayor = 0;
        int valores[];
        valores = new int[10];
        System.out.println("Introduzca diez valores por pantalla: ");
        for (int i = 0; i < (valores.length); i++) {
            do{System.out.print("Introduzca el valor " + i + ": ");
            valores[i] = teclado.nextInt();
            }while(valores[i]<1);
            if (valores[i] > mayor) {
                mayor = valores[i];
            } 
        }
        System.out.print("Array original: |");
        for (int i = 0; i < (valores.length); i++) {
            System.out.print(valores[i]+"|");
            if (valores[i] == mayor) {
                contador++;
            }
        }
        System.out.println("");
        System.out.println("El valor máximo es el " + mayor);
        System.out.print("Aparece " + contador +(contador==1?" vez en la posición ":" veces las posiciones "));
        for (int i = 0; i < (valores.length); i++) {
            if ((valores[i] == mayor)&&(contador>=2)) {
                System.out.print(i + ",");
                contador--;
            }
            else if (valores[i]==mayor){
                System.out.println(i);
            }

        }

    }
}
