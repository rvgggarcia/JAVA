package cl.curso.java.guia_10;

public class Barco implements Desplazable {
	private int numeroBarco;
	private String franquisiaMaritima;
	private String nombre;
	
	public Barco (){
		
	}
	

	public int getNumeroBarco() {
		return numeroBarco;
	}


	public void setNumeroBarco(int numeroBarco) {
		this.numeroBarco = numeroBarco;
	}



	public String getFranquisiaMaritima() {
		return franquisiaMaritima;
	}



	public void setFranquisiaMaritima(String franquisiaMaritima) {
		this.franquisiaMaritima = franquisiaMaritima;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Barco(int numeroBarco, String franquisiaMaritima, String nombre) {
		super();
		this.numeroBarco = numeroBarco;
		this.franquisiaMaritima = franquisiaMaritima;
		this.nombre = nombre;
	}



	@Override
	public void desplazar(int km) {
		System.out.println("El barco se desplaza " + km + " kilometros en el mar");

	}

}
