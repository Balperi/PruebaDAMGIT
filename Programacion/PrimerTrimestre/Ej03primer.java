import java.util.Scanner;

public class Ej03primer {

    /*
     * 3. Un cajero automático dispone de billetes de (no contemplamos monedas):
     * a) 50 €
     * b) 20 €
     * c) 10 €
     * d) 5 €
     * Crear un método que reciba una cantidad de dinero ( siempre múltiplos de 5) y
     * calcule cuántos billetes de cada tipo debe entregar, procurando utilizar el
     * menor
     * número posible de billetes.
     * Ejemplo: Para retirar 185 €, el cajero entregará 3 billetes de 50 €, 1 de 20
     * €, 1 de
     * 10 € y 1 de 5 €.
     * Requisitos:
     * ✓ La cantidad debe ser positiva y múltiplo de 5.
     * ✓ Utilizar divisiones enteras y el operador módulo.
     * ✓ Mostrar la cantidad de billetes de cada tipo.
     * ✓ No utilizar arrays para almacenar los tipos de billetes.
     * ✓ Se supone que el cajero siempre tiene billetes de todo tipo suficientes
     * para
     * devolver el dinero
     * ✓ Hacer el programa de forma que lea una cantidad tras otra, hasta que me
     * tecleen una cantidad negativa o cero.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int billete50 = 50;
        int billete20 = 20;
        int billete10 = 10;
        int billete5 = 5;

        int importe;

        int count50 = 0;
        int count20 = 0;
        int count10 = 0;
        int count5 = 0;

        boolean continuar = true;

        do {
            System.out.println("¿Cuánto dinero deseas sacar? Solo múltiplos de 5. 0 o negativo para salir.");
            importe = scanner.nextInt();

            if (importe <= 0) {
                System.out.println("Gracias por usar nuestro servicio.");
                continuar = false;
                
            } else  if (importe % 5 != 0){
                System.out.println("Importe no válido, sólo múltiplos de 5.");
    
            } else {

                while (importe > 0) {

                    if (importe / billete50 >= 1) {
                        count50 = importe / billete50;
                        importe = importe % billete50;

                    } else if (importe / billete20 >= 1) {

                        count20 = importe / billete20;
                        importe = importe % billete20;

                    } else if (importe / billete10 >= 1) {

                        count10 = importe / billete10;
                        importe = importe % billete10;
                        
                    } else if (importe / billete5 >= 1) {

                        count5 = importe / billete5;
                        importe = importe % billete5;
                    }

                }

                System.out.println(count50 + " billetes de 50 euros, " + count20 + " billetes de 20 euros, " + count10 + " billetes de 10 euros y " + count5 + " billetes de 5 euros.");
                count50 = 0;
                count20 = 0;
                count10 = 0;
                count5 = 0;
            }

        } while (continuar == true);

    }

}

