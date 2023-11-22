/*49.-Crea un array de 100 elementos dónde cada elemento sea un
número aleatorio entre 1 y 100. A continuación muestra por pantalla el mayor y el
menor elemento de ese array. */

public class E49 {
    
    public static void main(String[] args) {
        int menor=0;
        int mayor=0;
        int i;
        int arra[];
        arra=new int [100];
        for(i=0;i<(arra.length);i++){
            arra[i]=(int)((Math.random()*(100-1+1))+1);
            if(arra[i]>mayor){
                mayor=arra[i];
            }
            if(arra[i]<menor){
                menor=arra[i];
            }
            System.out.print(arra[i]+"||");
        }
        System.out.println("");
        System.out.println("El mayor es: "+mayor);
        System.out.print("El menor es: "+menor);
    }

}
