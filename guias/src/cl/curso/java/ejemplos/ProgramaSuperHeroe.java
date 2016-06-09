package cl.curso.java.ejemplos;

public class ProgramaSuperHeroe {

	public static void main(String[] args) {
		Batman bt= new Batman ();
		Superman sp= new Superman ();
		Criptonita criptonita=new Criptonita ();
		Granada granada= new Granada ();
		
		bt.recibirAtaque(granada);
		bt.recibirAtaque(criptonita);
		
		sp.recibirAtaque(granada);
		sp.recibirAtaque(criptonita);

	}

}
