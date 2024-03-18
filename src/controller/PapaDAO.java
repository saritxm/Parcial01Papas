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

    public void agregarPapa(Papa papa) {
        String consulta = "INSERT INTO papa VALUES (?,?,?,?,?,?,?)";
        try {
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
        } catch (SQLException e) {
            System.out.println("No se pueden agregar elementos, verifique que ninguno se repita o que el elmento ya este en la base de datos");
        }
    }

    public Papa consultarPapa(Papa p) {
        Papa papa = null;
        String consulta = "SELECT * FROM papa WHERE nombre ='" + p.getNombre() + "' AND especie = '" + p.getEspecie() + "' AND zonaP ='" + p.getZonaP() + "' AND habitoC ='" + p.getHabitoC() + "' AND floracion ='" + p.getFloracion() + "' AND bayas ='" + p.getBayas() + "' AND tuberculos ='" + p.getTuberculos() + "'";
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
                System.out.println("No hay papa");
            }
            st.close();
            Conexion.desconectar();
        } catch (SQLException ex) {
            System.out.println("No se pudo realizar la consulta");
        }
        return papa;
    }
    
    public void eliminarPapa(Papa p) {
        String consulta = "DELETE FROM papa WHERE nombre = ?";

        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(consulta);

            ps.setString(1, p.getNombre());

            int filasEliminadas = ps.executeUpdate();

            if (filasEliminadas > 0) {
                System.out.println("Papa eliminada correctamente.");
            } else {
                System.out.println("No se encontró una papa para eliminar.");
            }
            ps.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error al intentar eliminar la papa: ");
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
                System.out.println("Papa actualizada correctamente.");
            } else {
                System.out.println("No se encontró una papa para actualizar.");
            }

            ps.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error al intentar actualizar la papa: ");
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
                Papa papa = new Papa();
                papa.setEspecie(rs.getString("especie"));
                papa.setNombre(rs.getString("nombre"));
                papa.setZonaP(rs.getString("zonaP"));
                papas.add(papa);
            }
            st.close();
            Conexion.desconectar();
        } catch (SQLException ex) {
            System.out.println("No se pudo realizar la consulta");
        }
        return papas;
    }
}
