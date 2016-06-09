package guia9B;

public class ProgramaAlumno {

	public static void main(String[] args) {
		
		Alumno [] alumnos= {new Alumno ("Julian BLanco ", 23),
				new Alumno ("Gisela Garaban ", 45),
				new Alumno ("Juan Sanchez ", 26)};
		
		Asignatura asignatura = new Asignatura ("JAVA", "Francisco Huelate", alumnos);
		
		asignatura.imprimir();
		
		
		System.out.println("La cantidad de alumnos de esta asignatura es : " + alumnos.length );
		for( int i = 0; i < alumnos.length ; i++ )
		{
			System.out.println( alumnos[i].getNombreAlumno()
					+ alumnos [i].getEdad() );
					
		}
		
	}
	}
		