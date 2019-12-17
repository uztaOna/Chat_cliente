package cliente;

import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.sun.jdi.event.Event;

public class Cliente {

	static final String HOST= "localhost";
	static final int PUERTO= 5000;
	private DataOutputStream salida;
	
	public void Cliente(Socket socket, JTextArea textArea, JTextField texto, JButton btnEnviar) {
		Socket cliente=null;
		ObjectInputStream entrada=null;
		ObjectOutputStream salida=null;
		
		HiloRecibir hiloCliente = new HiloRecibir(entrada, textArea, texto);
		hiloCliente.start();
		
	}
	
	public static String getHost() {
		return HOST;
	}

	public static int getPuerto() {
		return PUERTO;
	}
	
	public void enviarMensaje(String mensaje) {
		
	}
}
