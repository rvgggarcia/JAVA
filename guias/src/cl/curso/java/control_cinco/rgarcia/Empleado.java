/**
 * 
 */
package cl.curso.java.control_cinco.rgarcia;

/**
 * @author Royerliz
 *
 */
public class Empleado extends Persona {
	private Departamento departamento;
	private int salario;

	public Empleado() {

	}

	public Empleado(Departamento departamento, int salario) {
		super();
		this.departamento = departamento;
		this.salario = salario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;

	}
	
	/**
	 * Comparara si dos empleados son iguales según su rut
	 */

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Empleado) {
			Empleado empleado = (Empleado) obj;
			return this.getRut().equals(empleado.getRut());
		}
		return false;
	}

}
