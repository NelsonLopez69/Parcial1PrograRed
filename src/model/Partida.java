package model;

import java.util.*;

public class Partida {
	private ArrayList<Jugador> jugadores;
	private Dealer dealer;
	
	
	public Partida() {
		jugadores  =new ArrayList<Jugador>();
	}
	
	public boolean excesoJugadores() {
		if(jugadores.size()>3)
			return true;
		
		else return false;
	}
	
}
