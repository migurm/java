/*5.4 Implementar un programa que inicialice una tabla con nuestros números favoritos. A
continuación, pedir al usuario el índice de un elemento que será eliminado de la tabla.
Continuaremos eliminando elementos hasta que el índice introducido sea negativo o hasta que no
existan más elementos que borrar. Es imprescindible controlar que el índice leído corresponde.
a un dato válido.*/
package LIBRO;

import java.util.Scanner;
import java.util.Arrays;

public class E5_4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int arra[] = {7, 22, 23, 1, 46, -2, -27};
        int contador = arra.length;//Creamos un contador del tamaño de la longitud del array.
        int borrador=contador;//Lo igualamos a contador por igualarlo a algo.
        System.out.println(Arrays.toString(arra));

        while ((contador != 0) && (borrador >= 0)) {//Miestras el contador no sea 0 o un número negativo seguimos en el bucle.
            do {
                System.out.println("Indique el cajón a borrar: ");
                borrador = teclado.nextInt();//El norrador nos dice que cajón del array vamos a eliminar.
                if ((borrador >= contador)) {//En caso de que sea un número mayor a la longitud del array no es un dato valido.
                    System.out.println("Introduzca un dato válido.");
                }
            } while ((borrador >= contador));//La condición del dato valido para salir del do...while.
            if(borrador>=0){//Si el dato introducido es correcto, la posición elegida a ser borrada será sustituida por la última válida
                //Siempre teniendo en cuenta que cada tirada "recorta" el array 1 posición.
                arra[borrador]=arra[contador-1];
                contador--;
            }
        }
        System.out.print("|");
        for(int i=0;i<contador;i++){//Mostramos el array con las posiciones corregidas y de la longitud que quedase en el contador. Si se pidieron dos 
            //números a eliminar, el "array" deja de tener 5 cajones y pasaría a tener 3. (solo visualmente...claro)
            System.out.print(arra[i]+"|");
        }
    }
}
