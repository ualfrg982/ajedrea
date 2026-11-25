package ajedrea.juego;

import java.util.TreeMap;

public class Historial {

	private TreeMap<String, Jugador> jugadores; // String idJugador
	private TreeMap<String, Partida> partidas; // String idPartida
	
	public Historial() {
		this.jugadores = new TreeMap<>();
		this.partidas = new TreeMap<>();
		this.cargar();
	}
	
	public void cargar() {
		//...
		// relacionar con paquete src.ajedrea.conexion
	}
	public void subirActualizado() {
		//...
		// relacionar con paquete src.ajedrea.conexion
	}
	
	public void addJugador(String jugador) {
		String idJugador = "";
		//...
		this.jugadores.put(idJugador, new Jugador(jugador));
	}
	
	public void addPartida(Partida partida) {
		String idPartida = "";
		//...
		this.partidas.put(idPartida, partida);
	}
	
	

}
