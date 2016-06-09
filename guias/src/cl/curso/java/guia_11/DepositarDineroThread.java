/**
 * 
 */
package cl.curso.java.guia_11;

/**
 * @author Royerliz
 *
 */
public class DepositarDineroThread extends Thread {

	private CuentaBancaria cuentaBancaria;
	private int montoADepositar;

	public DepositarDineroThread() {

	}

	public DepositarDineroThread(CuentaBancaria cuentaBancaria, int montoADepositar) {
		super();
		this.cuentaBancaria = cuentaBancaria;
		this.montoADepositar = montoADepositar;
	}

	public CuentaBancaria getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}

	public int getMontoADepositar() {
		return montoADepositar;
	}

	public void setMontoADepositar(int montoADepositar) {
		this.montoADepositar = montoADepositar;
	}

	public void run() {
		cuentaBancaria.depositarDinero(montoADepositar);
		
	}
}
