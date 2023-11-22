

package E88;


public class Empleado {
    private String nombreEmpleado;
    
    
    public Empleado (String nombreEmpleado){
        this.nombreEmpleado=nombreEmpleado;   
    }
    
    public String getNombre(){//Método para devolver el nombre del empleado
        return this.nombreEmpleado;
    }
    
    
    
    public String toString(){//Método toString clásico
       String res="Soy el empleado "+this.nombreEmpleado+".";
       return res;
    }

}
