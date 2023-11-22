

package com.mycompany.relacionesjdk11;
import java.util.Scanner;
public class R2E22 {

    
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        int mes=(int)((Math.random()*(12-1+1))+1);
        int dias=0;
        String nmes="";
        System.out.print("Introduzca un año a su elección: ");
        int year=teclado.nextInt();
        switch(mes){
            case 1:dias=31; nmes="Enero";
            break;
            case 2:dias=28; nmes="Febrero";
            break;
            case 3:dias=31; nmes="Marzo";
            break;
            case 4:dias=30; nmes="Abril";
            break;
            case 5:dias=31; nmes="Mayo";
            break;
            case 6:dias=30; nmes="Junio";
            break;
            case 7:dias=31; nmes="Julio";
            break;
            case 8:dias=31; nmes="Agosto";
            break;
            case 9:dias=30; nmes="Septiembre";
            break;
            case 10:dias=31; nmes="Octubre";
            break;
            case 11:dias=30; nmes="Noviembre";
            break;
            case 12:dias=31; nmes="Diciembre";
            break;        
        }
        if(mes==2){
            if((year%4==0)&&(year%100!=0)||(year%400==0)){
                dias=29;
            }
        }
        System.out.println("Su mes aleatorio es: "+nmes);
        System.out.println("Tiene "+dias+" dias");
    }
}
