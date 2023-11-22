/*53.- Haz un programa que dado el array valores que posee los números
2,4,6,8,1,3,5,7 genere otro array con los mismos valores pero con el valor 200 en
la posición 4 y el valor 300 en la posición 7 (y el resto de valores afectados desplazados
una posición).
Valores: 2 4 6 8 1 3 5 7 
Otra: 2 4 6 200 8 1 300 3 5 7 */
public class E53 {

    public static void main(String[] args) {
        int valores[] = {2, 4, 6, 8, 1, 3, 5, 7};
        int k=0;
        int otra[];
        otra = new int[valores.length+2];
        System.out.println("El segundo array modificado: ");
        System.out.print("||");
        for (int i = 0; i < (otra.length); i++) {
            if(i==3){
                otra[i]=200;
            }
            else if(i==6){
                otra[i]=300;
            }
            else{
            otra[i]=valores[k];
            k++;
            }
            System.out.print(otra[i]+"||");

        }
    }

}
