package cl.curso.java.ejemplos;

/**
 * 
 * @author Royerliz
 *
 */
public class TarjetaBipClasica extends TarjetaBip {

	@Override
	public void recargar(int monto) {
		
		int montoMinimo=1000;
		int montoMaximo=25000;

		if (monto>=montoMinimo && monto <=montoMaximo) {

			this.setSaldo((this.getSaldo() + monto));

		} else {
			System.out.println("NO ES POSIBLE RECARGAR");
		}
	}

	@Override
	public void pagarViaje() {
	
		int pasaje = 710;


		if (this.getSaldo() >= pasaje) {

			this.setSaldo(this.getSaldo() - pasaje);
		}

		else {
			System.out.println("Su saldo es insuficiente ");
		}
	}

	
	
}
