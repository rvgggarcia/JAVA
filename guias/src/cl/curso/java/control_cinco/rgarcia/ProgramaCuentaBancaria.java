/**
 * 
 */
package cl.curso.java.control_cinco.rgarcia;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * @author Royerliz
 *
 */
public class ProgramaCuentaBancaria {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Date date = new GregorianCalendar(2016, 7, 6).getTime();
		Date date1 = new GregorianCalendar(2016, 7, 4).getTime();
		List<Transaccion> transaccion = new ArrayList<Transaccion>();

		Transaccion transaccion1 = new Transaccion("123", "deposito", date1, 20000);
		Transaccion transaccion2 = new Transaccion("124", "deposito", date, 50000);
		Transaccion transaccion3 = new Transaccion("122", "retiro", date, 10000);
		Transaccion transaccion4 = new Transaccion("128", "retiro", date1, 20000);

		transaccion.add(transaccion1);
		transaccion.add(transaccion2);
		transaccion.add(transaccion3);
		transaccion.add(transaccion4);

		CuentaBancaria cuenta = new CuentaBancaria(12345, transaccion);

		cuenta.ordenarTransaccionesPorFecha();
		cuenta.ordenarTransaccionesPorTipo();
		cuenta.imprimir();

	}

}
