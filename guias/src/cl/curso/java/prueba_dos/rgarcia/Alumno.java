/**
 * 
 */
package cl.curso.java.prueba_dos.rgarcia;

/**
 * @author Royerliz
 *
 */
public class Alumno implements Imprimible {

	private String nombre;
	private double promedio;

	public Alumno() {

	}

	public Alumno(String nombre, double promedio) {
		super();
		this.nombre = nombre;
		this.promedio = promedio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	@Override
	public void imprimir() {
		System.out.println(nombre);
		System.out.println(promedio);

	}

}
