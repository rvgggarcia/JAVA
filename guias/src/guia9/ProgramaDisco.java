package guia9;

public class ProgramaDisco {

	public static void main(String[] args) {
		String [] canciones= { "Gracias a la vida", "Angelito", "Arriba quemando el sol"};
		
		Disco disco= new Disco ("Se fue a los cielos", "Violeta Parra" , "Folklore", canciones);
		disco.imprimir();
		
		
	}
	
}
