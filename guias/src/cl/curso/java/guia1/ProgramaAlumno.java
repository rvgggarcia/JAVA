package cl.curso.java.guia1;

public class ProgramaAlumno {

	public static void main(String[] args) {

		
			Alumno alumno1 = new Alumno();
			alumno1.imprimir();
	
			int promedio= alumno1.promedio();
			System.out.println(promedio);

			Alumno alumno2 = new Alumno("Pedro", 45, 34, 67);
			alumno2.imprimir();
			
			promedio= alumno2.promedio();
			System.out.println(promedio);
		}

	}


