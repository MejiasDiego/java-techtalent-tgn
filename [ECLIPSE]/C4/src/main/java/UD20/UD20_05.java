package UD20;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UD20_05 extends JFrame {
    private JTextArea textArea;

    public UD20_05() {
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
        addWindowStateListener(new WindowStateListener() {
            public void windowStateChanged(WindowEvent e) {
                if ((e.getNewState() & Frame.ICONIFIED) != 0) {
                    textArea.append("Has minimizado el programa\n");
                } else if ((e.getNewState() & Frame.MAXIMIZED_BOTH) != 0) {
                    textArea.append("Has expandido el programa\n");
                }
            }
        });

        // Añadir un MouseWheelListener al JTextArea
        textArea.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent e) {
                if (e.getWheelRotation() > 0) {
                    textArea.append("Has usado la rueda del ratón hacia abajo\n");
                } else {
                    textArea.append("Has usado la rueda del ratón hacia arriba\n");
                }
            }
        });

        // Añadir un MouseListener al JTextArea
        textArea.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textArea.append("Has clicado en el área de texto.\n");
            }
        });

        // Crear y configurar el botón para limpiar el área de texto
        JButton limpiarButton = new JButton("Limpiar");
        limpiarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setText(""); // Limpiar el contenido del área de texto
            }
        });
        panel.add(limpiarButton, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        // Crear y mostrar la ventana
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                UD20_05 ventana = new UD20_05();
                ventana.setVisible(true);
            }
        });
    }
}
