public class Ej01For {

    /*
     * 1. Tabla de multiplicar básica
     * Consigna: Dado un número entero, utiliza un bucle for para mostrar los
     * primeros 5 múltiplos de ese número (multiplicado del 1 al 5).
     * 
     * Entrada: int numero = 3;
     * 
     * Pista: Usa un bucle for (int i = 1; i <= 5; i++) y multiplica numero * i.
     * 
     * Resultado esperado: 3, 6, 9, 12, 15
     */

    public static void main(String[]args) {

        int numero = 3;
        
        for (int i = 1; i<=5; i++) {
            System.out.println(numero * i);
        }
    }
}
