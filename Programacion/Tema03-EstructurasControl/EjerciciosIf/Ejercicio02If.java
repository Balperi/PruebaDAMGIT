/*
* 2. Clasificador de notas escolares
* Consigna: Dado un número entero que representa la nota de un examen (de 0 a 10), 
* determina si el alumno está "Aprobado" (nota mayor o igual a 5) o "Suspenso" (nota menor a 5).
*
* Entrada: int nota = 7;
*
* Pista: Usa una variable numérica y un bloque if-else.
*
* Resultado esperado: "Aprobado"
*/

public class Ejercicio02If {
    public static void main(String[] args) {

        int nota = 7;

        if (nota < 5) {
            System.out.println("Suspenso.");
        } else {
            System.out.println("Aprobado.");
        }

    }

}
