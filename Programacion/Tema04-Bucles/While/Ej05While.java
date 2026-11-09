public class Ej05While {
    /*
     * 5. Conteo de números pares en un Array
     * Consigna: Dado un array de números enteros, utiliza un bucle while para
     * contar cuántos números pares contiene.
     * 
     * Entrada: int[] numeros = {3, 4, 7, 8, 10};
     * 
     * Pista: Recorre el array con un índice evaluando si numeros[indice] % 2 == 0
     * dentro del while.
     * 
     * Resultado esperado: "Cantidad de pares: 3"
     */

    public static void main(String[] args) {
        
        int[] numeros = {3,4,7,8,10};
        int contador = 0;
        int par = 0;

        while (contador < numeros.length) {
            if (numeros[contador]%2 == 0) {
                par ++;
            }
            contador++;
        }

        System.out.println("Cantidad de pares: " + par);
    }

}
