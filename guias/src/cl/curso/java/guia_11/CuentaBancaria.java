/**
 * 
 */
package cl.curso.java.guia_11;

/**
 * @author Royerliz
 *
 */
public class CuentaBancaria {
	
	private int saldo;
	private int numeroCuenta;
	
	public CuentaBancaria (){
		
	}

	public CuentaBancaria(int saldo, int numeroCuenta) {
		super();
		this.saldo = saldo;
		this.numeroCuenta = numeroCuenta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public void depositarDinero (int montoADepositar){
		synchronized (this) {
		this.saldo= this.getSaldo()+ montoADepositar;
		System.out.println("Su saldo disponible es de : " + this.saldo);}
	}
	
	public void retirarDinero (int montoARetirar){
		synchronized (this) {
		this.saldo=this.getSaldo()-  montoARetirar;
		System.out.println("Su saldo disponible es de : " + this.saldo);}
	}

}
