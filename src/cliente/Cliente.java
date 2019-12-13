package cliente;

import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Cliente {

	static final String HOST= "localhost";
	static final int PUERTO= 5000;
	private DataOutputStream salida;
	
	public void Cliente(Socket socket, JTextArea textArea, JTextField texto, JButton btnEnviar) {
		Socket cliente=null;
		ObjectInputStream entrada=null;
		ObjectOutputStream salida=null;
	}
	
	public static String getHost() {
		return HOST;
	}

	public static int getPuerto() {
		return PUERTO;
	}
	
	protected void enviarMensaje(String mensaje) {
		
	}
	
	public static void main(String[] args) {
		Cliente c1=new Cliente();
	}
}
