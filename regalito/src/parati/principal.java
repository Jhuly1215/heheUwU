package parati;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal frame = new principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public principal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("feliz san valentín c:");
		title.setFont(new Font("Gadugi", Font.PLAIN, 24));
		title.setForeground(new Color(103, 115, 87));
		title.setBounds(370, 180, 300, 30);
		contentPane.add(title);
		
		JLabel fondo = new JLabel("New label");
		fondo.setIcon(new ImageIcon(principal.class.getResource("/recursos/fondo1.jpg")));
		fondo.setBounds(0, 0, 1000, 700);
		contentPane.add(fondo);
		
		JButton btnStart = new JButton("HEY");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lirio x=new lirio();
				x.setSize(1000,700);
				x.setLocation(0, 0);
				contentPane.removeAll();
			    getContentPane().add(x,BorderLayout.CENTER);
				revalidate();
				repaint();
			}
		});
		btnStart.setForeground(new Color(103, 115, 87));
		btnStart.setBackground(new Color(228, 225, 220));
		btnStart.setFont(new Font("Gadugi", Font.PLAIN, 40));
		btnStart.setBounds(370, 230, 300, 100);
		contentPane.add(btnStart);
	}
}
