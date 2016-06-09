package cl.curso.java.guia1;

public class CuentaVista extends CuentaBancaria {
	
	public void girar (int monto)
	{
		if (this.getSaldo()<=(monto+300))
		{
			this.setSaldo(this.getSaldo()-(monto+300));
		}
		else
		{
			System.out.println("Saldo insuficiente");
		}
	}
}


