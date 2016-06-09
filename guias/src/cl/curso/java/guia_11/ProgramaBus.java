/**
 * 
 */
package cl.curso.java.guia_11;

/**
 * @author Royerliz
 *
 */
public class ProgramaBus {
	public static void main(String[] args) {
		Asiento [] asientos = {new Asiento(), new Asiento (), new Asiento()};
		Bus bus= new Bus ("ENCAVA", asientos);
		ReservaThread hilo1= new ReservaThread(bus, (1));
		ReservaThread hilo2= new ReservaThread(bus, (2));
		ReservaThread hilo3= new ReservaThread(bus, (1));
		hilo1.start();
		hilo2.start();
		hilo3.start();
		
		
	}
	

}
