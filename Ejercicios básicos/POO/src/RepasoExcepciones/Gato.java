

package RepasoExcepciones;


public class Gato {
    private String nombre;
    private int edad;
    
    public Gato (String nombre, int edad){
        if(nombre.length()<3)throw new CreacionGatoException("El nombre debe tener al menos 3 caracteres.");
        this.nombre=nombre;
        if(edad<0)throw new CreacionGatoException("La edad no puede ser negativa.");
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.length()<3)throw new CreacionGatoException("El nombre debe tener al menos 3 caracteres.");
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad<0)throw new CreacionGatoException("La edad no puede ser negativa.");
        this.edad = edad;
    }
    public String toString(){
        return "El gatito "+this.nombre+" tiene "+this.edad+" a?os de edad.";
    }

}
