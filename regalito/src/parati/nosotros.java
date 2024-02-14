package parati;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class nosotros extends JPanel {

    private static final long serialVersionUID = 1L;

    public nosotros() {
        setBackground(new Color(228, 173, 168));
        setSize(1000,700);
        setLayout(null);

        Font f = new Font("DialogInput", Font.BOLD, 20);
        
        JLabel lblGaleria = new JLabel("Momentos que alteraron la química en mi cerebro");
        lblGaleria.setBounds(76, 73, 700, 52);
        lblGaleria.setFont(f);
        lblGaleria.setForeground(new Color(239, 232, 216));
        add(lblGaleria);

        JLabel lblTitulo = new JLabel("GALERÍA");
        lblTitulo.setBounds(76, 21, 281, 57);
        lblTitulo.setFont(new Font("Malgun Gothic", Font.PLAIN, 36));
        lblTitulo.setForeground(new Color(53, 20, 17));
        add(lblTitulo);
        
        JLabel lblImagen = new JLabel("New label");
        lblImagen.setIcon(new ImageIcon(nosotros.class.getResource("/recursos/foto1.jpg")));
        lblImagen.setBounds(80, 150, 300, 400);
        add(lblImagen);
        
        JLabel lblImagen_1 = new JLabel("New label");
        lblImagen_1.setIcon(new ImageIcon(nosotros.class.getResource("/recursos/foto2.jpg")));
        lblImagen_1.setBounds(590, 150, 300, 400);
        add(lblImagen_1);
        JTextArea txtDescripcion = new JTextArea();
        txtDescripcion.setForeground(Color.BLACK);
        txtDescripcion.setText("Halloween no hubiera sido lo mismo si es que no estabas conmigo ese día.");
        txtDescripcion.setEnabled(false);
        txtDescripcion.setEditable(false);
        txtDescripcion.setLineWrap(true); 
        txtDescripcion.setWrapStyleWord(true);
        txtDescripcion.setBackground(new Color(239, 232, 216));
        txtDescripcion.setBounds(380, 150, 210, 150);
        add(txtDescripcion);
        JTextArea txtDescripcion_1 = new JTextArea();
		txtDescripcion_1.setWrapStyleWord(true);
		txtDescripcion_1.setText("Esta es la primera foto que tomé de ti. Debo decir que cada vez que la veía caía más en ti.");
		txtDescripcion_1.setLineWrap(true);
		txtDescripcion_1.setForeground(Color.BLACK);
		txtDescripcion_1.setEnabled(false);
		txtDescripcion_1.setEditable(false);
		txtDescripcion_1.setBackground(new Color(239, 232, 216));
		txtDescripcion_1.setAlignmentY(0.8f);
		txtDescripcion_1.setAlignmentX(0.8f);
		txtDescripcion_1.setBounds(380, 400, 210, 150);
		add(txtDescripcion_1);
		
        Font f1= new Font("Tahoma", Font.PLAIN, 9);
        JButton btn1 = new JButton("1");
        btn1.setBackground(new Color(230, 210, 185));
        btn1.setFont(f1);
        btn1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		lblImagen.setIcon(new ImageIcon(nosotros.class.getResource("/recursos/foto1.jpg")));
        		lblImagen_1.setIcon(new ImageIcon(nosotros.class.getResource("/recursos/foto2.jpg")));
        		txtDescripcion.setText("Halloween no hubiera sido lo mismo si es que no estabas conmigo ese día.");
        		txtDescripcion_1.setText("Esta es la primera foto que tomé de ti. Debo decir que cada vez que la veía caía más en ti.");
        	}
        });
        btn1.setBounds(300, 590, 40, 30);
        add(btn1);
        
        JButton btn2 = new JButton("2");
        btn2.setBackground(new Color(230, 210, 185));
        btn2.setFont(f1);
        btn2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		lblImagen.setIcon(new ImageIcon(nosotros.class.getResource("/recursos/foto3.jpg")));
        		lblImagen_1.setIcon(new ImageIcon(nosotros.class.getResource("/recursos/foto4.jpg")));
        		txtDescripcion_1.setText("Esa flor es del día en el que nos quedamos como bobos mirando al otro");
        		txtDescripcion.setText("Esta es la primera foto que me enviaste en la que supe algo más de ti.");
        	}
        });
        btn2.setBounds(340, 590, 40, 30);
        add(btn2);
        
        JButton btn3 = new JButton("3");
        btn3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		lblImagen.setIcon(new ImageIcon(nosotros.class.getResource("/recursos/foto5.jpg")));
        		lblImagen_1.setIcon(new ImageIcon(nosotros.class.getResource("/recursos/foto6.jpg")));
        		txtDescripcion.setText("Cuando tuvimos ese departamento por un día solo para nosotros dos, solo quería que fuera para siempre");
        		txtDescripcion_1.setText("Voy a atesorar por siempre aquella vez que te quedaste a causa de la lluvia.");
        	}
        });
        btn3.setBounds(380, 590, 40, 30);
        btn3.setFont(f1);
        add(btn3);
        
        JButton btn4 = new JButton("4");
        btn4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		lblImagen.setIcon(new ImageIcon(nosotros.class.getResource("/recursos/foto7.jpg")));
        		lblImagen_1.setIcon(new ImageIcon(nosotros.class.getResource("/recursos/foto8.jpg")));
        		txtDescripcion.setText("Simplemente adoro tener planes al aire libre de vez en cuando, para este momento sabía que ya no había vuelta atrás.");
        		txtDescripcion_1.setText("Quien iba a decir que ibas a ser un lindo pingüinito :).");
        	}
        });
        btn4.setBounds(420, 590, 40, 30);
        btn4.setFont(f1);
        add(btn4);
        
        JButton btn5 = new JButton("5");
        btn5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		lblImagen.setIcon(new ImageIcon(nosotros.class.getResource("/recursos/foto9.jpg")));
        		lblImagen_1.setIcon(new ImageIcon(nosotros.class.getResource("/recursos/foto10.jpg")));
        		txtDescripcion.setText("Ser tu fotógrafa fue lo más divertido de ese día.");
        		txtDescripcion_1.setText("La cantidad de fotos que me tomas desprevenida no la sé, pero ahí quedan capturados.");
        	}
        });
        btn5.setBounds(460, 590, 40, 30);
        btn5.setFont(f1);
        add(btn5);
        
        JButton btn6 = new JButton("6");
        btn6.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		lblImagen.setIcon(new ImageIcon(nosotros.class.getResource("/recursos/foto11.jpg")));
        		lblImagen_1.setIcon(new ImageIcon(nosotros.class.getResource("/recursos/foto12.jpg")));
        		txtDescripcion.setText("Cuando escribiste nuestro aniversario, pensé que me encantaba que me involucraras tanto en todo lo tuyo.");
        		txtDescripcion_1.setText("La foto de año nuevo. Ambos estabamos derrotados pero no podía haberlo pasado mejor que contigo.");
        	}
        });
        btn6.setBounds(499, 590, 40, 30);
        btn6.setFont(f1);
        add(btn6);
        
        JButton btn7 = new JButton("7");
        btn7.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		lblImagen.setIcon(new ImageIcon(nosotros.class.getResource("/recursos/foto13.jpg")));
        		lblImagen_1.setIcon(new ImageIcon(nosotros.class.getResource("/recursos/foto14.jpg")));
        		txtDescripcion.setText("No puedo decir más que, me diste el mejor cumpleaños de mi vida, estaré agradecida contigo siempre.");
        		txtDescripcion_1.setText("Ese día llovió mucho y ambos terminamos empapados. Adoré verte con el cabello mojado y esa playera.");
        	}
        });
        btn7.setBounds(540, 590, 40, 30);
        btn7.setFont(f1);
        add(btn7);
        
        JButton btn8 = new JButton("8");
        btn8.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		lblImagen.setIcon(new ImageIcon(nosotros.class.getResource("/recursos/foto15.jpg")));
        		lblImagen_1.setIcon(new ImageIcon(nosotros.class.getResource("/recursos/foto16.jpg")));
        		txtDescripcion.setText("Esta no sabes que existe, pero estabas todo cansado mientras seguíamos coloreando los diubujitos que traje.");
        		txtDescripcion_1.setText("Cuando fuimos al parque a manejar bici, fue lo más divertido. Parece que eres un imán para los animales.");
        	}
        });
        btn8.setFont(f1);
        btn8.setBounds(581, 590, 40, 30);
        btn8.setBackground(new Color(230, 210, 185));
        btn7.setBackground(new Color(230, 210, 185));
        btn6.setBackground(new Color(230, 210, 185));
        btn5.setBackground(new Color(230, 210, 185));
        btn4.setBackground(new Color(230, 210, 185));
        btn3.setBackground(new Color(230, 210, 185));
        btn2.setBackground(new Color(230, 210, 185));
        add(btn8);
        
        
		
		
        JButton btnBack = new JButton("<");
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
		btnBack.setForeground(new Color(113, 92, 63));
		btnBack.setBackground(new Color(217, 215, 177));
		btnBack.setFont(f);
		btnBack.setBounds(50, 600, 50, 50);
		add(btnBack);
		
		
    }
}
