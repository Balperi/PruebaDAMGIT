public class Ej02While {
    /*
     * 2. Contador de caracteres específicos
     * Consigna: Dado un texto, utiliza un bucle while y el método charAt() para
     * recorrer cada carácter y contar cuántas veces aparece la letra 'a'.
     * 
     * Entrada: String texto = "banana";
     * 
     * Pista: Usa un índice que empiece en 0 y un while (indice < texto.length()).
     * 
     * Resultado esperado: "Cantidad de 'a': 3"
     */

    public static void main(String[] args) {

        String word = "anaconda";
        int index = 0;
        int total = 0;

        while (index < word.length()) {
            if (word.charAt(index) == 'a') {
                total = total + 1;
            }
            index = index + 1;
        }

        System.out.println("Cantidad de 'a': " + total);
    }
}
