package guia9;

import javax.swing.JOptionPane;

public class ProgramaPersona {

	public static void main(String[] args) {
		Persona persona1= new Persona ();
		
		
		persona1.setNombre(JOptionPane.showInputDialog("Ingrese su nombre"));
		persona1.setApellido(JOptionPane.showInputDialog("Ingrese su apellido"));
		persona1.setTelefono(JOptionPane.showInputDialog("Ingrese su numero de telefono"));
		
		while (persona1.validarTelefono()!=true)
				{
			      JOptionPane.showMessageDialog(null, "NUMERO INVALIDO. \n "
			      		+ "El numero de telefono DEBE tener 9 digitos ");
			      persona1.setTelefono(JOptionPane.showInputDialog("Ingrese su numero de telefono"));
			      persona1.validarTelefono();
			         
				}

		persona1.imprimir();
	
	}
}




