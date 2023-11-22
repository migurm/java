/*57.- Uno de los métodos más famosos para ordenar un array numérico es el algoritmo
de ordenación por selección. Este algoritmo consiste en:
• Se busca el elemento más pequeño del array se coloca en la primera posición.
• Se hace lo mismo que en el punto anterior pero ahora se toma todo el array
menos la primera posición (porque ya está ordenada).
• Se repite el primer punto pero ahora solo se toma todo el array menos las dos
primeras posiciones (porque ya están ordenadas).
• Se repite el primer punto hasta que ordeno todos los elementos del array.
Crea un programa en el que se defina un array de 10 números enteros aleatorios (entre 1
y 100) y ordene ese array usando la ordenación por selección.
 */

public class E57 {

    public static void main(String[] args) {

        int arra[];
        arra = new int[10];
        System.out.print("El array original: |");
        for (int i = 0; i < (arra.length); i++) {
            arra[i] = (int) ((Math.random() * (100 - 1 + 1)) + 1);
            System.out.print(arra[i] + "|");
        }
        for (int i = 0; i < (arra.length); i++) {
            for (int j = i + 1; j < (arra.length); j++) {
                if (arra[j] > arra[i]) {
                    int aux = arra[i];
                    arra[i] = arra[j];
                    arra[j] = aux;
                }
            }
        }
        System.out.print("\n  Array ordenado:  |");
        for (int i = 0; i < (arra.length); i++) {
            System.out.print(arra[i] + "|");
        }
    }

}
