/*
71.- Crea una clase Aritmética, la cual tendrá dos valores numéricos decimales como
propiedades de clase y los métodos necesarios para calcular (que no mostrar), la suma,
resta, multiplicación, división y potencia de esos valores.
 */
package E71;

public class Aritmetica {

    double valor1;
    double valor2;
    double suma;
    double resta;
    double multiplicacion;
    double division;
    double potencia;

    public Aritmetica(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;

    }

    public void opera() {
        this.suma = this.valor1 + this.valor2;
        this.resta = this.valor1 - this.valor2;
        this.multiplicacion = this.valor1 * this.valor2;
        this.division = this.valor1 / this.valor2;
        this.potencia = Math.pow(this.valor1, this.valor2);

    }

}
