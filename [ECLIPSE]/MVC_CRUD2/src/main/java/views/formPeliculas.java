package views;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import controllers.cliente;
import controllers.video;  // Import the video controller
import models.conexionBD;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.border.EtchedBorder;
import javax.swing.UIManager;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class formPeliculas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textFieldTitle;
	private JTextField textFieldDirector;
	private JTextField textFieldCliId;
	private JTextField textFieldId;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formPeliculas frame = new formPeliculas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public formPeliculas() {
		setTitle("GESTOR DE VIDEOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 968, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JPanel panel = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel, 452, SpringLayout.NORTH, contentPane);
		panel.setBorder(new TitledBorder(null, "Datos Video", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, contentPane);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.WEST, panel_1, 210, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel_1, -15, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel, -6, SpringLayout.WEST, panel_1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel_1, 10, SpringLayout.NORTH, contentPane);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JLabel lblNewLabel = new JLabel("TÍTULO");
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, panel);
		panel.add(lblNewLabel);
		
		JLabel lblDirector = new JLabel("DIRECTOR");
		sl_panel.putConstraint(SpringLayout.NORTH, lblDirector, 24, SpringLayout.SOUTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.WEST, lblDirector, 10, SpringLayout.WEST, panel);
		panel.add(lblDirector);
		
		JLabel lblCliId = new JLabel("CLI ID");
		sl_panel.putConstraint(SpringLayout.WEST, lblCliId, 0, SpringLayout.WEST, lblNewLabel);
		panel.add(lblCliId);
		
		textFieldTitle = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 6, SpringLayout.NORTH, textFieldTitle);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel, -6, SpringLayout.WEST, textFieldTitle);
		sl_panel.putConstraint(SpringLayout.NORTH, textFieldTitle, 15, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, textFieldTitle, 93, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, textFieldTitle, -14, SpringLayout.EAST, panel);
		textFieldTitle.setColumns(10);
		panel.add(textFieldTitle);
		
		textFieldDirector = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textFieldDirector, 58, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, textFieldDirector, 93, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, textFieldDirector, -14, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, lblDirector, 6, SpringLayout.NORTH, textFieldDirector);
		sl_panel.putConstraint(SpringLayout.EAST, lblDirector, -6, SpringLayout.WEST, textFieldDirector);
		textFieldDirector.setColumns(10);
		panel.add(textFieldDirector);
		
		textFieldCliId = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textFieldCliId, 25, SpringLayout.SOUTH, textFieldDirector);
		sl_panel.putConstraint(SpringLayout.WEST, textFieldCliId, 93, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, textFieldCliId, -14, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, lblCliId, 6, SpringLayout.NORTH, textFieldCliId);
		sl_panel.putConstraint(SpringLayout.EAST, lblCliId, -6, SpringLayout.WEST, textFieldCliId);
		textFieldCliId.setColumns(10);
		panel.add(textFieldCliId);
		
		JButton btnGuardar = new JButton("Guardar");
		sl_panel.putConstraint(SpringLayout.WEST, btnGuardar, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnGuardar, -14, SpringLayout.EAST, panel);
		btnGuardar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de guardar este video?", "Confirmar Guardar Video", JOptionPane.YES_NO_OPTION);
		        if (confirmacion == JOptionPane.YES_OPTION) {
		            video objetoVideo = new video();
		            objetoVideo.insertarVideo(textFieldTitle, textFieldDirector, textFieldCliId);
		            objetoVideo.MostrarVideos(table);
		        }
		    }
		});
		sl_panel.putConstraint(SpringLayout.SOUTH, btnGuardar, -117, SpringLayout.SOUTH, panel);
		panel.add(btnGuardar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, btnModificar, 19, SpringLayout.SOUTH, btnGuardar);
		sl_panel.putConstraint(SpringLayout.WEST, btnModificar, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnModificar, -16, SpringLayout.EAST, panel);
		panel.add(btnModificar);
		
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.addItem("peliculas");
		comboBox.addItem("clientes");
		contentPane.add(comboBox);
		
		// Agregar ActionListener al JComboBox
		comboBox.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String seleccion = (String) comboBox.getSelectedItem(); // Obtiene el elemento seleccionado del JComboBox
		        if (seleccion.equals("clientes")) { // Verifica si se seleccionó "clientes"
		            dispose(); // Cierra la ventana actual
		            // Crea una instancia de la vista formCliente y la hace visible
		            formCliente clienteForm = new formCliente();
		            clienteForm.setVisible(true);
		        }
		    }
		});
		
		JButton btnEliminar = new JButton("Eliminar");
		sl_panel.putConstraint(SpringLayout.NORTH, btnEliminar, 367, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, btnEliminar, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnEliminar, -14, SpringLayout.EAST, panel);
		panel.add(btnEliminar);
		
		JLabel lblId = new JLabel("ID");
		sl_panel.putConstraint(SpringLayout.WEST, lblId, 10, SpringLayout.WEST, panel);
		panel.add(lblId);
		
		textFieldId = new JTextField();
		sl_panel.putConstraint(SpringLayout.WEST, textFieldId, 73, SpringLayout.EAST, lblId);
		sl_panel.putConstraint(SpringLayout.EAST, textFieldId, -14, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, lblId, 3, SpringLayout.NORTH, textFieldId);
		sl_panel.putConstraint(SpringLayout.NORTH, textFieldId, 23, SpringLayout.SOUTH, textFieldCliId);
		textFieldId.setColumns(10);
		panel.add(textFieldId);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel_1, -92, SpringLayout.SOUTH, contentPane);
		panel_1.setBorder(new TitledBorder(null, "Lista Videos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_1);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		sl_panel_1.putConstraint(SpringLayout.NORTH, scrollPane, 10, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, scrollPane, 333, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, scrollPane, -6, SpringLayout.EAST, panel_1);
		scrollPane.setViewportBorder(null);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		
		video objetoVideo = new video();  // Use the video controller
		objetoVideo.MostrarVideos(table);;
		
		textFieldId.setEditable(false);  // Hacer el campo ID no editable
		
		JLabel lblSeleccionarTabla = new JLabel("SELECCIONAR TABLA");
		sl_contentPane.putConstraint(SpringLayout.NORTH, comboBox, -3, SpringLayout.NORTH, lblSeleccionarTabla);
		sl_contentPane.putConstraint(SpringLayout.WEST, comboBox, 6, SpringLayout.EAST, lblSeleccionarTabla);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblSeleccionarTabla, 172, SpringLayout.EAST, panel);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblSeleccionarTabla, 36, SpringLayout.SOUTH, panel_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblSeleccionarTabla, 31, SpringLayout.EAST, panel);
		contentPane.add(lblSeleccionarTabla);

		btnEliminar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        int filaSeleccionada = table.getSelectedRow();
		        if (filaSeleccionada != -1) {
		            int idVideo = Integer.parseInt(table.getValueAt(filaSeleccionada, 0).toString());
		            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este video?", "Confirmar Eliminar Video", JOptionPane.YES_NO_OPTION);
		            if (confirmacion == JOptionPane.YES_OPTION) {
		                video objetoVideo = new video();
		                objetoVideo.eliminarVideo(idVideo);
		                objetoVideo.MostrarVideos(table);
		            }
		        } else {
		            JOptionPane.showMessageDialog(null, "Por favor, seleccione un video para eliminar.");
		        }
		    }
		});

		table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
		    public void valueChanged(ListSelectionEvent event) {
		        if (!event.getValueIsAdjusting()) {
		            video objetoVideo = new video();
		            objetoVideo.SeleccionarVideo(table, textFieldId, textFieldTitle, textFieldDirector, textFieldCliId);
		        }
		    }
		});
		btnModificar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de modificar este video?", "Confirmar Modificar Video", JOptionPane.YES_NO_OPTION);
		        if (confirmacion == JOptionPane.YES_OPTION) {
		            video objetoVideo = new video();
		            objetoVideo.ModificarVideo(table, textFieldTitle, textFieldDirector, textFieldCliId, textFieldId);
		            objetoVideo.MostrarVideos(table);
		        }
		    }
		});
	}
}
