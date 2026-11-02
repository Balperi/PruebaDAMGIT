public class Ej03Fundamentos {
    public static void main(String[] args) {
        /*
         * Consigna: Crea un programa que determine mediante un valor booleano si un
         * cliente tiene derecho a un descuento. La regla es que el cliente recibe el
         * descuento si es socio O si el monto de su compra es mayor a 100.0. Evalúa la
         * condición en una sola variable boolean.
         * 
         * Entrada: boolean esSocio = false; y double montoCompra = 120.50; Pista:
         * Combina una comparación (>) con el operador lógico OR (||). Resultado
         * esperado: true
         */

        boolean discount;
        boolean socio = false;
        double amount = 120.50;

        if (socio || amount > 100) {
            discount = true;
            System.out.println("Descuento válido.");
        } else {
            discount = false;
            System.out.println("No elegible para descuento.");
        }

    }
}
