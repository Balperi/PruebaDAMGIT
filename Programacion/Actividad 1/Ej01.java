import java.util.Scanner;

public class Ej01 {

    /*
     * ▸ Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente (<=4),
     * Suficiente (5),
     * Bien (6), Notable (7-8) y Sobresaliente (9-10).
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("¿Nota?");
        int nota = scan.nextInt();

        if (nota <= 4) {
            System.out.println("Insuficiente");
        } else if (nota == 5) {
            System.out.println("Suficiente");
        } else if (nota == 6) {
            System.out.println("Bien");
        } else if (nota <= 8) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }
    }
}
