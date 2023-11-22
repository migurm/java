/*128.- La empresa MEDAC te ha elegido para crear un programa que se encargue de
registrar los sueldos de los hombres y las mujeres que trabajan allí, con el fin de detectar
si existe brecha salarial entre ambos.
Para ello, el programa pedirá primero el número total de trabajadores de la empresa por
teclado  y, posteriormente, solicitará información de cada persona de la siguiente
forma:
• pedirá su género (0 para varón y 1 para mujer)
• pedirá su sueldo anual en euros.
Esta información debe guardarse en un diccionario. Finalmente, el programa mostrará
por pantalla el sueldo medio de cada género.*/
package E128;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;


public class E128 {

    public static void main(String[] args) {
        int cantidadSalarios=0, sexo=0;
        double acumuladoH=0, acumuladoM=0, salario=0, hombres=0, mujeres=0;
        boolean todoBien=false;
        Scanner input = new Scanner (System.in);
        System.out.println("Cuantos salarios vamos a almacenar?:");
        try{
            cantidadSalarios=input.nextInt();
            if(cantidadSalarios<1)throw new InputMismatchException();
            todoBien=true;
            
        }catch(InputMismatchException e){
            System.out.println("Tiene que ser al menos 1 empleado, indique numero entero minimo 1.");
            input.nextLine();
        }
        
        if(todoBien){
            Map <Integer,Double> mapaSalarios = new HashMap<>();
            int contador=0;
            while(contador < cantidadSalarios){
                
                try{
                    System.out.print("Introduzca el sexo (1 Mujer, 0 Hombre)"+(contador+1)+":");
                    sexo=input.nextInt();
                    if ((sexo<0)||(sexo>1))throw new InputMismatchException("Valor de sexo erroneo.");
                    System.out.print("Ahora el salario para el "+(contador+1)+": ");
                    salario=input.nextDouble();
                    if (salario<0)throw new InputMismatchException("Un salario mayor de 0");
                    if(sexo==1){
                        mujeres++;
                        acumuladoM+=salario;
                        /*rellenaMapa(mapaSalarios, sexo, acumuladoM);*/
                        mapaSalarios.put(sexo, acumuladoM);
                    }else{
                        hombres++;
                        acumuladoH+=salario;
                        /*rellenaMapa(mapaSalarios, sexo, acumuladoH);*/
                        mapaSalarios.put(sexo, acumuladoH);
                    }
                    contador++;

                }catch(InputMismatchException e){
                    System.out.println("Error: "+e.getMessage());
                    input.nextLine(); 
                }
            }
            System.out.println("Sueldo medio mujeres: "+mapaSalarios.get(1)/mujeres);
            System.out.println("Sueldo medio hombres: "+mapaSalarios.get(0)/hombres);
            
 
        }
        
    }
    
    /*public static void rellenaMapa ( Map mapa, int key, double value){
        mapa.put(key, value);
    }*/

}
