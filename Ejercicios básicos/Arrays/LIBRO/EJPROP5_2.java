/* Los diseñadores de una aplicación necesitan obtener ordenados los datos de una tabla, pero por restricciones de la aplicación,
la tabla debe permanecer inmutable. Una posible solución es hacer una copia de la tabla y ordenarla, manteniendo intacta la tabla original,
pero esta alternativa se ha desechado. En su lugar, se ha pensado en crear una segunda tabla donde se almacenan ordenados los indices de
la tabla original. Se pide diseñar un algoritmo en el que, dada una tabla, cree otra donde se ordenen mediante los indices de la tabla original.
Ejemplo:
tablaOriginal: [3, 5, 1, 4]
tablaConIndices: [2, 0, 3, 1]
Donde tablaConIndices especifica el lugar que ocupan de forma ordenada los datos de tablaOriginal. Por ejemplo, el primer elemento de tablaOriginal, 
que vale 3, en caso de ordenar los datos, ocupará la posición 2 (que le corresponde en tablaConIndice). En este caso, el i-ésimo elemento de la tablaOriginal 
ocupará la posición que contiene el i-ésimo elemento de tablaConIndices.
*/
package LIBRO;

public class EJPROP5_2 {

    public static void main(String[] args) {
        int i=0, k=0, aux;
        int arra1[]={3,5,1,4};
        int arra2[];
        arra2=new int[arra1.length];
        int arraor[];
        arraor=new int[arra1.length];
        for(i=0;i<(arra1.length);i++){
            for(k=i+1;k<(arra1.length);k++){
                }
            }
            System.out.println(arraor[i]);
        }
    
    }


