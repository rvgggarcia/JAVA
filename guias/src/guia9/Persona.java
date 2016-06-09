package guia9;

/**
 * 
 * @author Royerliz
 *
 */
public class Persona {
	
	private String nombre;
	private String apellido;
	private String telefono;
	
	public Persona()
	{
		nombre= "Liz";
		apellido= "Garcia";
		telefono= "951286383";	
	}
	
	public Persona (String nombre, String apellido, String telefono)
	{
	 this.nombre=nombre;
	 this.apellido=apellido;
	 this.telefono=telefono;
	 
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
	 public void imprimir ()
	 {
		 System.out.println("El nombre es : "+ this.nombre );
		 System.out.println("El apellido es : "+ this.apellido);
		 System.out.println("El telefono es : "+ this.telefono);
	 }
	
	 public boolean validarTelefono()
	 {
		 return (this.telefono.length() > 8 && this.telefono.length()<10);
		 
		 }
			 	 
		
	 }



