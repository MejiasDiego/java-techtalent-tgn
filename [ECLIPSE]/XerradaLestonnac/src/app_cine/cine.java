package app_cine;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class cine extends JFrame {
    private JButton[][] asientos;
    public pelicula[] peliculas = {new pelicula("Toy Story", 90, 7, "John Lasseter"),
                                    new pelicula("Harry Potter", 150, 12, "Chris Columbus"),
                                    new pelicula("Titanic", 195, 16, "James Cameron"),
                                    new pelicula("Oppenheimer", 152, 18, "Christopher Nolan")};

    public cine() {
        setTitle("Cine");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Crear matriz de botones para representar los asientos del cine
        JPanel panelAsientos = new JPanel(new GridLayout(9, 10)); // Añadimos una fila y una columna adicionales para las etiquetas
        asientos = new JButton[9][10];
        Random random = new Random();

        panelAsientos.setBorder(BorderFactory.createLineBorder(Color.BLACK, 80));

        // Etiquetas de las columnas
        for (int columna = 0; columna < 10; columna++) {
            JLabel columnaLabel = new JLabel(columna == 0 ? "" : String.valueOf(columna));
            columnaLabel.setHorizontalAlignment(JLabel.CENTER);
            panelAsientos.add(columnaLabel);
        }

        for (int fila = 1; fila < 9; fila++) { // Comienza desde la fila 1 y va hacia abajo
            // Etiqueta de fila
            JLabel filaLabel = new JLabel(String.valueOf(fila));
            filaLabel.setHorizontalAlignment(JLabel.CENTER);
            panelAsientos.add(filaLabel);
            
            for (int columna = 1; columna < 10; columna++) {
                char letraColumna = (char) ('A' + columna - 1);
                JButton button = new JButton(letraColumna + String.valueOf(fila)); // Agrega el texto del botón como letra de columna y número de fila
                button.setPreferredSize(new Dimension(50, 50));
                asientos[fila-1][columna-1] = button; // Ajusta el índice de la fila y columna
                panelAsientos.add(button); 

                // Determinar si el asiento está ocupado aleatoriamente
                boolean ocupado = random.nextBoolean();

                // Marcar en rojo si el asiento está ocupado
                if (ocupado) {
                    button.setBackground(Color.RED);
                    button.setEnabled(false); // No se puede seleccionar
                } else {
                    // Asignar comportamiento al hacer clic en un asiento no ocupado
                    button.addActionListener(e -> {
                        // Obtener la película seleccionada
                        pelicula peliculaSeleccionada = (pelicula) JOptionPane.showInputDialog(
                            null,
                            "Seleccione una película:",
                            "Selección de Película",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            peliculas,
                            peliculas[0]);
                        
                            // Crear panel para mostrar información de la película seleccionada
                            JPanel panelInfoPelicula = new JPanel(new GridLayout(2, 1));
                            panelInfoPelicula.setBorder(BorderFactory.createTitledBorder("Información de la película"));
            
                            // Añadir etiquetas con información de la película
                            JLabel duracionLabel = new JLabel("Duración: " + peliculaSeleccionada.getDuracion() + " minutos");
                            JLabel directorLabel = new JLabel("Director: " + peliculaSeleccionada.getDirector());
            
                            // Añadir etiquetas al panel
                            panelInfoPelicula.add(duracionLabel);
                            panelInfoPelicula.add(directorLabel);
                            
                            // Mostrar panel con información de la película
                            JOptionPane.showMessageDialog(null, panelInfoPelicula, "Información de la película", JOptionPane.INFORMATION_MESSAGE);

                        if (peliculaSeleccionada != null) {
                            int edadMinima = peliculaSeleccionada.getEdadMinima();

                            String nombre = JOptionPane.showInputDialog("Nombre del cliente:");
                            String edadStr = JOptionPane.showInputDialog("Edad del cliente (mínima para ver la película: " + edadMinima +" años):");
                            String dineroStr = JOptionPane.showInputDialog("Dinero del cliente (entrada 8€):");

                            int edad = Integer.parseInt(edadStr);
                            double dinero = Double.parseDouble(dineroStr);

                            // Verificar si el cliente cumple con los requisitos de edad y dinero
                            if (edad >= edadMinima && dinero >= 8) {
                                JOptionPane.showMessageDialog(null, "Ya tiene su entrada "+nombre+",\ngracias por su compra!");

                                // Opcional: Actualizar la visualización de la interfaz gráfica
                                button.setBackground(Color.GREEN); // Marcar el asiento como ocupado
                                button.setEnabled(false); // Deshabilitar el botón

                            } else {
                                JOptionPane.showMessageDialog(null, "El cliente no cumple con los requisitos para ver la película.");
                            }
                        }
                    });
                }
            }
        }

        // Agregar el panel de asientos al marco
        add(panelAsientos);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            cine Cine = new cine();
            Cine.setVisible(true);
        });
    }
}