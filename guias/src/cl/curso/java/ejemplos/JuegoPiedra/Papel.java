package cl.curso.java.ejemplos.JuegoPiedra;

public class Papel extends Jugada {

	@Override
	public void jugar(Jugada jugada) {
		
		if (jugada instanceof Piedra)
		{
			System.out.println("GANA");
		}

		if (jugada instanceof Papel)
		{
			System.out.println("EMPATA");
		}
		
		if (jugada instanceof Tijera)
		{
			System.out.println("PIERDE");
		}

	}

}
