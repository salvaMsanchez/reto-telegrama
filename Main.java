package salva.telegrama;

public class Main {

    static java.util.Scanner in;

    static String[] letrasMorse = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "!", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "?"};
    static int[] duracionMorse = {5, 9, 11, 7, 1, 9, 9, 7, 3, 13, 9, 9, 7, 19, 5, 11, 11, 13, 7, 5, 3, 7, 9, 9, 11, 13, 11, 15};

    public static void  casoDePrueba() {

        in = new java.util.Scanner(System.in);

        String frase;

        do {
            frase = in.nextLine();
            // Se garantiza que no aparecen dos espacios seguidos, y que la línea no empieza ni termina en espacio.
            frase = frase.trim().toUpperCase(); // Quitar espacios al inicio y fin y pasar a mayúsculas.
            frase = frase.replaceAll("\\s+", " "); // Eliminar espacios consecutivos dentro del String.
            // Limitación de la entrada a 80 caracteres.
            if (frase.length() > 80) {
                frase = frase.substring(0, 80);
            }
        } while (!frase.matches("[A-Z !?]{1,80}"));

        String[] palabras = frase.split("\\s+"); // División de la frase en palabras.

        int sumaPuntosMorse = 0;
        int sumaPorSeparacionLetra = 3;
        int sumaPorSeparacionPalabra = 5;
        // Iteración por palabras.
        for (int i = 0; i < palabras.length; i++) {
            // Sumar 5 puntos por separación de palabra. Se detecta que no sea la última palabra para sumar.
            if (!(i == palabras.length - 1)) {
                sumaPuntosMorse = sumaPuntosMorse + sumaPorSeparacionPalabra;
            }
            // Iteración por letras.
            for (int j = 0; j < palabras[i].length(); j++) {
                String letra = palabras[i].substring(j, j+1);
                // Iteración por array letrasMorse, el cual tiene correspondencia directa con el array duracionMorse.
                for (int k = 0; k < letrasMorse.length; k++) {
                    if (letra.equals(letrasMorse[k])) {
                        // Suma del valor de puntos de cada letra.
                        sumaPuntosMorse = sumaPuntosMorse + duracionMorse[k];
                        // Sumar 3 puntos por separación de letra. Se detecta que no sea la última letra para sumar.
                        if (!letra.equals(palabras[i].substring(palabras[i].length() - 1))) {
                            sumaPuntosMorse = sumaPuntosMorse + sumaPorSeparacionLetra;
                        }
                    }
                }
            }
        }

        System.out.println(sumaPuntosMorse);

    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();

    }
}