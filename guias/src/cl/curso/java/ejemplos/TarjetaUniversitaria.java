package cl.curso.java.ejemplos;

import java.util.Date;

public class TarjetaUniversitaria extends Tne{

	@Override
	public void recargar(int monto) {
		
		int montoMinimo=400;
		int montoMaximo=10000;

		if (monto>=montoMinimo && monto <=montoMaximo) {

			this.setSaldo((this.getSaldo() + monto));

		} else {
			System.out.println("NO ES POSIBLE RECARGAR");
		}
	}

	@Override
	public void pagarViaje() {
		Date fechaActual = new Date();
		int pasaje = 210;

		if (this.getFechaExp().before(fechaActual)) {
			pasaje = 710;

		}

		if (this.getSaldo() >= pasaje) {

			this.setSaldo(this.getSaldo() - pasaje);
		}

		else {
			System.out.println("Su saldo es insuficiente ");
		}
		
	}

}
