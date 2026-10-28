/*
 * 1. Validador de longitud de contraseña
 * Consigna: Dada una contraseña en formato de texto, verifica si tiene al menos
 * 8 caracteres. Si cumple la condición, el resultado debe indicar que es
 * válida; de lo contrario, que es muy corta.
 * 
 * Entrada: "java123"
 * 
 * Pista: Usa el método length() de String y una estructura condicional if-else.
 * 
 * Resultado esperado: "Contraseña muy corta"
 */

public class Ejercicio01If {
    public static void main(String[] args) {

        String password = "Vaca45";

        if (password.length() >= 8) {
            System.out.println("La contraseña es correcta.");
        } else {
            System.out.println("Contraseña demasiado corta.");
        }
    }
}
