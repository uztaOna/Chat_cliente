package cliente;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Cliente {

	static final String HOST= "localhost";
	static final int PUERTO= 5000;
    private DataOutputStream salida;
	
	public void hasi() {
		Socket cliente=null;
		ObjectInputStream entrada=null;
		ObjectOutputStream salida=null;
		
		try {
			cliente=new Socket(HOST,PUERTO);
			System.out.println("Conexión realizada con servidor");
			salida = new ObjectOutputStream (cliente.getOutputStream());
			entrada = new ObjectInputStream(cliente.getInputStream());
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Cliente c1=new Cliente();
		c1.hasi();
	}
}
