package cl.curso.java.control;

/**
 * 
 * @author Royerliz
 *
 */

public class Articulo {
	
	private String nombre;
	private double costoBase;
	
	public Articulo( String nombre, double costoBase){
	
	this.nombre=nombre;
	this.costoBase=costoBase;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getCostoBase() {
		return costoBase;
	}
	public void setCostoBase(double costoBase) {
		this.costoBase = costoBase;
	}
	public int getImprimir() {
		return imprimir;
	}
	public void setImprimir(int imprimir) {
		this.imprimir = imprimir;
	}
	public double precioAlDetalle ()  {
	double precioAlDetalle=costoBase+(0.3*costoBase);
	return precioAlDetalle;
	}
	
	public double precioAlMayor () {
	
	double precioAlMayor = costoBase+(0.15*costoBase);
	return precioAlMayor;
	
	}
	
	public int imprimir;
	
	{
	
	System.out.println( nombre );
	System.out.println( costoBase );
	System.out.println( precioAlDetalle() );
	System.out.println( precioAlMayor() );
	}

}
