public class Ej07Fundamentos {
    public static void main(String[] args) {

        /*
         * Consigna: Dada una plantilla de texto con marcadores entre corchetes (ej.
         * "Hola [NOMBRE], tu código de acceso es [CODIGO]."), reemplaza los marcadores
         * por valores reales almacenados en variables.
         * 
         * Entrada: Plantilla anterior, nombre: "Carlos", código: "9876" Pista: Encadena
         * múltiples llamadas a replace(). Resultado esperado:
         * "Hola Carlos, tu código de acceso es 9876."
         */

        String template = "Hola [NOMBRE], tu código de acceso es [CODIGO].";
        String name = "Carlos";
        String code = "9876";

        template = template.replace("[NOMBRE]", name);
        template = template.replace("[CODIGO]", code);

        System.out.println(template);

    }
}
