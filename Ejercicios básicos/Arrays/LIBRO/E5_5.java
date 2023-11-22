/*5.5 Desarrollar el juevo "la cámara secreta", que consiste abrir una cámara mediante su combinación secreta, que está formado por una combinación
de dígitos del uno al cinco. El jugador especificará cuál es la longitud de la combinación, a mayor longitud mayor será la dificultad del juego. La
aplicación genera, de forma aleatoria, una combinación secreta que el usuario tendrá que acertar. En cada intento se muestra como pista, para cada 
dígito de la combinación introducido por el jugador, si es mayor, menor o igual que el correspondiente en la combinación secreta.*/
package LIBRO;

import java.util.Scanner;

public class E5_5 {

    public static void main(String[] args) {
        int tirada=0;
        boolean fallo=false;
        int intentos = 2;
        int aciertos = 0;
        int largo, num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido a la cámara secreta.\nTendrá tres intentos para acertar una combinación de números del 1 al 5.");
        do {
            System.out.print("¿De qué tamaño quiere que sea la combinación? Mayor longitud, mayor dificultad: ");//Este número será el tamaño del array.
            largo = (int)teclado.nextDouble();
            if (largo <= 0) {
                System.out.println("Mínimo una combinación de un número.");
            }
        } while (largo <= 0);//Nos aseguramos del que el usuario solo intruduzca un número positivo.
        int password[];
        password = new int[(int)largo];
        System.out.println("Generando la combinación secreta...");//Le damos algo de emoción.
        for (int i = 0; i < largo; i++) {//A cada cajón del array le damos un valor aleatorio entre 1 y 5.
            password[i] = (int) ((Math.random() * (5 - 1 + 1)) + 1);
        }
        System.out.println("...Combinación generada. Tendrá tres intentos para acertar, si consume un intento y no acierta le daremos alguna pista.");
        while ((intentos > 0) && (aciertos != largo)) {//Estamos en este while mientras los intentos no lleguen a cero ni los aciertos igualen a la longitud del array.
            for (int i = 0; i < largo; i++) {//Le damos vuelta al array comprobando posicion por posicion si el número introducido es igual al dígito que sea.
                if ((fallo==true)&&(tirada==largo)){
                    intentos--;
                    System.out.println("Te quedan "+(intentos+1)+" intentos.");
                    fallo=false;
                    tirada=0;
                }
                System.out.println("Introduzca el dígito " + (i + 1));
                num = teclado.nextInt();
                if (num > password[i]) {
                    System.out.println("Te pasaste. Suerte.");//Si se pasa se lo decimos y seguimos con el código.
                    aciertos = 0;
                    fallo=true;
                    tirada++;
                    
                } else if (num < password[i]) {
                    System.out.println("Te quedaste corto.");//Si se queda corto se lo decimos y seguimos con el código.
                    aciertos = 0;
                    fallo=true;
                    tirada++;
                   
                } else {
                    System.out.println("Digito acertado.");//Si acierta le sumamos 1 al contador de aciertos.
                    aciertos++;  
                    tirada++;
                }
                             
                if((intentos==0)&&(aciertos==largo)){
                    intentos=1;//En el caso de acertar en el último intento
                }
            }
            if (aciertos != largo) {//Si después del primer intento no los has acertado todos, el contador de aciertos vuelve a cero.
                aciertos = 0;
            }
            else if (aciertos == largo) {//Ponemos esta condición para el caso de si acierta en el último intento.
                System.out.println("Código correcto.");
                intentos = 1;
            }
        }
        if (aciertos == largo) {
            System.out.println("Enhorabuena, conseguiste abrir la cámara secreta.");
        } else if (intentos == 0) {
            System.out.println("Has fracasado, más suerte la próxima vez.");
        }
        teclado.close();
    }
}
