package views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class gestorDeClientes extends JFrame {
	
	private JPanel contentPane;
    private JTextArea textArea;

	public gestorDeClientes() {
		
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
		
		// Ajustar el tamaño del JTextArea para dejar espacio a la derecha
		textArea = new JTextArea();
        textArea.setEditable(false); // Hacer que el área de texto sea solo de lectura
        textArea.setBounds(20, 20, 300, 400); // Ajustar tamaño y posición del JTextArea
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(20, 20, 300, 400); // Ajustar tamaño y posición del JScrollPane
        contentPane.add(scrollPane);
        
        // Añadir los botones en vertical
        JButton añadirCliente = new JButton("Añadir Cliente");
        añadirCliente.setBounds(330, 20, 140, 50);
        contentPane.add(añadirCliente);
        
        JButton eliminarCliente = new JButton("Eliminar Cliente");
        eliminarCliente.setBounds(330, 90, 140, 50);
        contentPane.add(eliminarCliente);
        
        JButton modificarCliente = new JButton("Modificar Datos Cliente");
        modificarCliente.setBounds(330, 160, 140, 50);
        contentPane.add(modificarCliente);
	}
	
	public static void main(String[] args) {
		new gestorDeClientes();
	}
}

