public class Ejercicio02Switch {
    /*
     * 2. Acciones del semáforo
     * Consigna: Dado un carácter que representa el estado de un semáforo ('R' para
     * Rojo, 'A' para Amarillo, 'V' para Verde), usa un switch para mostrar la
     * acción que debe tomar el conductor ("Detenerse", "Precaución", "Avanzar").
     * 
     * Entrada: char semaforo = 'V';
     * 
     * Pista: Emplea un switch evaluando un char junto con break en cada caso.
     * 
     * Resultado esperado: "Avanzar"
     */
    public static void main(String[] args) {

        char semaforo = 'A';
        //Convertimos char en mayúscula para que valga R y r.
        semaforo = Character.toUpperCase(semaforo);

        switch (semaforo) {
            case ('R'):
                System.out.println("Detenerse.");
                break;
            case ('A'):
                System.out.println("Precaución.");
                break;
            case ('V'):
                System.out.println("Avanzar.");
                break;
            default:
                System.out.println("Código no admitido.");
        }
    }

}
