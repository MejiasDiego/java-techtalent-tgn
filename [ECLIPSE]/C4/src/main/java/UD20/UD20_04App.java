package UD20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UD20_04App extends JFrame {
    private JTextArea textArea;

    public UD20_04App() {
        // Configuración de la ventana
        setTitle("Eventos de Ventana");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear y configurar el área de texto
        textArea = new JTextArea();
        textArea.setEditable(false); // Hacer que el área de texto sea solo de lectura
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Añadir el área de texto con scroll y la etiqueta al panel de contenido
        JPanel panel = new JPanel(new BorderLayout());
        JLabel etiqueta = new JLabel("Registro de eventos:");
        panel.add(etiqueta, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
        add(panel);

        // Añadir listeners de ventana
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                textArea.append("Ventana abierta\n");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                textArea.append("Ventana cerrándose\n");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                textArea.append("Ventana cerrada\n");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                textArea.append("Ventana minimizada\n");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                textArea.append("Ventana restaurada\n");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                textArea.append("Ventana activada\n");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                textArea.append("Ventana desactivada\n");
            }
        });

        // Añadir un MouseListener al JTextArea
        textArea.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textArea.append("Has clicado en el área de texto.\n");
            }
        });
    }

    public static void main(String[] args) {
        // Crear y mostrar la ventana
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                UD20_04App ventana = new UD20_04App();
                ventana.setVisible(true);
            }
        });
    }
}
