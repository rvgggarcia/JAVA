package cl.curso.java.guia1;

public class Gato  extends Mamiferos {

	private String nombre;
	
	public Gato (int cantidadPatas, int mesesGestacion, String nombre){
		
		super(cantidadPatas, mesesGestacion);
		this.nombre=nombre;
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
