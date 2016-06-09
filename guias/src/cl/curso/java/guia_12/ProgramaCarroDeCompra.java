/**
 * 
 */
package cl.curso.java.guia_12;

import java.util.ArrayList;

/**
 * @author Royerliz
 *
 */
public class ProgramaCarroDeCompra {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * Instancia el array
		 */
		ArrayList <Producto> producto= new ArrayList <Producto> ();
		
		/**
		 * Crea productos usando el respectivo constructor
		 */
		
		Producto cerveza= new Producto (1, "Cerveza", 2000);
		Producto ron= new Producto (2, "Ron", 7000);
		Producto pisco =new Producto (3, "Pisco", 5000);
		Producto whiskey= new Producto (4, "Whiskey", 18000);
		
		/**
		 * Agrega los productos creados a la lista
		 */
		
		producto.add(cerveza);
		producto.add(ron);
		producto.add(pisco);
		
		
		/**
		 * Crea una instancia de usuario
		 */
		
		Usuario usuario= new Usuario ("Guachita", "5873");
		
		/**
		 * Crea un nuevo carro de compra
		 */
		
		CarroDeCompra carro= new CarroDeCompra (usuario, producto);
		
		/**
		 * Aplica los  metodos de la clase CarroDeCompra
		 */
		carro.imprimir();  
		carro.agregarProducto(whiskey);
		carro.imprimir();
		carro.eliminarProducto(cerveza);
		carro.eliminarProducto(cerveza);
		carro.imprimir();
		carro.ordenarPorPrecio();
		carro.imprimir();

	}

}
