

package com.mycompany.relacionbucles;
import java.util.Scanner;
public class E40 {

    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int m, n,aux, i;
        int facm=1;
        int facn=1;
        int facmn=1;
        do{System.out.println("A continuación introduzca dos números positivos, el primero mayor o igual que el segundo, por favor.");
        System.out.println("Introduzca el primer valor: ");
        m=teclado.nextInt();
        System.out.println("Ahora el segundo: ");
        n=teclado.nextInt();
        if((n<0)||(m<0)){//Si ha metido algún número negativo al menos que sepa que es retrasado y vuelva a intentarlo.
            System.out.println("Ay señor, dame paciencia...");
        }
        }while((n<0)||(m<0));
        if(n>m){
            System.out.println("Dijismo que el primer valor tenía que ser mayor o igual que el segundo... en fin...los ordenaré yo.");
            //En caso de que el segundo valor sea mayor que el primero, los ordenamos.
            aux=n;
            n=m;
            m=aux;
        }
        //Vamos a crear un for para calcular el factorial de la variable m.
        for(i=m;i>=1;i--){
            facm=facm*i;
        }
        //Ya tenemos el primero, ahora el segundo.
        for(i=n;i>=1;i--){
            facn=facn*i;
        }
        //Y ahora de postre el factorial de la operación (m-n).
        for(i=(m-n);i>=1;i--){
            facmn=facmn*i;
        }
        //Con los tres factoriales calculados, hacemos la operación matemática ((m!/n!*(m-n)!) para calcular el combinatorio de m y n.
        //m! / n!*(m-n)!

        aux=(facm/(facn*facmn));
        System.out.println("El combinatorio de "+m+" y "+n+" da: "+aux);
        

    }

}
