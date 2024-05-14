package T19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TG19_01 extends JFrame {
	
	private JPanel contentPane = new JPanel();
	
	public TG19_01() {
		//Titulo
		setTitle("Saludador");
		//Coordenadas
		setBounds(400,200,400,300);
		
		//Exit on close
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Hacer visble la ventana
		setVisible(true);
		
		//Creamos panel
		contentPane=new JPanel();
		
		//Indicamos diseño panel
		contentPane.setLayout(null);
		
		//Asignamos panel a ventana
		setContentPane(contentPane);
		
		//Creamos etiqueta
		JLabel etiqueta = new JLabel("Escribe un nombre "
		+ "para saludar");
		etiqueta.setBounds(110,30,180,20);
		//Añadimos elemento al panel
		contentPane.add(etiqueta);
		
		//Añadimos campo de texto
		
		JTextField saludarEnunciado = new JTextField ("");
		saludarEnunciado.setBounds(70,60,270,20);
		contentPane.add(saludarEnunciado);

		JButton botonSaludar = new JButton("¡Saludar!");
		botonSaludar.setBounds(150,100,100,20);
		contentPane.add(botonSaludar);

		botonSaludar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(botonSaludar, 
		"¡Un saludo a " 
		+ saludarEnunciado.getText()+"!");
			}
		});
		
	}
	
	
	
	public static void main(String[] args) {
			TG19_01 ventana =  new TG19_01();
	}

}
