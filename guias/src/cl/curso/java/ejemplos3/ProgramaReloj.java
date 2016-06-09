package cl.curso.java.ejemplos3;

public class ProgramaReloj {

	public static void main(String[] args) {
		Reloj reloj= new Reloj (0,0,0,true);
		Timer timer= new Timer (reloj);
		timer.start();
		
		ApagarReloj apagar= new ApagarReloj (reloj, 4000);
		apagar.start();

	}

}
