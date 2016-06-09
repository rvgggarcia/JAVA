package guia9B;

public class Permiso {

	private String nombrePermiso;
	private String identificador;
	private String descripcion;
	
	public Permiso ()
	{}
	
	public Permiso(String nombrePermiso, String identificador, String descripcion) {
		super();
		this.nombrePermiso = nombrePermiso;
		this.identificador = identificador;
		this.descripcion = descripcion;
	}

	public String getNombrePermiso() {
		return nombrePermiso;
	}

	public void setNombrePermiso(String nombrePermiso) {
		this.nombrePermiso = nombrePermiso;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
