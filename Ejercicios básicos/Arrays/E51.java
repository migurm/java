/*51.- Crea un array de tamaño10 que sirva para almacenar colores y pide al usuario que
rellene cada posición del array con un color. A continuación indica cuantas veces
aparece el color “rojo” y el color “azul” usando la siguiente salida:
El color 'rojo' aparece X veces en el array.
El color 'azul' aparece Y veces en el array.
Siendo X el número de veces que aparece el rojo en el array e Y el número de veces que aparece el
azul en el array).*/
//.equalsIgnoreCase =me la pela que sea mayúscula o minúscula.
import java.util.Scanner;

public class E51 {

    
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        int contazul=0;
        int contarojo=0;
        String colores[];
        colores=new String[10];
        System.out.println("A continuación introduzca 10 colores");
        for(int i=0;i<(colores.length);i++){
            System.out.println("Introduzca el color "+i);
            colores[i]=teclado.nextLine();
            if(colores[i].equals("azul")){
                contazul++;  
            }
            if(colores[i].equals("rojo")){
                contarojo++;
            }
        }
        teclado.close();
        System.out.println("El color rojo aparece "+contarojo+" veces en el array.");
        System.out.println("El color azul aparece "+contazul+" veces en el array.");
    }

}
