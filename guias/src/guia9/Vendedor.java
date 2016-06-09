package guia9;

public class Vendedor {
	
	private String nombre;
	private int semTrabajadas;
	private int canArtVendidos;
	private int valorPesosArtVendidos;
	
	public Vendedor (){
		
	}

	public Vendedor(String nombre, int semTrabajadas, int canArtVendidos, int totalVenta) {
		super();
		this.nombre = nombre;
		this.semTrabajadas = semTrabajadas;
		this.canArtVendidos = canArtVendidos;
		this.valorPesosArtVendidos = totalVenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSemTrabajadas() {
		return semTrabajadas;
	}

	public void setSemTrabajadas(int semTrabajadas) {
		this.semTrabajadas = semTrabajadas;
	}

	public int getCanArtVendidos() {
		return canArtVendidos;
	}

	public void setCanArtVendidos(int canArtVendidos) {
		this.canArtVendidos = canArtVendidos;
	}

	public int getTotalVenta() {
		return valorPesosArtVendidos;
	}

	public void setTotalVenta(int totalVenta) {
		this.valorPesosArtVendidos = totalVenta;
	}

	
	public double comision (){
		double comision;
	comision= (this.valorPesosArtVendidos*0.09)+(this.semTrabajadas*200);
	System.out.println("El total de comision del vendedor " + this.nombre + " es de : " + comision );
	return comision; 
		
		}
	}

