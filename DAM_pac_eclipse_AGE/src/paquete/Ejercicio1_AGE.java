package paquete;
import java.util.*;
public class Ejercicio1_AGE {

	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		boolean proyectosTerminados = false;
		
		System.out.println("Vamos a realizar una auditor�a:");
		System.out.print("Indique el salario del jefe: ");
		int salarioJefe = teclado.nextInt();
		System.out.print("Indique el salario del encargado: ");
		int salarioEncargado = teclado.nextInt();
		System.out.print("Indique el salario de los oficinistas: ");
		int salarioOficinistas = teclado.nextInt();
		System.out.print("Indique su n�mero: ");
		int numeroOficinistas = teclado.nextInt();
		
		teclado.nextLine();
		System.out.print("�Est�n terminados los proyectos? ");
		String respuesta = teclado.nextLine();
		
		if(respuesta.equalsIgnoreCase("si")) {
			proyectosTerminados = true;
		} 
		System.out.println("�Cu�l es el presupuesto de la empresa?");
		int presupuestoEmpresa = teclado.nextInt();
		
		auditoriaEmpresa(salarioJefe, salarioEncargado, salarioOficinistas, numeroOficinistas, proyectosTerminados, presupuestoEmpresa);

	}

	public static boolean auditoriaEmpresa(int salarioJefe, int salarioEncargado, 
            int salarioOficinistas, int numeroOficinistas, 
            boolean proyectosTerminados, int presupuestoEmpresa) {

			if(!proyectosTerminados) {
				System.out.println("No ha pasado la auditor�a ya que no ha terminado los proyectos acordados");
				return false;
			}
			
			int gastoSueldos = salarioJefe + salarioEncargado + (salarioOficinistas * numeroOficinistas);
			
			if(gastoSueldos > 20000) {
				System.out.println(" No ha pasado la auditor�a ya que el gasto en personal es de " + gastoSueldos + " y excede el l�mite mensual de 20.000 euros");
				return false;
			} else {
				
				if(presupuestoEmpresa > 100000) {
					System.out.println("No ha pasado la auditor�a ya que el presupuesto asignado de" + presupuestoEmpresa + "excede el l�mite establecido en 100.000 euros");
					return false;
				} else {
					System.out.println("Enhorabuena!! Ha pasado la auditor�a, nos vemos el a�o que viene");
					return true;
				}
			}			
	}
	
	
}
