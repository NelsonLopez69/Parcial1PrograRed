package model;

public class Jugador {
	private String name; 
	private Carta[] cartas; 
	private boolean out;//Se sale de la ronda
	
	public Jugador(String name, Carta[] cartas, boolean out) {
		this.name =name;
		this.out =out;
		this.cartas =cartas;
		
	}
	
	public String getName() {
		return name;
	}
	public Carta[] getCartas() {
		return cartas;
	}
	public boolean isOut() {
		return out;
	}

}
