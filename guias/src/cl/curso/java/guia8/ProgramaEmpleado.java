package cl.curso.java.guia8;


public class ProgramaEmpleado {

	public static void main(String[] args) {
		
		Empleado empleado1= new Empleado ( "juanito", 202115292, 250000,10000,5);
		
		
		System.out.println("El sueldo liquido es: "+ empleado1.sueldoLiquido());
		System.out.println("El sueldo bruto es: "+ empleado1.sueldoBruto());
		
	
	}

}
