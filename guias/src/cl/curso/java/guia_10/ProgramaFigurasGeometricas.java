package cl.curso.java.guia_10;

public class ProgramaFigurasGeometricas {

	public static void main(String[] args) {

		Triangulo t= new Triangulo ("rojo",3, 5,2 );
		
		t.calcularArea();
		t.dibujar();
	
		
		Cuadrado c= new Cuadrado ("amarillo",4, 5);
		c.calcularArea();
		c.dibujar();
		
		Circulo cir= new Circulo ("azul",0, 6);
		cir.calcularArea();
		cir.dibujar();

	}

}
