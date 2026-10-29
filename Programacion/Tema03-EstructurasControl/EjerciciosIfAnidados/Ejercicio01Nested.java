public class Ejercicio01Nested {
    /*
     * 1. Clasificación por edad y etapa de vida
     * Consigna: Dado un número entero que representa la edad de una persona,
     * utiliza if anidados para clasificarla: si la edad es menor de 18, evalúa si
     * es menor de 12 para mostrar "Niño", de lo contrario "Adolescente". Si la edad
     * es 18 o más, evalúa si es menor de 65 para mostrar "Adulto", de lo contrario
     * "Adulto mayor".
     * 
     * Entrada: int edad = 25;
     * 
     * Pista: Usa un if-else principal para separar menores y mayores de edad, y
     * coloca otro if-else dentro de cada bloque.
     * 
     * Resultado esperado: "Adulto"
     */

    public static void main (String[] args) {

        int age = 80;

        if (age<18) {
            if (age <12) {
                System.out.println("Niño.");
            } else {
                System.out.println("Adolescente.");
            }
        } else {
            if (age<65) {
                System.out.println("Adulto.");
            } else {
                System.out.println("Adulto mayor.");
            }
         }
    }
}
