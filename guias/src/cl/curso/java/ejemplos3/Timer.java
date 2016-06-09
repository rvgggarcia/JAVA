package cl.curso.java.ejemplos3;

public class Timer extends Thread {

	private Reloj reloj;

	public Timer() {

	}

	public Timer(Reloj reloj) {
		super();
		this.reloj = reloj;
	}

	public Reloj getReloj() {
		return reloj;
	}

	public void setReloj(Reloj reloj) {
		this.reloj = reloj;
	}

	public void run() {
		while (this.getReloj().isEstaEncendido()) {
			this.getReloj().imprimir();
			this.getReloj().avanzarUnSegundo();
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
