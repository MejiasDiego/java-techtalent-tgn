package views;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ventanaIniciar extends JFrame {
	
	private JPanel contentPane = new JPanel();
	
	public ventanaIniciar() {
		
		setTitle("Gestor Clientes");
		// Coordenadas
		setBounds(500, 200, 500, 500);

		// Exit on close
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Hacer visible la ventana
		setVisible(true);
		
		// Creamos panel
		contentPane = new JPanel();
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
		
		// Usamos HTML para incluir un salto de línea y centrado con tamaño de fuente especificado
		JLabel cartelInicio = new JLabel("<html><div style='text-align: "
				+ "center; font-size:35px;'>GESTOR<br>DE CLIENTES</div></html>");
		cartelInicio.setBounds(90, 10, 400, 200); // Ajusta las coordenadas y tamaño según sea necesario
		contentPane.add(cartelInicio);
		
		JLabel guionesDecoradores = new JLabel("<html><div style=font-size:25px;>------------ </html>");
		guionesDecoradores.setBounds(178, 100, 400, 200);
		contentPane.add(guionesDecoradores);

		JButton iniciar = new JButton("<html><div style=font-size:25px;>INICIAR </html>");
		iniciar.setBounds(145,250,200,50);
		contentPane.add(iniciar);
		
		// Añadir ActionListener al botón "INICIAR"
		iniciar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Crear y mostrar la nueva ventana
				new gestorDeClientes();
				// Ocultar la ventana actual (opcional)
				setVisible(false);
				// O cerrar la ventana actual
				// dispose();
			}
		});
	}
	
		}
	

