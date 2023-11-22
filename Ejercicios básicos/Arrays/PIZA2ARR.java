//Crea un array de 100 cajones con valores aleatorios del 1 al 100.
//Pide un numero entero por teclado entre 1 y 100
//Crea otro array con los núm ultimos valores del array.
import java.util.Scanner;
public class PIZA2ARR {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int k=0;
        int num;
        int i=0;
        int[] val = new int[100];
        for (i = 0; i < (val.length); i++) {
            val[i] = (int) ((Math.random() * (100 - 1 + 1)) + 1);
            System.out.print(val[i]+"||");
        }
        System.out.println("");
        do{System.out.print("Introduzca un número por pantalla entre 1 y 100: ");
            num=teclado.nextInt();
            System.out.println("El array con las "+num+" últimas cifras es: ");
        }while((num<1)||(num>100));
        int [] seg = new int [num];
        for(k=0;k<(seg.length);k++){
            for(i=(val.length-num);i<(val.length);i++){
                seg[k]=val[i];
            }

            System.out.println(seg[i]+"||");
        }
        
        
        
    
    }

}
