package guia9;

public class Auto {

	private int codigo;
	private String marca;
	private String tipo;
	private int modelo;
	private String patente;
	private int kilometraje;
	private int precioVenta;
	private int unidadesPorVender;
	
	public Auto ()
	{}

	public Auto(int codigo, String marca, String tipo, int modelo, String patente, int kilometraje, int precioVenta,
			int unidadesPorVender) {
		super();
		this.codigo = codigo;
		this.marca = marca;
		this.tipo = tipo;
		this.modelo = modelo;
		this.patente = patente;
		this.kilometraje = kilometraje;
		this.precioVenta = precioVenta;
		this.unidadesPorVender = unidadesPorVender;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

	public int getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getUnidadesPorVender() {
		return unidadesPorVender;
	}

	public void setUnidadesPorVender(int unidadesPorVender) {
		this.unidadesPorVender = unidadesPorVender;
	}
	
	
	public void vender () {
		
		if (unidadesPorVender>0){
			System.out.println("VENTA EFECTUADA CORRECTAMENTE");
			unidadesPorVender= (unidadesPorVender-1);
			System.out.println("QUEDA EN STOCK "+ unidadesPorVender );
		}
	
		else {
			System.out.println("NO HAY MAS UNIDADES EN STOCK. NO ES POSIBLE EFECTUAR LA VENTA");
		
	   }

	}

}

