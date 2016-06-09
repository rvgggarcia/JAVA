/**
 * 
 */
package cl.curso.java.guia_12;

/**
 * @author Royerliz
 *
 */
public class Producto {

	private Integer identificador;
	private String nombre;
	private int precio;

	public Producto() {

	}

	public Producto(Integer identificador, String nombre, int precio) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.precio = precio;
	}

	public Integer getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Producto) {
			Producto producto = (Producto) obj;
			return this.getIdentificador().equals(producto.getIdentificador());
		}

		return false;
	}

	@Override
	public String toString() {
		return "ID= " + this.getIdentificador() +" Producto: "+ this.getNombre() + ". "+ "Precio= " + this.getPrecio();
	}
}