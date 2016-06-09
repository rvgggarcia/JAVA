/**
 * 
 */
package cl.curso.java.guia_11;

/**
 * @author Royerliz
 *
 */
public class ReservaThread extends Thread {
	private Bus bus;
	private int numeroDeAsiento;
	
	public ReservaThread (){
		
	}

	public ReservaThread(Bus bus, int numeroDeAsiento) {
		super();
		this.bus = bus;
		this.numeroDeAsiento = numeroDeAsiento;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public int getNumeroDeAsiento() {
		return numeroDeAsiento;
	}

	public void setNumeroDeAsiento(int numeroDeAsiento) {
		this.numeroDeAsiento = numeroDeAsiento;
	}

	@Override
	public void run() {
	
		this.getBus().reservarAsiento(this.getNumeroDeAsiento());
	}
	

}
