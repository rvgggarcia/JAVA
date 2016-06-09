package guia9;

public class Disco {
	
	private String nombre;
	private String autor;
	private String genero;
	private String [] canciones;
	
	public Disco (){
	}

	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String[] getCanciones() {
		return canciones;
	}


	public void setCanciones(String[] canciones) {
		this.canciones = canciones;
	}


	public Disco(String nombre, String autor, String genero, String[] canciones) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.genero = genero;
		this.canciones = canciones;
	}


	public void imprimir (){
		System.out.println(nombre);
		System.out.println(autor);
		System.out.println(genero);
		for (int i=0; i<canciones.length; i++)
		{
			System.out.println(i + "- " +  canciones [i]);
		}
	
	
	}

}
