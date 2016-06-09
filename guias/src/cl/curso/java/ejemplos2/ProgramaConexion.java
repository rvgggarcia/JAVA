package cl.curso.java.ejemplos2;

public class ProgramaConexion {

	public static void main(String[] args) {

		try {
		
		ConexionAbierta open= new ConexionAbierta ();
		Conexion conexion= new Conexion(open);
		conexion.abrir();
		
		} 
		catch (ConexionAbiertaException e){
			System.out.println(e.getMessage());
		}


		
		try{
		
		ConexionCerrada close= new ConexionCerrada ();
		Conexion conexion1= new Conexion (close);
		conexion1.cerrar();
		}
		
		catch (ConexionCerradaException e){
			System.out.println(e.getMessage());
		}

	}

}
