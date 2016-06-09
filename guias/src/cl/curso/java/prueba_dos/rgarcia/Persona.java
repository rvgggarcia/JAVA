/**
 * 
 */
package cl.curso.java.prueba_dos.rgarcia;

/**
 * @author Royerliz
 *
 */
public class Persona {

	private String nombre;
	private int edad;
	private String rut;
	private int peso;
	private double altura;

	public Persona() {
	}

	public Persona(String nombre, int edad, String rut, int peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.rut = rut;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * Este metodo permite calcular el IMC de una persona y en base a ello
	 * decirle si esta en su pero ideal, por encima o por debajo del mismo.
	 */

	public void calcularIMC() {
		double pesoIdeal;
		int imc;
		pesoIdeal = (peso /(altura * altura));
		imc=0;

		if (this.getPeso() > pesoIdeal) {
			imc=1;
			System.out.println(imc + "  Tiene sobrepeso");

		}

		if (this.getPeso() == pesoIdeal) {
			imc=0;
			System.out.println( imc + "  Peso ideal");
		}

		if (this.getPeso() < pesoIdeal) {
			imc=-1;
			System.out.println( imc +"  Esta por debajo del peso ideal");
		}

	}

	/**
	 * Este metodo te dice si es mayor de edad o no
	 * 
	 * @return
	 */

	public boolean esMayorEdad() {

		if (this.getEdad() > 18) {
			System.out.println("Esta persona es mayor de edad");
			return true;
		} else
			System.out.println("Esta persona NO es mayor de edad");
		return false;

	}

}
