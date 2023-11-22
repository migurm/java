/*
72.- Crea la clase Persona con los siguientes datos: Una persona debe tener nombre
(cadena), edad (entero mayor a 0), sexo (?M? o ?F?) y país (España, Bulgaria, Colombia
o Venezuela).
Además tendrá dos métodos:
? saludar: el cual debe devolver (que no mostrar) un saludo de la forma:
?Hola! Me llamo nombre y soy de pais?
? mostrarDatos: muestra de forma ordenada los datos de la persona.
? EsMayorEdad(): devuelve un booleano que indica si la persona es mayor de
edad o no.
? toString(): método para mostrar la información de una persona.
 */
package E72;

public class Persona {

    String nombre;
    int edad;
    char sexo;
    String pais;
    boolean mayor;

    public Persona(String nombre, int edad, char sexo, String pais) {
        this.nombre = nombre;
        if (edad < 1) {
            this.edad = (int) ((Math.random() * (45 - 12 + 1)) + 12);//En caso de una edad errónea, le asignamos una edad aleatoria entre 12 y 45.
        } else {
            this.edad = edad;
        }
        if (this.edad > 17) {
            this.mayor = true;
        } else {
            this.mayor = false;
        }
        if (sexo == 'M') {
            this.sexo = 'm';
        } else if (sexo == 'F') {
            this.sexo = 'f';
        } else if ((sexo != ('m')) && (sexo != ('f'))) {
            int azar = (int) ((Math.random() * (2 - 1 + 1)) + 1);
            switch (azar) {
                case 1:
                    this.sexo = 'f';
                    break;
                case 2:
                    this.sexo = 'm';
            }

        } else {
            this.sexo = sexo;
        }
        if ((!pais.equalsIgnoreCase("España")) && (!pais.equalsIgnoreCase("Colombia")) && (!pais.equalsIgnoreCase("Venezuela")) && (!pais.equalsIgnoreCase("Bulgaria"))) {
            int azar2 = (int) ((Math.random() * (4 - 1 + 1)) + 1);
            switch (azar2) {
                case 1:
                    this.pais = "España";
                    break;
                case 2:
                    this.pais = "Colombia";
                    break;
                case 3:
                    this.pais = "Venezuela";
                    break;
                case 4:
                    this.pais = "Bulgaria";
                    break;
            }
        } else {
            this.pais = pais;
        }
    }

    public void saludar() {
        String saludo = "";
        saludo += "Hola! Me llamo " + nombre + " y soy de " + pais + "\n";
        System.out.println(saludo);
    }

    public void mostrarDatos() {
        String datos = "";
        datos += "Nombre: " + this.nombre + "\n";
        datos += "Edad: " + this.edad + "\n";
        if (this.sexo == 'm') {
            datos += "Sexo: Masculino \n";
        } else if (this.sexo == 'f') {
            datos += "Sexo: Femenino  \n";
        } else {
            datos += "Hay un problema en el ejercicio, sale: " + this.sexo + "\n";
        }
        datos += "Pais: " + this.pais + "\n";
        if (mayor) {
            datos += "Mayor de edad \n";
        } else {
            datos += "Menor de edad\n";
        }
        System.out.println(datos);
    

    }

    public void esMayorEdad() {
        if (mayor) {
            System.out.println("Es mayor de edad.");

        } else {
            System.out.println("Es menor de edad.");
        }
    }

    public String toString() {
        String res = "";
        res += "Nombre: " + this.nombre + "\n";
        res += "Edad: " + this.edad + "\n";
        if (this.sexo == 'm') {
            res += "Sexo: Masculino \n";
        } else if (this.sexo == 'f') {
            res += "Sexo: Femenino  \n";
        } else {
            res += "Hay un problema en el ejercicio, sale: " + this.sexo + "\n";
        }
        res += "Pais: " + this.pais + "\n";
        if (mayor) {
            res += "Mayor de edad \n";
        } else {
            res += "Menode de edad\n";
        }
        return res;
    }
    public void saludo(int saludo){
        switch (saludo){
            case 1:
                System.out.println("Que pasa cabesa");
                break;
            case 2:
                System.out.println("Hola muy buenas mi parce");
                break;
            case 3:
                System.out.println("Dimitri!!Pásame el kalashnikov");
                break;
            default:
                System.out.println("Solo tiene saludos del 1 al 3, intenta otra vez.");
        }
    }

}

/*
while (!res.equalsIgnoreCase("N"));
 */
