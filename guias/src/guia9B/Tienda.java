package guia9B;

public class Tienda {
	
	private String nombre;
	private String tipoTienda;
	private Productos [] listaProductos;
	
	public Tienda (){
		
	}

	public Tienda(String nombre, String tipoTienda, Productos[] listaProductos) {
		super();
		this.nombre = nombre;
		this.tipoTienda = tipoTienda;
		this.listaProductos = listaProductos;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoTienda() {
		return tipoTienda;
	}

	public void setTipoTienda(String tipoTienda) {
		this.tipoTienda = tipoTienda;
	}

	public Productos[] getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(Productos[] listaProductos) {
		this.listaProductos = listaProductos;
	}


}
