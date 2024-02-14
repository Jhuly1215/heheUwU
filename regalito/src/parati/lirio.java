package parati;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;



import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class lirio extends JPanel {

	private static final long serialVersionUID = 1L;
	public lirio() {
		setBackground(new Color(113, 92, 63));
		setSize(1000,700);
		setLayout(null);
		
		Font f=new Font("DialogInput", Font.BOLD, 20);
		JButton btnMensaje = new JButton("Mensaje");
		btnMensaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teamo x=new teamo();
				x.setSize(1000,700);
				x.setLocation(0, 0);
				removeAll();
			    add(x,BorderLayout.CENTER);
				revalidate();
				repaint();
			}
		});
		btnMensaje.setBackground(new Color(217, 215, 177));
		btnMensaje.setForeground(new Color(113, 92, 63));
		btnMensaje.setFont(f);
		btnMensaje.setBounds(200, 400, 180, 50);
		add(btnMensaje);
		
		JButton btnGaleria = new JButton("Galería");
		btnGaleria.setForeground(new Color(113, 92, 63));
		btnGaleria.setFont(f);
		btnGaleria.setBackground(new Color(228, 225, 220));
		btnGaleria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nosotros x=new nosotros();
				x.setSize(1000,700);
				x.setLocation(0, 0);
				removeAll();
			    add(x,BorderLayout.CENTER);
				revalidate();
				repaint();
			}
			
		});
		btnGaleria.setBounds(420, 400, 180, 50);
		add(btnGaleria);
		
		JButton btnMusica = new JButton("Música");
		btnMusica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tulipan x=new tulipan();
				x.setSize(1000,700);
				x.setLocation(0, 0);
				removeAll();
			    add(x,BorderLayout.CENTER);
				revalidate();
				repaint();
			}
		});
		btnMusica.setBackground(new Color(230, 210, 185));
		btnMusica.setForeground(new Color(113, 92, 63));
		btnMusica.setBounds(640, 400, 180, 50);
		btnMusica.setFont(f);
		add(btnMusica);
		
		JButton btnBack = new JButton("<");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				principal panelPrincipal = new principal();
				panelPrincipal.setVisible(true);
				removeAll();
			    panelPrincipal.setSize(1000, 700);
			    panelPrincipal.setLocation(100, 100);
			    revalidate();
			    repaint();
			    getTopLevelAncestor().setVisible(false);
				panelPrincipal.setVisible(true);
			}
		});
		btnBack.setForeground(new Color(113, 92, 63));
		btnBack.setBackground(new Color(217, 215, 177));
		btnBack.setFont(f);
		btnBack.setBounds(50, 550, 50, 50);
		add(btnBack);
		
		JLabel lblMensaje = new JLabel("New label");
		lblMensaje.setIcon(new ImageIcon(lirio.class.getResource("/recursos/message.jpg")));
		lblMensaje.setBounds(197, 190, 180, 180);
		add(lblMensaje);
		
		JLabel lblGaleria = new JLabel("New label");
		lblGaleria.setIcon(new ImageIcon(lirio.class.getResource("/recursos/gallery.jpg")));
		lblGaleria.setBounds(420, 190, 180, 180);
		add(lblGaleria);
		
		JLabel lblMusica = new JLabel("New label");
		lblMusica.setIcon(new ImageIcon(lirio.class.getResource("/recursos/music.jpg")));
		lblMusica.setBounds(640, 190, 180, 180);
		add(lblMusica);
		
	}

}
