package guia9;

public class Libro {
	private String nombre;
	private String autor;
	private String editorial;
	private String isbn;
	
	public Libro (){
		
	}

	public Libro(String nombre, String autor, String editorial, String isbn) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.editorial = editorial;
		this.isbn = isbn;
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

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public void verificarIsbn (){
		int suma=0;
		int multiplo=10;
		
		int largo =isbn.length();
		 
		if (largo==10)
		{
			for (int i=0; i<9; i++)
			{ suma= (Integer.parseInt(isbn.substring(i, i+1))*multiplo)+suma;
			multiplo--;
				
			}

			int residuo= suma%11;
			int checksum= 11- residuo;
			
			
			int verificador= (Integer.parseInt(isbn.substring(9)));
			
			
			if (verificador==checksum) {
				System.out.println("ISBN VALIDO");
				
			}
			
			else 
				System.out.println("ISBN INVALIDO, POR FAVOR VERIFIQUE");
			}
		
		
		else 
		System.out.println("El largo del ISBN deber ser igual a 10");
}
}
