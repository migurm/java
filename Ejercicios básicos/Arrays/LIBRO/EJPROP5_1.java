/*5.1. El ayuntamiento de nuestra localidad nos ha encargado una aplicación que ayude a realizar encuestas estadísticas
para conocer el nivel adquisitivo de los habitantes del municipio. Para ello, tendremos que preguntar el sueldo a cada persona
encuestada. A priori no conocemos el número de encuestados. Para finalizar la entrada de datos, introduciremos un sueldo con valor -1.
Una vez terminada la entrada de datos, hemos de mostrar la siguiente información:
a)Todos los sueldos introducidos ordenados de forma decreciente.
b)El sueldo máximo y mínimo.
c)La media de los sueldos.
Nota. Como a priori se desconoce el número de sueldos, la tabla donde se almacenan los datos tendrá que incrementar su tamaño conforme
necesitemos más espacio.
 */
package LIBRO;

import java.util.Scanner;

public class EJPROP5_1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 0, suma = 0, aux = 0, mayor = 0, k, i, menor = 9999;
        int arra1[];
        //Creamos un array monstruosamente largo para introducir los datos... ya que no podemos usar arrays dinámicos.
        arra1 = new int[50000];
        System.out.println("Bienvenidos a la encuesta. Introduzca la información recogida, cuando no tenga más datos introduzca -1. ");
        for (i = 0; i < (arra1.length); i++) {
            //Impedimos que el usuario introduzca un valor negativo, que no sea -1 claro...)
            do {
                System.out.print("Introduzca el sueldo " + (i + 1) + " (o finalice con -1): ");
                arra1[i] = teclado.nextInt();
                if (arra1[i] < -1) {
                    System.out.println("Valores positivos ó -1 si no tiene más datos.");
                }
            } while (arra1[i] < -1);
            //Si el dato es correcto, seguimos con el programa.
            if (arra1[i] == -1) {
                System.out.println("Datos almacenados, gracias.");
                i = arra1.length;
                //Creamos un contador para saber la longitud del segundo array.
            } else {
                contador++;
            }
        }
        System.out.println("Ha introducido usted " + contador + " sueldos.");
        System.out.print("|");
        //Creamos el segundo array, con la longitud del contador anterior.
        int arra2[];
        arra2 = new int[contador];
        for (i = 0, k = 0; i < (arra2.length); i++) {
            //Le damos al segundo array los datos introducidos en el primero.
            arra2[i] = arra1[i];
            System.out.print(arra2[i] + "|");
        }
        //Ordenamos los números de mayor a menor.
        for (i = 0; i < (arra2.length); i++) {
            for (k = i + 1; k < (arra2.length); k++) {
                if (arra2[k] > arra2[i]) {
                    aux = arra2[i];
                    arra2[i] = arra2[k];
                    arra2[k] = aux;
                }
            }
        }
            System.out.print("\nLos sueldos ordenados de mayor a menor:\n|");
            //Aprovechamos este array también para encontrar el mayor, el menor, y hacer un sumatorio total para la media.
            //Y con este array ya enseñamos el array, que ya está ordenado, y el resto de cosas que pide y cerramos teclado.
            for (i = 0; i < (arra2.length); i++) {
                if (mayor < arra2[i]) {
                    mayor = arra2[i];
                }
                if (menor > arra2[i]) {
                    menor = arra2[i];
                }
                suma = suma + arra2[i];
                System.out.print(arra2[i] + "|");
            }
            System.out.println("\nEl mayor sueldo es: " + mayor + " €.");
            System.out.println("El menor sueldo es: " + menor + " €.");
            System.out.println("El salario medio de los encuestados es: " + (suma / contador) + " €.");
            teclado.close();
        
    }
}
