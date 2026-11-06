public class Ej03While {
    /*
     * 3. Impresión de elementos de un array
     * Consigna: Dado un array unidimensional de números enteros, utiliza un bucle
     * while para mostrar cada uno de sus elementos en la consola.
     * 
     * Entrada: int[] numeros = {2, 4, 6, 8};
     * 
     * Pista: Usa una variable índice que comience en 0 y aumente en cada iteración
     * mientras sea menor que la longitud del array (numeros.length).
     * 
     * Resultado esperado: 2, 4, 6, 8
     */

    public static void main(String[] args) {

        int[] numbers = { 2, 4, 6, 8 };
        int index = 0;

        while (index < numbers.length) {
            if (index < (numbers.length - 1)) {
                System.out.print(numbers[index] + ", ");
            } else {
                System.out.print(numbers[index]);
            }
            index++;
        }
    }
}
