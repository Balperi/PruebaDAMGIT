public class Ejercicio01Switch {
    /*
     * 1. Traductor de días laborables
     * Consigna: Dado un número entero del 1 al 5 que representa un día de la semana
     * (1: Lunes, 2: Martes, 3: Miércoles, 4: Jueves, 5: Viernes), utiliza una
     * estructura switch para imprimir el nombre correspondiente del día. Si el
     * número está fuera de ese rango, muestra "Día no válido".
     * 
     * Entrada: int dia = 3;
     * 
     * Pista: Usa un switch evaluando la variable numérica con casos (case 1:, case
     * 2:, etc.) y un bloque default.
     * 
     * Resultado esperado: "Miércoles"
     */

    public static void main (String[] args) {

        int diaSemana = 5;

        switch (diaSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día no válido.");
                break;                            
        }
    }
}
