/*
76.- El objetivo de este ejercicio es crear la clase Urna cuyos objetos pueden contener
bolas blancas y bolas negras y, además, nos va a permitir realizar operaciones básicas
sobre ellas.
 */
package E76;

/*
La clase tendrá un par de variables de instancia privadas en las que se
almacenará el número de bolas de cada color.
 */
public class Urna {

    private int bolasblancas;
    private int bolasnegras;
    int numerobolas;

    /*
También tendrá un constructor que permita crear instancias de la clase con un
número inicial de bolas blancas y negras pasadas como parámetros.
     */
    public Urna(int blancas, int negras) {
        this.bolasblancas = blancas;
        this.bolasnegras = negras;
        this.numerobolas=this.bolasblancas+this.bolasnegras;
    }
    public void inicio(){
        System.out.println("Urna creada con "+this.bolasblancas+" bolas blancas y "+this.bolasnegras+" bolas negras.");
    }

    public void numeroDeBolas() {
        if (numerobolas > 0) {
            System.out.println("Quedan " + numerobolas + " bola/s en la urna.");
            System.out.println(this.bolasblancas+" blancas y "+this.bolasnegras+" negras.");
       /* } else {
            System.out.println("No quedan bolas en la urna.");*/
        }
    }
    public void extraerBola(){
        if(this.numerobolas>1){
        int colorBola=(int)((Math.random()*(this.numerobolas-1+1))+1);
        if(colorBola<=this.bolasblancas){
            System.out.println("Se ha extraido una bola b");
            this.bolasblancas--;
            this.numerobolas--;
        }else{
            System.out.println("Se ha extraido una bola n");
            this.bolasnegras--;
            this.numerobolas--;
        }
        }else if (this.numerobolas==1){
            if(this.bolasblancas==1){
                System.out.println("Se ha extraido la bola final de bolor b");
                this.bolasblancas--;
            this.numerobolas--;
            }else{
                System.out.println("Se ha extraido la bola final de color n");
                 this.bolasnegras--;
            this.numerobolas--;
            }
        }
        
    }
    public void introducirBola(String color){
       if(color.equalsIgnoreCase("blanca")){
           System.out.println("Se ha metido una bola BLANCA");
           this.bolasblancas++;
           this.numerobolas++;
       }else if(color.equalsIgnoreCase("negra")){
           System.out.println("Se ha metido una bola NEGRA");
           this.bolasnegras++;
           this.numerobolas++;
       }
        
    }
    
    

}
