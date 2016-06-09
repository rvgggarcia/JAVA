package cl.curso.java.guia_10;

public class EmpleadoComision extends Empleado {
	
	private int cantidadDeVentas;
	private int sueldoBase;
	

	public EmpleadoComision() {	
	}
	

	public EmpleadoComision(String nombre, int horasTrabajadas) {
		super(nombre, horasTrabajadas);
		
	}
	
	public EmpleadoComision(int cantidadDeVentas, int sueldoBase) {
		super();
		this.cantidadDeVentas = cantidadDeVentas;
		this.sueldoBase = sueldoBase;
	}
	
	public EmpleadoComision(String nombre, int horasTrabajadas, int cantidadDeVentas, int sueldoBase) {
		super(nombre, horasTrabajadas);
		this.cantidadDeVentas=cantidadDeVentas;
		this.sueldoBase=sueldoBase;
		
	}

	public int getCantidadDeVentas() {
		return cantidadDeVentas;
	}

	public void setCantidadDeVentas(int cantidadDeVentas) {
		this.cantidadDeVentas = cantidadDeVentas;
	}

	public int getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}


	@Override
	public void calcularSalario() {
		int salario= sueldoBase+(cantidadDeVentas*9000);
		System.out.println("El sueldo del empleado POR COMISION este mes es de: " + salario);

	}

}
