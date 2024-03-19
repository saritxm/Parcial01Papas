/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Carlos Riveros
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import model.Conexion;
import model.Papa;
import java.util.ArrayList;

public class PapaDAO {

    private Connection con;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;

    public PapaDAO() {
        con = null;
        st = null;
        rs = null;
    }

    public void agregarPapa(Papa papa) throws SQLException{
        String consulta = "INSERT INTO papa VALUES (?,?,?,?,?,?,?)";
        
        con = (Connection) Conexion.getConexion();
        ps = con.prepareStatement(consulta);

        ps.setString(1, papa.getNombre());
        ps.setString(2, papa.getEspecie());
        ps.setString(3, papa.getZonaP());
        ps.setString(4, papa.getHabitoC());
        ps.setString(5, papa.getFloracion());
        ps.setString(6, papa.getBayas());
        ps.setString(7, papa.getTuberculos());

        ps.executeUpdate();
        ps.close();
        Conexion.desconectar();
        
    }

    public Papa consultarPapaPorNombre(String nombre) {
        Papa papa = null;
        String consulta = "SELECT * FROM papa WHERE nombre ='" + nombre + "'";
        try {
            con = (Connection) Conexion.getConexion();
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            if (rs.next()) {
                papa = new Papa();
                papa.setEspecie(rs.getString("especie"));
                papa.setNombre(rs.getString("nombre"));
                papa.setZonaP(rs.getString("zonaP"));
                papa.setHabitoC(rs.getString("habitoC"));
                papa.setFloracion(rs.getString("floracion"));
                papa.setBayas(rs.getString("bayas"));
                papa.setTuberculos(rs.getString("tuberculos"));
            } else {
                //JOptionPane con el mensaje "No se encontro ninguna papa con este nombre"
            }
            st.close();
            Conexion.desconectar();
        } catch (SQLException ex) {
            //JOptionPane con el mensaje "No se pudo realizar la consulta"
        }
        return papa;
    }

     
    
    public void eliminarPapa(String nombre) {
        String consulta = "DELETE FROM papa WHERE nombre = ?";

        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(consulta);

            ps.setString(1, nombre);

            int filasEliminadas = ps.executeUpdate();

            if (filasEliminadas > 0) {
                //JOptionPane con el mensaje "Papa eliminada correctamente"
            } else {
                //JOptionPane con el mensaje "No se encontro ninguna papa por eliminar"
            }
            ps.close();
            con.close();
        } catch (SQLException ex) {
            //JOptionPane con el mensaje "Error al intentar eliminar la papa"
        }
    }

    public void modificarPapa(Papa papaNueva) {
        String consulta = "UPDATE papa SET especie=?, zonaP=?, habitoC=?, floracion=?, bayas=?, tuberculos=? WHERE nombre=?";

        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(consulta);

            ps.setString(1, papaNueva.getEspecie());
            ps.setString(2, papaNueva.getZonaP());
            ps.setString(3, papaNueva.getHabitoC());
            ps.setString(4, papaNueva.getFloracion());
            ps.setString(5, papaNueva.getBayas());
            ps.setString(6, papaNueva.getTuberculos());
            ps.setString(7, papaNueva.getNombre());

            int filasActualizadas = ps.executeUpdate();

            if (filasActualizadas > 0) {
                //JOptionPane con el mensaje "Papa modificada correctamente"
            } else {
                //JOptionPane con el mensaje "No se encontro papa por modificar"
            }

            ps.close();
            con.close();
        } catch (SQLException ex) {
            //JOptionPane con el mensaje "Error al intentar modificar la papa"
        }
    }

    public ArrayList<Papa> listaDePapas() {
        ArrayList<Papa> papas = new ArrayList<Papa>();
        String consulta = "SELECT * FROM papa";
        try {
            con = Conexion.getConexion();
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            while (rs.next()) {
                Papa papa = new Papa(rs.getString("nombre"),rs.getString("especie"),rs.getString("zonaP"),rs.getString("habitoC"),rs.getString("floracion"),rs.getString("bayas"),rs.getString("tuberculos"));
                
                papas.add(papa);
            }
            st.close();
            Conexion.desconectar();
        } catch (SQLException ex) {
            //JOptionPne con el mensaje "No se pudo realizar la consulta"
        }
        return papas;
    }
}
