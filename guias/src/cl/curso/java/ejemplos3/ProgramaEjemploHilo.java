package cl.curso.java.ejemplos3;

public class ProgramaEjemploHilo {

	public static void main(String[] args) {
		EjemploHilo thread= new EjemploHilo ();
		thread.run();
		System.out.println("metodo main; El nombre del thread es: "+ Thread.currentThread().getName());

	}

}
