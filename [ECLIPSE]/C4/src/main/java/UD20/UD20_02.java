package UD20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UD20_02 extends JFrame{
	
	private JPanel contentPane = new JPanel();

	public UD20_02() {
	//Titulo
			setTitle("Ventana Botones");
			//Coordenadas
			setBounds(400,200,350,200);

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
			final JLabel etiqueta = new JLabel("Has pulsado: ");
			etiqueta.setBounds(20,20,180,20);
			//Añadimos elemento al panel
			contentPane.add(etiqueta);
			

			final JButton boton1 = new JButton("Botón 1");
			boton1.setBounds(150,20,85,20);
			contentPane.add(boton1);

			final JButton boton2 = new JButton("Botón 2");
			boton2.setBounds(240,20,85,20);
			
			
			contentPane.add(boton2);
		     // Añadir ActionListener al botón 1
	        boton1.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                etiqueta.setText("Has pulsado: " + boton1.getText());
	            }
	        });
		     // Añadir ActionListener al botón 2 
	        boton2.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                etiqueta.setText("Has pulsado: " + boton2.getText());
					}
				});
			
			
			
}
}