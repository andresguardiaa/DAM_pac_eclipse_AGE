package paquete;
import java.util.*;
public class Ejercicio3_AGE {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double velocidad = 0;
		double distancia = 0;
		int calorias = 0;
		int maxCal = 0;
		double maxDis = 0.00;
		int caloriasTotales = 0;
		double distanciaTotal = 0.00;
		
		
		System.out.println("Introduce tu nombre:");
		String nombre = teclado.next();
		System.out.println("Introduce tu edad:");
		int edad = teclado.nextInt();
		System.out.println("Introduce tu peso:");
		double peso = teclado.nextDouble();
		System.out.println("Introduce tu altura:");
		double altura = teclado.nextDouble();
		System.out.println("Introduce tu sexo:");
		String sexo = teclado.next();
		System.out.println("Indica la velocidad media inicial");
		double velocidadInicial = teclado.nextDouble();
		System.out.println("Indica la distancia media inicial");
		double distanciaInicial = teclado.nextDouble();
		System.out.println("Indica el promedio de calorias quemadas inicial");
		int caloriasQuemadasIniciales = teclado.nextInt();
		
		double imc = peso / (altura * 2);
		
		System.out.println("Indique los siguientes datos de las últimas sesiones:");
		for(int i = 0; i < 10; i ++) {
			System.out.println("\n Sesión nº " + i);
			System.out.println("Velocidad media:");
			velocidad += teclado.nextDouble();
			System.out.println("Distancia recorrida:");
			distancia = teclado.nextDouble();
			if(maxDis < distancia) {
				maxDis = distancia;
			}
			distanciaTotal += distancia;
			System.out.println("Calorías quemadas");
			calorias = teclado.nextInt();
			if(maxCal < calorias) {
				maxCal = calorias;
			}
			caloriasTotales += calorias;
		}
		
		 
		
		System.out.println("Hola " + nombre + ", te presentamos la ficha de seguimiento de entrenamiento:"
				+ "\n\nEdad: " + edad
				+ "\nPeso: " + peso + "Kg"
				+ "\nAltura: " + altura + "cm"
				+ "\nSexo: " + sexo
				+ "\n Índice de masa corporal: " + imc);
		System.out.println("\nLa media del entrenamiento en 10 sesiones es:"
				+ "\nVelocidad: " + (velocidad/10) + "km/h" 
				+ "\nDistancia recorrida: " + (distanciaTotal/10) + "km"
				+ "\nCalorías qumeadas: " + (caloriasTotales /10)
				+ "\nMáxima distancia recorrida: " + maxDis
				+ "\nMáximo número de calorías quemadas en una sesión: " + maxCal );
		
		if(velocidadInicial < (velocidad/10) || caloriasQuemadasIniciales < (calorias/10)) {
			System.out.println("Enhorabuena! Has superado tu media inicial.");
		}
		
	}

	
}
