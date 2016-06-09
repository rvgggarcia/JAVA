package cl.curso.java.guia_10;

public class Rut implements Validable {

	private int numero;
	private String digitoVerificador;

	public Rut() {

	}

	public Rut(int numero, String digitoVerificador) {
		super();
		this.numero = numero;
		this.digitoVerificador = digitoVerificador;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDigitoVerificador() {
		return digitoVerificador;
	}

	public void setDigitoVerificador(String digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}

	@Override
	public boolean validar() {
		int multiplicador = 2;
		int suma = 0;

		for (int i = 1; i <= 8; i++) {
			int n = numero % 10;
			suma = suma + (n * multiplicador);
			multiplicador++;
			numero = numero / 10;
		}

		int residuo = suma % 11;

		String verificador = "";

		if (residuo == 0) {
			verificador = "0";
		}

		if (residuo > 0) {
			int v = 0;
			v = (11 - residuo);

			if (v == 10) {
				verificador = "K";
			}
			verificador = "" + v;

		}

		if (verificador.equals(digitoVerificador)) {
			System.out.println("RUT VALIDO");
			return true;
		}

		else
			System.out.println("RUT INVALIDO");
		return false;
	}

}
