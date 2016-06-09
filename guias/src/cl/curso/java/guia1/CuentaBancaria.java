package cl.curso.java.guia1;

public class CuentaBancaria {
	private int saldo;
	private int numeroCuenta;
	
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

	public CuentaBancaria ()
	{}
	
	public void girar (int monto)
	{
		System.out.println("girar" + monto);
	}
	
}
