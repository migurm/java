/*
b) Programa un archivo main que se encargue de crear una piscina con un valor
aleatorio entre 1 y 100. A continuación, en un bucle FOR de 5 vueltas, llena la piscina
con un numero aleatorio entre 1 y 25 mostrando el nivel de la piscina en cada vuelta.
Seguidamente, haz lo mismo pero vaciando la piscina (mismas vueltas y números
aleatorios)
*/
package RepasoExcepciones;


public class E110 {

    public static void main(String[] args) {
        int retirado, agregado;
        Piscina pool1=new Piscina((int)calcularAleatorio(100,1));
        System.out.println("----------------------------------------------------------------");
        System.out.println(" Se ha creado una piscina con una capacidad máxima de "+pool1.MAXNIVEL+" litros. ");
        System.out.println("----------------------------------------------------------------");
        System.out.println(" Empezamos a agregar cantidades de agua a la piscina.");
        System.out.println("------------------------------------------------------");
        
        for(int i=0 ; i<5 ; i++){
            agregado=(int)calcularAleatorio(25,1);
            System.out.println("Vamos a intentar echar "+agregado+" litros");
            try{
                pool1.ponerAgua(agregado);
                System.out.println("Conseguido!");
            }catch(NivelAguaException e){
                System.out.println("No se ha podido echar esa cantidad.");
            }
            System.out.println("Nivel de la piscina: "+pool1.getNivel()+" litros.");
            System.out.println("---------------------------------");
            
        }
        System.out.println("------------------------------------------------------");
        System.out.println(" Ahora retiramos cantidades de agua a la piscina.");
        System.out.println("------------------------------------------------------");
        System.out.println("-------------------------------------");
        for(int i=0 ; i<5 ; i++){
            retirado=(int)calcularAleatorio(25,1);
            System.out.println("Vamos a intentar retirar "+retirado+" litros");
            try{
                pool1.quitarAgua(retirado);
                System.out.println("Conseguido!");
            }catch(NivelAguaException e){
                System.out.println("No se ha podido retirar esa cantidad.");
            }
            System.out.println("Nivel de la piscina: "+pool1.getNivel()+" litros.");
            System.out.println("-------------------------------------");
            
        }
       
    }
    public static double calcularAleatorio(double max, double min){
        return ((Math.random()*(max-min+1))+1);
    }

}
