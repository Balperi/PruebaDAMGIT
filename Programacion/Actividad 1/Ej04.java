import java.util.Random;
import java.util.Scanner;
public class Ej04 {
    /*
     * Realizar un juego para adivinar un número. Para ello pedir un número N
     * aleatorio
     * de 1 a 40, y luego ir pidiendo números indicando “mayor” o “menor” según sea
     * mayor o menor con respecto a N. El proceso termina cuando el usuario acierta.
     * Y escribimos la cantidad de intentos antes del número exacto
     */

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroBuscado = random.nextInt(40) + 1;
        int intentos = 0;

        System.out.println("Intenta adivinar el número secreto.");
        System.out.println("Escribe un número del 1 al 40:");

        while (true) {
            int numero = Integer.valueOf(scanner.nextLine());
            if (numero < numeroBuscado) {
                System.out.println("El número introducido es menor al buscado.");
                intentos ++;
            } else if (numero > numeroBuscado) {
                System.out.println("El número introducido es mayor al buscado.");
                intentos++;
            } else {
                System.out.println("¡Has acertado el número!");
                intentos++;
                System.out.println("Lo has conseguido en " + intentos + " intenos.");
                break;
            }
        }

    }

}
