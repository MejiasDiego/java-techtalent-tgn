package controllers;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import models.conexionBD;

public class cliente {

    int id;
    String nombreCliente;
    String apellidoCliente;
    String direcciónCliente;
    int DNI;
    String fechaCliente;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public String getApellidoCliente() {
        return apellidoCliente;
    }
    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }
    public String getDirecciónCliente() {
        return direcciónCliente;
    }
    public void setDirecciónCliente(String direcciónCliente) {
        this.direcciónCliente = direcciónCliente;
    }
    public int getDNI() {
        return DNI;
    }
    public void setDNI(int dNI) {
        this.DNI = dNI;
    }
    public String getFechaCliente() {
        return fechaCliente;
    }
    public void setFechaCliente(String fechaCliente) {
        this.fechaCliente = fechaCliente;
    }

    public void insertarCliente(JTextField paramNombre,
            JTextField paramApellido, JTextField paraDireccion,
            JTextField paramDNI, JTextField paramFecha) {
        
        setNombreCliente(paramNombre.getText());
        setApellidoCliente(paramApellido.getText());
        setDirecciónCliente(paraDireccion.getText());
        try {
            int dni = Integer.parseInt(paramDNI.getText());
            setDNI(dni);
        } catch (NumberFormatException e) {
            // Maneja el caso donde el DNI no es un número válido
            System.out.println("El DNI ingresado no es un número válido");
            return;
        }
        setFechaCliente(paramFecha.getText());
        
        conexionBD objetoConexion = new conexionBD();
        
        String consulta = "INSERT INTO cliente (nombre, apellido, direccion, dni, fecha) VALUES (?, ?, ?, ?, ?)";
        
        try {
            Connection con = objetoConexion.estableceConexion();
            CallableStatement cs = con.prepareCall(consulta);
            cs.setString(1, getNombreCliente());
            cs.setString(2, getApellidoCliente());
            cs.setString(3, getDirecciónCliente());
            cs.setInt(4, getDNI());
            cs.setString(5, getFechaCliente());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se insertó correctamente el cliente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se insertó correctamente el cliente, error: " + e.toString());
        }
    }

    public void insertarVideo(JTextField paramTitulo,
            JTextField paramDirector,
            JTextField paramCliId) {
conexionBD objetoConexion = new conexionBD();

String consulta = "INSERT INTO videos (title, director, cli_id) VALUES (?, ?, ?)";

try {
Connection con = objetoConexion.estableceConexion();
PreparedStatement ps = con.prepareStatement(consulta);
ps.setString(1, paramTitulo.getText());
ps.setString(2, paramDirector.getText());
ps.setInt(3, Integer.parseInt(paramCliId.getText()));
ps.execute();
JOptionPane.showMessageDialog(null, "Se insertó correctamente el video");
} catch (Exception e) {
JOptionPane.showMessageDialog(null, "No se insertó correctamente el video, error: " + e.toString());
}
}	
    
    public void MostrarCliente(JTable paramMostrarClientes) {
        conexionBD objetoConexion = new conexionBD();
        DefaultTableModel modelo = new DefaultTableModel();
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<>(modelo);
        paramMostrarClientes.setRowSorter(OrdenarTabla);
        String sql = "";
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Dirección");
        modelo.addColumn("DNI");
        modelo.addColumn("Fecha");
        
        paramMostrarClientes.setModel(modelo);
        sql = "SELECT * FROM cliente;";
        String[] datos = new String[6];
        Statement st;
        
        try {
            st = objetoConexion.estableceConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                modelo.addRow(datos);
            }
            paramMostrarClientes.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros, error: " + e.toString());
        }
    }
    
    
    
    
    public void MostrarVideos(JTable paramMostrarVideos) {
        conexionBD objetoConexion = new conexionBD();
        DefaultTableModel modelo = new DefaultTableModel();
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<>(modelo);
        paramMostrarVideos.setRowSorter(OrdenarTabla);
        String sql = "";
        modelo.addColumn("ID");
        modelo.addColumn("Título");
        modelo.addColumn("Director");
        modelo.addColumn("Cli ID");

        paramMostrarVideos.setModel(modelo);
        sql = "SELECT * FROM videos;";
        String[] datos = new String[4]; // Cambiar a 4 para incluir el Cli ID
        Statement st;
        
        try {
            st = objetoConexion.estableceConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4); // Obtener el Cli ID
                modelo.addRow(datos);
            }
            paramMostrarVideos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros de videos, error: " + e.toString());
        }
    }
    public void ModificarVideo(JTable tablaVideos, JTextField paramTitulo,
            JTextField paramDirector, JTextField paramCliId,
            JTextField paramId) {
conexionBD objetoConexion = new conexionBD();

try {
// Obtener los valores de los campos
int idVideo = Integer.parseInt(paramId.getText());
String titulo = paramTitulo.getText();
String director = paramDirector.getText();

// Consulta SQL para actualizar el video
String consulta = "UPDATE videos SET title=?, director=?, cli_id=? WHERE id=?";

// Establecer conexión y preparar la consulta
Connection con = objetoConexion.estableceConexion();
PreparedStatement ps = con.prepareStatement(consulta);
ps.setString(1, titulo);
ps.setString(2, director);
ps.setInt(3, Integer.parseInt(paramCliId.getText()));
ps.setInt(4, idVideo);

// Ejecutar la consulta
int filasActualizadas = ps.executeUpdate();

if (filasActualizadas > 0) {
JOptionPane.showMessageDialog(null, "Video modificado correctamente");
} else {
JOptionPane.showMessageDialog(null, "No se pudo modificar el video");
}

// Actualizar la tabla después de la modificación
MostrarVideos(tablaVideos);
} catch (Exception e) {
JOptionPane.showMessageDialog(null, "Error al modificar el video: " + e.getMessage());
}
}
    
    public void eliminarVideo(int idVideo) {
        conexionBD objetoConexion = new conexionBD();
        String consulta = "DELETE FROM videos WHERE id = ?";

        try {
            Connection con = objetoConexion.estableceConexion();
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setInt(1, idVideo);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente el video");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el video, error: " + e.toString());
        }
    }

    
    public void eliminarCliente(int idCliente) {
        conexionBD objetoConexion = new conexionBD();
        String consulta = "DELETE FROM cliente WHERE id = ?";

        try {
            Connection con = objetoConexion.estableceConexion();
            CallableStatement cs = con.prepareCall(consulta);
            cs.setInt(1, idCliente);
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente el cliente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el cliente, error: " + e.toString());
        }
    }
    public void SeleccionarVideo(JTable tablaVideos, JTextField paramTitulo,
            JTextField paramDirector, JTextField paramID) {

        try {
            int fila = tablaVideos.getSelectedRow();

            if (fila >= 0) {
                paramID.setText(tablaVideos.getValueAt(fila, 0).toString());
                paramTitulo.setText(tablaVideos.getValueAt(fila, 1).toString());
                paramDirector.setText(tablaVideos.getValueAt(fila, 2).toString());
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de selección, error: " + e);
        }
    }
    public void SeleccionarCliente(JTable tablaCliente, JTextField paramNombre,
            JTextField paramApellido, JTextField paraDireccion,
            JTextField paramDNI, JTextField paramFecha, JTextField paramID) {

        try {
            int fila = tablaCliente.getSelectedRow();

            if (fila >= 0) {
                paramID.setText(tablaCliente.getValueAt(fila, 5).toString());
                paramNombre.setText(tablaCliente.getValueAt(fila, 0).toString());
                paramApellido.setText(tablaCliente.getValueAt(fila, 1).toString());
                paraDireccion.setText(tablaCliente.getValueAt(fila, 2).toString());
                paramDNI.setText(tablaCliente.getValueAt(fila, 3).toString());
                paramFecha.setText(tablaCliente.getValueAt(fila, 4).toString());
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de selección, error: " + e);}
        }
        public void ModificarCliente(JTable tablaCliente, JTextField paramNombre,
                JTextField paramApellido, JTextField paraDireccion,
                JTextField paramDNI, JTextField paramFecha, JTextField paramID) {
            
            conexionBD objetoConexion = new conexionBD();
            
            try {
                // Obtener los valores de los campos
                int idCliente = Integer.parseInt(paramID.getText());
                String nombreCliente = paramNombre.getText();
                String apellidoCliente = paramApellido.getText();
                
                // Consulta SQL para actualizar el cliente
                String consulta = "UPDATE cliente SET nombre=?, apellido=?, direccion=?, dni=?, fecha=? WHERE id=?";
                
                // Establecer conexión y preparar la consulta
                Connection con = objetoConexion.estableceConexion();
                PreparedStatement ps = con.prepareStatement(consulta);
                ps.setString(1, nombreCliente);
                ps.setString(2, apellidoCliente);
                ps.setString(3, paraDireccion.getText());
                ps.setInt(4, Integer.parseInt(paramDNI.getText()));
                ps.setString(5, paramFecha.getText());
                ps.setInt(6, idCliente);
                
                // Ejecutar la consulta
                int filasActualizadas = ps.executeUpdate();
                
                if (filasActualizadas > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente modificado correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo modificar el cliente");
                }
                
                // Actualizar la tabla después de la modificación
                MostrarCliente(tablaCliente);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al modificar el cliente: " + e.getMessage());
            }
        }
    }
