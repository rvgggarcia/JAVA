package cl.curso.java.guia_10;

public class Triangulo extends FiguraGeometrica {
	
	private int base;
	private int altura;

	public Triangulo() {
		
	}

	
	public Triangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}


	public int getBase() {
		return base;
	}


	public void setBase(int base) {
		this.base = base;
	}


	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}


	public Triangulo(String color, int cantidadLados) {
		super(color, cantidadLados);
		// TODO Auto-generated constructor stub
	}
	
	public Triangulo(String color, int cantidadLados, int base, int altura){
		super(color, cantidadLados);
		this.base=base;
		this.altura=altura;
	}

	@Override
	public void dibujar() {
		System.out.println("   /\\  ");
		System.out.println("  /  \\");
		System.out.println(" /____\\");
	
	}

	@Override
	public double calcularArea() {
		double area= base*altura;
		System.out.println("El area del triangulo es : " + area );
		return area;
		
	}

}
