package cl.curso.java.guia8;

public class Empleado {
	
	private String nombre;
	private int rut;
	private int sueldoBase;
	private int pagoHoraExtra;
	private int horasExtrasRealizadas;
	
	public Empleado ()
	{}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public int getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getPagoHoraExtra() {
		return pagoHoraExtra;
	}

	public void setPagoHoraExtra(int pagoHoraExtra) {
		this.pagoHoraExtra = pagoHoraExtra;
	}

	public int getHotasExtrasRealizadas() {
		return horasExtrasRealizadas;
	}

	public void setHotasExtrasRealizadas(int hotasExtrasRealizadas) {
		this.horasExtrasRealizadas = hotasExtrasRealizadas;
	}

	public Empleado(String nombre, int rut, int sueldoBase, int pagoHoraExtra, int horasExtrasRealizadas) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.sueldoBase = sueldoBase;
		this.pagoHoraExtra = pagoHoraExtra;
		this.horasExtrasRealizadas = horasExtrasRealizadas;
	}
	
	public double sueldoLiquido()
	{
		double sueldoLiquido= this.getSueldoBase()- (this.getSueldoBase()*0.17);
		return sueldoLiquido;
	}
	
	public double sueldoBruto ()
	{
		double sueldoBruto= this.getSueldoBase()+this.getPagoHoraExtra();
		return sueldoBruto;
		

	}

}
