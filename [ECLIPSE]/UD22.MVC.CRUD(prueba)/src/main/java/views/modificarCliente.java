/*package views;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class modificarCliente extends JFrame {
	private JPanel contentPane;
	private JTextField nombreField;
	private JTextField apellidosField;
	private JTextField direccionField;
	private JTextField dniField;
	private JTextField fechaField;

	public modificarCliente() {
		setTitle("Gestor Clientes");
		// Coordenadas
		setBounds(500, 200, 500, 500);

		// Exit on close
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Creamos panel
		contentPane = new JPanel(new GridBagLayout());
		setContentPane(contentPane);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 10, 10, 10);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 1.0; // Expandir horizontalmente

		Dimension labelSize = new Dimension(100, 40); // Tamaño de las etiquetas
		Dimension fieldSize = new Dimension(300, 40); // Tamaño de los campos de texto

		// Nombre
		JLabel nombreCliente = new JLabel("Nombre");
		nombreCliente.setPreferredSize(labelSize);
		gbc.gridx = 0;
		gbc.gridy = 0;
		contentPane.add(nombreCliente, gbc);
		
		nombreField = new JTextField();
		nombreField.setPreferredSize(fieldSize);
		gbc.gridx = 1;
		gbc.gridy = 0;
		contentPane.add(nombreField, gbc);

		// Apellidos
		JLabel apellidosCliente = new JLabel("Apellidos");
		apellidosCliente.setPreferredSize(labelSize);
		gbc.gridx = 0;
		gbc.gridy = 1;
		contentPane.add(apellidosCliente, gbc);
		
		apellidosField = new JTextField();
		apellidosField.setPreferredSize(fieldSize);
		gbc.gridx = 1;
		gbc.gridy = 1;
		contentPane.add(apellidosField, gbc);

		// Dirección
		JLabel direccionCliente = new JLabel("Dirección");
		direccionCliente.setPreferredSize(labelSize);
		gbc.gridx = 0;
		gbc.gridy = 2;
		contentPane.add(direccionCliente, gbc);
		
		direccionField = new JTextField();
		direccionField.setPreferredSize(fieldSize);
		gbc.gridx = 1;
		gbc.gridy = 2;
		contentPane.add(direccionField, gbc);

		// DNI
		JLabel dniCliente = new JLabel("DNI");
		dniCliente.setPreferredSize(labelSize);
		gbc.gridx = 0;
		gbc.gridy = 3;
		contentPane.add(dniCliente, gbc);
		
		dniField = new JTextField();
		dniField.setPreferredSize(fieldSize);
		gbc.gridx = 1;
		gbc.gridy = 3;
		contentPane.add(dniField, gbc);

		// Fecha
		JLabel fechaCliente = new JLabel("Fecha");
		fechaCliente.setPreferredSize(labelSize);
		gbc.gridx = 0;
		gbc.gridy = 4;
		contentPane.add(fechaCliente, gbc);
		
		fechaField = new JTextField();
		fechaField.setPreferredSize(fieldSize);
		gbc.gridx = 1;
		gbc.gridy = 4;
		contentPane.add(fechaField, gbc);

		
		JButton aceptarCliente = new JButton("<html><div style=font-size:15px;>Aceptar Cambios</html>");	
		aceptarCliente.setPreferredSize(fieldSize);
		gbc.gridx = 1;
		gbc.gridy = 5;
		contentPane.add(aceptarCliente,gbc);
		
		aceptarCliente.addActionListener(new ActionListener() {
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
		
		// Expandir verticalmente
		gbc.weighty = 1.0;
		gbc.anchor = GridBagConstraints.NORTH;
		
		// Hacer visible la ventana
		setVisible(true);
	}
}
*/