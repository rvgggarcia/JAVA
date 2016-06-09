package cl.curso.java.ejemplos;

/**
 * 
 * @author Royerliz
 *
 */
public class CuentaCorriente extends CuentaBancaria {
	
	private int lineaCredito;
	
	public CuentaCorriente ()
	{}

	public CuentaCorriente(int lineaCredito) {
		super();
		this.lineaCredito = lineaCredito;
	}

	public int getLineaCredito() {
		return lineaCredito;
	}

	public void setLineaCredito(int lineaCredito) {
		this.lineaCredito = lineaCredito;
	}
	
	public void girar (int monto)
	{
		if (monto <= (this.getSaldo()+this.getLineaCredito()) )
			if (monto <= this.getSaldo())
			{
				this.setSaldo(this.getSaldo()-monto);
			}
		
		    else
		    {
		    	int resto= monto- this.getSaldo();
				this.setLineaCredito(this.getLineaCredito()-resto);
				this.setSaldo(0);
				
		    }
		else
		{
			System.out.println("Saldo insuficiente");
			
		}
	}
	
	public void imprimir ()
	{
		super.imprimir();
		System.out.println("Linea Credito $ : " + this.getLineaCredito());
	}
	

}
