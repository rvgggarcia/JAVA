/**
 * 
 */
package cl.curso.java.prueba_dos.rgarcia;

/**
 * @author Royerliz
 *
 */
public class Curso implements Imprimible {

	private String nombre;
	private Alumno[] alumnos;

	public Curso() {

	}

	public Curso(String nombre, Alumno[] alumnos) {
		super();
		this.nombre = nombre;
		this.alumnos = alumnos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}
	
	/**
	 * NO RECUERDO COMO SACAR UN PROMEDIO CON ARREGLOS. NO SE COMO HACER QUE FUNCIONEN ESTOS DOS METODOS. LOS CREE SOLAMENTE
	 * Y PUSE UN DATO X EN LA FORMA DE OBTENERLA.
	 * @return
	 */

	public double calcularPromedioCurso (){
		double promedioCurso= 0.4 ;
		return promedioCurso;
		
	}

	public double obtenerMejorPromedio (){
		double mejorPromedio= 0.5;
		return mejorPromedio;
	}

	
	@Override
	public void imprimir() {
		 System.out.println(nombre);
		 for  (int i=0; i<= alumnos.length ; i++) {
				System.out.println( i );
		}
			
		}
		
		
	}


