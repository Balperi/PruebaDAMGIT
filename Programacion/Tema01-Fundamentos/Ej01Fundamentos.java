public class Ej01Fundamentos {
    public static void main(String[] args) {

		/*
		 * Consigna: Dada una frase y una palabra prohibida, reemplaza todas las
		 * apariciones de esa palabra por tres asteriscos (***), ignorando si está en
		 * mayúsculas o minúsculas en la búsqueda original (puedes asumir reemplazo
		 * exacto o convertir para buscar).
		 * 
		 * Entrada: "El lenguaje Java es genial. ¡Me encanta Java!" Pista: Usa
		 * replace(). Resultado esperado: "El lenguaje *** es genial. ¡Me encanta ***!"
		 */

		String phrase = "El lenguaje Java es genial. ¡Me encanta Java!";
		String modified = phrase.replace("Java", "***");
		System.out.println(modified);

	}

}

