/**
 * 
 */
package cl.curso.java.control_cuatro.rgarcia;

/**
 * @author Royerliz
 *
 */
public class Auto {
	private String marca;
	private String modelo;
	private int anio;
	private int stock;

	public Auto() {

	}

	public Auto(String marca, String modelo, int anio, int stock) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.stock = stock;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void venderAuto() {

		if (this.stock > 0) {
			this.stock = this.stock - 1;
			System.out.println("Auto vendido con exito");
		} else {
			 throw new SinStockException("NO ES POSIBLE VENDER AUTO. NO HAY STOCK");

	

		}
	}
}
