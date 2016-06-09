/**
 * 
 */
package cl.curso.java.control_cuatro.rgarcia;

/**
 * @author Royerliz
 *
 */
public class DevolverLibroThread extends Thread {

	private Libro libro;

	public DevolverLibroThread() {

	}

	public DevolverLibroThread(Libro libro) {
		super();
		this.libro = libro;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	@Override
	public void run() {
		this.getLibro().devolverLibro();
	}

}
