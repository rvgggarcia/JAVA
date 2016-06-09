package cl.curso.java.guia1;

public class Alumno {
	
	String nombreAlumno;
	int nota1;
	int nota2;
	int nota3;


	public Alumno () {
	
	nombreAlumno= "Liz";
	nota1=40;
	nota2=40;
	nota3=40;
	
	}
	
	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public int getNota1() {
		return nota1;
	}

	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}

	public int getNota3() {
		return nota3;
	}

	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}

	public Alumno(String nombreAlumno, int nota1,int nota2,int nota3) {
		this.nombreAlumno=nombreAlumno;
		this.nota1=nota1;
		this.nota2=nota2;
		this.nota3=nota3;
	
	}	
	public int promedio ()
	{
		
		int promedio= (this.nota1+this.nota2+this.nota3)/3;
		return promedio;
		
		
	}
	 public void imprimir(){
		 System.out.println(this.nombreAlumno);
		 System.out.println(this.nota1);
		 System.out.println(this.nota2);
	     System.out.println(this.nota3);
	 }
	
}
