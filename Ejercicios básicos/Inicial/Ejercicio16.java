/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.relacionesjdk11;

/**
 *
 * @author migue
 */
import java.util.Scanner;
public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        System.out.println("A continuación introduzca por pantalla sus notas del curso.");
        //Pedimos al usuario que introduzca los tres valores del ejercicio.
        System.out.print("Introduzca la nota del 1er Trimestre: ");
        double t1=teclado.nextDouble();
        System.out.print("Introduzca la nota del 2o Trimestre: ");
        double t2=teclado.nextDouble();
        System.out.print("Introduzca la nota del 3er Trimestre: ");
        double t3=teclado.nextDouble();
        double nfinal=((t1+t2+t3)/3);
        //En caso de que la media sea menor de 6.5 hay que mostrar no promociona.
        if(nfinal<6.5){
            System.out.println("No promociona.");
        //En caso de que sea mayor de 6.5, que muestre la nota.
        }
        else{
            System.out.println("Promocionando con una media de "+nfinal+".");
        }
        
     
                
        
    }
}
