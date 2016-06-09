package guia9B;

public class ProgramaUsuario {
 
	public static void main(String[] args) {
		Perfil datos = new Perfil("Juan Andres", "Estudiante de ayer, vive en Chile");
		Usuario usuario= new Usuario ("eljuio", "45rtgf5", datos);
		
		usuario.imprimir();
	
}
}
