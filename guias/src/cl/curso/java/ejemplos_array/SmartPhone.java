/**
 * 
 */
package cl.curso.java.ejemplos_array;

import java.util.ArrayList;

/**
 * @author Royerliz
 *
 */
public class SmartPhone {
	
	private String marca;
	private String modelo;
	private int memoriaMB;
	private ArrayList<App> apps;
	
	public SmartPhone(String marca, String modelo, int memoriaMB, ArrayList<App> apps) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.memoriaMB = memoriaMB;
		this.apps = apps;
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

	public int getMemoriaMB() {
		return memoriaMB;
	}

	public void setMemoriaMB(int memoriaMB) {
		this.memoriaMB = memoriaMB;
	}

	public ArrayList<App> getApps() {
		return apps;
	}

	public void setApps(ArrayList<App> apps) {
		this.apps = apps;
		
	}
	
	
	
	public void instalarApp (App app){

		
		
	}
	
	
	
	public void desinstalarApp (App app){
		
	}
	
	

}
