package cl.curso.java.ejemplos3;

public class ProgramaBomba {

	public static void main(String[] args) throws InterruptedException {
		Thread bomba= new Thread (new Bomba());
		bomba.start();
		bomba.join();
		System.out.println("BOOM !!");

	}

}
