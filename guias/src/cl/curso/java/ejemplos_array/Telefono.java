/**
 * 
 */
package cl.curso.java.ejemplos_array;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Royerliz
 *
 */
public class Telefono {

	private ArrayList<Contacto> contactos;

	public Telefono() {

	}

	public Telefono(ArrayList<Contacto> contactos) {
		super();
		this.contactos = contactos;
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public void imprimirFor() {

		for (int i = 0; i < this.contactos.size(); i++) {
			System.out.println(this.getContactos().get(i));
		}

	}

	public void imprimirForEach() {

		for (Contacto contacto : this.getContactos()) {
			System.out.println(contacto);
		}

	}

	public void imprimirIterador() {

		Iterator<Contacto> iterator = this.getContactos().iterator();
		{

			while (iterator.hasNext()) {

				System.out.println(iterator.next());
			}

		}

	}
}
