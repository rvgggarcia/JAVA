package cl.curso.java.guia_10;

public class Revista implements Imprimible {
	
	private int numeroEdicion;
	private String nombre;
	private String editorial;
	
	public Revista (){
		
	}
	

	public Revista(int numeroEdicion, String nombre, String editorial) {
		super();
		this.numeroEdicion = numeroEdicion;
		this.nombre = nombre;
		this.editorial = editorial;
	}
	
	
	public int getNumeroEdicion() {
		return numeroEdicion;
	}


	public void setNumeroEdicion(int numeroEdicion) {
		this.numeroEdicion = numeroEdicion;
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


	@Override
	public void imprimir() {
		System.out.println("Nombre de la revista : " + nombre);
		System.out.println("Editorial : " + editorial);
		System.out.println("Edicion : " + numeroEdicion);

	}

}
