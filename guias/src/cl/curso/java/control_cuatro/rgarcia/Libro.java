/**
 * 
 */
package cl.curso.java.control_cuatro.rgarcia;

/**
 * @author Royerliz
 *
 */
public class Libro {
	private String nombre;
	private String editorial;
	private int cantidadLibros;
	private int cantidadLibrosPrestados;

	public Libro() {

	}

	public Libro(String nombre, String editorial, int cantidadLibros, int cantidadLibrosPrestados) {
		super();
		this.nombre = nombre;
		this.editorial = editorial;
		this.cantidadLibros = cantidadLibros;
		this.cantidadLibrosPrestados = cantidadLibrosPrestados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getCantidadLibros() {
		return cantidadLibros;
	}

	public void setCantidadLibros(int cantidadLibros) {
		this.cantidadLibros = cantidadLibros;
	}

	public int getCantidadLibrosPrestados() {
		return cantidadLibrosPrestados;
	}

	public void setCantidadLibrosPrestados(int cantidadLibrosPrestados) {
		this.cantidadLibrosPrestados = cantidadLibrosPrestados;
	}

	/**
	 * Este metodo permite reservar un libro, sumando uno (1) a la cantidad de
	 * libros prestados, siempre y cuando la reserva no supere la cantidad de
	 * libros existentes
	 */

	public synchronized void reservarLibro() {

		if (this.cantidadLibrosPrestados < this.cantidadLibros) {
			this.cantidadLibrosPrestados = this.cantidadLibrosPrestados + 1;
			System.out.println("LIBRO RESERVADO CON EXITO ");

		} else {
			System.out.println("NO HAY MAS LIBROS PARA PRESTAR");
		}

	}

	/**
	 * Este metodo devuelve un libro prestado, restando (1) a la cantidad de
	 * libros prestados siempre y cuando la cantidad de libros prestados se sea
	 * mayor a uno.
	 */

	public synchronized void devolverLibro() {

		if (this.cantidadLibrosPrestados > 0) {
			this.cantidadLibrosPrestados = this.cantidadLibrosPrestados - 1;
			System.out.println("LIBRO DEVUELTO CON EXITO ");
		} else {
			System.out.println("NO TIENE MAS LIBROS QUE DEVOLVER");
		}

	}

}
