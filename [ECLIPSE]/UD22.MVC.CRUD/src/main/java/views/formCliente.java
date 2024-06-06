package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controllers.cliente;

import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class formCliente extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;
    private JTextField textFieldDNI;
    private JTextField textField_1Apellido;
    private JTextField textField_3Nombre;
    private JTextField textField_4Dirección;
    private JTextField textField_2Fecha;
    private JTextField textFieldId;
    private cliente objetoCliente;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    formCliente frame = new formCliente();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public formCliente() {
        setResizable(false);
        setTitle("GESTOR DE CLIENTES");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 968, 528);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        SpringLayout sl_contentPane = new SpringLayout();
        contentPane.setLayout(sl_contentPane);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "Datos Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, contentPane);
        sl_contentPane.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, contentPane);
        sl_contentPane.putConstraint(SpringLayout.SOUTH, panel, 452, SpringLayout.NORTH, contentPane);
        sl_contentPane.putConstraint(SpringLayout.EAST, panel, 350, SpringLayout.WEST, contentPane);
        contentPane.add(panel);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new TitledBorder(null, "Lista Clientes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        sl_contentPane.putConstraint(SpringLayout.NORTH, panel_1, 10, SpringLayout.NORTH, contentPane);
        sl_contentPane.putConstraint(SpringLayout.WEST, panel_1, 370, SpringLayout.WEST, contentPane);
        sl_contentPane.putConstraint(SpringLayout.SOUTH, panel_1, 452, SpringLayout.NORTH, contentPane);
        sl_contentPane.putConstraint(SpringLayout.EAST, panel_1, 640, SpringLayout.WEST, contentPane);
        contentPane.add(panel_1);
        SpringLayout sl_panel = new SpringLayout();
        panel.setLayout(sl_panel);

        JLabel lblNewLabel = new JLabel("NOMBRE");
        sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, panel);
        panel.add(lblNewLabel);

        JLabel lblApellido = new JLabel("APELLIDO");
        sl_panel.putConstraint(SpringLayout.NORTH, lblApellido, 24, SpringLayout.SOUTH, lblNewLabel);
        sl_panel.putConstraint(SpringLayout.WEST, lblApellido, 10, SpringLayout.WEST, panel);
        panel.add(lblApellido);

        JLabel lblDni = new JLabel("DNI");
        sl_panel.putConstraint(SpringLayout.NORTH, lblDni, 26, SpringLayout.SOUTH, lblApellido);
        sl_panel.putConstraint(SpringLayout.WEST, lblDni, 0, SpringLayout.WEST, lblNewLabel);
        panel.add(lblDni);

        JLabel lblFecha = new JLabel("FECHA");
        sl_panel.putConstraint(SpringLayout.NORTH, lblFecha, 29, SpringLayout.SOUTH, lblDni);
        sl_panel.putConstraint(SpringLayout.WEST, lblFecha, 0, SpringLayout.WEST, lblNewLabel);
        panel.add(lblFecha);

        textFieldDNI = new JTextField();
        sl_panel.putConstraint(SpringLayout.NORTH, textFieldDNI, 62, SpringLayout.NORTH, panel);
        sl_panel.putConstraint(SpringLayout.WEST, textFieldDNI, 0, SpringLayout.WEST, lblNewLabel);
        sl_panel.putConstraint(SpringLayout.EAST, textFieldDNI, -10, SpringLayout.EAST, panel);
        panel.add(textFieldDNI);
        textFieldDNI.setColumns(10);

        textField_1Apellido = new JTextField();
        sl_panel.putConstraint(SpringLayout.NORTH, textField_1Apellido, 28, SpringLayout.SOUTH, textFieldDNI);
        sl_panel.putConstraint(SpringLayout.WEST, textField_1Apellido, 0, SpringLayout.WEST, textFieldDNI);
        sl_panel.putConstraint(SpringLayout.EAST, textField_1Apellido, -10, SpringLayout.EAST, panel);
        panel.add(textField_1Apellido);
        textField_1Apellido.setColumns(10);

        textField_3Nombre = new JTextField();
        sl_panel.putConstraint(SpringLayout.NORTH, textField_3Nombre, 27, SpringLayout.SOUTH, panel);
        sl_panel.putConstraint(SpringLayout.WEST, textField_3Nombre, 10, SpringLayout.WEST, panel);
        sl_panel.putConstraint(SpringLayout.EAST, textField_3Nombre, -10, SpringLayout.EAST, panel);
        panel.add(textField_3Nombre);
        textField_3Nombre.setColumns(10);

        textField_4Dirección = new JTextField();
        sl_panel.putConstraint(SpringLayout.NORTH, textField_4Dirección, 29, SpringLayout.SOUTH, textField_1Apellido);
        sl_panel.putConstraint(SpringLayout.WEST, textField_4Dirección, 0, SpringLayout.WEST, textFieldDNI);
        sl_panel.putConstraint(SpringLayout.EAST, textField_4Dirección, 0, SpringLayout.EAST, textFieldDNI);
        panel.add(textField_4Dirección);
        textField_4Dirección.setColumns(10);

        textField_2Fecha = new JTextField();
        sl_panel.putConstraint(SpringLayout.NORTH, textField_2Fecha, 26, SpringLayout.SOUTH, textFieldDNI);
        sl_panel.putConstraint(SpringLayout.WEST, textField_2Fecha, 0, SpringLayout.WEST, textFieldDNI);
        sl_panel.putConstraint(SpringLayout.EAST, textField_2Fecha, 0, SpringLayout.EAST, textFieldDNI);
        panel.add(text
