public class Ej04For {

    /*
     * 4. Búsqueda del número mayor en un Array
     * Consigna: Dado un array de números enteros, utiliza un bucle for para
     * encontrar y mostrar el valor más alto almacenado en él.
     * 
     * Entrada: int[] numeros = {12, 45, 7, 89, 23};
     * 
     * Pista: Asume que el primer elemento es el mayor y compáralo con el resto de
     * elementos usando un for.
     * 
     * Resultado esperado: "Número mayor: 89"
     */

    public static void main (String[] args) {

        int[] numeros = {12,45,7,89,23};
        int mayor = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("El mayor número encontrado en el Array es el " + mayor);

    }

}
