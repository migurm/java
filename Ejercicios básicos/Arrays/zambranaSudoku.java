/*
Queremos comprobar que un sudoku sea válido.
Un sudoku es una matriz de 9x9 valores, en cada subdivision de 9 casillas solo puede haber un número del 1 al 9 sin repetirse.
En cada columna solo pueden aparecer numeros del 1 al 9 sin repetirse.
En cada fila solo pueden aparecer numeros del 1 al 9 sin repetirse.


Ejemplo de sudoku correcto:
int matriz[][]={{5,3,4,6,7,8,9,1,2},
                {6,7,2,1,9,5,3,4,8},
                {1,9,8,3,4,2,5,6,7},
                {8,5,9,7,6,1,4,2,3},
                {4,2,6,8,5,3,7,9,1},
                {7,1,3,9,2,4,8,5,6},
                {9,6,1,5,3,7,2,8,4},
                {2,8,7,4,1,9,6,3,5},
                {3,4,5,2,8,6,1,7,9}};
 */
public class zambranaSudoku {
    public static void main(String[] args) {
        //La suma de los dígitos del y al 9 es 45. Si ninguno.a[i][k]
        boolean correcto = true;
        int aux;
        int arra[][] = {{5, 3, 4, 6, 7, 8, 9, 1, 2},
                        {6, 7, 2, 1, 9, 5, 3, 4, 8},
                        {1, 9, 8, 3, 4, 2, 5, 6, 7},
                        {8, 5, 9, 7, 6, 1, 4, 2, 3},
                        {4, 2, 6, 8, 5, 3, 7, 9, 1},
                        {7, 1, 3, 9, 2, 4, 8, 5, 6},
                        {9, 6, 1, 5, 3, 7, 2, 8, 4},
                        {2, 8, 7, 4, 1, 9, 6, 3, 5},
                        {3, 4, 5, 2, 8, 6, 1, 7, 9}};            
        for (int fila=0;fila<9;fila++){
            for (int columna=0;columna<arra[fila].length;columna++){
//Todo lo que haga lo hago a partir de aquí, el doble for de antes Se Queda.
                for( int i=0; i<arra[fila].length; i++){                  
                }  
            }
        }
    }
}
