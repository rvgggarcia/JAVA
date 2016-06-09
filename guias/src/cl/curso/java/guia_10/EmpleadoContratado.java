package cl.curso.java.guia_10;

public class EmpleadoContratado extends Empleado {
	
	
	public EmpleadoContratado() {
		
	}

	public EmpleadoContratado(String nombre, int horasTrabajadas) {
		super(nombre, horasTrabajadas);
		
	}

	@Override
	public void calcularSalario() {
	 int salario= this.getHorasTrabajadas()*20000;
	 System.out.println("El sueldo del empleado CONTRATADO este mes es de : "+ salario);

	}

}
