package cl.curso.java.guia1;

public class Persona {

		String nombre;
		String apellidoPaterno;
		String apellidoMaterno;
		int edad;
		
		public Persona () {
			nombre="liz";
			apellidoPaterno="Garcia";
			apellidoMaterno="Garaban";
			edad=23;
		
		}
		public Persona(String nombre, String apellidoPaterno, String apellidoMaterno,int edad) {
		
		this.nombre=nombre;
		this.apellidoPaterno=apellidoPaterno;
		this.apellidoMaterno=apellidoMaterno;
		this.edad=edad;
				
		}
			
		public void imprimir () {
			
			System.out.println(this.nombre);
			System.out.println(this.apellidoPaterno);
			System.out.println(this.apellidoMaterno);
			System.out.println(this.edad);
		}

	}

