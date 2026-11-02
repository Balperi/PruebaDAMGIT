public class Ejercicio04SwitchFinal {
    /*
     * FINAL
     * ------
     * 
     * Calculadora de tarifas de envío con descuento VIP
     * Consigna: Calcula el costo final de un envío combinando switch e if. Primero,
     * utiliza un switch basado en la zona de destino ("Norte", "Centro", "Sur")
     * para definir un precio base (Zona Norte: 40, Zona Centro: 25, Zona Sur: 60).
     * Después, utiliza un if para comprobar si el cliente es VIP (esVip = true); si
     * lo es, aplica un descuento de 10 unidades al precio base. Finalmente, muestra
     * el precio final obtenido.
     * 
     * Entrada: String zona = "Centro"; boolean esVip = true;
     * 
     * Pista: Declara una variable numérica para el precio, usa el switch para
     * asignarle el valor inicial según el texto de la zona, y luego emplea un if
     * para restarle el descuento si la variable booleana es verdadera.
     * 
     * Resultado esperado: "Precio final: 15"
     */

    public static void main(String[] args) {

        int ticket = 0;
        boolean vip = true;
        String zona = "centro";

        zona = zona.toLowerCase();

        switch (zona) {
            case "norte":
                ticket = 40;
                break;
            case "centro":
                ticket = 25;
                break;
            case "sur":
                ticket = 60;
                break;
            default:
                System.out.println("Zona no válida.");
                return;
        }

        if (vip) {
            ticket = ticket - 10;
        }

        System.out.println("Precio final: " + ticket);

    }
}
