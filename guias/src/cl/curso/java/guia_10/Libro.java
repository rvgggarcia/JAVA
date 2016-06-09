package cl.curso.java.guia_10;

public class Libro implements Imprimible {
	
	private String nombre;
	private String editorial;
	
	public Libro (){
		
	}
	

	public Libro(String nombre, String editorial) {
		super();
		this.nombre = nombre;
		this.editorial = editorial;
	}



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEditorial() {
		return editorial;
	}


	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


	public void imprimir() {
		System.out.println("Nombre del libro : " + nombre);
		System.out.println("Editorial : " + editorial);

	}

}
