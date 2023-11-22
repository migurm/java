package E92;

public class Profesor {

    private String nombre;
    protected Asignatura listaDeAsignaturas[];
    protected double numeroHorasClase;
    protected boolean impartiendo;

    public Profesor(String nombre, int asignaturas) {

        this.nombre = nombre;

        this.listaDeAsignaturas = new Asignatura[asignaturas];

        int asignaturasEfectivas = (int) ((Math.random() * (asignaturas)) + 1);//Numero aleatorio de el numero de asignaturas reales q tendrá.
        int contadorHoras = 0;//Un contador para acumular las horas de las asignaturas que tiene asignada.
        for (int i = 0; i < asignaturasEfectivas; i++)
        {
            this.listaDeAsignaturas[i] = new Asignatura();//Creamos una nueva asignatura y la guardamos en el array.
            contadorHoras += this.listaDeAsignaturas[i].getHorasSemana();
        }
        this.numeroHorasClase = contadorHoras;
        this.impartiendo = false;//Por defecto false
    }
    public String empezarClase() {
        boolean asignaturaEncontrada = false;
        String mensaje = "";//He hecho esto porque no soy capaz de apa?arme solo con returns. :s

        if (!impartiendo)
        {

            while (!asignaturaEncontrada)
            {

                int aleatorio = (int) ((Math.random() * (this.listaDeAsignaturas.length - 0 + 1)) + 1);
                if (this.listaDeAsignaturas[aleatorio] != null)
                {
                    asignaturaEncontrada = true;
                    mensaje += this.nombre + " está dando clase de '" + this.listaDeAsignaturas[aleatorio].getCodigo() + "'\n";
                }
            }
        } else
        {
            mensaje += "Está dando otra clase ahora mismo";
        }
        return mensaje;
    }  
    public void parar(){
        if(impartiendo){
            System.out.println(this.nombre+" ha finalizado de dar clase");
            this.impartiendo=false;
        }else{
            System.out.println(this.nombre+" no está dando ninguna clase.");
        }
    }
    public String toString(){
        String res="--------------------------------------";
        res+="Información del profesor.\n";
        res+="Nombre: "+this.nombre+"\n";
        res+="Imparte a la semana: "+this.numeroHorasClase+" horas.\n";
        res+="Imparte las siguientes asignaturas:\n";
        for(int i = 0 ; i < this.listaDeAsignaturas.length ; i++){
            if(this.listaDeAsignaturas[i]!=null){
                res+=this.listaDeAsignaturas[i].toString()+"\n";
            } 
        }
        return res;
    }    
}
