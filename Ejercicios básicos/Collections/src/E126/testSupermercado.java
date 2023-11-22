
package E126;


public class testSupermercado {

    public static void main(String[] args) {
        Persona migue=new Persona("74941813q");
        Persona paco=new Persona ("75846952k");
        Persona fernando=new Persona ("548214556O");
        
        ColaDeSupermercado colaPrueba = new ColaDeSupermercado ("Aldi");
        
        colaPrueba.entar(migue);
        
        System.out.println(colaPrueba.cantidad());
        
        System.out.println(colaPrueba.toString());
        System.out.println("Metemos a otras dos personas en la cola.");
        colaPrueba.entar(paco);
        colaPrueba.entar(fernando);
        System.out.println(colaPrueba.cantidad());
        System.out.println("Imprimimos la gente de la cola.");
        System.out.println(colaPrueba.toString());
        colaPrueba.salir();
        System.out.println("Debería haber salido de la cola el ultimo en entrar.");
        System.out.println(colaPrueba.toString());
        

    }

}
