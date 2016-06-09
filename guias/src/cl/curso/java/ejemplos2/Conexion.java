package cl.curso.java.ejemplos2;

public class Conexion {

	private EstadoConexion estadoconexion;
	
	public Conexion (){
		
	}

	public Conexion(EstadoConexion estadoconexion) {
		super();
		this.estadoconexion = estadoconexion;
	}

	public EstadoConexion getEstadoconexion() {
		return estadoconexion;
	}

	public void setEstadoconexion(EstadoConexion estadoconexion) {
		this.estadoconexion = estadoconexion;
	}
	
	public void abrir(){
		
		this.getEstadoconexion().abrir(this);
		
	}
	
	public void cerrar (){
		
		this.getEstadoconexion().cerrar(this);
		
	}
}
