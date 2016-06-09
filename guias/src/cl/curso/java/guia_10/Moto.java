package cl.curso.java.guia_10;

public class Moto implements Desplazable {
	
	private String marca;
	private String modelo;
	
	public Moto (){
		
	}

	public Moto(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	@Override
	public void desplazar(int km) {
		System.out.println("La moto se desplaza " + km + " kilometros en la carretera");
		
	}



		
		

	

}
