/*package views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;

public class ventanaIniciar extends JFrame {

    public ventanaIniciar() {
        setTitle("Inicio");
        setBounds(400, 200, 400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel titleLabel = new JLabel("Bienvenido al Gestor de Clientes");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setBounds(50, 30, 300, 30);
        contentPane.add(titleLabel);

        JButton iniciarButton = new JButton("Iniciar Gestor de Clientes");
        iniciarButton.setBounds(100, 100, 200, 40);
        contentPane.add(iniciarButton);

        iniciarButton.addActionListener(e -> {
            new gestorDeClientes();
            setVisible(false);
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new ventanaIniciar();
    }
}

*/