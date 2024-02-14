package parati;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class tulipan extends JPanel {
	private static final long serialVersionUID = 1L;
	public tulipan() {
		setBackground(new Color(217, 215, 177));
		setSize(1000,700);
		setLayout(null);
		Font f = new Font("DialogInput", Font.BOLD, 20);
		JButton btnBack = new JButton(">");
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
		 JTextArea txtDescripcion = new JTextArea();
		 txtDescripcion.setFont(new Font("Monospaced", Font.PLAIN, 30));
	     txtDescripcion.setForeground(Color.BLACK);
	     txtDescripcion.setText("Te dejo una playlist que hice de YouTube");
	     txtDescripcion.setEnabled(false);
	     txtDescripcion.setEditable(false);
	     txtDescripcion.setLineWrap(true); 
	     txtDescripcion.setWrapStyleWord(true);
	     txtDescripcion.setVisible(false);
	     txtDescripcion.setBackground(new Color(239, 232, 216));
	     txtDescripcion.setBounds(550, 200, 400, 100);
	     add(txtDescripcion);
	     JTextArea txtDescripcion1 = new JTextArea();
		 txtDescripcion1.setFont(new Font("Monospaced", Font.PLAIN, 30));
	     txtDescripcion1.setForeground(Color.BLACK);
	     txtDescripcion1.setText("https://youtube.com/playlist?list=PLfgDLT4RRmhQ64Ggp3-BVmD9BaPd8A5AB&si=3jL58jEbEMZvcz6H");
	     txtDescripcion1.setEnabled(false);
	     txtDescripcion1.setEditable(true);
	     txtDescripcion1.setLineWrap(true); 
	     txtDescripcion1.setWrapStyleWord(true);
	     txtDescripcion1.setVisible(false);
	     txtDescripcion1.setBackground(new Color(239, 232, 216));
	     txtDescripcion1.setBounds(550, 300, 400, 250);
	     add(txtDescripcion1);
		JButton btnPlaylist = new JButton("");
		btnPlaylist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDescripcion.setVisible(true);
				txtDescripcion1.setVisible(true);
				
			}
		});
		btnPlaylist.setIcon(new ImageIcon(tulipan.class.getResource("/recursos/portada.jpg")));
		btnPlaylist.setBounds(80, 80, 400, 400);
		add(btnPlaylist);
		btnBack.setForeground(new Color(113, 92, 63));
		btnBack.setBackground(new Color(217, 215, 177));
		btnBack.setFont(f);
		btnBack.setBounds(850, 570, 50, 50);
		add(btnBack);
		JLabel lblFondo = new JLabel("New label");
		lblFondo.setIcon(new ImageIcon(tulipan.class.getResource("/recursos/playlist.jpg")));
		lblFondo.setBounds(0, 0, 1000, 700);
		add(lblFondo);
	}
}
