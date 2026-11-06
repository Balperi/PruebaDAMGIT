public class Ej01While {
    /*
     * 1. Contador regresivo simple
     * Consigna: Dado un número entero inicial, utiliza un bucle while para imprimir
     * una cuenta regresiva hasta llegar a 0.
     * 
     * Entrada: int numero = 3;
     * 
     * Pista: Usa una estructura while (numero >= 0) decrementando la variable en
     * cada iteración.
     * 
     * Resultado esperado: 3, 2, 1, 0
     */

    public static void main(String[] args) {

        int number = 3;

        while (number > 0) {
            System.out.print(number + ", ");
            number--;
        }

        System.out.println("0");
    }
}
