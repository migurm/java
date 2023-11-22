/*54.- Haz un programa que dado un array valores que posea una serie de números pej
2,4,6,8,1,3,5,7, y un numero que se pida por teclado, indique si ese número está
en el array o no lo está.*/
import java.util.Scanner;
public class E54 {

    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int valores[]={2,4,6,8,1,3,5,7};
        boolean esta=false;
        System.out.print("Introduzca un número por pantalla y le diremos si está en el array: ");
        int valor=teclado.nextInt();
        teclado.close();
        for(int i=0; i<(valores.length);i++){
            if(valores[i]==valor){
                esta=true;
            }
        }
        if(esta==true){
            System.out.println("El número está en el array.");
        }else{
            System.out.println("El número no está en el array.");
        }
    
    }

}
