package cl.curso.java.ejemplos;

import java.util.Date;

public abstract class Tne extends TarjetaBip {
	
	private String nombre;
	private Date fechaExp;
	
	public Tne ()
	{}
	
	public  Tne (String nombre, Date fechaExp)
	{
		this.nombre=nombre;
		this.fechaExp=fechaExp;
	}

	public String getNombre ()
	{
		return nombre;
	}
	
	public void setNombre (String nombre)
	{
		this.nombre=nombre;
	}
	
	public Date getFechaExp ()
	{
		return fechaExp;
	}
	
	public void setFechaExp (Date fechaExp)
	{
		this.fechaExp=fechaExp;
	}
}
