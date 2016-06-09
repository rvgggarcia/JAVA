/**
 * 
 */
package cl.curso.java.ejemplos;

/**
 * @author Royerliz
 *
 */
public abstract class TarjetaBip {

	private int saldo;
	private int numTarjeta;
	private String color;
	
	public TarjetaBip ()
	{}
	
	public TarjetaBip (int saldo, int numTarjeta, String color)
	{
		this.saldo=saldo;
		this.numTarjeta=numTarjeta;
		this.color= color;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(int numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract void recargar(int monto);
	
	public abstract void pagarViaje ();
	
	public void imprimir ()
	{
		System.out.println("El numero de su tarjeta es : "+ this.getNumTarjeta());
		System.out.println("Su saldo actual es de : "+ this.getSaldo() + "$");
	}
}
