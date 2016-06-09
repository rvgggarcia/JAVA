package cl.curso.java.guia_10;

public class ProgramaValidables {

	public static void main(String[] args) {
		Isbn isbn= new Isbn (234543445,"2");
		isbn.validar();
		
		Rut rut= new Rut (25210177, "9");
		rut.validar();
		

	}
	

}
