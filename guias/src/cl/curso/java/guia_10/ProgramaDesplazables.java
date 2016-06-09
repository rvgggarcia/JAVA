package cl.curso.java.guia_10;

public class ProgramaDesplazables {

	public static void main(String[] args) {
		Moto moto= new Moto ("Yamaha", "BYT 2016");
		moto.desplazar(20);
		
		Barco barco= new Barco (34, "Scorpios", "Gran Roque");
		barco.desplazar(10);

	}

}
