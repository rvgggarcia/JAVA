package cl.curso.java.guia8;

public class ProgramaFecha {

	public static void main(String[] args) {
		
		Fecha fecha1=new Fecha ();
		Fecha fecha2= new Fecha (112,5,2016);
		
		fecha1.imprimirFecha();
		fecha1.imprimirFechaFormato();
		
		System.out.println( " El dia es: "+ fecha1.validarDia());
		System.out.println( " El mes es: "+ fecha2.validarMes());
		
		fecha2.imprimirFecha();
		fecha2.imprimirFechaFormato();
		
		
		System.out.println(  " El dia es: "+fecha2.validarDia());
		System.out.println(  " El mes es: "+fecha1.validarMes());
		

	}

}
