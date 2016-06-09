package cl.curso.java.control;

public class CuentaVista {
	
	//ATRIBUTOS
	private int saldo;
	private int giroMaximo;
	
	//CONSTRUCTORES
	
	public CuentaVista ()
	{
		this.saldo=0;
		this.giroMaximo=200000;
	}
	
	public CuentaVista (int saldo, int giroMaximo)
	{
		this.saldo=saldo;
		this.giroMaximo=giroMaximo;
	}

	//ACCESADORES Y MUTADORES
	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getGiroMaximo() {
		return giroMaximo;
	}

	public void setGiroMaximo(int giroMaximo) {
		this.giroMaximo = giroMaximo;
	}
	
	public void depositar (int deposito)
	{
		this.saldo=this.saldo+deposito;
		
	}
	
	public int girar (int montoAGirar)
	{
		if (montoAGirar>this.giroMaximo)
		{
			System.out.println("Ha superado el monto maximo de giro");
		}
		
		else
		{
			this.saldo=this.saldo-montoAGirar;
		}
		
		
		if (montoAGirar>this.saldo)	
		{
			System.out.println("El monto a retirar excede el saldo en su cuenta");
		}
		this.giroMaximo=giroMaximo-montoAGirar;
				return giroMaximo;
	}
	
	
	
  }

