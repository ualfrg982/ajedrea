package ajedrea.juego;

public class Pieza {
	
	public final Color color;
	public final Tipo tipo;
	
	public Pieza(Color color, Tipo tipo) {
		this.color = (color==null)? Color.blanco : color;
		this.tipo = (tipo==null)? Tipo.peon : tipo;
	}
	
	@Override
	public String toString() {
		boolean esBlanca = (this.color == Color.blanco);
		switch(this.tipo) {
		case peon:
			return esBlanca ? "♙" : "♟";
		case torre:
			return esBlanca ? "♖" : "♜";
		case caballo:
			return esBlanca ? "♘" : "♞";
		case alfil:
			return esBlanca ? "♗" : "♝";
		case reina:
			return esBlanca ? "♕" : "♛";
		case rey:
			return esBlanca ? "♔" : "♚";
		default:
			return "?";
		}
	}
	
}
