package cl.curso.java.ejemplos3;

public class Reloj {

	private int segundo;
	private int minuto;
	private int hora;
	private boolean estaEncendido;

	public Reloj() {

	}

	public Reloj(int segundo, int minuto, int hora, boolean estaEncendido) {
		super();
		this.segundo = segundo;
		this.minuto = minuto;
		this.hora = hora;
		this.estaEncendido = true;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public boolean isEstaEncendido() {
		return estaEncendido;
	}

	public void setEstaEncendido(boolean estaEncendido) {
		this.estaEncendido = estaEncendido;
	}

	public void avanzarUnSegundo() {

		this.segundo++;

		if (this.segundo == 60) {
			this.segundo = 0;
			this.avanzarMinuto();
		}

	}

	public void avanzarMinuto() {
		this.minuto++;
		if (this.minuto == 60) {
			this.minuto = 0;
			this.avanzarHora();
		}
	}

	public void avanzarHora() {
		this.hora++;
		if (this.hora == 24) {
			this.hora = 0;

		}
	}

	public void imprimir() {
		System.out.println(this.hora + ": " + this.minuto + ": " + this.segundo);

	}

}
