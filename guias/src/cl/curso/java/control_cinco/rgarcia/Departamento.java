/**
 * 
 */
package cl.curso.java.control_cinco.rgarcia;

/**
 * @author Royerliz
 *
 */
public class Departamento {
	private String nombre;
	private String descripcion;

	public Departamento() {

	}

	public Departamento(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Comparara si dos departamento son iguales según su nombre
	 */

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Departamento) {
			Departamento departamento = (Departamento) obj;
			return this.getNombre().equals(departamento.getNombre());
		}
		return false;
	}

}
