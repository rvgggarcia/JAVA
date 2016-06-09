package cl.curso.java.ejemplos2;

import javax.swing.JOptionPane;

public class ProgramaDivision {

	public static void main(String[] args) {
		
		int dividendo=obtenerNumero ("dividendo");
		int divisor= obtenerNumero ("divisor");
		
		Division division= new Division (dividendo, divisor);
		
		try {
			division.hacerDivision();
		}
		catch (ArithmeticException e){
			JOptionPane.showMessageDialog(null,
					"ERROR AL REALIZAR LA DIVISION " + e.getMessage() + JOptionPane.ERROR_MESSAGE);
			
		}
		
	}

	
	
	public static int obtenerNumero ( String nombreDelCampo) {

		int numero = 0;
		boolean numeroValido = false;
		do {

			try {
				String dividendoX = JOptionPane.showInputDialog(" Ingresar " + nombreDelCampo);

				numero = Integer.parseInt(dividendoX);
				numeroValido = !numeroValido;

			}

			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null,
						" ERROR AL INGRESAR EL DIVIDENDO " + e.getMessage() + JOptionPane.ERROR_MESSAGE);
			}

		} while (!numeroValido);
		return numero;

	}

	


}
