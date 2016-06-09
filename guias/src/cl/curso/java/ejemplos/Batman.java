package cl.curso.java.ejemplos;

public class Batman extends SuperHeroe{

	@Override
	public void recibirAtaque(Arma arma) {
		if (arma instanceof Granada){
			
			System.out.println("muere");
		}
			
		if (arma instanceof Criptonita){
			System.out.println("vive");
		}
		}
		
	

	
}
