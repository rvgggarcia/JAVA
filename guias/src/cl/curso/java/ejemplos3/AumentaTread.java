package cl.curso.java.ejemplos3;

public class AumentaTread extends Thread {
	
	private Contador contador;
	
	public AumentaTread (){
		
	}

	public AumentaTread(Contador contador) {
		super();
		this.contador = contador;
	}

	public Contador getContador() {
		return contador;
	}

	public void setContador(Contador contador) {
		this.contador = contador;
	}
	
	public void run (){
		for (int i=0; i<3; i++){
		contador.aumentaCuenta();
		
		}
	}
	
	
}
