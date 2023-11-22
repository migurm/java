

package E88;


public class Operario extends Empleado {//Clase operario hija de clase Empleado
    private int numeroOperario;//El operario, aparte de los atributos de Empleado tiene este propio.
    
    
    public Operario(String nombreOperario, int numeroOperario){//En el constructor pedimos también el dato para Empleado
        
        super(nombreOperario);//Llevamos el parametro nombreOperario al constructor superior, a nombreEmpleado.
             
        this.numeroOperario=numeroOperario;//Este atributo entra normal.
     
    }
    public void setNumeroOprerario(int nuevoNumeroOperario){//Método para alterar el atributo numeroOperario.
        this.numeroOperario=nuevoNumeroOperario;
    }
    
    public int getNumeroOperario(){//Método para obtener el atributo numeroOperario.
        return this.numeroOperario;
    }

    
    @Override //Al haber heredado el toString de la superclase, este sobreescribe al anterior.
    public String toString(){
        
        String res = "Soy el operario con el código "+this.numeroOperario+".";
        
        return res;
    }
    
    

}
