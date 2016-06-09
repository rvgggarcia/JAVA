package cl.curso.java.ejemplos3;

public class ProgramaEjemploHiloV2 {
	public static void main(String[] args) {
		Thread thread= new Thread (new EjemploHiloV2());
		thread.start();
		System.out.println("metodo main; el nombre del thread es: "+ Thread.currentThread().getName());
	}
	
	

}
