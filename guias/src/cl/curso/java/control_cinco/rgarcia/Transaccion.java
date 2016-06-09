/**
 * 
 */
package cl.curso.java.control_cinco.rgarcia;

import java.util.Date;

/**
 * @author Royerliz
 *
 */
public class Transaccion {

	private String id;
	private String tipo;
	private Date fecha;
	private int monto;

	public Transaccion() {

	}

	public Transaccion(String id, String tipo, Date fecha, int monto) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.fecha = fecha;
		this.monto = monto;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Transaccion) {
			Transaccion transaccion = (Transaccion) obj;
			return this.getTipo().equals(transaccion.getTipo());
		}
		return false;
	}
	
	

}
