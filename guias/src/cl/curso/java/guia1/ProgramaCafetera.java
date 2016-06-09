package cl.curso.java.guia1;

import javax.swing.JOptionPane;

public class ProgramaCafetera {

	public static void main(String[] args) {
		
		Cafetera cafetera1=new Cafetera ();
	
		boolean opcionSalir=false;
		do
		{
		String opcion=JOptionPane.showInputDialog(
				"OPCION 1: LLENAR CAFETERA \n"
				+ "OPCION 2: SERVIR TAZA \n"
				+ "OPCION 3: VACIAR CAFETERA \n"
				+ "OPCION 4: AGREGAR CAFE \n"
				+ "OPCION 5: STATUS DE LA CAFETERA \n"); 
		
				switch (opcion)
				{
				case "1":
				{
					cafetera1.llenarCafetera();
					 System.out.println("Cafetera llena");
					break;
				}
				
				case "2":
				{
					cafetera1.servirTaza(); 
					break;
				}
				case "3":
				{
					cafetera1.vaciarCafetera();
					break;
				}
				case "4":
				{
					cafetera1.agregarCafe();
					break;				
				}
				case "5":
				{
					cafetera1.imprimir();
					break;
				}
				case "6":
				{
					opcionSalir=!opcionSalir;
					break;
				}
				}
		}
		
				while(!opcionSalir);
				
		}
	}


		
		
