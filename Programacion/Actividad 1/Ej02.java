import java.util.Scanner;

public class Ej02 {

    /*
     * Leer tres números enteros de la consola y mostrarlos ordenados de mayor a
     * menor.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Número uno:");
        int num1 = scan.nextInt();
        System.out.println("Número dos:");
        int num2 = scan.nextInt();
        System.out.println("Número tres:");
        int num3 = scan.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.print(num1 + ", ");
                if (num2 > num3) {
                    System.out.print(num2 + ", ");
                    System.out.print(num3);
                } else {
                    System.out.print(num3 + ", ");
                    System.out.print(num2);
                }
            } else {
                System.out.print(num3 + ", ");
                System.out.print(num1 + ", ");
                System.out.print(num2);

            }
        } else {
            if (num2 > num3) {
                System.out.print(num2 + ", ");
                if (num1 > num3) {
                    System.out.print(num1 + ", ");
                    System.out.print(num3);
                } else {
                    System.out.print(num3 + ", ");
                    System.out.print(num1);
                }
            } else {
                System.out.print(num3 + ", ");
                System.out.print(num2 + ", ");
                System.out.print(num1);

            }
        }
    }
}
