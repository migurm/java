

package E88;


public class Empleado {
    private String nombreEmpleado;
    
    
    public Empleado (String nombreEmpleado){
        this.nombreEmpleado=nombreEmpleado;   
    }
    
    public String getNombre(){//M�todo para devolver el nombre del empleado
        return this.nombreEmpleado;
    }
    
    
    
    public String toString(){//M�todo toString cl�sico
       String res="Soy el empleado "+this.nombreEmpleado+".";
       return res;
    }

}
