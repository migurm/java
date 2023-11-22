package E81;

public class testGuerrero {

    public static void main(String[] args) {
        Arma arma1 = new Arma("Pistola", 120, 60);
        Arma arma2 = new Arma("Garras", 150, 20);

        Guerrero guerrero1 = new Guerrero("Terminator", 120, 50, 80, arma1);
        Guerrero guerrero2 = new Guerrero("Venom", 120, 80, 60, arma2);
        
        
        
        System.out.println(guerrero1.atacarA(guerrero2));
        System.out.println(guerrero2);
        System.out.println(guerrero2.atacarA(guerrero1));
        System.out.println(guerrero1);
        guerrero1.mejorarArma("pistola");
        System.out.println(arma1);
        
        
        

    }

}
