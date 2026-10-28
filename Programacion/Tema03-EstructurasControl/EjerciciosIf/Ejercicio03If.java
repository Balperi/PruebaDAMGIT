public class Ejercicio03If {
    /*
     * 3. Validador de correo electrónico básico
     * Consigna: Dado un texto que representa un correo electrónico, comprueba si
     * contiene el carácter @. Si lo contiene, muestra "Correo válido", de lo
     * contrario "Correo inválido".
     * 
     * Entrada: "usuario.gmail.com"
     * 
     * Pista: Usa el método contains("@") de String junto con un if.
     * 
     * Resultado esperado: "Correo inválido"
     */

    public static void main (String[] args) {
        String mail = "usuario@gmail.com";
        if (mail.contains("@")) {
            System.out.println("Cuenta de correo válida.");
        } else {
            System.out.println("Cuenta de correo inválida.");
        }
    }
}
