/*50.- Crea un array de 100 elementos dónde cada elemento sea un número aleatorio entre
1 y 100. Realiza los siguientes apartados:
a) Haz un programa que muestre los valores múltiplos de 5.
b) Otro que sólo muestre los números pares.
c) Otro que muestre el mayor de todos los elementos del array y su posición (si hay
varios iguales, muestra el primero)*/

public class E50 {

    public static void main(String[] args) {
        int pos=0;
        int i;
        int mayor=0;
        int arra[];
        arra = new int[100];
//Muestro el array original para ver que todo está bien. 
        System.out.print("El array original es: ||");
        for (i = 0; i < (arra.length); i++) {
            arra[i] = (int) ((Math.random() * (100 - 1 + 1)) + 1);
            System.out.print(arra[i]+"||");
        }
//Apartado a)
System.out.println("");
System.out.print("Los múltiplos de 5 son: ||");
        for(i=0; i<(arra.length);i++){
            if(arra[i]%5==0){
                System.out.print(arra[i]+"||");
            }
//Apartado b)            
        }
        System.out.println("");
        System.out.print("Los números pares son: ||");
        for(i=0;i<(arra.length);i++){
            if(arra[i]%2==0){
                System.out.print(arra[i]+"||");
            }
        }
//Apartado c)
        for(i=0;i<(arra.length);i++){
            
            if (arra[i]>mayor){
                
                mayor=arra[i];
                
                pos=i;
                
            }
        }
        System.out.println("");
        System.out.print("El mayor valor es: "+mayor+" y se encuentra en la posición: "+pos);
    }

}
