package cl.curso.java.guia_10;

public class Circulo extends FiguraGeometrica {
	
	private double radio;

	public Circulo() {
		
	}

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public Circulo(String color, int cantidadLados) {
		super(color, cantidadLados);
		// TODO Auto-generated constructor stub
	}
	
	public Circulo(String color, int cantidadLados, double radio) {
		super(color, cantidadLados);
		this.radio=radio;
	}

	@Override
	public void dibujar() {
		System.out.println("   * * *  ");
		System.out.println(" *       *");
		System.out.println(" *       *");
		System.out.println("  *  *  * ");
		
	
		
	}

	@Override
	public double calcularArea() {
		double area= Math.PI*(radio*radio);
		System.out.println("El area del circulo es : " + area);
		return area;
	}

}
