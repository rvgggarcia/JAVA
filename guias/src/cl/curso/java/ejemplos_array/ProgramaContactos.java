/**
 * 
 */
package cl.curso.java.ejemplos_array;

import java.util.ArrayList;


/**
 * @author Royerliz
 *
 */
public class ProgramaContactos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList <Contacto> contacto= new ArrayList <Contacto> ();
		contacto.add(new Contacto ("Pedro", 1234556, "edu@hotmail.com"));
		contacto.add(new Contacto ("Juana", 2987567, "juanita@hotmail.com"));
		contacto.add(new Contacto ("Perensejo", 456556, "mengano@hotmail.com"));
		
		
		Telefono telefono= new Telefono (contacto);
		telefono.imprimirFor();
		telefono.imprimirForEach();
		telefono.imprimirIterador();
		
	}

}
