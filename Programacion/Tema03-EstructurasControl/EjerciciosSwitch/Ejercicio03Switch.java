public class Ejercicio03Switch {

    /*
     * 3. Selector de menú de cafetería (String)
     * Consigna: Dado un texto que representa una opción de bebida pedida ("cafe",
     * "te", "jugo"), utiliza un switch compatible con cadenas de texto (String)
     * para mostrar el precio de la bebida elegida ("$2.00", "$1.50", "$3.00"). Si
     * la opción no existe, muestra "Producto no disponible".
     * 
     * Entrada: "te"
     * 
     * Pista: En Java moderno, puedes usar bloques switch directamente con String en
     * los casos (ej. case "te":).
     * 
     * Resultado esperado: "$1.50"
     * 
     * Resultado esperado: "Acceso permitido"
     */

    public static void main (String[] args) {

        String producto = "jugo";
        producto = producto.toLowerCase();

        switch (producto) {
            case "café":
            case "cafe":
                System.out.println("1.50€");
                break;
            case "jugo":
                System.out.println("2€");
                break;
            case "zumo natural":
                System.out.println("3€");
                break;
            default:
                System.out.println("Producto no disponible");
                break;


        }
    }

}
