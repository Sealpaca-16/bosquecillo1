package co.edu.unbosque.controller;

import co.edu.unbosque.model.Dato;
import co.edu.unbosque.view.Ventana;

public class Control {


	
		private Ventana v = new Ventana();
		private Dato datito = new Dato();
		private Dato nombre;
		byte contadorNombre = 0;
		
		
		public void run() {
			
			byte opcion ;
			
			do {
				
				//menu creado	
						String menu = "Señor ususario digite la opcion que desea realizar"
				        + "\n 1. ingresar datos jugadores" 
					    + "\n 2. mostrar los ultimos 15 datos de los jugadores"
						+ "\n 3. Maximo ganador de balon de oro"
						+ "\n 4. salir del programa";
						opcion = v.pedirOpcion(menu);
					
				// condicional multiple		
				switch(opcion) {
				case 1:
					hacerCaso1();
					
					break;
				case 2:
					hacerCaso2();
					break;
				case 3:
					hacerCaso3();
				
				case 4:
					v.mostrarMensaje("Gracias por usar este programa");
					break;
				default:
					v.mostrarMensajes("ha digitado una opcion invalida");
					break;
				}
				
			}while(opcion!=3);
		}
		
		
		public void hacerCaso1() {
			
			
			for (int i = 0; i < 15; i++) {
	            System.out.println("Señorito usuario ingrese el nombre del jugador " + i + ":");
	            datito.getNombres()[i] = v.pedirNombre();

	            System.out.println(" Señorito usuario ingrese el club de " + datito.getNombres()[i] + ":");
	            datito.getClubes()[i] = v.pedirClub();

	            System.out.println("Señorito usuario ingrese la cantidad de Balones de Oro de " + datito.getNombres()[i] + ":");
	            datito.getBalonesDeOro()[i] = v.pedirNumeroBalon();
	            
	            
	             
	        }
		
	    }
		public void hacerCaso2() {
			
			System.out.println("\nInformación de los jugadores:");
	        for (int i = 0; i < 15; i++) {
	            System.out.println("Jugador: " + datito.getNombres()[i] + ", Club: " + datito.getClubes()[i] + ", Balones de Oro: " + datito.getBalonesDeOro()[i]);
	        }
			
		}
		
		
		public void hacerCaso3() {
			System.out.println("El jugador con más Balones de Oro es: " + datito.getNombres() +
                    " con " + datito.calcularBalones(datito.getBalonesDeOro()) + " Balones de Oro.");
			}
		}

