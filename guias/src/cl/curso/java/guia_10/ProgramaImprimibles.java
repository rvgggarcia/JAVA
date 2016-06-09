package cl.curso.java.guia_10;

public class ProgramaImprimibles {

	public static void main(String[] args) {
		Libro libro= new Libro ("Narnia", "Anagrama");
		
		libro.imprimir();
		
		System.out.println("_____________ \n");

		Revista revista= new Revista (23, "Poetas locos", "Larense");
		
		revista.imprimir();
	}

}
