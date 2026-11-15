public class Ej05 {
    /*
     * Crea una matriz de 3X3 (3 filas y tres columnas) de números del 1 al 9. Y
     * responder
     * a las siguientes preguntas:
     * • Por cada fila de la matriz, muestra cada número, y al final de cada fila
     * muestras la suma de sus números. Al final de la matriz, muestras la suma de
     * todos los números.
     * • Contar cuántos elementos son pares e impares en la matriz.
     * • Encontrar el valor mayor y el menor dentro de la matriz
     */

    public static void main(String[] args) {

        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int sumaTotal = 0;
        int par = 0;
        int impar = 0;
        int mayor = matriz[0][0];
        int menor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
                suma = suma + matriz[i][j];
                sumaTotal = sumaTotal + matriz[i][j];
                if (matriz[i][j] % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
            System.out.println("La suma de la fila es : " + suma);
        }

        System.out.println("La suma total de la matriz es: " + sumaTotal);
        System.out.println("El mayor número encontrado es: " + mayor);
        System.out.println("El menor número encontrado es: " + menor);
        System.out.println("Número de números pares: " + par);
        System.out.println("Número de números impares: " + impar);
    }
}
