package ajedrez;

public class Peon extends Ficha{
	
	String inicio; // Tiene en cuenta si es la primera vez de la ficha en moverse.si,si es verdad, no, si es falso
	
	public Peon(int coordenada_x, int coordenada_y) {
		super(coordenada_x, coordenada_y);
		this.inicio = inicio;
		
		
	}
	
	public String getInicio() {
		return inicio;
	}
	
	public void setInicio(String inicio) {
		this.inicio = inicio;
	}
	{
		
	int movimiento = 0; //Es el contador de movimientos
	
	for ( int i = 0; i <= 8; i++) {
		
		if (inicio == "si") {
			
			movimiento += 2;
		}
			else {
				if (inicio == "no") {
					
					this.coordenada_x = coordenada_x;
					this.coordenada_y = coordenada_y;
					movimiento = coordenada_x + 1;
				}
			
		}
		
	System.out.println("El peon puede avanzar: " + movimiento);
		
	}
	
	
		
	}
	
	

}
