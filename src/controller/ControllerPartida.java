package controller;

import communication.Servidor;
import view.ViewPartida;


public class ControllerPartida implements communication.Servidor.ConnectionEvent{
	private ViewPartida view;
	private Servidor server;
	
	public ControllerPartida(ViewPartida view) {
		this.view=view;
	}
	
	public void initView() {
		//crear metodo que inicie la vista
		
		server =new Servidor();
		server.addConnectionEvent(this);
	
	}
	
	public void initJugadores() {
		
	}

	@Override
	public void onConnection() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onEnvioCarta(String msj) {
		// TODO Auto-generated method stub
		
	}


}
