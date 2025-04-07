package paquete;
import java.util.*;

public class Ejercicio2_AGE {
	public static void main(String[] args) {
		
		System.out.println(procesoSeleccion());

	}

	
	public static boolean procesoSeleccion() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indique su edad");
		int edad = teclado.nextInt();
		boolean contratado = true;
		double suma = 0.00;
		double nomina = 0.00;
		
		if(edad > 40) {
			System.out.println("Descartado el proceso de selecci�n");
			contratado = false;
		}else {
			
		teclado.nextLine();
		System.out.print("Indique su nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.println("\nIndique sus a�os trabajados: ");
		int a�os = teclado.nextInt();
		
		System.out.print("Indique su sueldo bruto anual del a�o anterior: ");
		int sueldoAnual = teclado.nextInt();
		
			if(sueldoAnual > 30000) {
				System.out.println("Descartado el proceso de selecci�n.");
				contratado = false;
			} else {
				System.out.println("Ha sido contratado");
				System.out.println("Indica sus �ltimas 5 n�minas: ");
				
				for(int i = 1; i <= 5; i++) {
					
					System.out.print("N�mina " + i + ": ");
					nomina = teclado.nextDouble();
					suma += nomina;
					
				}
				
				double media = suma / 5;
				if(media > 2500) {
					media = media + (media * 0.05);
					System.out.println("Su sueldo aumenta en un 5%: " + media);
				} else {
					media = media + (media * 0.1);
					System.out.println("Su sueldo aumenta en un 10%: " + Math.round(media * 100.0) / 100.0);
				}
				
			}
			
		}
		return contratado;
	}
}


