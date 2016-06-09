package cl.curso.java.guia1;

public class CuentaCorriente extends CuentaBancaria{
	private int lineaCredito;
	
	public int getLineaCredito() {
		return lineaCredito;
	}

	public void setLineaCredito(int lineaCredito) {
		this.lineaCredito = lineaCredito;
	}

	public void girar (int monto)
	
	{
		if (monto <= (this.getSaldo()+ this.getLineaCredito() ))
		{
			
		}
		else
		{
			System.out.println("Saldo insuficiente");
		}
	}

}
