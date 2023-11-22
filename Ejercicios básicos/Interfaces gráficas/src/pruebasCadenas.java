

public class pruebasCadenas {

    public static void main(String[] args) {
        String cadena = "La lluvia en Sevilla es una maravilla";
        
        System.out.println(cadena.substring(cadena.indexOf("S"), cadena.lastIndexOf("a")));
        //Observamos que la funcion substring el caracter inicial si lo coge, pero el final lo descarta, tiene su sendito para Java.
        System.out.println(cadena.substring(cadena.indexOf("S"), cadena.lastIndexOf("a")+1));
        
        cadena = cadena.replaceAll("Sevilla", "Malaga");
        System.out.println(cadena);
        
        String [] frase = cadena.split(" ");
        
        System.out.println("La frase tiene "+frase.length+" palabras.");
        
        String aux = frase[frase.length-1];
        
        frase[frase.length-1]= frase[0];
        frase[0]=aux;
        
        for (String palabra : frase){
            System.out.println(palabra);
        }


    }

}
