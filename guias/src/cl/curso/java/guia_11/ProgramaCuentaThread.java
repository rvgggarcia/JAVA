/**
 * 
 */
package cl.curso.java.guia_11;

/**
 * @author Royerliz
 *
 */
public class ProgramaCuentaThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CuentaBancaria cuenta= new CuentaBancaria (50000, 1234567);
		
		System.out.println("EL SALDO INICIAL DE LA CUENTA ES DE: "+ cuenta.getSaldo());
		
		RetirarDineroThread retirar1= new RetirarDineroThread (cuenta, 20000);
		retirar1.start();
		System.out.println("RETIRO 1 por : "+ retirar1.getMontoARetirar() );
		RetirarDineroThread retirar2= new RetirarDineroThread (cuenta, 10000);
		retirar2.start();
		System.out.println("RETIRO 2 por : "+ retirar2.getMontoARetirar() );
		RetirarDineroThread retirar3= new RetirarDineroThread (cuenta, 5000);
		retirar3.start();
		System.out.println("RETIRO 3 por : "+ retirar3.getMontoARetirar() );
		
		DepositarDineroThread depositar1= new DepositarDineroThread (cuenta, 40000);
		depositar1.start();
		System.out.println("DEPOSITO 1 por : "+ depositar1.getMontoADepositar() );
		DepositarDineroThread depositar2= new DepositarDineroThread (cuenta, 30000);
		depositar2.start();
		System.out.println("DEPOSITO 2 por : "+ depositar2.getMontoADepositar() );
		DepositarDineroThread depositar3= new DepositarDineroThread (cuenta, 100000);
		depositar3.start();
		System.out.println("DEPOSITO 3 por : "+ depositar3.getMontoADepositar() );
		
		
		

	}

}
