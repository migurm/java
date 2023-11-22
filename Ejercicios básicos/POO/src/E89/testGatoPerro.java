
package E89;


public class testGatoPerro {

    public static void main(String[] args) {
        
        Perro perro1 = new Perro (4,10,"Carlino", "Duke");
        
        Perro perro2 = new Perro (4,12,"Bodeguero","Notario");
        
        Gato gato1 = new Gato (4 , 10 , "Persa", "Bigotes");
        
        Gato gato2 = new Gato (4, 8, "Egipcio", "Bills");
        System.out.println("---------------------------");
        System.out.println(perro1);
        System.out.println("---------------------------");
        System.out.println(perro2);
        System.out.println("---------------------------");
        System.out.println(gato1);
        System.out.println("---------------------------");
        System.out.println(gato2);
        System.out.println("---------------------------");
    }

}
