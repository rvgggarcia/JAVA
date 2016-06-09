package guia9B;

public class Perfil2 {

	private String nombrePerfil;
	private String descripcion;
	private Permiso [] listaPermisos;
	
	public Perfil2 (){
	
	}

	public Perfil2(String nombrePerfil, String descripcion, Permiso[] listaPermisos) {
		super();
		this.nombrePerfil = nombrePerfil;
		this.descripcion = descripcion;
		this.listaPermisos = listaPermisos;
	}

	public String getNombrePerfil() {
		return nombrePerfil;
	}

	public void setNombrePerfil(String nombrePerfil) {
		this.nombrePerfil = nombrePerfil;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Permiso[] getListaPermisos() {
		return listaPermisos;
	}

	public void setListaPermisos(Permiso[] listaPermisos) {
		this.listaPermisos = listaPermisos;
	}
	
	public void imprimir (){
		
		System.out.println(nombrePerfil);
		System.out.println(descripcion);
		
	}
}
