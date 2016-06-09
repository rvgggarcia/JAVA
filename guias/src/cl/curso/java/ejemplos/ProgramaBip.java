package cl.curso.java.ejemplos;

import java.util.Calendar;

public class ProgramaBip {

	public static void main(String[] args) {
		TarjetaBipClasica clasica= new TarjetaBipClasica ();
		
		System.out.println("SIMULACION TARJETA BIP ADULTO :");
		
		System.out.println("\n DATOS DE LA TARJETA");
				
		clasica.setNumTarjeta(343434732);
		clasica.setSaldo(5000);
		clasica.imprimir ();
		
		System.out.println("\n SIMULACION PAGAR VIAJE");
		clasica.pagarViaje();
		clasica.imprimir();
		
		System.out.println("\n SIMULACION RECARGAR");
		clasica.recargar(30000);
		
			
		System.out.println("_______________________");
		
		System.out.println("\n SIMULACION TARJETA BIP TNE ESTUDIANTE BASICA :");
		
		TarjetaBasica basica=new TarjetaBasica ();
		
		System.out.println("\n DATOS DE LA TARJETA");
		
		basica.setNumTarjeta(343434732);
		basica.setSaldo(5000);
		
		Calendar cal = Calendar.getInstance();
		cal.set(1992, 8, 10);
		basica.setFechaExp(cal.getTime());
		
		basica.imprimir ();
		System.out.println("La fecha de expiracion es : " + basica.getFechaExp());
		
		System.out.println("\n SIMULACION PAGAR VIAJE");
	    basica.pagarViaje();
		basica.imprimir();
		
		System.out.println("\n SIMULACION RECARGAR");
		basica.recargar(4000);
		basica.imprimir();
		
		System.out.println("_______________________");
		
		System.out.println("\n SIMULACION TARJETA BIP TNE ESTUDIANTE UNIVERSITARIO :");
		
		TarjetaUniversitaria uni= new TarjetaUniversitaria ();
		
		System.out.println("\n DATOS DE LA TARJETA");
		
		uni.setNumTarjeta(46374637);
		uni.setSaldo(500);
		
		Calendar cale = Calendar.getInstance();
		cale.set(1992, 9, 10);
		uni.setFechaExp(cale.getTime());
		
		
		uni.imprimir ();
		System.out.println("La fecha de expiracion es : " + uni.getFechaExp());
	
		System.out.println("\n SIMULACION PAGAR VIAJE");
		uni.pagarViaje();
		uni.imprimir ();
		
		System.out.println("\n SIMULACION RECARGAR");
		uni.recargar(10000);
		uni.imprimir();
		
		System.out.println("\n SIMULACION PAGAR VIAJE DESPUES DE LA RECARGA");
		uni.pagarViaje();
		uni.imprimir();
		
		}		

	
}
