/**
 * 
 */
package cl.curso.java.control_cuatro.rgarcia;

/**
 * @author Royerliz
 *
 */
public class ReservarLibroThread extends Thread {

	private Libro libro;

	public ReservarLibroThread() {

	}

	public ReservarLibroThread(Libro libro) {
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
		this.getLibro().reservarLibro();
	}

}
