package guia9B;

public class ProgramaPerfil {
public static void main(String[] args) {
	
	Permiso [] permisos= {new Permiso ("1- Administrar", " (COD23) ", "da derechos de adminsitrador"),
			new Permiso ("2- Agregar contenido", " (COD11) ", "permite agregar nuevos contenidos"),
			new Permiso ("3- Suprimir contenido", " (COD56) ", "permite eliminar cualquier contenido")};
	
	Perfil2 perfil=new Perfil2 ("Armando", "Ingeniero y cantante", permisos);

	perfil.imprimir();
	
	System.out.println("La cantidad de permisos que tiene este perfil es : " + permisos.length );
	for( int i = 0; i < permisos.length ; i++ )
	{
		System.out.println( permisos[i].getNombrePermiso()
				+ permisos [i].getIdentificador()
				+ permisos [i].getDescripcion() );
	}
	
}
}
	
	