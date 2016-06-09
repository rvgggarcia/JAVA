package cl.curso.java.ejemplos3;

public class ProgramaDataRace {

	public static void main(String[] args) {
		Contador contador= new Contador ();
		AumentaTread tread= new AumentaTread (contador);
		AumentaTread tread1=new AumentaTread (contador);
		tread.start();
		tread1.start();

	}

}
