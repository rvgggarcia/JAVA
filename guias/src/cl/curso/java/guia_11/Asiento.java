/**
 * 
 */
package cl.curso.java.guia_11;

/**
 * @author Royerliz
 *
 */
public class Asiento extends Bus {

	private boolean reservado;

	public Asiento (){
		super();
		this.reservado=false;
		
	}

	public Asiento(boolean reservado) {
		super();
		this.reservado = reservado;
	}

	public boolean isReservado() {
		return reservado;
	}

	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}
	
	
	
}
