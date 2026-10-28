public class Ejercicio05If {
    /*
     * 5. Verificador de palabra clave exacta
     * Consigna: Dado un texto, comprueba si es exactamente igual a la palabra
     * "admin" ignorando las mayúsculas o minúsculas. Si coincide, muestra
     * "Acceso permitido", de lo contrario "Acceso denegado".
     * 
     * Entrada: "ADMIN"
     * 
     * Pista: Utiliza el método equalsIgnoreCase("admin") con una estructura if.
     */

    public static void main (String[] args) {

        String palabra = "admin";
        if (palabra.equalsIgnoreCase("admin")) {
            System.out.println("Acceso permitido.");
        } else {
            System.out.println("Acceso denegado.");
        }
    }

}
