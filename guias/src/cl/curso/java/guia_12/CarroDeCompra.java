package cl.curso.java.guia_12;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Royerliz
 *
 */

public class CarroDeCompra {

	private Usuario usuario;
	private List<Producto> productos;

	public CarroDeCompra() {

	}

	public CarroDeCompra(Usuario usuario, List<Producto> productos) {
		super();
		this.usuario = usuario;
		this.productos = productos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	/**
	 * Este metodo permite agregar un nuevo producto a la lista
	 */

	public void agregarProducto(Producto e) {

		this.getProductos().add(e);
		System.out.println("Se ha añadido el producto : "+ e.getNombre());
	}

	/**
	 * Este metodo permite eliminar un producto de la lista
	 */

	public void eliminarProducto(Producto e) {
		
		if(this.getProductos().contains(e)){
			   this.getProductos().remove(e);
			   System.out.println("Se ha eliminado el producto : "+ e.getNombre());
			   }
			   else{
				   System.out.println("El productos que desea eliminar NO EXISTE");
			   }
	}

	/**
	 * Permite ordenar los productos de la lista segun el precio
	 */

	public void ordenarPorPrecio() {
		System.out.println("         ***   Su compra ha sido ordenada por precio   ***       ");
		Collections.sort(this.getProductos(), new Comparator<Producto>() {
			public int compare(Producto o1, Producto o2) {
				if (o1.getPrecio() > o2.getPrecio()) {
					return 1;
				}
				if (o1.getPrecio() < o2.getPrecio()) {
					return -1;
				}
				if (o1.getPrecio() == o2.getPrecio()) {
					return 0;
				}

				return 0;
			}

		});
	}

	/**
	 * Calcula el costo total de la compra
	 */
	public int costoTotal() {
		int suma = 0;
		for (int i = 0; i < this.getProductos().size(); i++) {
			suma = suma + (this.getProductos().get(i).getPrecio());

		}
		return suma;

	}

	/**
	 * Imprime la descripcion de los productos existentes en el carro de compra
	 * y el monto total de la misma
	 */

	public void imprimir() {
		System.out.println("RESUMEN DE COMPRA: ");
		for (int i = 0; i < this.getProductos().size(); i++) {
			System.out.println(this.getProductos().get(i));
			
		}
		System.out.println("Costo total: " + this.costoTotal() + " $");
		System.out.println(" ");

	}
}
