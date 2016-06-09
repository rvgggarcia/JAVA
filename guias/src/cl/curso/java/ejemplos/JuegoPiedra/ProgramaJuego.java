package cl.curso.java.ejemplos.JuegoPiedra;

public class ProgramaJuego {

	public static void main(String[] args) {
		Tijera tijera= new Tijera ();
		Piedra piedra=new Piedra ();
		Papel papel =new Papel ();
		
		tijera.jugar(piedra);
		tijera.jugar(papel);
		tijera.jugar(tijera);
		
		piedra.jugar(piedra);
		piedra.jugar(papel);
		piedra.jugar(tijera);
		
		papel.jugar(piedra);
		papel.jugar(papel);
		piedra.jugar(tijera);
		

	}

}
