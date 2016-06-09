package guia9B;

public class Asignatura {
	
	private String nombreAsignatura;
	private String nombreProfesor;
	private Alumno [] alumno;
	
	public Asignatura (){
		
	}
	
	public String getNombreAsignatura() {
		return nombreAsignatura;
	}

	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}

	public String getNombreProfesor() {
		return nombreProfesor;
	}

	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}

	public Alumno[] getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno[] alumno) {
		this.alumno = alumno;
	}

	public Asignatura(String nombreAsignatura, String nombreProfesor, Alumno[] alumno) {
		super();
		this.nombreAsignatura = nombreAsignatura;
		this.nombreProfesor = nombreProfesor;
		this.alumno = alumno;
	}



	public void imprimir (){
		System.out.println("Asignatura: " + nombreAsignatura);
		System.out.println("Profesor: " + nombreProfesor);
	}

}
