package cl.curso.java.guia1;

public class Calculadora {
	
	int numero1;
	int numero2;
	
	public Calculadora () {
	numero1=10;
	numero2=20;

	}
	
	public Calculadora (int numero1, int numero2){
		this.numero1=numero1;
		this.numero2=numero2;
		
		}
	
	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	
	}
	public int sumar()
	{
		int suma=this.numero1+this.numero2;
				return suma;
	}
	
	public int restar()
	{
	int resta=this.numero1-this.numero2;
	return resta;
	}
}
