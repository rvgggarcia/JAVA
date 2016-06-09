package guia9B;

public class ProgramaTienda {

	public static void main(String[] args) {
		
		Productos [] productos= {new Productos ("Desifectante ", "articulo de aseo", 5, 2500),
				new Productos ("Confort ", "articulo para el baño ", 45, 1700),
				new Productos ("Sedal ", "Articulo de estetica", 67, 2600)};
		
		Tienda tienda= new Tienda ("ABASTO EL PODER", "tienda de abarrotes ", productos);
		
		System.out.println(tienda.getNombre());
	
	
	
		for( int i = 0; i < productos.length ; i++ )
		{
			System.out.println( productos[i].getNombreProducto ()
					+ productos [i].getPrecio()+ " $" );
					
		}
		
	}
	}
		