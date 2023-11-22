package E89;

public class Perro extends Mamifero {
    String razaDelPerro;
    String nombreDelPerro;
    private boolean puraRaza;

    public Perro(int numeroDePatas, int mediaDeVida, String raza, String nombre) {
        super(numeroDePatas, mediaDeVida);
        this.razaDelPerro = raza;
        this.nombreDelPerro = nombre;
        this.puraRaza = true;
    }

    @Override
    public void dormir() {//Sobreescribimos el metodo
        System.out.println("Está durmiendo, suele dormir unas 18 horas.");
    }

    @Override
    public String comunicarse() {//Sobreescribimos el metodo

        return "Guau, guau!!";
    }
    
    public String jugar(){
        return this.nombreDelPerro+" está jugando";
    }
    
    public void setPuraRaza(boolean cambioPuraRaza){
        this.puraRaza=cambioPuraRaza;
    }
    
    public boolean getPuraRaza(){
        return this.puraRaza;
    }
    
    
    @Override
    public String toString(){//Sobreescribimos el metodo
        String res="Nombre del perro: "+this.nombreDelPerro+"\n";
        res+="Raza: "+this.razaDelPerro+"\n";
        if(puraRaza){
            res+="Pura raza";
        }else{
            res+="Mestizo";
        } 
        return res;
    }

}
