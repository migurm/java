
package E97;

import java.util.Scanner;


public class pruebaMain {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Introduzca una cantidad de tiempo en segundos:");
        int segundos= input.nextInt();
        int horas=segundos/3600;
        segundos-=horas*3600;
        int minutos= segundos/60;
        segundos-=minutos*60;
        System.out.println("Horas: "+horas+" Minutos: "+minutos+" Segundos: "+segundos);
    }

}
