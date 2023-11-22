/*Array de 5 posiciones, los datos {4,8,15,50,2}
Crea un segundo array moviendo los datos 1 a la derecha, el último vaya a la posicion 0.
{2,4,8,15,50}
 */

public class ejerPablo {

    public static void main(String[] args) {
        int numeros[] = {4, 8, 15, 50, 2};
        int res[];
        int k = 0;
        res = new int[5];
        System.out.print("Nuevo array pedido: |");
        for (int i = 1; i < (res.length); i++) {
            if (k == 0) {
                res[k] = numeros[numeros.length - 1];
                k++;
            } else {
                res[k] = numeros[i];
            }
            System.out.print(res[k] + "|");
        }
    }
}
