package ajedrea.juego;

public class Casilla {
	private final int fila;
	private final int columna;
	public Casilla(int fila, int columna) {
		this.fila = fila;
		this.columna = columna;
	}
	public int fila() {return this.fila;}
	public int columna() {return this.columna;}
}
