package co.edu.unbosque.model;

public class Dato {

   private String[] nombres = new String[15];
   private  String[] clubes = new String[15];
   private  int[] balonesDeOro = new int[15];
   
   
   
   

	
	
	


	public String[] getNombres() {
		return nombres;
	}


	public void setNombres(String[] x) {
		nombres = x;
	}


	public String[] getClubes() {
		return clubes;
	}


	public void setClubes(String[] c) {
		clubes = c;
	}


	public int[] getBalonesDeOro() {
		return balonesDeOro;
	}


	public Dato( String[] n, String[] c, int[] b) {
		nombres = n;
		clubes = c;
		balonesDeOro = b;
	}


	public void setBalonesDeOro(int[] balonesDeOro) {
		this.balonesDeOro = balonesDeOro;
	}


	public Dato() {
		
	}
	
	

	
	
	
	public int calcularBalones(int[] balonesDeOro) {
	   
	    int mayorB = 0;
	    for (int balon : balonesDeOro) {
	        if (balon > mayorB) {
	            mayorB = balon;
	        }
	    }
	    return mayorB; 
	}
}
	
	/*Bruno
	 * Federico
	 * Pedri
	 * Jamal
	 * Luka
	 * Achraf
	 * Oliver
	 * Mbappe
	 * Jude
	 * Cody Gakpo
	 * Christian Eriksen
	 * Lionel
	 * Richarlison
	 * Dibu Martinez
	 * Takuma Asano
	 */
	
	
	
	
	
	
	
	


