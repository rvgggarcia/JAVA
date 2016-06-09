package cl.curso.java.guia1;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		
		Auto autoToyota= new Auto ("rojo", "toyota", "aaaaa23");
		Motor motorToyota=new Motor(2000,"bencina");
		autoToyota.setMotor(motorToyota);
		
		boolean opcionSalir=false;
		do
		{
			String opcion=JOptionPane.showInputDialog(
					"Opcion 1: Encender auto\n"
					+ "Opcion 2: Avanzar\n"
				    +"Opcion 3 : Imprimir\n"
					+ "Opcion 4: salir\n");
			switch (opcion)
			{
			case "1":
			{
				autoToyota.Encendido();
				break;
			
			}
			case "2":
			{  
				String kM=JOptionPane.showInputDialog("Ingrese KM");
				int kilometros=Integer.parseInt(kM);
				autoToyota.avanzar(kilometros);
				break;
			
			}
			case "3":
			{
				autoToyota.imprimir();
				break;
			
			}
			case "4":
			{
				opcionSalir=!opcionSalir;
				break;
			
			}
			default:
			
			{
				
				break;
				
			}
			
			}
		}
		
		while(!opcionSalir);
		
		
//		autoToyota.setColor("verde");
//		autoToyota.avanzar();
//		
//		
//		Auto autoHonda=new Auto ("blanco", "honda", "aaaa24");
//		Auto autoDefecto= new Auto ();
//		
//		autoToyota.avanzar();
//		autoToyota.imprimir();
//		autoToyota.setColor("verde");
//		autoToyota.setMarca("chevrolet");
//		autoToyota.setPatente("76994ju");
//		autoToyota.imprimir();
//		
//		autoHonda.avanzar();
//		autoHonda.imprimir();
//		autoToyota.setColor("amarillo");
//		autoToyota.setMarca("yaris");
//		autoToyota.setPatente("674gfu");
//		autoToyota.imprimir();
//		
//		autoDefecto.avanzar();
//		autoDefecto.imprimir();
//		autoDefecto.setColor("vinotinto");
//		autoDefecto.setMarca("corola");
//		autoDefecto.setPatente("453ft5");
//		autoDefecto.imprimir();
		
	}

}
