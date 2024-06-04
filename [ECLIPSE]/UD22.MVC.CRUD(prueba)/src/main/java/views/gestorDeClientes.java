/*package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import models.conexionBDclientes;

public class gestorDeClientes extends JFrame {

    private JPanel contentPane;
    private JTextArea textArea;

    public gestorDeClientes() {
        setTitle("Gestor Clientes");
        setBounds(500, 200, 500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setBounds(20, 20, 300, 400);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(20, 20, 300, 400);
        contentPane.add(scrollPane);

        JButton addCliente = new JButton("Añadir Cliente");
        addCliente.setBounds(330, 20, 140, 50);
        contentPane.add(addCliente);

        JButton borrarCliente = new JButton("Eliminar Cliente");
        borrarCliente.setBounds(330, 90, 140, 50);
        contentPane.add(borrarCliente);

        JButton modificarCliente = new JButton("Modificar Cliente");
        modificarCliente.setBounds(330, 160, 140, 50);
        contentPane.add(modificarCliente);

        cargarClientes();

        addCliente.addActionListener(e -> {
            new añadirCliente();
            setVisible(false);
        });

        borrarCliente.addActionListener(e -> {
            new eliminarCliente();
            setVisible(false);
        });

        modificarCliente.addActionListener(e -> {
            new modificarCliente();
            setVisible(false);
        });

        setVisible(true);
    }

    private void cargarClientes() {
        conexionBDclientes conexion = new conexionBDclientes();
        ArrayList<String> clientes = conexion.getClientes();
        for (String cliente : clientes) {
            textArea.append(cliente + "\n");
        }
    }
}

*/
