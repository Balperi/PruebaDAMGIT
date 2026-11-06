public class Ej04While {
    /*
     * 4. Suma acumulativa hasta un límite
     * Consigna: Utiliza un bucle while para sumar los números enteros consecutivos
     * desde el 1 en adelante hasta que la suma total sea mayor o igual a 10, y
     * muestra el valor final de la suma.
     * 
     * Entrada: Ninguna (límite interno de 10)
     * 
     * Pista: Usa una variable contador y una variable acumuladora dentro del while.
     * 
     * Resultado esperado: "Suma total: 10"
     */
    public static void main(String[] args) {

        int suma = 0;
        int contador = 1;

        while (suma < 10) {
            suma = suma + contador;
            contador++;
        }
        System.out.println("Suma total: " + suma);
    }
}
