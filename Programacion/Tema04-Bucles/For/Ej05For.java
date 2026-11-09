public class Ej05For {

    /*
     * 5. Conteo de una letra en un String
     * Consigna: Dado un texto y un carácter específico, utiliza un bucle for para
     * contar cuántas veces se repite ese carácter en el texto.
     * 
     * Entrada: String texto = "programacion"; char letra = 'r';
     * 
     * Pista: Recorre el string con un for usando charAt(i) y compara cada carácter
     * con la variable letra.
     * 
     * Resultado esperado: "La letra 'r' aparece 2 veces"
     */

    public static void main(String[] args) {

        String texto = "programacion";
        char letra = 'r';
        int veces = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == letra) {
                veces++;
            }
        }

        System.out.println("La letra '" + letra + "' aparece " + veces + " veces.");
    }
}
