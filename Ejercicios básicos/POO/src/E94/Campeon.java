package E94;

import java.util.Scanner;

public class Campeon extends Personaje {

    double puntosDeMagia;
    int nivelCampeon;
    String rolCampeon;
    Habilidad [] habilidadesCampeon = new Habilidad[4];

    public Campeon(String nombre, int posVertical, int posHorizontal,
            double puntosDeVida, double puntosEscudo, double puntosAtaque, double puntosDeMagia,
            int nivelCampeon, String rol, Habilidad habilidadInicial) {
        
        super(nombre, posVertical, posHorizontal, puntosDeVida, puntosEscudo, puntosAtaque);
        
        this.puntosDeMagia = puntosDeMagia;
        
        this.nivelCampeon = 1;

        switch (rol){
            
            case "tanque":
                this.rolCampeon = rol;
                this.puntosDeMagia=100;
                break;
            case "support":
                this.rolCampeon = rol;
                this.puntosDeMagia=300;
                break;
            case "mago":
                this.rolCampeon = rol;
                this.puntosDeMagia=500;
                break;
            case "jungla":
                this.rolCampeon = rol;
                this.puntosDeMagia=200;
                break;
            default:
                this.rolCampeon = "carry";
                this.puntosDeMagia=300;
                break;
        }
        this.coordenadas[0]=(int)calcularAleatorio(1920,1000);
        this.coordenadas[1]=(int)calcularAleatorio(1920,1000);
        
        this.habilidadesCampeon[0]=habilidadInicial;
    }
    
    public String subirDeNivel(Habilidad habilidadNueva){
        String mensaje="";
        this.nivelCampeon++;
        this.puntosDeVida+=calcularAleatorio(9,1);
        this.puntosEscudo+=(calcularAleatorio(9,1)/10);
        this.puntosAtaque+=(calcularAleatorio(9,1)/10);
        mensaje+="Enhorabuena, subió al nivel "+this.nivelCampeon+"\n";
        
        switch (this.nivelCampeon){
            case 2:
                mensaje+="Aprendió la habilidad: "+habilidadNueva.nombreHabilidad;
                this.habilidadesCampeon[1]=habilidadNueva;
                break;
            case 4:
                mensaje+="Aprendió la habilidad: "+habilidadNueva.nombreHabilidad;
                this.habilidadesCampeon[2]=habilidadNueva;
                break;
            case 6:
                mensaje+="Aprendió la habilidad: "+habilidadNueva.nombreHabilidad;
                this.habilidadesCampeon[3]=habilidadNueva;
                break;
            case 8:
                mensaje+="Aprendió la habilidad: "+habilidadNueva.nombreHabilidad;
                this.habilidadesCampeon[4]=habilidadNueva;
                break;                           
        }
        return mensaje;
    }
}
