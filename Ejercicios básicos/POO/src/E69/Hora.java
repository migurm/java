/*
69.- Crear una clase llamada Hora, con los atributos horas, minutos y segundos. Dicha
clase podrá ser construida indicando los tres atributos, solo las horas y los minutos o
sólo las horas. La clase tendrá los métodos necesarios para modificar la hora en
cualquier momento de forma manual y para mostrar la hora que tiene en un momento
dado. Hay que mantener los atributos con valores correctos en todo momento.
 */
package E69;

public class Hora {

    double horas;
    double minutos;
    double segundos;

    public Hora(double hor, double min, double seg) {//Constructor con los tres atributos

        this.horas = hor;

        if (min > 59) {
            this.minutos = min % 60;
            this.horas += ((int) (min / 60));

        } else {
            this.minutos = min;
        }

        if (seg > 59) {
            this.segundos = seg % 60;
            this.minutos += ((int) (seg / 60));
        } else {
            this.segundos = seg;
        }

    }

    public Hora(double hor, double min) {//Constructor solo de horas y minutos

        this.horas = hor;

        if (min > 59) {
            this.minutos = min % 60;
            this.horas += ((int) (min / 60));

        } else {
            this.minutos = min;
        }

        this.segundos = 0;

    }

    public Hora(double hor) {//Constructor solo de horas

        this.horas = hor;

        this.minutos = 0;

        this.segundos = 0;

    }

    public void cambioHora(int hor, int min, int seg) {
        this.horas = hor;

        if (min > 59) {
            this.minutos = min % 60;
            this.horas += ((int) (min / 60));

        } else {
            this.minutos = min;
        }

        if (seg > 59) {
            this.segundos = seg % 60;
            this.minutos += ((int) (seg / 60));
                   
        } else {
            this.segundos = seg;
        }
     
    }
    public void mostrarHora(){
        System.out.println("La hora es: "+(int)this.horas+":"+(int)this.minutos+":"+(int)this.segundos);
    }
    


}
