package cl.curso.java.guia_10;

public abstract class Empleado {
	
	private String nombre;
	private int horasTrabajadas;
	
	public Empleado (){
		
	}
	
	public Empleado(String nombre, int horasTrabajadas) {
		super();
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}


	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public abstract void calcularSalario ();
	

}
