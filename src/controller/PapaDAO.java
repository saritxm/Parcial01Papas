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
    
    public PapaDAO(){
        con = null;
        st = null;
        rs = null;
    }
    
    public void agregarPapa(Papa papa){
        String consulta = "INSERT INTO papa VALUES (?,?,?,?,?,?,?)";
        try{
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
        catch(SQLException e){
        
        }
    }
    public Papa consultarPapa(String nombre) {
        Papa papa = null;
        String consulta = "SELECT * FROM papa where nombre='" + nombre+"'";
        try {
            con = (Connection) Conexion.getConexion();
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            if (rs.next()) {
                papa = new Papa();
                papa.setEspecie(rs.getString("especie"));
                papa.setNombre(rs.getString("nombre"));
                papa.setZonaP(rs.getString("zonaP"));
            }
            st.close();
            Conexion.desconectar();
        } catch (SQLException ex) {
            System.out.println("No se pudo realizar la consulta");
        }
        return papa;
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
            }
            st.close();
            Conexion.desconectar();
        } catch (SQLException ex) {
            System.out.println("No se pudo realizar la consulta");
        }
        return papas;
    }
}
