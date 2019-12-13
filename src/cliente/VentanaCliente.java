package cliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaCliente extends JFrame{

	private static final long serialVersionUID = -7142412255417186125L;
	private String nick;
	public JTextField textField;
	public JTextArea textArea;
	public final JButton btnAceptar,btnSalir;
	public JPanel panel;
	
	public VentanaCliente(Socket socket,String nick) {
		this.nick=nick;
		
		setTitle("Chat");
		setResizable(false);
		setBounds(100, 100, 450, 350);
		panel=new JPanel();
		setContentPane(panel);
		panel.setLayout(null);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 298, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(10, 42, 410, 187);
		getContentPane().add(textArea);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(170, 240, 100, 20);
		getContentPane().add(btnSalir);
		
		btnAceptar = new JButton("Enviar");
		btnAceptar.setBounds(320, 11, 100, 20);
		getContentPane().add(btnAceptar);
		initListeners();
	}
	
	private void initListeners() {
		btnSalir.addActionListener(new ListenerBotones());
		btnAceptar.addActionListener(new ListenerBotones());
	}

	private class ListenerBotones implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String accion = e.getActionCommand();
			switch (accion) {
			case "Enviar":
				break;
			case "Salir":
				System.exit(getDefaultCloseOperation());
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		new VentanaCliente(null, "").setVisible(true);
	}
}
