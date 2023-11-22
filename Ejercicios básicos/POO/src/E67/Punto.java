/*
67.- Crear la clase Punto, la cual tendrá dos atributos: X e Y. También son necesarios
los siguientes métodos:
? moverHorizontal: recibe un numero entero con signo y desplaza
horizontalmente el punto con ese valor.
? moverVertical: igual que el anterior pero verticalmente.
? mostrar: muestra el punto de la siguiente forma: Punto (X,Y)
*/

package E67;


public class Punto {
    int x;
    int y;
    
    
    public Punto(){
        this.x=0;
        this.y=0;
}
    
    public void moverHorizontal(int hor){
        this.x+=hor;
    }
    public void moverVertical(int ver){
        this.y+=ver;
    }
    public void mostrar(){
        System.out.println("Punto ("+this.x+","+this.y+")");
    } //Prueba de examen
    public static void mostrarNumero(){
        System.out.println("4");
    }
    
}
