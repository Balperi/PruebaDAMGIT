import java.util.Scanner;

public class Ej1 {

    /*
     * 1. Leer números, de uno en uno, hasta que se introduzca un 0. Para cada uno
     * indicar si es par o impar. Al final del proceso Escribir, cuantos números
     * pares
     * hemos leído, cuantos números impares, cuanto suman los pares y cuanto suman
     * los impares.
     */

    public static void main(String[] args) {

        int contadorPar = 0;
        int contadorImpar = 0;
        int sumaPar = 0;
        int sumaImpar = 0;
        int numero;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Dame un número. 0 para salir.");
        numero = scanner.nextInt();

        while (numero != 0) {
            
            if (numero == 0) {
                break;
            } else if (numero % 2 == 0) {
                sumaPar = sumaPar + numero;
                contadorPar++;
                System.out.println("El número " + numero + " es par.");
            } else {
                sumaImpar = sumaImpar + numero;
                contadorImpar++;
                System.out.println("El número " + numero + " es impar.");
            }

            System.out.println("Dame un número. 0 para salir.");
            numero = scanner.nextInt();
        } 

        System.out.println("Has escrito " + contadorPar + " números pares y " + contadorImpar + " números impares.");
        System.out.println("Suma pares: " + sumaPar);
        System.out.println("Suma impares: " + sumaImpar);

    }

}
