package cl.curso.java.ejemplos.JuegoPiedra;

public class Piedra extends Jugada {

	@Override
	public void jugar(Jugada jugada) {
	
		if (jugada instanceof Piedra)
		{
			System.out.println("EMPATA");
		}

		if (jugada instanceof Papel)
		{
			System.out.println("PIERDE");
		}
		
		if (jugada instanceof Tijera)
		{
			System.out.println("GANA");
		}
	}

}
