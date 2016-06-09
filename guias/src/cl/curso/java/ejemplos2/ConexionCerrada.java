package cl.curso.java.ejemplos2;

public class ConexionCerrada extends EstadoConexion {

	@Override
	public void abrir(Conexion conexion) {
		conexion.setEstadoconexion(new ConexionAbierta());
		System.out.println("LA CONEXION SE HA ABIERTO CORRECTAMENTE");
		
	}

	@Override
	public void cerrar(Conexion conexion) {
		throw new ConexionCerradaException ("La conexion ya se encuentra cerrada");
	}

}
