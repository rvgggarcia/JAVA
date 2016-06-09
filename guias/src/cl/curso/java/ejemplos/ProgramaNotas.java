package cl.curso.java.ejemplos;

import javax.swing.JOptionPane;

public class ProgramaNotas {

	public static void main(String[] args) {
		
		Nota[] notax=new Nota [3];
		
		for ( int i=0; i<notax.length; i++)
		{
			String nota= JOptionPane.showInputDialog("Ingresar nota "+ i);
			String porcentaje= JOptionPane.showInputDialog("Ingrese porcentaje " + i);
			
			notax [i]=new Nota ("", Integer.parseInt(nota), Integer.parseInt(porcentaje));
			
		}
		
		Alumno alumno=new Alumno ("Juan", notax);
		JOptionPane.showMessageDialog(null, "El promedio es: "+ alumno.calcularPromedio());

	}

}
