package cl.curso.java.ejemplos2;

public class ConexionAbierta extends EstadoConexion {

	
	
	@Override
	public void abrir(Conexion conexion) {
		throw new ConexionAbiertaException ("La conexion ya se encuentra abierta");
		
	}

	@Override
	public void cerrar(Conexion conexion) {
		conexion.setEstadoconexion(new ConexionCerrada());
		System.out.println("LA CONEXION SE HA CERRADO CORRECTAMENTE");
		
	}

}
