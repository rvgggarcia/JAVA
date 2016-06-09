/**
 * 
 */
package cl.curso.java.guia_11;

/**
 * @author Royerliz
 *
 */
public class RetirarDineroThread extends Thread {

	private CuentaBancaria cuentaBancaria;
	private int montoARetirar;
	
	public RetirarDineroThread (){
		
	}

	public RetirarDineroThread(CuentaBancaria cuentaBancaria, int montoARetirar) {
		super();
		this.cuentaBancaria = cuentaBancaria;
		this.montoARetirar = montoARetirar;
	}

	public CuentaBancaria getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}

	public int getMontoARetirar() {
		return montoARetirar;
	}

	public void setMontoARetirar(int montoARetirar) {
		this.montoARetirar = montoARetirar;
	}
	
	public void run (){
		cuentaBancaria.retirarDinero(montoARetirar);
		
	}
}
