package E90;

public class Pelicula extends Multimedia {

    private String actorPrincipal;
    private String actrizPrincipal;

    public Pelicula(String titulo, String formato, double duracion, String actorPrincipal, String actrizPrincipal) {
        super(titulo, formato, duracion);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    public String getActorPrincipal() {
        return this.actorPrincipal;
    }

    public String getActrizPrincipal() {
        return this.actrizPrincipal;
    }

    @Override
    public String toString() {
        String res = "Titulo de la película: " + getTituloArchivo() + ".\n";
        res += "Protagonizada por: " + this.actrizPrincipal + " y " + this.actorPrincipal;
        res += "Con una duración de " + getDuracionArchivo() + " minutos.";
        return res;

    }

    @Override
    public boolean equals(Object otroArchivo) {

        Pelicula otraPelicula = (Pelicula) otroArchivo;
  
        if(super.equals(otroArchivo)){
            if((this.getActorPrincipal().equals(otraPelicula.getActorPrincipal()))&&
                    (this.getActrizPrincipal().equals(otraPelicula.getActrizPrincipal()))){
                return true;
            }
        }
        return false;
    }
    
    
}
