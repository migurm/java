/*56.- Crea dos arrays de enteros tamaño 5. A continuación:
• Rellena el primero con números aleatorios entre el 2 y el 50. 
• Rellena el segundo con valores que introduzca el usuario por teclado.
• Crea un tercer array cuyos valores en cada celda van a ser la suma de las celdas
correspondientes de los otros dos arrays. Es decir, para la celda 1: la suma de las
celdas 1 del 1er y del 2º array. Para la celda 2: la suma de las celdas 2 del 1er y del 2º
array y así sucesivamente.
• Muestra el tercer array por pantalla.
• Muestra la suma de todos los elementos del tercer array.*/
import java.util.Scanner;
public class E56 {

    
    public static void main(String[] args) {
        int suma=0;
        int arra1[],arra2[],arra3[];
        arra1=new int[5];
        arra2=new int [5];
        arra3=new int[5];
        System.out.print("Primer array (aleatorio): ||");
        for(int i=0;i<(arra1.length);i++){
            arra1[i]=(int)((Math.random()*(50-2+1))+2);
            System.out.print(arra1[i]+"||");
        }
        Scanner teclado = new Scanner(System.in);
        System.out.println("");
        System.out.println("Introduzca los valores del segundo array. ");
        for(int i=0;i<(arra2.length);i++){
            System.out.print("Valor "+i+":");
            arra2[i]=teclado.nextInt();  
        }
        System.out.print("El tercer array: ||");
        for(int i=0;i<(arra3.length);i++){
            arra3[i]=(arra1[i]+arra2[i]);
            suma=suma+arra3[i];
            System.out.print(arra3[i]+"||");
        }
        System.out.println("");
        System.out.println("La suma de los valores del tercer array es: "+suma);
    }

}
