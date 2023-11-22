
package E97;


public class testColeccion {

    public static void main(String[] args) {
        /*
        Conjunto conjuntoPrueba = new Conjunto();
        
        conjuntoPrueba.aniadir(9);
        
        System.out.println(conjuntoPrueba);
        */
        
        
        
        int arra [] = {0, 2, 4, 5, 6, 1, 7, 9, 5, 0};
        
        System.out.print("[");
        for (int i = 0 ; i < arra.length ; i++){
            if(i!=arra.length-1){
            System.out.print(arra[i]+",");
            }else{
                System.out.print(arra[i]);
            }
        }
        System.out.println("]");
    }

}
