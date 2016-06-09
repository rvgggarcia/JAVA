/**
 * 
 */
package cl.curso.java.ejemplos_array;



/**
 * @author Royerliz
 *
 */
public class App {
	
	private String nombre;
	private int pesoMB;
	
	public App (){
		
	}

	public App(String nombre, int pesoMB) {
		super();
		this.nombre = nombre;
		this.pesoMB = pesoMB;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPesoMB() {
		return pesoMB;
	}

	public void setPesoMB(int pesoMB) {
		this.pesoMB = pesoMB;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	

}
