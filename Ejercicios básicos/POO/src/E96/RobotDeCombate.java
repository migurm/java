package E96;

public class RobotDeCombate extends Robot {

    protected double armadura;
    protected boolean estadoArmadura;
    protected String arma;

    public RobotDeCombate(double aguante, double velocidad, double potencia, double armadura, boolean estado, String arma) {
        super(aguante, velocidad, potencia);
        this.armadura = armadura;
        this.estadoArmadura = estado;
        this.arma = arma;
    }

    @Override
    public String combatir(Robot defensor) {
        String pelea = "";
        if (defensor instanceof RobotDeCombate){//CASO DE QUE SE TRATE DE UNA PELEA ENTRE ROBOTS DE COMBATE
            RobotDeCombate defensorTemporalCombate = (RobotDeCombate) defensor;
            if(defensorTemporalCombate.estadoArmadura){//CASO DE ATAQUE A UN ROBOT CON SU ARMADURA OPERATIVA
                
                if(this.potencia>defensorTemporalCombate.armadura){//CASO DE QUE EL ATAQUE SEA MAYOR A LA ARMADURA (SE LE VA A ROMPER Y LE VA A QUITAR VIDA)
                    defensorTemporalCombate.armadura=0;
                    defensorTemporalCombate.estadoArmadura=false;
                    pelea+=" El atacado perdió su armadura...pinta mal";
                    defensorTemporalCombate.aguanteRobot-=(this.potencia-defensorTemporalCombate.armadura);
                    pelea+="El defensor recibe un ataque de "+this.potencia+" puntos de potencia.";
                    if(defensorTemporalCombate.aguanteRobot<=0){
                        defensorTemporalCombate.aguanteRobot=0;
                        pelea+="El robot trató de defenderse... pero palmó. \n";
                    }
                    
                    
                }else if(defensorTemporalCombate.armadura>=this.potencia){//CASO QUE EL ATAQUE NO TERMINE DE ROMPER LA ARMADURA ( O JUSTO LA ROMPA PERO LA DEJE A CERO) 
                    defensorTemporalCombate.armadura-=this.potencia;
                    pelea+="El defensor recibe un ataque de "+this.potencia+" puntos de potencia.";
                    if(defensorTemporalCombate.armadura==0){
                        defensorTemporalCombate.estadoArmadura=false;
                        pelea+=" El atacado perdió su armadura...pinta mal";
                    }
                    
                }
                
            }else{//CASO QUE SE ATAQUE A UN ROBOT DE COMBATE CON LA ARMADURA ROTA.
                defensorTemporalCombate.aguanteRobot-=this.potencia;
                pelea+="El defensor recibe un ataque de "+this.potencia+" puntos de potencia.";
                if(defensorTemporalCombate.aguanteRobot<=0){
                    defensorTemporalCombate.aguanteRobot=0;
                    pelea+="El defensor ha palmador.";
                }
                
            }
            
            

        }else{//SE ATACA A UN ROBOT SIMPLE
            //Ejercicio inacabado, parece inabarcable la casuistica. (Le meteré mano cuando sea mejor programando).

            
        }
        return pelea;
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}//Este ejercicio es TAAAAAAAAAAAAAAAN largo, con lo simple que parece... 
/*Tenemos que programar un metodo que contemple:
a)Si se trata de una pelea robot de combate vs robot de combate
o es una pelea de robot de combate contra robot normal
b)En el primer caso hay que programar los casos de que el robot defensor tenga
o no la armadura lista, si justo se le rompe en ese ataque, si justo muere en ese ataque
si no muere, si no se le rompe
c)y luego hay que repetirlo todo a la inversa
d)en caso de que sea un robot de combate contra un robot normal, comprobar que cuando el robot normal
nos devuelva el ataque si se rompe su armadura, si ya la tiene rota, si muere, si no muere....
Es MUY complicado, no por la sintaxis, sino por la casuística del ejercicio... demasiado creo yo.
El unico punto dificil de este ejercicio es el hecho de comprobar si el defensor se trata de un tipo de robot u otro
a traves del if instance of y posterior casteo.*/
