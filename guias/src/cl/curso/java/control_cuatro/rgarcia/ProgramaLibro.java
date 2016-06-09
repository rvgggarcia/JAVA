/**
 * 
 */
package cl.curso.java.control_cuatro.rgarcia;

/**
 * @author Royerliz
 *
 */
public class ProgramaLibro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Libro libro = new Libro("El guerrero", "Larense", 2, 1);

		ReservarLibroThread reservar1 = new ReservarLibroThread(libro);
		ReservarLibroThread reservar2 = new ReservarLibroThread(libro);
		ReservarLibroThread reservar3 = new ReservarLibroThread(libro);
		reservar1.start();
		reservar2.start();
		reservar3.start();

		DevolverLibroThread devolver1 = new DevolverLibroThread(libro);
		DevolverLibroThread devolver2 = new DevolverLibroThread(libro);
		DevolverLibroThread devolver3 = new DevolverLibroThread(libro);
		devolver1.start();
		devolver2.start();
		devolver3.start();

	}

}
