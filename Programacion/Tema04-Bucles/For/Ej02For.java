public class Ej02For {

    /*
     * 2. Recorrido de un array de notas
     * Consigna: Dado un array de notas escolares (números enteros), utiliza un
     * bucle for para recorrerlo e imprimir cada nota en la consola.
     * 
     * Entrada: int[] notas = {7, 8, 5, 10, 4};
     * 
     * Pista: Usa la estructura estándar for (int i = 0; i < notas.length; i++).
     * 
     * Resultado esperado: Imprimir cada nota una por una.
     */

    public static void main(String[] args) {

        int[] notas = {7,8,5,10,4};

        for (int i = 0; i<notas.length; i++) {
            System.out.println(notas[i]);
        }
    }
} 
