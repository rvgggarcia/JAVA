package cl.curso.java.guia_10;

public class ProgramaEmpleado {

	public static void main(String[] args) {
		EmpleadoContratado contratado= new EmpleadoContratado ("Manuel", 10);
		
		contratado.calcularSalario();
		
		EmpleadoComision comision= new EmpleadoComision ("Joaquin", 10, 39, 20000);
		
		comision.calcularSalario();

	}

}
