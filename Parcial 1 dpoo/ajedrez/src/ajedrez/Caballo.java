package ajedrez;

public class Caballo extends Ficha{
	
	public Caballo(int coordenada_x, int coordenada_y) {
		super(coordenada_x, coordenada_y);
		
	}
	{
	int movimiento_i = 0; //Es el contador de movimientos
	int movimiento_j = 0;
	
	for ( int i = 0; i <= 8; i++) {
		for (int j = 0; j <= 8; j++ ) {
			}
		}
	if (this.coordenada_x == coordenada_x) {
		
		movimiento_i = coordenada_x + 2;
		movimiento_j = coordenada_y + 1;
	}
		
	int total = movimiento_i + movimiento_j;	
	
	
	System.out.println("El caballo puede avanzar: " + total);
	}
	
	
		
		
	
	
	

}
