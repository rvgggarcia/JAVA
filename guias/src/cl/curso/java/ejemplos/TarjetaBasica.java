package cl.curso.java.ejemplos;

import java.util.Date;

public class TarjetaBasica extends Tne {

	@Override
	public void recargar(int monto) {
		Date fechaActual = new Date();

		/**
		 * Este condicional permite recargar SOLO a las tarjetas de educacion
		 * Basica que esten vencidas. Si una tarjeta esta vigente no sera
		 * posible recargar.
		 */

		if (this.getFechaExp().before(fechaActual)) {

			this.setSaldo((this.getSaldo() + monto));

		} else {
			System.out.println("NO ES POSIBLE RECARGAR");
		}
	}

	@Override
	public void pagarViaje() {
		Date fechaActual = new Date();
		int pasaje = 0;

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
