/**
 * 
 */
package cl.curso.java.prueba_dos.rgarcia;

/**
 * @author Royerliz
 *
 */
public class EstacionRutaVerde extends Estacion {

	@Override
	public boolean seDetieneTrenRutaRoja() {
		return false;
	}

	@Override
	public boolean seDetieneTrenRutaVerde() {
		return true;
	}

}
