public class Ej06Fundamentos {
    public static void main(String[] args) {
        /*
         * Consigna: Dado un salario bruto diario y un porcentaje de retención de
         * impuestos (por ejemplo, 15%), calcula la cantidad exacta de dinero retenida y
         * el salario neto que recibe el empleado tras aplicar el descuento.
         * 
         * Entrada: double salarioBruto = 100.0; y double porcentajeImpuesto = 15.0;
         * Pista: Multiplica el bruto por el porcentaje dividido entre 100 para hallar
         * la retención, y luego réstasela al bruto. Resultado esperado: Retención =
         * 15.0, Salario neto = 85.0
         */

        double mainSalary = 100.0;
        double taxPercentage = 15.0;
        double tax = (mainSalary * taxPercentage) / 100;
        double netSalary = mainSalary - tax;

        System.out.println(tax);
        System.out.println(netSalary);

    }
}
