/**
 * 
 */
package cl.curso.java.guia_11;

/**
 * @author Royerliz
 *
 */
public class ProgramaAnimal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal animal1= new Animal ("Caballo", 20, 2000, 0, false);
		Thread thread= new Thread (animal1);
		thread.start();
		Animal animal2= new Animal ("Perro", 60, 2000, 0, false);
		Thread thread2= new Thread (animal2);
		thread2.start();
		Animal animal3= new Animal ("Leon", 30, 3000, 0, false);
		Thread thread3= new Thread (animal3);
		thread3.start();
		

	}

}
