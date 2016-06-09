package cl.curso.java.guia1;

import javax.swing.JOptionPane;

/**
 * 
 * @author Royerliz Garcia
 *
 */

//atributos

public class Cafetera {
	private int capacidadMaxima;
	private int cantidadActual;
	
//constructor
	
 public Cafetera ()
 {
	 this.capacidadMaxima=1000;
	 this.cantidadActual=1000;
 }
	
 public Cafetera (int capacidadMaxima, int cantidadActual)
 {
		 this.capacidadMaxima= capacidadMaxima;
		 this.cantidadActual= cantidadActual;
		 
 }
 
 //get and set

public int getCapacidadMaxima() {
	return capacidadMaxima;
}

public void setCapacidadMaxima(int capacidadMaxima) {
	this.capacidadMaxima = capacidadMaxima;
}

public int getCantidadActual() {
	return cantidadActual;
}

public void setCantidadActual(int cantidadActual) {
	this.cantidadActual = cantidadActual;
}
 //acciones

public void llenarCafetera ()
{  
	cantidadActual=capacidadMaxima;
		
}

public void servirTaza ()
{
	String cantidadTaza=JOptionPane.showInputDialog("Indique la cantidad de cc a servir en la taza");
	 
    int taza= Integer.parseInt(cantidadTaza);
    
  
    
    if (cantidadActual>0)
          if (taza>cantidadActual)
          System.out.println("No hay suficiente cafe para completar su taza, se dispensara lo que queda: " + cantidadActual);
          cantidadActual=cantidadActual-taza;
          if (cantidadActual<0)
        	  System.out.println("NO HAY MAS CAFE");
        
       
          if(taza<=cantidadActual)
          System.out.println("Su taza ha sido servida");
          cantidadActual=cantidadActual-taza;
          
}

public void vaciarCafetera ()
{
	cantidadActual=0;
	
}

public void agregarCafe ()
{
	String agregarCafe=JOptionPane.showInputDialog("Indique la cantidad de cafe a agregar");
	 
    int cafe= Integer.parseInt(agregarCafe);
    
    if (cafe>capacidadMaxima)
    	System.out.println("LA cantidad de cafe supera la capacidad maxima de la cafetera");
	
}

public void imprimir ()
{
	System.out.println(this.capacidadMaxima);
	System.out.println(this.cantidadActual);
}
 
 
}
