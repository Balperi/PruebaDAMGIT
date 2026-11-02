public class Ej05Fundamentos {
    public static void main(String[] args) {

        /*
         * Consigna: Dado un nombre con espacios sobrantes al inicio/final y en
         * minúsculas (ejemplo: " juan perez "), límpialo de espacios extremos,
         * convierte la primera letra en mayúscula y el resto mantenlo igual.
         * 
         * Entrada: " juan perez " Pista: Usa trim(), substring(), toUpperCase() y
         * concatenación +. Resultado esperado: "Juan perez"
         */

        String name = "  juan Perez ";
        name = name.trim();
        String[] partName = name.split(" ");
        String firstName = (partName[0].substring(0, 1).toUpperCase() + partName[0].substring(1).toLowerCase());
        String lastName = (partName[1].substring(0, 1).toUpperCase() + partName[1].substring(1).toLowerCase());
        String capitalName = firstName + " " + lastName;
        System.out.print(capitalName);

    }
}
