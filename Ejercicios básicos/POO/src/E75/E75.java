
package E75;


public class E75 {

    public static void main(String[] args) {
        Cuenta cuenta1= new Cuenta ("jose antonio", 25412.14);
        
        cuenta1.retirar(24651.15);
        
        System.out.println(cuenta1);
        
        
        cuenta1.setTitular("conchi");
        System.out.println(cuenta1);
        
        
        String nombre1=cuenta1.getTitular();
        
        
        System.out.println("Holaaa que pasa \naqui estamos");
        
 
    }

}
