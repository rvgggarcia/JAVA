package cl.curso.java.ejemplos3;

public class Bomba implements Runnable {

	private String []segundos= {"nueve", "ocho", "siete", "seis", "cinco", "cuatro", "tres", "dos", "uno", "cero"};
	
	public Bomba (){
		
	}
	
	@Override
	public void run() {
		int i;
		for (i=0; i<10; i++)  {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(segundos[i]);
			
		}
		
	}
	

}
