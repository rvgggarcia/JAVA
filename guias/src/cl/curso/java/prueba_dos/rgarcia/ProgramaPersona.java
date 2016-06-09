/**
 * 
 */
package cl.curso.java.prueba_dos.rgarcia;

/**
 * @author Royerliz
 *
 */
public class ProgramaPersona {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Persona persona = new Persona("Juan", 14, "24543423-1", 250, 1.90);
		persona.calcularIMC();
		persona.esMayorEdad();

	}

}
