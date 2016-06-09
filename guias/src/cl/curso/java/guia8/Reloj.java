package cl.curso.java.guia8;

public class Reloj {
	private int hora;
	private int minuto;
	private int segundo;
	
	public Reloj (){
		
	  hora=0;
	  minuto=0;
	  segundo=0;
	  
	}
		
	public Reloj (int hora, int minuto, int segundo)
	{
	this.hora=hora;
	this.minuto=minuto;
	this.segundo=minuto;
	
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	public int avanzarSegundo ()
	{
		segundo=segundo+1;
		return segundo;
	}
	
	public int retrocederSegundo ()
	{
		segundo=segundo-1;
		return segundo;
		
	}
	
	public void imprimir ()
	{
		System.out.println("HORA: "+ hora);
		System.out.println("MINUTO: "+ minuto);
		System.out.println("SEGUNDO: " + segundo);
	
	}

}
