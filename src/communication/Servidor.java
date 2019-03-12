import java.util.ArrayList;
import java.util.List;;
import java.io.IOException;
import java.net.*;

public class Servidor {
	
	private static ArrayList<Socket> clientes;
	
	
	public Servidor() {
		clientes = new ArrayList<Socket>();
	}
	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(5555);
			
			while(true) {
				System.out.println("Esperando conexion...");
				Socket socket = server.accept(); //Objeto que representa la comunicacion con el otro lado
				clientes.add(socket);
				System.out.println("Conexion aceptada...");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public interface ConnectionEvent{
		void onConnection();
		void onMessage(String msj);
	}
	
	private List<ConnectionEvent> listeners;
	
	public void addConnectionEvent(ConnectionEvent listener) {
		if(listeners == null) {
			listeners = new ArrayList<>();
		}
		listeners.add(listener);
	}
}
