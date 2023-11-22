
public class PIZA1ARR {

    public static void main(String[] args) {
        int contapar = 0;
        int i;
        int k = 0;
        int[] notas = new int[100];
        for (i = 0; i < (notas.length); i++) {
            notas[i] = (int) ((Math.random() * (100 - 1 + 1)) + 1);
            System.out.print(notas[i] + "||");
            if (notas[i] % 2 == 0) {
                contapar++;
            }
        }
        System.out.println("");
        System.out.println("El array de pares es de " + contapar + " cajones");
        int[] pares = new int[contapar];
        for (i = 0; i < (notas.length); i++) {
            if (notas[i] % 2 == 0) {
                pares[k] = notas[i];
                k++;
            }
        }
        for (k = 0; k < (pares.length); k++) {
            System.out.print(pares[k] + "||");
        }
    


}

}
