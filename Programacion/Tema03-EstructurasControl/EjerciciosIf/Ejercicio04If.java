public class Ejercicio04If {
    /*
     * 4. Verificación del primer elemento de un Array
     * Consigna: Dado un array unidimensional de números enteros, verifica si el
     * número almacenado en la primera posición (índice 0) es mayor que 10. Si es
     * así, imprime "Número alto", de lo contrario "Número bajo o igual".
     * 
     * Entrada: int[] numeros = {15, 8, 22, 4};
     * 
     * Pista: Accede al array usando la sintaxis numeros[0] dentro de una condición
     * if.
     * 
     * Resultado esperado: "Número alto"
     */

    public static void main(String[] args) {
        int [] numbers = {15, 8, 22, 4};
        if (numbers[0]>10) {
            System.out.println("Número alto.");
        } else {
            System.out.println("Número bajo o igual.");
        }
    }

}
