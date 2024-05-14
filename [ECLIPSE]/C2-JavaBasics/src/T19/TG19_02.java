package T19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TG19_02 extends JFrame{

	private JPanel contentPane = new JPanel();
	
	public TG19_02() {
		//Titulo
			setTitle("Saludador");
			//Coordenadas
			setBounds(400,200,450,300);				
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
			JLabel etiqueta = new JLabel
			("Escribe el título de una película");
			JLabel listadoPelis = new JLabel
			("Lista de películas");
			etiqueta.setBounds(20,30,180,20);
			listadoPelis.setBounds(240,30,180,20);
			//Añadimos elemento al panel
			contentPane.add(etiqueta);
			contentPane.add(listadoPelis);

		
		
			JTextField textoPeliculas = new JTextField ("");
			textoPeliculas.setBounds(20,60,190,20);
			contentPane.add(textoPeliculas);
		
			JButton añadir = new JButton("Añadir");
			añadir.setBounds(40,100,80,20);
			contentPane.add(añadir);

			JComboBox listaPelis = new JComboBox();
			listaPelis.setBounds(240,60,180,20);
			contentPane.add(listaPelis);
		
			añadir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				listaPelis.addItem(textoPeliculas.getText());
								;
					}
				});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TG19_02 ventana =  new TG19_02();

	}

}
