/*
70.- Crea la clase Rect�ngulo, la cual almacenar� la base y la altura. Estos atributos
ser�n privados y no deben poder accederse desde el exterior. Adem�s, la clase tendr� los
m�todos necesarios para calcular el �rea (base * altura), el per�metro (2*(b+h)) del
rect�ngulo y un m�todo para representar en texto la clase:
-----------------------------------------
Rect�ngulo con base X y altura Y
�rea: A
Per�metro: P
-----------------------------------------
 */
package E70;

public class Rectangulo {

    private double base;
    private double altura;
    private double area;
    private double perimetro;

    public Rectangulo(double bas, double alt) {
        this.base = bas;
        this.altura = alt;
    }

    public void area() {
        this.area = this.base * this.altura;

    }

    public void perimetro() {
        this.perimetro = (2 * (this.base + this.altura));
    }
    public String toString(){
        String res="";
        res+="Rect�ngulo con base "+this.base+" y altura "+this.altura+"\n";
        res+="�rea: "+this.area+"\n";
        res+="Per�metro: "+this.perimetro+"\n";
        
        return res;
    }

}
