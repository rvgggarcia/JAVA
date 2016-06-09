/**
 * 
 */
package cl.curso.java.prueba_dos.rgarcia;

/**
 * @author Royerliz
 *
 */
public class EstacionComun extends Estacion {

	@Override
	public boolean seDetieneTrenRutaRoja() {
		return true;
	}

	@Override
	public boolean seDetieneTrenRutaVerde() {
		return true;
	}

}
