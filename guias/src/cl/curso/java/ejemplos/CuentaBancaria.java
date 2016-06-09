package cl.curso.java.ejemplos;

/**
 * 
 * @author Royeriz
 *
 */

public class CuentaBancaria {
	
	private int numeroCuenta;
	private int saldo;
	

	public CuentaBancaria ()
	{}


	public CuentaBancaria(int numeroCuenta, int saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}


	public int getNumeroCuenta() {
		return numeroCuenta;
	}


	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}


	public int getSaldo() {
		return saldo;
	}


	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * 
	 * @param monto dinero total a girar
	 */
	
	public void girar( int monto)
	{
		System.out.println("Girar [Cuenta Bancaria]");
		
	}
	
	/**
	 * 
	 * @param monto dinero que se abonara al saldo
	 */
	
	public void depositar (int monto)
	{
		System.out.println("Se depositara $ " + monto);
		this.setSaldo( (this.getSaldo()+monto));
	}
	
	/**
	 * Metodo que permite imprimir los atributos de la clase
	 */
	
	public void imprimir ()
	{
		System.out.println("Datos de la cuenta");
		System.out.println("nro cuenta : " + this.getNumeroCuenta());
		System.out.println("saldo : $ "+ this.getSaldo());
	}
}
