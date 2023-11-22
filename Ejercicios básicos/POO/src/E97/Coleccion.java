package E97;

public abstract class Coleccion {

    private int[] listaNumeros;
    private int cantidadObjetos;
    private final int TAM = 10;//Tama?o para el constructor sin parámetros

    public Coleccion() {
        this.listaNumeros = new int[TAM];
        for (int i = 0; i < this.listaNumeros.length; i++)
        {
            this.listaNumeros[i] = 0;//Aunque un array vacío de int en java está lleno de 0, mejor esto
        }
        this.cantidadObjetos = 0;
    }

    public Coleccion(int tamanioLista) {
        if (tamanioLista <= 0)
        {
            tamanioLista = TAM;//Si el parámetro es incorrecto, usaremos el tama?o TAM para el array.
        }
        this.listaNumeros = new int[tamanioLista];
        for (int i = 0; i < this.listaNumeros.length; i++)
        {
            this.listaNumeros[i] = 0;//Aunque un array vacío de int en java está lleno de 0, mejor esto
        }
        this.cantidadObjetos = 0;
    }

    public int getElementos() {
        return this.cantidadObjetos;
    }

    public int getElemento(int pos) {
        if ((pos < 0) || (pos >= this.listaNumeros.length))
        {//Si es menor de 0, o mayor o igual que la longitud del array, no vale.
            return -1;
        } else
        {
            return this.listaNumeros[pos];
        }
    }

    public boolean sinElementos() {
        boolean vacio = true;
        for (int i = 0; (i < this.listaNumeros.length) && (vacio); i++)
        {
            if (this.listaNumeros[i] != 0)
            {
                vacio = false;
            }
        }
        return vacio;
    }

    public void aniadir(int elemento) {
        boolean aniadido = false;
        if (elemento > 0)
        {//Solo vamos a a?adir el elemento si es mayor que cero, que eso es lo que queria, enteros positivos.
            for (int i = 0; ((i < this.listaNumeros.length) && (!aniadido)); i++)
            {
                if (this.listaNumeros[i] == 0)
                {
                    this.listaNumeros[i] = elemento;
                    aniadido = true;
                }
            }
            if (!aniadido)
            {//Si no se ha podido a?adir, porque el array no tiene ninguna posicion vacía (a cero)
                int[] nuevaLista = new int[this.listaNumeros.length * 2];//Creamos un nuevo array con el doble de longitud.
                for (int i = 0; i < nuevaLista.length; i++)
                {//Llenamos el nuevo array de ceros
                    nuevaLista[i] = 0;
                }
                for (int i = 0; i < this.listaNumeros.length; i++)
                {//Volcamos los valores del primer array en el segundo
                    nuevaLista[i] = this.listaNumeros[i];
                }
                nuevaLista[this.listaNumeros.length] = elemento;//JAJAJAJA

                this.listaNumeros = nuevaLista;//Esto así funcionaría???
            }
        }
    }

    public void eliminar(int elemento) {//Método para eliminar un elemento del array
        boolean eliminado = false;
        for (int i = 0; ((i < this.listaNumeros.length) && (!eliminado)); i++)
        {//Recorremos el array o hasta finalizarlo o hasta que consigamos elimiar el elemento
            if (this.listaNumeros[i] == elemento)
            {
                this.listaNumeros[i] = 0;
                eliminado = true;//Si encontramos el elemento, lo igualamos a cero y dejamos de recorrer el bucle. (Podríamos devolver el boolean, no se especifica que haga nada)
            }
        }
    }

    public boolean contiene(int elemento) {//Comprobar si tenemos un elemento en un array
        boolean encontrado = false;
        for (int i = 0; ((i < this.listaNumeros.length) && (!encontrado)); i++)
        {
            if (this.listaNumeros[i] == elemento)
            {
                encontrado = true;//Recorremos el array hasta encontrar el elemento o hasta que este acabe, si lo encontramos solo cambiamos el boolean a true y listo.
            }
        }
        return encontrado;
    }

    public String toString() {
        String res = "[";
        for (int i = 0; i < this.listaNumeros.length; i++)
        {
            if (this.listaNumeros[i] != 0)
            {
                if (i == 0)
                {
                    res += listaNumeros[i];

                }

            }

        }
        return res;
    }
}
