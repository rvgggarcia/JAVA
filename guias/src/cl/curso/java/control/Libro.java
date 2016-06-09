package cl.curso.java.control;

public class Libro {

	private String titulo;
	private String autor;
	private int numeroEjemplares;
	private int numeroEjemplaresPrestados;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumeroEjemplares() {
		return numeroEjemplares;
	}
	public void setNumeroEjemplares(int numeroEjemplares) {
		this.numeroEjemplares = numeroEjemplares;
	}
	public int getNumeroEjemplaresPrestados() {
		return numeroEjemplaresPrestados;
	}
	public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestador) {
		this.numeroEjemplaresPrestados = numeroEjemplaresPrestador;
	}
	
	public void prestarLibro()
	{
	}
	
	public void devolverLibro ()
	{
	}
	public void imprimir ()
	{
		System.out.println(getAutor () );
		System.out.println(getTitulo () );
		System.out.println(getNumeroEjemplares () );
		System.out.println(getNumeroEjemplaresPrestados() );
	}
	
	
}


