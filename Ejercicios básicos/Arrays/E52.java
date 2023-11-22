/*52.- Haz un programa que dados dos arrays (tamaño y tipo los que tu quieras) diga sin
esos arrays son iguales o no. Dos arrays son iguales si sus elementos son iguales y están
en la misma posición*/
import java.util.Scanner;

public class E52 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean iguales=true;
        int arra1[];
        arra1 = new int[5];
        int arra2[];
        arra2 = new int[5];
        System.out.println("A continuación rellene dos arrays de 5 posiciones cada uno y le diremos si es igual o no.");
        System.out.println("Primer array.");
        for (int i = 0; i < (arra1.length); i++) {
            System.out.print("Introduzca la posición " + i + ":");
            arra1[i] = teclado.nextInt();
        }
        System.out.println("Segundo array.");
        for (int i = 0; i < (arra2.length); i++) {
            System.out.print("Introduzca la posición " + i + ":");
            arra2[i] = teclado.nextInt();
        }
        teclado.close();
        for(int i=0;i<(arra2.length)&&(iguales);i++){
            if(arra1[i]!=arra2[i]){
                iguales=false;
                i=arra2.length;
            }  
            }
        if (iguales==false){
            System.out.println("No son iguales.");
        }else{
            System.out.println("Son iguales.");
        }  
    }
    }
