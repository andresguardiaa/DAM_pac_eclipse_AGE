package paquete;

public class Ejercicio1_AGE {

	public static void main(String[] args) {
		
		
		
		

	}

	public boolean auditoriaEmpresa(double salarioJefe, double salarioEncargado, 
            double salarioOficinistas, int numeroOficinistas, 
            boolean proyectosTerminados, double presupuestoEmpresa) {

			// Si los proyectos no se han terminado, devuelve false
			if (!proyectosTerminados) {
			System.out.println("No ha pasado la auditoría ya que no ha terminado los proyectos acordados.");
			return false;
			}
			
			// Cálculo del gasto acumulado en sueldos
			double gastoPersonal = salarioJefe + salarioEncargado + (salarioOficinistas * numeroOficinistas);
			
			// Comprobar si el gasto en personal supera el límite establecido
			if (gastoPersonal > 20000) {
			System.out.println("No ha pasado la auditoría ya que el gasto en personal es de " + gastoPersonal + 
			       " y excede el límite mensual de 20.000 euros.");
			return false;
			}
			
			// Comprobar si el presupuesto excede el límite establecido
			if (presupuestoEmpresa > 100000) {
			System.out.println("No ha pasado la auditoría ya que el presupuesto asignado de " + 
			       presupuestoEmpresa + " excede el límite establecido en 100.000 euros");
			return false;
			}
			
			// Si ha pasado todas las comprobaciones anteriores, la auditoría es apta
			System.out.println("Enhorabuena!! Ha pasado la auditoría, nos vemos el año que viene");
			return true;
	}
	
	
}
