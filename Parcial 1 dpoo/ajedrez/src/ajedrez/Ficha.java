package ajedrez;

public class Ficha {
	
	int coordenada_x;
	int coordenada_y;
	
	public Ficha(int coordenada_x, int coordenada_y) {
		
		this.coordenada_x = coordenada_x;
		this.coordenada_y = coordenada_y;
				
		
	}
	
	public int getCoordenadaX() {
		return coordenada_x;
	}
	
	public void setCoordenadaX(int coordenada_x) {
		this.coordenada_x = coordenada_x;
	}
	
	public int getCoordenadaY() {
		return coordenada_y;
	}
	
	public void setCoordenadaY(int coordenada_y) {
		this.coordenada_y = coordenada_y;
	}
	
	
	

}
