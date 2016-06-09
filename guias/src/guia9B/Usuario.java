package guia9B;

public class Usuario {
	private String nombreUsuario;
	private String password;
	private Perfil perfil;
	
	
	public Usuario (){
		
	}


	public Usuario(String nombreUsuario, String password, Perfil perfil) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.perfil = perfil;
	}



	public String getNombreUsuario() {
		return nombreUsuario;
	}



	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Perfil getPerfil() {
		return perfil;
	}


	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
	public void imprimir (){
		System.out.println(nombreUsuario);
		System.out.println(password);
		System.out.println(perfil.getNombre());
		System.out.println(perfil.getDescripcion());
		
	}
}
