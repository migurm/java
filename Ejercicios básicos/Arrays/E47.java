/*47.- Sea el array relleno con las notas: 6,3,9,7,5,8,10,2,4 y 5
Crea un programa que, a partir de ese array, muestre por pantalla la media aritmética de
las notas.
*/
public class E47 {
//He calculado la media aritmética en vez de la ponderada porque no se cómo se hace la ponderada exactamente.
    
    public static void main(String[] args) {
        int i;
        double suma=0; 
        double num[]={6,3,9,7,5,8,10,2,4,5};
        for(i=0;i<(num.length);i++){
            suma=suma+num[i];
        }
        int media=(int)(Math.round(suma/num.length));
        System.out.print("La media de las notas es: "+media);   
    }
}
