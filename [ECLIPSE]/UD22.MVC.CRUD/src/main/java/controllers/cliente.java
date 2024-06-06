package controllers;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import models.conexionBD;

public class cliente {

    int id;
    String nombreCliente;
    String apellidoCliente;
    String direcciónCliente;
    int DNI;
    String fechaCliente;
    conexionBD objetoConexion;

    public cliente(String dbName) {
        objetoConexion = new conexionBD(dbName);
    }

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

    public void insertarCliente(JTextField paramNombre, JTextField paramApellido, JTextField paraDireccion, JTextField paramDNI, JTextField paramFecha) {
        if (!validarCampos(paramNombre, paramApellido, paraDireccion, paramDNI, paramFecha)) {
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea guardar este cliente?", "Confirmar Guardado", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        setNombreCliente(paramNombre.getText());
        setApellidoCliente(paramApellido.getText());
        setDirecciónCliente(paraDireccion.getText());
        setDNI(Integer.parseInt(paramDNI.getText()));
        setFechaCliente(paramFecha.getText());

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

    public void MostrarCliente(JTable paramTablaTotalAlumnos) {
        DefaultTableModel modelo = new DefaultTableModel();
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<>(modelo);
        paramTablaTotalAlumnos.setRowSorter(OrdenarTabla);
        String sql = "";
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Dirección");
        modelo.addColumn("DNI");
        modelo.addColumn("Fecha");
        
        paramTablaTotalAlumnos.setModel(modelo);
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
            paramTablaTotalAlumnos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros, error: " + e.toString());
        }
    }

    public void SeleccionarCliente(JTable tablaCliente, JTextField paramNombre, JTextField paramApellido, JTextField paraDireccion, JTextField paramDNI, JTextField paramFecha, JTextField paramID) {
        try {
            int fila = tablaCliente.getSelectedRow();

            if (fila >= 0) {
                paramNombre.setText(tablaCliente.getValueAt(fila, 1).toString());
                paramApellido.setText(tablaCliente.getValueAt(fila, 2).toString());
                paraDireccion.setText(tablaCliente.getValueAt(fila, 3).toString());
                paramDNI.setText(tablaCliente.getValueAt(fila, 4).toString());
                paramFecha.setText(tablaCliente.getValueAt(fila, 5).toString());
                paramID.setText(tablaCliente.getValueAt(fila, 0).toString());
            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de selección, error: " + e);
        }
    }

    public void ModificarCliente(JTextField paramID, JTextField paramNombre, JTextField paramApellido, JTextField paraDireccion, JTextField paramDNI, JTextField paramFecha) {
        setId(Integer.parseInt(paramID.getText()));
        setNombreCliente(paramNombre.getText());
        setApellidoCliente(paramApellido.getText());
        setDirecciónCliente(paraDireccion.getText());
        setDNI(Integer.parseInt(paramDNI.getText()));
        setFechaCliente(paramFecha.getText());

        int confirm = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea modificar este cliente?", "Confirmar Modificación", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        String consulta = "UPDATE cliente SET cliente.nombre = ?, cliente.apellido= ?, cliente.direccion=?, cliente.dni=?, cliente.fecha=? WHERE cliente.id = ?;";
        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);
            cs.setString(1, getNombreCliente());
            cs.setString(2, getApellidoCliente());
            cs.setString(3, getDirecciónCliente());
            cs.setInt(4, getDNI());
            cs.setString(5, getFechaCliente());
            cs.setInt(6, getId());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Modificación realizada con éxito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se modificó correctamente el cliente, error: " + e.toString());
        }
    }

    public void EliminarCliente(JTextField paramID) {
        try {
            setId(Integer.parseInt(paramID.getText()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID no válido, error: " + e.toString());
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea eliminar este cliente?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        String consulta = "DELETE FROM cliente WHERE id = ?";

        try {
            Connection con = objetoConexion.estableceConexion();
            CallableStatement cs = con.prepareCall(consulta);
            cs.setInt(1, getId());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Cliente eliminado con éxito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se eliminó con éxito el cliente, error: " + e.toString());
        }
    }

    private boolean validarCampos(JTextField paramNombre, JTextField paramApellido, JTextField paraDireccion, JTextField paramDNI, JTextField paramFecha) {
        if (paramNombre.getText().trim().isEmpty() || paramApellido.getText().trim().isEmpty() || paraDireccion.getText().trim().isEmpty() || paramDNI.getText().trim().isEmpty() || paramFecha.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar completos.");
            return false;
        }
        try {
            Integer.parseInt(paramDNI.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El DNI debe ser un número válido.");
            return false;
        }
        return true;
    }
}
