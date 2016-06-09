package guia9B;

public class Productos {
	private String nombreProducto;
	private String tipoArticulo;
	private int cantidad;
	private int precio;
	
	public Productos (){
		
	}

	public Productos(String nombreProducto, String tipoArticulo, int cantidad, int precio) {
		super();
		this.nombreProducto = nombreProducto;
		this.tipoArticulo = tipoArticulo;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getTipoArticulo() {
		return tipoArticulo;
	}

	public void setTipoArticulo(String tipoArticulo) {
		this.tipoArticulo = tipoArticulo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	

}
