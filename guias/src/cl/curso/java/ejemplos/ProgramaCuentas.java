package cl.curso.java.ejemplos;

/**
 * 
 * @author Royerliz
 *
 */
public class ProgramaCuentas {

	public static void main(String[] args) {
		
		CuentaCorriente cta1= new CuentaCorriente();
		cta1.setLineaCredito(2000);
		cta1.setNumeroCuenta(123456789);
		cta1.setSaldo(1000);
		
		cta1.imprimir();
		cta1.girar(2000);
		cta1.imprimir();

		System.out.println("______________");
		
		
		
		CuentaVista cuentaVista= new CuentaVista ();
		cuentaVista.setNumeroCuenta(1234567);
		cuentaVista.setSaldo(2000);
		
		cuentaVista.imprimir();
		cuentaVista.girar(3000);
		
	}

}
