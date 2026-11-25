package ajedrea.juego;

public class Estado {

	private Turno turno;
	private Pieza[][] tablero;
	
	public Estado() {
		this.inicializar();
	}
	public Estado(Estado otro) {
		this.tablero = otro.tablero; // ¿se copia el valor o la referencia?
		this.turno = otro.turno;
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
	private void setPieza(Casilla c, Pieza pieza) {
		this.tablero[c.fila()][c.columna()] = pieza;
	}
//	private void setPieza(Pieza pieza, int fila, int columna) {
//		this.tablero[fila][columna] = pieza;
//	}
	public boolean moverPieza(Casilla origen, Casilla destino) {
		var pieza = this.getPieza(origen);
		if(comprobarMovimiento(origen, destino)) {
			this.setPieza(origen, null);
			this.setPieza(destino, pieza);
			this.turnar();
			//...
			return true;
		} else {
			//...
			return false;
		}
	}
	protected boolean comprobarMovimiento(Casilla origen, Casilla destino) {
		//...
		// límites del tablero
		// rango de la pieza
		// piezas obstáculo
		// promoción de peón
		// jaque
		// mate
		return true;
	}
	
	public boolean enrocar(Enroque tipo) {
		if(comprobarEnroque(tipo)) {
			//...
			// realizar enroque
			return true;
		} else {
			//...
			return false;
		}
	}
	private boolean comprobarEnroque(Enroque tipo) {
		//...
		return true;
	}
	
	private void inicializar() {
		this.tablero = new Pieza[8][8];
		this.turno = Turno.blancas;
		this.setPieza(new Casilla(0,0), new Pieza(Color.negro, Tipo.torre));
		this.setPieza(new Casilla(0,1), new Pieza(Color.negro, Tipo.caballo));
		this.setPieza(new Casilla(0,2), new Pieza(Color.negro, Tipo.alfil));
		this.setPieza(new Casilla(0,3), new Pieza(Color.negro, Tipo.reina));
		this.setPieza(new Casilla(0,4), new Pieza(Color.negro, Tipo.rey));
		this.setPieza(new Casilla(0,5), new Pieza(Color.negro, Tipo.alfil));
		this.setPieza(new Casilla(0,6), new Pieza(Color.negro, Tipo.caballo));
		this.setPieza(new Casilla(0,7), new Pieza(Color.negro, Tipo.torre));
		for (int i = 0; i < 8; i++) {
			this.setPieza(new Casilla(1,i), new Pieza(Color.negro, Tipo.peon));
		}
		for (int i = 0; i < 8; i++) {
			this.setPieza(new Casilla(6,i), new Pieza(Color.blanco, Tipo.peon));
		}
		this.setPieza(new Casilla(7,0), new Pieza(Color.blanco, Tipo.torre));
		this.setPieza(new Casilla(7,1), new Pieza(Color.blanco, Tipo.caballo));
		this.setPieza(new Casilla(7,2), new Pieza(Color.blanco, Tipo.alfil));
		this.setPieza(new Casilla(7,3), new Pieza(Color.blanco, Tipo.reina));
		this.setPieza(new Casilla(7,4), new Pieza(Color.blanco, Tipo.rey));
		this.setPieza(new Casilla(7,5), new Pieza(Color.blanco, Tipo.alfil));
		this.setPieza(new Casilla(7,6), new Pieza(Color.blanco, Tipo.caballo));
		this.setPieza(new Casilla(7,7), new Pieza(Color.blanco, Tipo.torre));
	}
	
	@Override
	public String toString() {
		String estado = "";
		estado += "Juegan las " + this.turno + "\n";
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				Pieza pieza = this.getPieza(new Casilla(i,j));
				estado += ((pieza==null)? "·" : pieza.toString()) + "\t";
			}
			estado += "\n\n\n";
		}
		estado += "\n";
		return estado;
	}
	
}
