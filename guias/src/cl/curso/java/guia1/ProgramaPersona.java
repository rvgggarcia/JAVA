package cl.curso.java.guia1;

public class ProgramaPersona {
	public static void main(String[] args) {

		Persona personaUno = new Persona();
		personaUno.imprimir();

		Persona personaDos = new Persona("David", "Paterno", "Materno", 29);
		personaDos.imprimir();
	}

}