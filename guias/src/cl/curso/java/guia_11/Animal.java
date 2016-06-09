/**
 * 
 */
package cl.curso.java.guia_11;

/**
 * @author Royerliz
 *
 */
public class Animal implements Runnable {

	private String nombre;
	private int velocidad;
	private long descanso;
	private int posicion;
	private static boolean carreraFinalizada;

	public Animal() {

	}

	public Animal(String nombre, int velocidad, long descanso, int posicion, boolean carreraFinalizada) {
		super();
		this.nombre = nombre;
		this.velocidad = velocidad;
		this.descanso = descanso;
		this.posicion = posicion;
		Animal.carreraFinalizada = carreraFinalizada;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public long getDescanso() {
		return descanso;
	}

	public void setDescanso(long descanso) {
		this.descanso = descanso;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public static boolean isCarreraFinalizada() {
		return carreraFinalizada;
	}

	public void setCarreraFinalizada(boolean carreraFinalizada) {
		Animal.carreraFinalizada = carreraFinalizada;
	}

	@Override
	public void run() {

		while (!carreraFinalizada) {

			if (this.getPosicion() >= 100) {
				Animal.carreraFinalizada = true;
				System.out.println("La carrera ha terminado. El ganador es : " + this.getNombre());
			} else {
				this.setPosicion(this.getPosicion() + this.getVelocidad());
				try {
					Thread.sleep((long) (0 + Math.random() * this.getDescanso()));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(this.getNombre() + " posicion :" + this.getPosicion());
			}
		}

	}
}