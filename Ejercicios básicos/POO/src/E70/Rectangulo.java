/*
70.- Crea la clase Rectángulo, la cual almacenará la base y la altura. Estos atributos
serán privados y no deben poder accederse desde el exterior. Además, la clase tendrá los
métodos necesarios para calcular el área (base * altura), el perímetro (2*(b+h)) del
rectángulo y un método para representar en texto la clase:
-----------------------------------------
Rectángulo con base X y altura Y
Área: A
Perímetro: P
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
        res+="Rectángulo con base "+this.base+" y altura "+this.altura+"\n";
        res+="Área: "+this.area+"\n";
        res+="Perímetro: "+this.perimetro+"\n";
        
        return res;
    }

}
