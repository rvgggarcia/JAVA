/**
 * 
 */
package cl.curso.java.control_cuatro.rgarcia;

/**
 * @author Royerliz
 *
 */
public class ProgramaAuto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try{
			Auto auto= new Auto ("Toyota", "BMW", 2016, 1);
			auto.venderAuto();
			auto.venderAuto();
		}catch (SinStockException e){
			System.out.println(e.getMessage());
		}
	
		

	}

}
