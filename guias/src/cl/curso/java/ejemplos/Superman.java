package cl.curso.java.ejemplos;

public class Superman extends SuperHeroe{

	@Override
	public void recibirAtaque(Arma arma) {
		
	    if (arma instanceof Granada){
			
			System.out.println("vive");
		}
			
		if (arma instanceof Criptonita){
			System.out.println("muere");
		}
		}
		
	}


