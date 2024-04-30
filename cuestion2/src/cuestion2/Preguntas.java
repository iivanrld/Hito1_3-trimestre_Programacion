package cuestion2;
import java.io.*;
import java.util.*;

public class Preguntas {
    private static final String preguntas_FILE = "cuestio2/cuestion2/preguntas.txt";
    private static final String respuestas_FILE = "cuestion2/cuestion2/respuestas.txt";

    public static void main(String[] args) {
        List<String> preguntas = leerArchivo(preguntas_FILE);
        List<String> respuestas = leerRespuestas(respuestas_FILE);

        if (preguntas.size() != respuestas.size()) {
            System.out.println("Error: El número de preguntas y respuestas no coincide.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        double puntuacion = 0;

        for (int i = 0; i < preguntas.size(); i++) {
            String pregunta = preguntas.get(i);
            String respuesta = respuestas.get(i);

            System.out.println("Pregunta " + (i + 1) + ": " + pregunta);
            System.out.print("Tu respuesta: ");
            String respuestaUsuario = scanner.nextLine();

            if (respuestaUsuario.equalsIgnoreCase(respuesta)) {
                System.out.println("¡Respuesta correcta! +1 punto");
                puntuacion += 1;
            } else {
                System.out.println("Respuesta incorrecta. -0.5 puntos");
                puntuacion -= 0.5;
            }
        }

        System.out.println("Tu puntuación final es: " + puntuacion);

        if (puntuacion > 5) {
            System.out.println("¡Felicidades! Has aprobado.");
        } else {
            System.out.println("Lo siento, no has aprobado.");
        }

        scanner.close();
    }

    private static List<String> leerArchivo(String nombreArchivo) {
        List<String> lineas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lineas;
    }

    private static List<String> leerRespuestas(String nombreArchivo) {
        List<String> respuestas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                respuestas.add(linea.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return respuestas;
    }
}