package ajedrea.juego;

public class Estado {

	private Turno turno;
	private Pieza[][] tablero;
	
	public Estado() {
		this.tablero = new Pieza[8][8];
		this.turno = Turno.blancas;
		
	}
	public Pieza getPieza(Casilla c) {
		return this.tablero[c.fila()][c.columna()];
	}
//	public Pieza getPieza(int fila, int columna) {
//		return this.tablero[fila][columna];
//	}
	public Turno getTurno() {
		return this.turno;
	}
	
	private void turnar() {
		Turno turno = this.getTurno();
		if(turno == Turno.blancas) {
			turno = Turno.negras;
		} else {
			turno = Turno.blancas;
		}
	}
	
	private void setPieza(Pieza pieza, int fila, int columna) {
		this.tablero[fila][columna] = pieza;
	}
	public void moverPieza(int filaOrigen, int columnaOrigen,
							int filaDestino, int columnaDestino) {
		if(comprobarMovimiento(casillaOrigen, casillaDestino)) {
			setPieza
		}
		
	}
	private boolean comprobarMovimiento(int[][] casillaOrigen, int[][] casillaDestino) {
		//...
		// límites del tablero
		// rango de la pieza
		// piezas obstáculo
		// jaque
		return true;
	}
	
	
}
