package UD20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UD20_03 extends JFrame{
	
	private JPanel contentPane = new JPanel();

	public UD20_03() {
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
			
			final int[] contadorBoton1 = {1};
	        final int[] contadorBoton2 = {1};

			//Creamos etiqueta
			final JLabel etiqueta1 = new JLabel("Botón 1: 0 veces ");
			etiqueta1.setBounds(10,20,180,20);
			//Añadimos elemento al panel
			contentPane.add(etiqueta1);
			
			//Creamos etiqueta
			final JLabel etiqueta2 = new JLabel("Botón 2: 0 veces ");
			etiqueta2.setBounds(10,40,180,20);
			//Añadimos elemento al panel
			contentPane.add(etiqueta2);
			

			final JButton boton1 = new JButton("Botón 1: ");
			boton1.setBounds(150,30,85,20);
			contentPane.add(boton1);

			final JButton boton2 = new JButton("Botón 2 ");
			boton2.setBounds(240,30,85,20);
			contentPane.add(boton2);
			
		     // Añadir ActionListener al botón 1
	        boton1.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                etiqueta1.setText("Botón 1: " + (contadorBoton1[0])++ + " veces");
	            }
	        });
		     // Añadir ActionListener al botón 2 
	        boton2.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                etiqueta2.setText("Botón 2: " + (contadorBoton2[0]++) + " veces");
					}
				});
			
	}}
			