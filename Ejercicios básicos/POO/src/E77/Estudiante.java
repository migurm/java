package E77;

public class Estudiante {

    private String nombre;
    private String apellidos;
    private double[] notas;
    private int numeroCalificaciones;

    public Estudiante(String nombre, String apellidos, int calificaciones) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.notas = new double[calificaciones];//Nuevo array de tipo doble de longitud calificaciones
        this.numeroCalificaciones = calificaciones;//Lo usaremos como longitud del array
        for (int i = 0; i < calificaciones; i++) {
            notas[i] = -1;//El array por defecto se llena de -1;
        }
    }

    public boolean InsertarNota(double nota) {
        boolean notaInsertada = false;
        if (nota < 0) {//Si la nota introducida es menor de 0 se devuelve el false y no se hace más.
            return notaInsertada;
        } else {//Caso de nota correcta
            int contador = 0;
            while ((!notaInsertada) && (contador < this.numeroCalificaciones)) {//Bucle hasta que se consiga insertar la nota o se acabe el array.
                if (this.notas[contador] == -1) {//Solo pisamos el valor si es un -1.
                    this.notas[contador] = nota;
                    notaInsertada = true;
                    contador++;
                } else {
                    contador++;
                }

            }
            return notaInsertada;//Se devuelve si se consiguió o no insertar la nota.
        }
    }

    public double CalcularMedia() {
        double sumatorioNotas = 0;
        int notasCorrectas = 0;
        int contador = 0;//Contadores para la operacion de la media que devolveremos.
        while ((contador < this.numeroCalificaciones) && (this.notas[contador] != -1)) {//Solo contamos con notas diferentes a -1
            if (this.notas[contador] != -1) {
                sumatorioNotas += notas[contador];
                notasCorrectas++;
                contador++;
            } else {
                contador++;
            }
        }
        return (sumatorioNotas / notasCorrectas);//Devolvemos el valor operado
    }

    public String IndicarRangos() {
        String rangos = "";
        int insuficientes = 0, suficientes = 0, notables = 0, sobresalientes = 0;
        for (int i = 0; i < this.numeroCalificaciones; i++) {
            if (this.notas[i] >= 0) {//Tomamos en cuenta valores mayor o iguales a 0.
                if (this.notas[i] < 5) {
                    insuficientes++;
                } else if ((this.notas[i] >= 5) && (this.notas[i] < 7)) {
                    suficientes++;
                } else if ((this.notas[i] >= 7) && (this.notas[i] < 9)) {
                    notables++;
                } else if ((this.notas[i] >= 9) && (this.notas[i] <= 10)) {
                    sobresalientes++;
                }
            } else {
                i = this.numeroCalificaciones;//Salida rápida del for.
            }
        }
        rangos += "Insuficientes: " + insuficientes + "\n";
        rangos += "Suficientes: " + suficientes + "\n";
        rangos += "Notables: " + notables + "\n";
        rangos += "Sobresalientes: " + sobresalientes + "\n";
        return rangos;//Devolvemos un string con los rangos estructurados.
    }

    public String MostrarNotas() {
        String listaNotas = "|";
        for (int i = 0; i < this.numeroCalificaciones; i++) {
            listaNotas += " " + notas[i] + " |";
            //En el caso de que se vaya a mostrar -1, cambiar a mostrar N.E.; **CAMBIAR**
        }

        return listaNotas;//Mostramos el array maquetado.
    }

    public String toString() {
        String res = "";
        res += "Estudiante: " + this.nombre + " " + this.apellidos + "\n";
        res += "Notas: " + MostrarNotas() + "\n";
        res += "Rangos: " + IndicarRangos();
        res += "Media: " + CalcularMedia();
        return res;//Damos los datos completos del alumno usando los métodos hechos antes.
    }

}
