package E126;

public class Persona {

    private String dni;
    private String nombre;
    private String apellido;
    private char sexo;
    private int edad;
    private double peso;

//Constructor con todos los datos por parámetro
    public Persona(String dni, String nombre, String apellido, char sexo, int edad, double peso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }
//Otro constructor solo con el DNI como parametro

    public Persona(String dni) {
        this.dni = dni;
        this.nombre = "";
        this.apellido = "";
        this.sexo = ' ';
        this.edad = 0;
        this.peso = 0;
    }
//getters y setters de todos los atributos
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String toString(){
        String res="Nombre: "+this.nombre+". Apellido: "+this.apellido+"\n";
        res+="DNI: "+this.dni+". Sexo: "+this.sexo+". Edad: "+this.edad+". Peso: "+this.peso+"\n";
        return res;
    }

}
