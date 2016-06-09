package cl.curso.java.ejemplos;

/**
 * 
 * @author Royerliz
 * @see  cl.curso.java.ejemplos.CuentaBancaria
 *Cuenta vista en una cuenta bancaria
 */

public class CuentaVista extends CuentaBancaria {

/**
 * @Override
 */

	public void girar (int monto)
	
	{
		if  ((monto+300)<=this.getSaldo())
		{
			this.setSaldo(this.getSaldo()-(monto-300));
		}
		
		else
		{
			System.out.println("Saldo insuficiente");
		}
	
     
	}


}
