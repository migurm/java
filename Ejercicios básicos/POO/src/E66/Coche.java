package E66;

public class Coche {

    //Propiedades //VALORES NINGUNO AQUÃ 
    String nombre;
    String color;
    double anchura;
    double altura;
    int puertas;
    int ruedas;
    boolean encendido;
    int gasolina;
    boolean combustible;

    //Abrimos el mÃ©todo constructor. Y aquÃ­ inicializamos las variables de la clase.
    public Coche(String nombre, String color, double anchura, double altura, int puertas) {
        this.nombre = nombre;
        this.color = color;
        this.anchura = anchura;
        this.altura = altura;
        this.puertas = puertas;
        //nombre, color, anchura, altura, puertas.
        this.ruedas = 4;
        //this. es para el futuro objeto que va a aparecer, me dice que ESTA VARIABLE la metes aquÃ­ 
        //this. NO SE USA EN EL MAIN
        this.encendido=false;
        this.gasolina=25;
        this.combustible=true;
    }
    public void arrancar(){
        if((!encendido)&&(combustible)){
            if(gasolina>=5){
                System.out.println("Arrancando el coche...arrancado!!");
            encendido=true;
            gasolina-=5;
            }else{
                System.out.println("No tiene suficiente gasolina... no ocurre nada.");
            }
            
            
        }else{
            System.out.println("El coche ya estaba en marcha...no ocurre nada.");
        }
        
        
    }
    public void parar(){
        if(!encendido){
            System.out.println("Primero el coche debe de estar encendido...no ocurre nada.");
        }else{
            System.out.println("Apagando el coche...apagado!!");
            encendido=false;
        }
    }
    public void desplazarse(){
        if(!encendido){
            System.out.println("Primero debería arrancar el coche... no ocurre nada.");
        }
        else{
            if(gasolina>=20){
            System.out.println("El coche se está desplazando!!");
            gasolina-=20;
            }else{
                System.out.println("Estás sin gasolina...no ocurre nada.");
            }
        }
    }
    public void repostar(int litros){
        if(!encendido){
            if(litros+gasolina>50){
                System.out.println("En el coche solo caben 50 litros, se le devuelven los "+((litros+gasolina)-50)+" litros sobrantes");
                gasolina=50;
            }else{
            System.out.println("Repostando "+litros+" litros.");
            gasolina+=litros;
            }
        }
        else{
            System.out.println("Primero debes apagar el coche...no ocurre nada.");
        }
        
    }
    public void chequear(){
        if(gasolina<=0){
            combustible=false;
            
        }else{
            combustible=true;
        }
        
    }
    public void pintar(String color){
        System.out.println("Pintando el coche de color "+color+"...");
        this.color=color;
    }
    
    public String toString(){
        String res = "";
        
        res += "El coche se llama "+this.nombre+ "\n";
        res += "Es de color "+this.color+"\n";
        res += "Mide "+this.anchura+"m de ancho \n";
        res += "Y "+this.altura+" m de alto \n";
        res += "Tiene "+this.puertas+ " puertas \n";
        res += "Como todos, tiene "+this.ruedas+" ruedas \n";
        if (encendido){
            res+= "Está encendido ahora mismo \n";
        }else{
            res += "Está apagado ahora mismo \n";
        }
        res += "Tiene "+gasolina+" litros en el depósito \n";
        if (combustible){
            res +="...tiene combustible \n";
        }else{
            res +="está seco.\n";
        }
        
        return res;
        
                
       
    }
    
    public Coche (Coche cocheACopiar){
        
        this.altura=cocheACopiar.altura;
        this.anchura=cocheACopiar.anchura;
        this.color=cocheACopiar.color;
        this.nombre=cocheACopiar.nombre;
        this.puertas=cocheACopiar.puertas;
        
        //String nombre, String color, double anchura, double altura, int puertas
    }
    

}

