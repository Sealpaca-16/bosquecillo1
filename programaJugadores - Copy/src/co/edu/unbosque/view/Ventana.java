package co.edu.unbosque.view;

import java.util.Scanner;

public class Ventana {

	private Scanner leer = new Scanner(System.in);
	
	
	public String pedirNombre(){
		System.out.println("digite el nombre del jugador");
		return leer.next();
		
	}
	
	
	public String pedirClub(){
		System.out.println("digite el club del jugador");
		return leer.next();
		
	}
	
	
	public int pedirNumeroBalon() {
		System.out.println("digite el numero de balones");
		return leer.nextInt();
	}
	
	
	
	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	
	
	
	public byte pedirOpcion(String menu) {
		System.out.println(menu);
		return leer.nextByte();
	}


	public void mostrarMensajes(String m) {
		System.out.println(m);
		
	}
	
	

	
	

}
