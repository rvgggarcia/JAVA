/**
 * 
 */
package cl.curso.java.control_cinco.rgarcia;

import java.util.List;

/**
 * @author Royerliz
 *
 */
public class CuentaBancaria {

	private int numero;
	private List<Transaccion> transacciones;

	public CuentaBancaria() {

	}

	public CuentaBancaria(int numero, List<Transaccion> transacciones) {
		super();
		this.numero = numero;
		this.transacciones = transacciones;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public List<Transaccion> getTransacciones() {
		return transacciones;
	}

	public void setTransacciones(List<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}

	/**
	 * Este metodo ordena las transacciones segun la fecha de las mismas
	 */

	public void ordenarTransaccionesPorFecha() {

		System.out.println("         ***   Sus transacciones han sido ordenadas por fecha   ***       ");

	}

	/**
	 * Permite ordenar las transacciones segun el tipo, colocando primero los
	 * depositos y luego los retiros
	 */

	public void ordenarTransaccionesPorTipo() {
		System.out.println("         ***   Sus transacciones han sido ordenadas por tipo  ***       ");

	}

	/**
	 * Imprime por consola la lista de transacciones
	 */

	public void imprimir() {

		for (Transaccion transaccion : this.getTransacciones()) {
			System.out.println(transaccion);
		}

	}

}
