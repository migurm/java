
package E69;


public class E69 {

    public static void main(String[] args) {
        /*System.out.println("Si me dan 80 minutos.");
        System.out.println(80/60+" A sumar a horas");
        System.out.println(80%60+" se queda en minutos");
        
        Hora reloj =new Hora(1,80,15);
        reloj.mostrarHora();
        
        reloj.cambioHora(1,20,95);
        
        reloj.mostrarHora();*/
        
        Hora hora1 = new Hora (20, 80, 300);
        
        hora1.mostrarHora();
        
        hora1.cambioHora(30, 59, 60);
        
        hora1.mostrarHora();

    }

}
