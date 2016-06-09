package cl.curso.java.guia1;

public class Mamiferos {
	
	private int cantidadPatas;
	private int mesesGestacion;
	
	public Mamiferos ()
	{}
	

	
	public Mamiferos (int cantidadPatas, int mesesGestacion){
	this.cantidadPatas=cantidadPatas;
	this.mesesGestacion=mesesGestacion;
	
}
	
	public int getCantidadPatas() {
		return cantidadPatas;
	}
	public void setCantidadPatas(int cantidadPatas) {
		this.cantidadPatas = cantidadPatas;
	}
	public int getMesesGestacion() {
		return mesesGestacion;
	}
	public void setMesesGestacion(int mesesGestacion) {
		this.mesesGestacion = mesesGestacion;
	}
	
	public void caminar (){
	
	System.out.println("Camina en " + this.cantidadPatas + "patas");
	}
	
	

}
