package cl.curso.java.guia8;

public class Fecha {

	private int dia;
	private int mes;
	private int anio;
	public final String [] nombreMeses= { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre","octubre","noviembre","diciembre"   };
	public final int [] cantidadDiasMes= {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public Fecha ()
	{
	dia=23;
	mes=5;
	anio=1995;
	}
	
	
	public Fecha(int dia, int mes, int a�o)
	{
	this.dia=dia;
	this.mes=mes;
	this.anio=a�o;
	}


	public int getDia() {
		return dia;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}


	public int getMes() {
		return mes;
	}


	public void setMes(int mes) {
		this.mes = mes;
	}


	public int getAnio() {
		return anio;
	}


	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	
   public boolean validarDia ()
   {
	   if (validarMes())
	   
	   {
		   if (this.getMes()==2 && this.esBisiesto())
		   {
			   return (this.getDia()>=1 && this.getDia()<=29);
		   }   
		   else 
		   {
			int cantDias= cantidadDiasMes [this.getMes()-1];
			return this.getDia() >=1 && this.getDia() <=cantDias;
		   }
		   	   
	   }
	   else 
	   {
		   return false;
	   }
   }
   
   
   public boolean validarMes ()
   
   {
	   return this.getMes()>=1 && this.getMes()<=12;
   }
   
   public void imprimirFecha ()
   {
	   System.out.println(this.getDia() + "-"+ this.getMes() + "-" + this.getAnio());    
   }
   
   public void imprimirFechaFormato ()
   {
	  String nombreMes= nombreMeses [this.getMes()-1];
	   System.out.println(this.getDia() + " de " + nombreMes + " de " + this.getAnio());
   
   }
   
   public boolean esBisiesto ()
   {
	
		return ((this.getAnio()%4==0 && this.getAnio()%400==0) && this.getAnio()%100 !=0);
	}
   
   
}
