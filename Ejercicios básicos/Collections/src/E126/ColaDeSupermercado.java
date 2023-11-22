
package E126;

import java.util.ArrayList;


public class ColaDeSupermercado {
    private String nombreSupermercado;
    private ArrayList <Persona> personasEnCola= new ArrayList();
    
    public ColaDeSupermercado(String nombreSuper){
        this.nombreSupermercado=nombreSuper;
        
    }
    public boolean estaVacia(){
        return this.personasEnCola.isEmpty();
        
    }
    //Metodo para poner en cola a una persona
    public void entar(Persona personaEnCola){
        personasEnCola.add(personaEnCola);
    }
    //Metodo para sacar de la cola a la ultima persona en entrar
    public void salir(){
       personasEnCola.remove(personasEnCola.size()-1); 
    }
    //Metodo para devolver a la primera persona que esta en la cola
    public Persona primero(){
        return personasEnCola.get(0);
    }
    //Metodo para devolver el numero de personas en la cola
    public int cantidad(){
        return personasEnCola.size();
    }
    public String toString(){
        String res="";
        res+="Personas en cola: \n";
        for(Persona persona:personasEnCola){
            res+=persona.toString();
        }
        return res;
    }

}
