/*
48.- Sea el array flags con los valores: 0,1,0,-1,0,-1,-1,-1,0,0,-1. Crea un
nuevo array llamado tivic que sea copia del anterior.
A continuación recorre el primer array (flags) y cambia todos los valores negativos por
el valor 8.
*/
public class E48 {

    public static void main(String[] args) {
        int i;
        int flags[]={0,1,0,-1,0,-1,-1,-1,0,0,-1};
        int tivic[];
        tivic=new int[flags.length];
        for(i=0;i<(flags.length);i++){
            tivic[i]=flags[i];
            System.out.print(tivic[i]+"||");
        }
        System.out.println("");
        for(i=0;i<(flags.length);i++){
            if(flags[i]<0){
                flags[i]=8;
            }
            System.out.print(flags[i]+"||");
        }
        
    
    }

}
