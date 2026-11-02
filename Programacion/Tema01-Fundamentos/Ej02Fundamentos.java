public class Ej02Fundamentos {
    public static void main(String[] args) {

        /*
         * Generador de código/Acrónimo simple Consigna: Dadas tres palabras sueltas en
         * variables ("Java", "String", "Class"), crea un acrónimo de 3 letras en
         * mayúsculas tomando la primera letra de cada una.
         * 
         * Entrada: "java", "string", "class" Pista: Usa charAt() o substring() junto
         * con toUpperCase(). Resultado esperado: "JSC"
         */

        String word1 = "java";
        String word2 = "String";
        String word3 = "class";

        String capitalized1 = word1.substring(0, 1).toUpperCase();
        String capitalized2 = word2.substring(0, 1).toUpperCase();
        String capitalized3 = word3.substring(0, 1).toUpperCase();

        System.out.println(capitalized1 + capitalized2 + capitalized3);

    }

}
