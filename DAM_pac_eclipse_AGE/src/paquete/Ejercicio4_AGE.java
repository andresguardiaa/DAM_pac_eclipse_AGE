package paquete;
import java.util.*;
public class Ejercicio4_AGE {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] arrayNombres = new String[20];
        int[] arrayPuntuacion = new int[20];

        for (int i = 0; i < arrayNombres.length; i++) {
            System.out.print("Introduce el nombre del equipo " + (i + 1) + ": ");
            arrayNombres[i] = scanner.nextLine();
        }

       
        for (int i = 0; i < arrayPuntuacion.length; i++) {
            arrayPuntuacion[i] = random.nextInt(66) + 35; // 100 - 35 + 1 = 66
        }

        
        int indiceGanador = 0;
        int indiceUltimo = 0;
        int sumaPuntos = 0;

        for (int i = 0; i < arrayPuntuacion.length; i++) {
            if (arrayPuntuacion[i] > arrayPuntuacion[indiceGanador]) {
                indiceGanador = i;
            }
            if (arrayPuntuacion[i] < arrayPuntuacion[indiceUltimo]) {
                indiceUltimo = i;
            }
            sumaPuntos += arrayPuntuacion[i];
        }

        double puntuacionMedia = sumaPuntos / 20.0;

        System.out.println("\n--- Resultados ---");
        System.out.println("Equipo ganador: " + arrayNombres[indiceGanador] + " con " + arrayPuntuacion[indiceGanador] + " puntos.");
        System.out.println("Último clasificado: " + arrayNombres[indiceUltimo] + " con " + arrayPuntuacion[indiceUltimo] + " puntos.");
        System.out.printf("Puntuación media: %.2f puntos.\n", puntuacionMedia);
        
        
        scanner.close();
    }
    
   
	
}
