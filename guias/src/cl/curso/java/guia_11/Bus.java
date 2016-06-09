/**
 * 
 */
package cl.curso.java.guia_11;

/**
 * @author Royerliz
 *
 */
public class Bus {

	private String nombre;
	private Asiento[] asiento;

	public Bus() {

	}

	public Bus(String nombre, Asiento[] asiento) {
		super();
		this.nombre = nombre;
		this.asiento = asiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Asiento[] getAsiento() {
		return asiento;
	}

	public void setAsiento(Asiento[] asiento) {
		this.asiento = asiento;
	}
	
	/**
	 * 
	 * @param numeroDeAsiento
	 * Este metodo permite de manera sincronizada reservar asientos en un bus. Si el asiento no esta reservado, se puede 
	 * reservar, de lo contrario mostrara un mensaje diciendo que el asiento ya esta ocupado.
	 */

	public synchronized void reservarAsiento(int numeroDeAsiento) {

		if (!this.getAsiento()[numeroDeAsiento].isReservado()) {
			this.getAsiento()[numeroDeAsiento].setReservado(true);
			System.out.println("Asiento " + numeroDeAsiento + " reservado con exito");
		} else {
			System.out.println("NO es posible procesar su reserva. El asiento nro: " + numeroDeAsiento + " ya esta reservado");
		}

	}
}
