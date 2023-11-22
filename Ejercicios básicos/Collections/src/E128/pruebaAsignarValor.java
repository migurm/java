
package E128;

import java.util.Scanner;


public class pruebaAsignarValor {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        boolean salarioValido=false;
        Double salarioDecimal=0.0;
        do{
            System.out.println("Introduzca un salario: ");
            String salario = input.nextLine();
            try{
                salarioDecimal=Double.valueOf(salario);
                if(salarioDecimal<=0)throw new NumberFormatException () ;
                System.out.println("Su salario es: "+salarioDecimal);
                salarioValido=true;
                
            }catch(NumberFormatException e){
                System.out.println("No es un salario valido.");
                
            }
            
        }while(!salarioValido);

    }

}
