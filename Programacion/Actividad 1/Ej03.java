import java.util.Scanner;

public class Ej03 {

    /*
     * Para que tres números enteros den un triángulo válido, se tiene que dar la
     * circunstancia de que la suma de dos cualquiera de los tiene que ser mayor que
     * la
     * del otro, en todas las combinaciones posibles. Por tanto, el ejercicio consta
     * de:
     * • Pedir tres números por consola, e informar si el triángulo es correcto, o
     * no
     * es correcto.
     * • Y si es correcto además decir si es:
     * ▪ Equilátero: los tres lados iguales.
     * ▪ Isósceles: dos iguales y uno desigual
     * ▪ Escaleno: los tres lados distintos
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Tamaño lado uno:");
        int lado1 = scan.nextInt();
        System.out.println("Tamaño lado dos:");
        int lado2 = scan.nextInt();
        System.out.println("Tamaño lado tres:");
        int lado3 = scan.nextInt();

        if (((lado1 + lado2) > lado3) && ((lado1 + lado3) > lado2) && ((lado2 + lado3) > lado1)) {
            System.out.println("Triánulo correcto.");
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triángulo equilátero.");
            } else if ((lado1 == lado2 && lado1 != lado3) || (lado1 == lado3 && lado1 != lado2) || (lado2 == lado3 && lado1 != lado3)) {
                System.out.println("Triángulo isósceles.");
            } else {
                System.out.println("Triángulo escaleno.");
            }
        } else {
            System.out.println("Triángulo incorrecto.");
        }
    }
}
