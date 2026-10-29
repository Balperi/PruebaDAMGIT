public class Ejercicio02Nested {
    /*
     * 2. Validación de credenciales de usuario (String)
     * Consigna: Dados dos textos que representan un rol de usuario y una
     * contraseña, utiliza if anidados para validar el acceso. Primero verifica si
     * el rol es exactamente "admin". Si es correcto, anida otro if para verificar
     * si la contraseña es "secreto123". Si ambos coinciden, muestra
     * "Acceso concedido". Si la contraseña falla, muestra "Contraseña incorrecta".
     * Si el rol no es admin, muestra "Usuario no reconocido".
     * 
     * Entrada: String rol = "admin"; String password = "secreto123";
     * 
     * Pista: Usa el método equals() dentro de otro bloque condicional if.
     * 
     * Resultado esperado: "Acceso concedido"
     */
    public static void main (String[] args) {
        String rol = "Admin";
        rol = rol.toLowerCase();
        String contrasena = "secreto1234";

        if (rol.equals("admin")) {
            if (contrasena.equals("secreto1234")){
                System.out.println("Acceso concedido.");
            } else {
                System.out.println("Contraseña errónea.");
            }
        } else {
            System.out.println("Usuario no reconocido.");
        }
    }
}
