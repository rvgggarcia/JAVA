package cl.curso.java.ejemplos2;

public class Division {
	
	private int dividendo;
	private int divisor;
	
	public Division (){
		
	}

	public int getDividendo() {
		return dividendo;
	}



	public void setDividendo(int dividendo) {
		this.dividendo = dividendo;
	}



	public int getDivisor() {
		return divisor;
	}



	public void setDivisor(int divisor) {
		this.divisor = divisor;
	}



	public Division(int dividendo, int divisor) {
		super();
		this.dividendo = dividendo;
		this.divisor = divisor;
	}



	public double hacerDivision (){
		return this.getDividendo()/this.getDivisor();
		
		
	}

}
