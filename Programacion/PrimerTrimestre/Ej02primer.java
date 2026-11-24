public class Ej02primer {

    /*
     * 2. Desarrolla un programa que reciba un array de números enteros y determine:
     * a) Cuántos números son positivos.
     * b) Cuántos son negativos.
     * c) Cuántos son iguales a cero.
     * d) Cuántos son pares.
     * e) Cuántos son impares.
     * f) Cuál es el número mayor y el menor.
     * Ejemplo: int[] numeros = {5, -3, 0, 8, -7, 12, 0, 9};
     */

    public static void main (String[] args) {

        int[] numeros = {5, -3, 0, 8, -7, 12, 0, 9};
        int positivos = 0;
        int negativos = 0;
        int cero = 0;
        int par = 0;
        int impar = 0;
        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > 0) {
                positivos++;
            } else if (numeros[i] < 0) {
                negativos++;
            } else {
                cero++;
            }

            if (numeros[i]%2 == 0) {
                par++;
            } else {
                impar++;
            }

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            } 
            
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println(positivos +  " números positivos.");
        System.out.println(negativos +  " números negativos.");
        System.out.println(cero +  " números cero.");
        System.out.println(par +  " números pares.");
        System.out.println(impar +  " números impares.");
        System.out.println(mayor +  " es el mayor número encontrado.");
        System.out.println(menor +  " es el menor número encontrado.");
    }
}
