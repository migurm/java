

public class PIZA2710ARR {

    
    public static void main(String[] args) {
        int i,k;
        int temp[];
        temp=new int[7];
        System.out.print("Las temperaturas son: ||");
        for(i=0;i<(temp.length);i++){
            temp[i]=(int)((Math.random()*(27-13+1))+13);
            System.out.print(temp[i]+"||");
        }
        System.out.println("");
        System.out.print("Diagrama de barras de las temperaturas: ");
        for(i=0;i<(temp.length);i++){
            System.out.println("");
            for(k=0;k<temp[i];k++){
                System.out.print("x");
            } 
        }
    }
}
