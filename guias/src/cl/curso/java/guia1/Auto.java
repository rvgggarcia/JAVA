package cl.curso.java.guia1;

public class Auto {

	String color;
	String marca;
	String patente;
	Motor motor;
	int kilometrosRecorridos;
	
	
	public Auto() {
		color="azul";
		marca="honda";
		patente="jjjj23";
		kilometrosRecorridos=0;
	}
	
	public Auto(String color, String marca, String patente) {
		this.color= color;
		this.marca=marca;
		this.patente=patente;
	}
	
	public String getColor() {
		
		return this.color;
	}
	
	public void setColor(String color) {
		
		this.color=color;
	}
	
	
    public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public String getMarca() {
		
		return this.marca;
	}
	
	public void setMarca(String marca) {
		
		this.marca=marca;
	}
	
	
    public String getPatente() {
		
		return this.patente;
	}
	
	public void setPatente(String patente) {
		
		this.patente=patente;
	}
	
	public int getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}

	public void setKilometrosRecorridos(int kilometrosRecorridos) {
		this.kilometrosRecorridos = kilometrosRecorridos;
	}

	public void imprimir () {
		
		System.out.println(this.color);
		System.out.println(this.marca);
		System.out.println(this.patente);
		System.out.println(this.kilometrosRecorridos);
	}
	
	
	public void avanzar(int kilometros) {
		
		if (this.motor.isEncendido()){
		System.out.println("Avanzar \n" + this.marca );
		this.kilometrosRecorridos= this.kilometrosRecorridos+kilometros;
		
	}
		
		else
		{
			System.out.println("El auto no esta encendido");
		}
			
	}
	
	public void Encendido() {
		
		this.motor.setEncendido(true);
	}
}
