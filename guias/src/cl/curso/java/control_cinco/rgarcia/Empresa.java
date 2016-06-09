/**
 * 
 */
package cl.curso.java.control_cinco.rgarcia;

import java.util.Iterator;
import java.util.List;

/**
 * @author Royerliz
 *
 */
public class Empresa {
	private String nombre;
	private List<Empleado> empleados;

	public Empresa() {

	}

	public Empresa(String nombre, List<Empleado> empleados) {
		super();
		this.nombre = nombre;
		this.empleados = empleados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	/**
	 * Ordena la lista segun el nombre (alfabetico)
	 */

	public void ordenarEmpleadosPorNombre() {

	}

	/**
	 * Ordena los empleados segun el departamento de trabajo
	 */

	public void ordenarEmpleadosPorDepartamento() {

	}

	/**
	 * Busca la informacion de un empleado a partir de un dato, en este caso el
	 * rut
	 * 
	 * @param rut
	 * @return
	 */

	public Empleado buscarEmpleado(String rut) {

		/**
		 * la siguiente linea esta puesta solo para que no me señale error el
		 * metodo, pero se que no es asi.
		 */
		Empleado empleado = new Empleado();
		return empleado;
	}

	/**
	 * imprime por consola la lista de empleados
	 */

	public void imprimir() {
		System.out.println("EMPLEADOS");

		Iterator<Empleado> iterator = this.getEmpleados().iterator();
		{

			while (iterator.hasNext()) {

				System.out.println(iterator.next());
			}

		}

	}

}
