package UD20;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class UD20_01 extends JFrame {

    private JPanel contentPane = new JPanel();
    private JLabel etiqueta;

    public UD20_01() {
        // Titulo
        setTitle("Saludador");
        // Coordenadas
        setBounds(600, 600, 600, 600);
        // Exit on close
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Hacer visible la ventana
        setVisible(true);
        // Creamos panel
        contentPane = new JPanel();
        // Indicamos diseño panel
        contentPane.setLayout(null);
        // Asignamos panel a ventana
        setContentPane(contentPane);

        // Creamos etiqueta
        etiqueta = new JLabel("Texto que se hace grande");
        etiqueta.setBounds(200, 110, 2000, 400);
        // Añadimos elemento al panel
        contentPane.add(etiqueta);

        // Añadimos botón
        final JButton botonEtiqueta = new JButton("Cambia el tamaño de la etiqueta");
        botonEtiqueta.setBounds(170, 100, 240, 30);
        botonEtiqueta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarTamañoEtiqueta();
            }
        });
        contentPane.add(botonEtiqueta);
    }

    public void cambiarTamañoEtiqueta() {
        try {
            // Solicitar al usuario que ingrese un número
            String input = JOptionPane.showInputDialog(null, "Introduce cuantos pixeles quieres agrandar la etiqueta");

            // Convertir el input a entero
            int sumarPixeles = Integer.parseInt(input);

            // Obtener el tamaño actual de la fuente
            Font currentFont = etiqueta.getFont();
            int newSize = currentFont.getSize() + sumarPixeles;

            // Aplicar el nuevo tamaño de fuente a la etiqueta
            etiqueta.setFont(new Font(currentFont.getName(), currentFont.getStyle(), newSize));
        } catch (NumberFormatException e) {
            // Manejar el caso donde el input no es un número válido
            JOptionPane.showMessageDialog(null, "Por favor, introduce un número válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}