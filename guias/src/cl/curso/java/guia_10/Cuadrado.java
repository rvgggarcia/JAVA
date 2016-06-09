package cl.curso.java.guia_10;

public class Cuadrado extends FiguraGeometrica {

	private int lado;
	
	public Cuadrado() {
		
	}

	public Cuadrado(int lado) {
		super();
		this.lado = lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public Cuadrado(String color, int cantidadLados) {
		super(color, cantidadLados);
		
	}
	
	public Cuadrado(String color, int cantidadLados, int lado) {
		super(color, cantidadLados);
		this.lado=lado;
	}

	@Override
	public void dibujar() {
		System.out.println("_____");
		System.out.println("|    |");
		System.out.println("|____|");
		

	}

	@Override
	public double calcularArea() {
		double area= lado*lado;
		System.out.println("El area del cuadrado es : " + area);
		return area;
		
	}

}
