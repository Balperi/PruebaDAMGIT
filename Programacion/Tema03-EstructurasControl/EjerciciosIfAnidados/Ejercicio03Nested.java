public class Ejercicio03Nested {
    /*
     * 3. Descuento comercial por membresía y monto
     * Consigna: Dado un valor que indica si un cliente es miembro VIP (booleano) y
     * un número entero que representa el valor de su compra, utiliza if anidados
     * para determinar su beneficio: si es VIP (true), verifica si su compra es
     * mayor a 100 para dar "Descuento del 20%", de lo contrario
     * "Descuento del 10%". Si no es VIP (false), verifica si su compra es mayor a
     * 100 para dar "Descuento del 5%", de lo contrario "Sin descuento".
     * 
     * Entrada: boolean esVip = true; int compra = 150;
     * 
     * Pista: Evalúa la variable booleana en el if principal y anida condiciones
     * numéricas en las ramas true y false.
     * 
     * Resultado esperado: "Descuento del 20%"
     */

    public static void main (String[] args) {

        boolean VIP = true;
        int importe = 200;
        int descuento = 0;
        double descuentoTotal=0;

        if (VIP) {
            if (importe > 100) {
                descuento = 20;
                System.out.println("Tienes un 20% de descuento.");
            } else {
                descuento = 10;
                System.out.println("Tiendes un 10% de descuento.");
            }
        } else {
            if (importe>100) {
                descuento = 5;
                System.out.println("Tienes un 5% de descuento.");
            } else {
                System.out.println("Sin descuento.");
            }
        }

        descuentoTotal = (1.0*descuento*importe)/100;
        double importeTotal = importe - descuentoTotal;
        System.out.println("El importe total es de" + importeTotal + " euros.");
    }
}
