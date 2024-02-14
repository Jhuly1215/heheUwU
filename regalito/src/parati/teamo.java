package parati;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;

public class teamo extends JPanel {

	private static final long serialVersionUID = 1L;
	public teamo() {
		setBackground(new Color(207, 166, 122));
		setSize(1000,700);
		Font f = new Font("DialogInput", Font.BOLD, 20);
		JButton btnBack = new JButton("<");
		btnBack.setBounds(100, 120, 50, 50);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lirio x=new lirio();
				x.setSize(1000,700);
				x.setLocation(0, 0);
				removeAll();
			    add(x,BorderLayout.CENTER);
				revalidate();
				repaint();
			}
		});
		setLayout(null);
		
		JLabel lblfoto = new JLabel("New label");
		lblfoto.setIcon(new ImageIcon(teamo.class.getResource("/recursos/ups.jpg")));
		lblfoto.setBounds(556, 230, 300, 300);
		add(lblfoto);
		
		JTextArea txtMensajito = new JTextArea();
		txtMensajito.setEnabled(false);
		txtMensajito.setEditable(false);
		txtMensajito.setLineWrap(true); 
		txtMensajito.setWrapStyleWord(true);
		
		txtMensajito.setText("San Valentín no podría ser más especial sin ti en este día. Gracias por hacerme tan feliz y por esforzarte tanto. Quiero que sepas que eres la mejor persona para mí, y que estoy muy orgullosa de que seas tú a quien ame. Debo decir que estoy concluyendo la nota mientras estás en el piso con tus flores, así que no puedo estar más feliz.\nEstás en todo para mí. Quizá digas que soy competitiva, pero si tú dices que soy tu mundo, para mí eres mi universo.\nMe encantas, y lo harás siempre <3");
		txtMensajito.setBounds(170, 230, 300, 300);
		add(txtMensajito);
		btnBack.setForeground(new Color(113, 92, 63));
		btnBack.setBackground(new Color(217, 215, 177));
		btnBack.setFont(f);
		add(btnBack);
		
		JLabel lblFondo = new JLabel("New label");
		lblFondo.setBounds(0, 0, 1000, 700);
		lblFondo.setIcon(new ImageIcon(teamo.class.getResource("/recursos/fondomensaje.jpg")));
		add(lblFondo);
	}

}
