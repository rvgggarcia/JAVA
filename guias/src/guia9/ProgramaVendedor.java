package guia9;

public class ProgramaVendedor {

	public static void main(String[] args) {
		Vendedor vendedor1= new Vendedor ("Pedro Perez", 2,50, 10000);
		Vendedor vendedor2=new Vendedor ("Juana Camino", 5,908, 5000000);
		
		vendedor1.comision();
		vendedor2.comision();

	}

}
