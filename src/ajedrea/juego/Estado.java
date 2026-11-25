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
	private void setPieza(Pieza pieza, Casilla c) {
		this.tablero[c.fila()][c.columna()] = pieza;
	}
//	private void setPieza(Pieza pieza, int fila, int columna) {
//		this.tablero[fila][columna] = pieza;
//	}
	public boolean moverPieza(Casilla origen, Casilla destino) {
		var pieza = this.getPieza(origen);
		if(comprobarMovimiento(origen, destino)) {
			this.setPieza(null, origen);
			this.setPieza(pieza, destino);
			this.turnar();
			return true;
		} else {
			return false;
		}
	}
	private boolean comprobarMovimiento(Casilla origen, Casilla destino) {
		//...
		// límites del tablero
		// rango de la pieza
		// piezas obstáculo
		// jaque
		return true;
	}
	
	
}
