package cliente;

import java.io.ObjectInputStream;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class HiloRecibir extends Thread{
	
	private ObjectInputStream entrada;
    public JTextArea textArea;
    public JButton btnEnviar;
    
    public HiloRecibir(ObjectInputStream entrada, JTextArea textArea, JTextField texto){
        try{
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    @Override
	public void run() {
		try{
			
        } catch (Exception e){
            e.printStackTrace();
        }
	}
	
}
