public class Ej03For {

    /*
     * 3. Inversión de un texto (String)
     * Consigna: Dado un texto, utiliza un bucle for para recorrerlo desde el último
     * carácter hasta el primero, imprimiendo el texto invertido.
     * 
     * Entrada: String texto = "hola";
     * 
     * Pista: Inicia el bucle for en texto.length() - 1 y decrementa i hasta 0
     * usando charAt(i).
     * 
     * Resultado esperado: "aloh"
     */

        public static void main(String[] args) {
        String texto = "hola";

        for (int i = texto.length() -1; i>=0; i--) {
            System.out.print(texto.charAt(i));
        }
    }
}
