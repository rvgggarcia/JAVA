/**
 * 
 */
package cl.curso.java.control_cinco.rgarcia;

/**
 * @author Royerliz
 *
 */
public class Persona {
	private String rut;
	private String nombre;
	private String Apellido;
	private int edad;

	public Persona() {

	}

	public Persona(String rut, String nombre, String apellido, int edad) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		Apellido = apellido;
		this.edad = edad;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
