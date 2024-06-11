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

public class video {

    int id;
    String titulo;
    String director;
    int cliId;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getCliId() {
        return cliId;
    }
    public void setCliId(int cliId) {
        this.cliId = cliId;
    }

    public void insertarVideo(JTextField paramTitulo, JTextField paramDirector, JTextField paramCliId) {
        setTitulo(paramTitulo.getText());
        setDirector(paramDirector.getText());
        try {
            int cliId = Integer.parseInt(paramCliId.getText());
            setCliId(cliId);
        } catch (NumberFormatException e) {
            System.out.println("El ID del Cliente ingresado no es un número válido");
            return;
        }

        conexionBD objetoConexion = new conexionBD();
        String consulta = "INSERT INTO videos (titulo, director, cli_id) VALUES (?, ?, ?)";

        try {
            Connection con = objetoConexion.estableceConexion();
            CallableStatement cs = con.prepareCall(consulta);
            cs.setString(1, getTitulo());
            cs.setString(2, getDirector());
            cs.setInt(3, getCliId());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se insertó correctamente el video");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se insertó correctamente el video, error: " + e.toString());
        }
    }


    public void MostrarVideos(JTable paramMostrarVideos) {
        conexionBD objetoConexion = new conexionBD();
        DefaultTableModel modelo = new DefaultTableModel();
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<>(modelo);
        paramMostrarVideos.setRowSorter(OrdenarTabla);

        modelo.addColumn("ID");
        modelo.addColumn("Título");
        modelo.addColumn("Director");
        modelo.addColumn("Cli ID");

        paramMostrarVideos.setModel(modelo);
        String sql = "SELECT * FROM videos;";
        String[] datos = new String[4];
        Statement st;

        try {
            st = objetoConexion.estableceConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                modelo.addRow(datos);
            }
            paramMostrarVideos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros de videos, error: " + e.toString());
        }
    }

    public void eliminarVideo(int idVideo) {
        conexionBD objetoConexion = new conexionBD();
        String consulta = "DELETE FROM videos WHERE id = ?";

        try {
            Connection con = objetoConexion.estableceConexion();
            CallableStatement cs = con.prepareCall(consulta);
            cs.setInt(1, idVideo);
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente el video");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el video, error: " + e.toString());
        }
    }

    public void SeleccionarVideo(JTable tablaVideos, JTextField paramId, JTextField paramTitulo, JTextField paramDirector, JTextField paramCliId) {
        try {
            int fila = tablaVideos.getSelectedRow();

            if (fila >= 0) {
                paramId.setText(tablaVideos.getValueAt(fila, 0).toString());
                paramTitulo.setText(tablaVideos.getValueAt(fila, 1).toString());
                paramDirector.setText(tablaVideos.getValueAt(fila, 2).toString());
                paramCliId.setText(tablaVideos.getValueAt(fila, 3).toString());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de selección, error: " + e);
        }
    }

    public void ModificarVideo(JTable tablaVideos, JTextField paramTitulo, JTextField paramDirector, JTextField paramCliId, JTextField paramId) {
        conexionBD objetoConexion = new conexionBD();

        try {
            int idVideo = Integer.parseInt(paramId.getText());
            String title = paramTitulo.getText();
            String director = paramDirector.getText();
            int cliId = Integer.parseInt(paramCliId.getText());

            String consulta = "UPDATE videos SET titulo=?, director=?, cli_id=? WHERE id=?";

            Connection con = objetoConexion.estableceConexion();
            PreparedStatement ps = con.prepareStatement(consulta);
            ps.setString(1, title);
            ps.setString(2, director);
            ps.setInt(3, cliId);
            ps.setInt(4, idVideo);

            int filasActualizadas = ps.executeUpdate();

            if (filasActualizadas > 0) {
                JOptionPane.showMessageDialog(null, "Video modificado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar el video");
            }

            MostrarVideos(tablaVideos);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al modificar el video: " + e.getMessage());
        }
    }
}
