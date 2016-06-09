package guia9;

public class Equipo {
	private String nombre;
	private int cantPartidosGanados;
	private int cantPartidosEmpatados;
	private int cantPartidosPerdidos;
	private int partidosJugados;
	private int puntosTotales;
	
	public Equipo () {
		
	}
	
	

	public Equipo(String nombre, int cantPartidosGanados, int cantPartidosEmpatados, int cantPartidosPerdidos,
			int partidosJugados, int puntosTotales) {
		super();
		this.nombre = nombre;
		this.cantPartidosGanados = cantPartidosGanados;
		this.cantPartidosEmpatados = cantPartidosEmpatados;
		this.cantPartidosPerdidos = cantPartidosPerdidos;
		this.partidosJugados = partidosJugados;
		this.puntosTotales = puntosTotales;
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCantPartidosGanados() {
		return cantPartidosGanados;
	}


	public void setCantPartidosGanados(int cantPartidosGanados) {
		this.cantPartidosGanados = cantPartidosGanados;
	}


	public int getCantPartidosEmpatados() {
		return cantPartidosEmpatados;
	}


	public void setCantPartidosEmpatados(int cantPartidosEmpatados) {
		this.cantPartidosEmpatados = cantPartidosEmpatados;
	}


	public int getCantPartidosPerdidos() {
		return cantPartidosPerdidos;
	}


	public void setCantPartidosPerdidos(int cantPartidosPerdidos) {
		this.cantPartidosPerdidos = cantPartidosPerdidos;
	}


	public int getPartidosJugados() {
		return partidosJugados;
	}


	public void setPartidosJugados(int partidosJugados) {
		this.partidosJugados = partidosJugados;
	}


	public int getPuntosTotales() {
		return puntosTotales;
	}


	public void setPuntosTotales(int puntosTotales) {
		this.puntosTotales = puntosTotales;
	}



	public void ganar () {
		
		puntosTotales= puntosTotales+3;
		cantPartidosGanados= cantPartidosGanados+1;
		partidosJugados= partidosJugados+1;
		
		
		System.out.println("PARTIDO GANADO");
		System.out.println( nombre + " tiene 3 nuevos puntos  " );
		System.out.println( "Ha jugado " + partidosJugados + " partidos durante la temporada");
		System.out.println("PUNTOS: " + puntosTotales);
	}
	
	public void perder () {
		
		puntosTotales= puntosTotales+0;
		cantPartidosPerdidos= cantPartidosPerdidos+1;
		partidosJugados= partidosJugados+1;
		
		
		System.out.println("PARTIDO PERDIDO");
		System.out.println( nombre + " tiene 0 nuevos puntos  " );
		System.out.println( "Ha jugado " + partidosJugados + " partidos durante la temporada");
		System.out.println("PUNTOS: " + puntosTotales);
		
	}
	
	public void empatar (){
		puntosTotales= puntosTotales+1;
		cantPartidosEmpatados= cantPartidosEmpatados+1;
		partidosJugados= partidosJugados+1;
		
		
		System.out.println("PARTIDO EMPATADO");
		System.out.println( nombre + " tiene 1 nuevos puntos  " );
		System.out.println( "Ha jugado " + partidosJugados + " partidos durante la temporada");
		System.out.println("PUNTOS: " + puntosTotales);
		
		
	}

}
