package ajedrea.juego;

import java.util.ArrayList;
import java.util.Date;

public class Partida {
	
	private ArrayList<Estado> estados;
//	private Date fecha; // fecha y hora
//	private Integer duracion; // en segundos
	private Jugador blancas;
	private Jugador negras;
	private Ganador resultado;
	
	public Partida(String jugadorBlancas, String jugadorNegras) {
		this.estados = new ArrayList<>();
		this.estados.add(new Estado());
//		this.blancas = new Jugador(jugadorBlancas); // se puede manejar mejor
		
	}
}
