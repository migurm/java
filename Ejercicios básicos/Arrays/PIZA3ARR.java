//Crea un array de 100 cajones con valores aleatorios.
//Pide 2 números, num y max.(números mayores a 2 y siendo max>num. Si no, vuelve a pedirlos).
//Crea un array y rellénalos con los valores entre num y max.
//Ejem. num=2; max=8; [2,3,4,5,6,7,8]
//Muéstralos por pantalla.

import java.util.Scanner;

public class PIZA3ARR {

    public static void main(String[] args) {
        int i,num,max;
        int lar2=0;
        int k=0;
        int arra1[];
        arra1 = new int[100];
        for (i = 0; i < (arra1.length); i++) {
            arra1[i] = (int) ((Math.random() * (100 - 1 + 1)) + 1);
            System.out.print(arra1[i] + "||");
        }
        Scanner teclado = new Scanner(System.in);
        do{System.out.println("A continuación introduzca dos valores mayores que 2 por pantalla.");
        System.out.println("El segundo valor mayor que el primero.");
        System.out.print("Introduzca el primer valor: ");
        num=teclado.nextInt();
        System.out.print("Ahora introduzca el segundo valor(mayor que el anterior): ");
        max=teclado.nextInt(); 
        if((num>=max)||(num<2)||(max<3)){
            System.out.println("Lea bien las indicaciones.");
        }
        }while((num>=max)||(num<2)||(max<3));
        teclado.close();
        for(i=num;i<max;i++){
            lar2=i;
        }
        System.out.println("Tamaño del segundo array: "+lar2);
        int arra2[];
        arra2=new int[lar2];
        for(i=num;i<=max;i++){
            arra2[k]=arra1[i];
            System.out.print(arra2[k]+"||");
            k++;
        }
         
    }

}
