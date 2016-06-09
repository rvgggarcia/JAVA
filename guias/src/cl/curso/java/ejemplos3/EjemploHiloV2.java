package cl.curso.java.ejemplos3;

public class EjemploHiloV2 implements Runnable{

	@Override
	public void run() {
		System.out.println("El nombre del thread es: "+ Thread.currentThread().getName());
		
	}

}
