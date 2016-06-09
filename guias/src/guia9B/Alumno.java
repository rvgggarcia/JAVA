package guia9B;

public class Alumno {
	
	private String nombreAlumno;
	private int edad;
	
	public Alumno (){
	}
		
	public Alumno(String nombreAlumno, int edad) {
		super();
		this.nombreAlumno = nombreAlumno;
		this.edad = edad;
		
	}
	

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
