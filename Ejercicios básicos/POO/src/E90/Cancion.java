package E90;

public class Cancion extends Multimedia {

    private String artista;
    private String editor;
    private String genero;

    public Cancion(String titulo, String formato, double duracion, String artista, String editor, String genero) {
        super(titulo, formato, duracion);
        this.artista = artista;
        this.editor = editor;
        switch (genero)
        {       //Acabo de descubrir el fuego.
            case "Pop":
            case "Flamenco":
            case "Hip Hop":
            case "R&B":
            case "Reguetón":
                this.genero = genero;
                break;
            default:
                this.genero = "Rock";
        }

    }
    public String getArtista(){
        return this.artista;
    }
    public String getEditor(){
        return this.editor;
    }
    public String getGenero(){
        return this.genero;
    }
    
    @Override
    public String toString(){
        String res="";
        
        res+="Información de la canción.\n";
        
        res+="Título: "+super.getTituloArchivo()+"\n";
        
        res+="Artista: "+this.artista+"\n";
        
        res+="Editor: "+this.editor+"\n";
        
        res+="Genero: "+this.genero;
        
        return res;
        
    }

}
