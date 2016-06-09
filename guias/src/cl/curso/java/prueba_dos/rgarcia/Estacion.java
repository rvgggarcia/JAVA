/**
 * 
 */
package cl.curso.java.prueba_dos.rgarcia;

/**
 * @author Royerliz
 *
 */
public  abstract class Estacion {
	
	private String nombre;
	private String linea;
	
	public Estacion (){
		
	}

	public Estacion(String nombre, String linea) {
		super();
		this.nombre = nombre;
		this.linea = linea;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}


	public abstract boolean seDetieneTrenRutaRoja();
	
	public abstract boolean seDetieneTrenRutaVerde();
	
}
