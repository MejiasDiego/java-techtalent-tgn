package T19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class TG19_03 extends JFrame{

		private JPanel contentPane = new JPanel();
		
		public TG19_03() {
			//Titulo
				setTitle("Encuesta TechTalent");
				//Coordenadas
				setBounds(400,200,450,300);				
				//Exit on close
				setDefaultCloseOperation(EXIT_ON_CLOSE);
					
				//Hacer visble la ventana
				setVisible(true);
					
				//Creamos panel
				contentPane=new JPanel();
									//Indicamos diseño panel
				contentPane.setLayout(null);
					
				//Asignamos panel a ventana
				setContentPane(contentPane);
				
				//Creamos etiqueta
				JLabel etiqueta = new JLabel
						("Elije un sistema operativo");
				JLabel especialidad = new JLabel
						("Elije tu especialidad");
				JLabel horasPC = new JLabel
						("Horas dedicadas al ordenador");

				etiqueta.setBounds(20,30,180,20);
				especialidad.setBounds(240,30,180,20);
				horasPC.setBounds(20, 90, 250, 130);

				//Añadimos elemento al panel
				contentPane.add(etiqueta);
				contentPane.add(especialidad);
				contentPane.add(horasPC);

			
				JRadioButton SOsOpcion1 = new JRadioButton 
						("Windows",false);
				SOsOpcion1.setBounds(20,60,190,20);
				contentPane.add(SOsOpcion1);
			
				JRadioButton SOsOpcion2 = new JRadioButton 
						("Linux",false);
				SOsOpcion2.setBounds(20,80,190,20);
				contentPane.add(SOsOpcion2);
				
				JRadioButton SOsOpcion3 = new JRadioButton 
						("MacOS",false);
				SOsOpcion3.setBounds(20,100,190,20);
				contentPane.add(SOsOpcion3);
				
				
				ButtonGroup opcionesSOs = new ButtonGroup();
				opcionesSOs.add(SOsOpcion1);
				opcionesSOs.add(SOsOpcion2);
				opcionesSOs.add(SOsOpcion3);

				
				
				JCheckBox especialidad1 = new JCheckBox
						("Programación",false);
				especialidad1.setBounds(240,60,180,20);
				contentPane.add(especialidad1);

				JCheckBox especialidad2 = new JCheckBox
						("Diseño gráfico",false);
				especialidad2.setBounds(240,80,180,20);
				contentPane.add(especialidad2);
		
				JCheckBox especialidad3 = new JCheckBox
						("Administración",false);
				especialidad3.setBounds(240,100,180,20);
				contentPane.add(especialidad3);
				
			
				JSlider horasSlider = new JSlider(0, 10);
		        horasSlider.setBounds(30, 170, 150, 50);
		        horasSlider.setMajorTickSpacing(1);
		        horasSlider.setPaintTicks(true);			      
		        horasSlider.setPaintLabels(true);
			    contentPane.add(horasSlider);
				
				

				JButton acabarEncuesta = new JButton
				("Enviar resultados");
				acabarEncuesta.setBounds(260, 170, 150, 50);
				contentPane.add(acabarEncuesta);
				
				acabarEncuesta.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						String SOseleccionado = "";
				        if (SOsOpcion1.isSelected()) {
				            SOseleccionado = SOsOpcion1.getText();
				        } else if (SOsOpcion2.isSelected()) {
				            SOseleccionado = SOsOpcion2.getText();
				        } else if (SOsOpcion3.isSelected()) {
				            SOseleccionado = SOsOpcion3.getText();
				        }-
				        
				    	String especialidadSeleccionado = "";
				        if (especialidad1.isSelected()) {
				        	especialidadSeleccionado = especialidad1.getText();
				        } else if (especialidad2.isSelected()) {
				        	especialidadSeleccionado = especialidad2.getText();
				        } else if (especialidad3.isSelected()) {
				        	especialidadSeleccionado = especialidad3.getText();
				        }
						
						  JOptionPane.showMessageDialog(null,"Sistema Operativo: "
						  + SOseleccionado 
						  + "\nEspecialidad: "
						  + especialidadSeleccionado
						  + "\nHoras dedicadas al ordenador: " 
						  + horasSlider.getValue());
				    }
					});
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			TG19_03 ventana =  new TG19_03();

		}

		
		
	}

