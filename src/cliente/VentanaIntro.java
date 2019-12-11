package cliente;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class VentanaIntro extends JFrame{
	
	private static final long serialVersionUID = -5528417114939120754L;
	public JTextField nick;
	private JLabel msgNick;
	private JButton btnAceptar;
	private JPanel panel;

	public VentanaIntro() {
		setTitle("Sign In");
		setResizable(false);
		setBounds(100, 100, 450, 350);
		panel=new JPanel();
		setContentPane(panel);
		panel.setLayout(null);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		nick = new JTextField();
		nick.setHorizontalAlignment(SwingConstants.CENTER);
		nick.setBounds(92, 71, 250, 20);
		getContentPane().add(nick);
		nick.setColumns(10);
		
		msgNick = new JLabel("Introducir nick");
		msgNick.setBounds(92, 40, 250, 20);
		getContentPane().add(msgNick);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nick.getText() == "")
					JOptionPane.showMessageDialog(null, "¡Atención! Introduzca un nombre de usuario válido");
				else
					;
			}
			
		});
		btnAceptar.setBounds(175, 130, 100, 25);
		getContentPane().add(btnAceptar);
	}
	
	public static void main(String[] args) {
		new VentanaIntro().setVisible(true);
	}
}
