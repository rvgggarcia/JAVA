package cl.curso.java.ejemplos.JuegoPiedra;

public class Tijera extends Jugada {

	@Override
	public void jugar(Jugada jugada) {
		
		if (jugada instanceof Piedra)
		{
			System.out.println("PIERDE");
		}

		if (jugada instanceof Papel)
		{
			System.out.println("GANA");
		}
		
		if (jugada instanceof Tijera)
		{
			System.out.println("EMPATA");
		}

	}

}
