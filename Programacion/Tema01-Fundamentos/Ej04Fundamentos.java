public class Ej04Fundamentos {
    public static void main(String[] args) {

        /*
         * Consigna: Dado un correo electrónico, obtén únicamente el nombre del dominio
         * (lo que está justo después de la @).
         * 
         * Entrada: "usuario.ejemplo@gmail.com" Pista: Usa indexOf() para encontrar la @
         * y substring(). Resultado esperado: "gmail.com"
         */

        String email = "usuario.ejemplo@gmail.com";
        /*
         * Usamos indexOf() para buscar la posición de la letra o símbolo que
         * necesitamos.
         */
        System.out.println(email.indexOf("@"));
        String domain = email.substring(16);
        System.out.println(domain);
    }
}
