package E90;

public class Multimedia {

    private String tituloArchivo;
    private String formato;
    private double duracionArchivo;

    public Multimedia(String titulo, String formato, double duracion) {

        this.tituloArchivo = titulo;

        boolean encontrado = false;

        switch (formato)
        {       //Acabo de descubrir el fuego.
            case "wav":
            case "aac":
            case "mp4":
            case "mkv":
            case "mov":
            case "flv":
                this.formato = formato;
                break;
            default:
                this.formato = "mp3";            
        }

        this.duracionArchivo = duracion;

    }

    public String getTituloArchivo() {
        return this.tituloArchivo;
    }

    public String getFormato() {
        return this.formato;
    }

    public double getDuracionArchivo() {
        return this.duracionArchivo;
    }

    public String toString() {
        String res = "";

        return res;
    }

    public boolean equals(Object otroArchivo) {

        Multimedia otroMultimedia = (Multimedia) otroArchivo;

        return this.getFormato().equals(otroMultimedia.getFormato()) && (this.getDuracionArchivo() == otroMultimedia.getDuracionArchivo());

    }

}
