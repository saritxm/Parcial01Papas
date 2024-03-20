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

    //Realiza la consulta sql para insertar una papa
    public void agregarPapa(Papa papa) throws SQLException {
        String consulta = "INSERT INTO papa VALUES (?,?,?,?,?,?,?)";
        //inicializa la conexion para poder ejecutar una peticion a la base de datos
        con = (Connection) Conexion.getConexion();
        ps = con.prepareStatement(consulta);
        //completa los campos faltantes protegiendolos de ataques inyeccion sql
        ps.setString(1, papa.getNombre());
        ps.setString(2, papa.getEspecie());
        ps.setString(3, papa.getZonaP());
        ps.setString(4, papa.getHabitoC());
        ps.setString(5, papa.getFloracion());
        ps.setString(6, papa.getBayas());
        ps.setString(7, papa.getTuberculos());
        //Ejecuta la consulta, insertando la papa en la base de datos
        ps.executeUpdate();
        //Cierra la conexion para proteger la base de datos
        ps.close();
        Conexion.desconectar();

    }
    //Realiza la consulta dado el nombre de una papa
    public Papa consultarPapaPorNombre(String nombre) {
        Papa papa = null;
        String consulta = "SELECT * FROM papa WHERE nombre ='" + nombre + "'";
        try {
            //inicializa la conexion para poder ejecutar una peticion a la base de datos
            con = (Connection) Conexion.getConexion();
            st = con.createStatement();
            //Ejecuta la consulta
            rs = st.executeQuery(consulta);
            //Verifica que almenos halla alguna papa en la base de datos
            if (rs.next()) {
                //Asigna los parametros para devolver la papa que esta en nuestra base de datos
                papa = new Papa(rs.getString("nombre"), rs.getString("especie"), rs.getString("zonaP"),
                        rs.getString("habitoC"), rs.getString("floracion"), rs.getString("bayas"),
                        rs.getString("tuberculos"));
            } else {
                // JOptionPane con el mensaje "No se encontro ninguna papa con este nombre"
            }
            //Cierra la conexion con la base de datos para protegerla
            st.close();
            Conexion.desconectar();
        } catch (SQLException ex) {
            // JOptionPane con el mensaje "No se pudo realizar la consulta"
        }
        return papa;
    }
    //Realiza la consulta sql para encontrar todas las papas con una especie dada 
    public ArrayList<Papa> consultarPapaPorEspecie(String especie) {
        ArrayList<Papa> papas = new ArrayList<>();
        Papa papa = null;
        String consulta = "SELECT * FROM papa WHERE especie ='" + especie + "'";
        try {
            //inicializa la conexion para poder ejecutar una peticion a la base de datos
            con = (Connection) Conexion.getConexion();
            st = con.createStatement();
            //Ejecuta la consulta
            rs = st.executeQuery(consulta);
            //Verifica que la base de datos no este vacia 
            while (rs.next()) {
                //Asigna parametros para devolver cada papa que cumple con la especie dada
                papa = new Papa(rs.getString("nombre"), rs.getString("especie"), rs.getString("zonaP"),
                        rs.getString("habitoC"), rs.getString("floracion"), rs.getString("bayas"),
                        rs.getString("tuberculos"));
                papas.add(papa);
            }
            //Cierra la conexion para proteger la base de datos
            st.close();
            Conexion.desconectar();
        } catch (SQLException ex) {
            // JOptionPane con el mensaje "No se pudo realizar la consulta"
        }
        return papas;
    }
    //Realiza la consulta sql para contar todas las papas que estan en una zona dada 
    public int consultarPapasPorZona(String zonaP) {
        int cantidadPapas = 0;
        String consulta = "SELECT COUNT(*) AS total FROM papa WHERE zonaP = '" + zonaP + "'";
        try {
            //inicializa la conexion para poder ejecutar una peticion a la base de datos
            con = (Connection) Conexion.getConexion();
            st = con.createStatement();
            //Ejecuta la consulta 
            rs = st.executeQuery(consulta);
            //Verifica que la base de datos no este vacia
            if (rs.next()) {
                //toma el parametro devuelto por la base de datos para que se pueda mostrar
                cantidadPapas = rs.getInt("total");
            } else {
                // JOptionPane con el mensaje "No se encontraron papas de esta especie"
            }
            //Cierra la conecion con la base de datos para protegerla
            st.close();
            Conexion.desconectar();
        } catch (SQLException ex) {
            // JOptionPane con el mensaje "No se pudo realizar la consulta"
        }
        return cantidadPapas;
    }
    //Realiza la consulta sql para encontrar todas las papas con una forma de tuberculo dada 
    public ArrayList<Papa> consultarPapaPorTuberculo(String formaTuberculo) {
        ArrayList<Papa> papas = new ArrayList<>();
        Papa papa = null;
        String consulta = "SELECT * FROM papa WHERE tuberculos LIKE'%" + formaTuberculo + "%'";
        try {
            //inicializa la conexion para poder ejecutar una peticion a la base de datos
            con = (Connection) Conexion.getConexion();
            st = con.createStatement();
            //Ejecuta la consulta
            rs = st.executeQuery(consulta);
            //Verifica que la base de datos no este vacia
            while (rs.next()) {
                //asigna los datos para de volver cada papa que cumpla con la forma dada
                papa = new Papa(rs.getString("nombre"), rs.getString("especie"), rs.getString("zonaP"),
                        rs.getString("habitoC"), rs.getString("floracion"), rs.getString("bayas"),
                        rs.getString("tuberculos"));
                papas.add(papa);
            }
            //Cierra la conexion par proteger  la base de datos
            st.close();
            Conexion.desconectar();
        } catch (SQLException ex) {
            // JOptionPane con el mensaje "No se pudo realizar la consulta"
        }
        return papas;
    }
    //Realiza la consulta sql para encontrar todas las papas con una color dado 
    public ArrayList<Papa> consultarPapaPorFloracion(String colorFloracion) {
        ArrayList<Papa> papas = new ArrayList<>();
        Papa papa = null;
        String consulta = "SELECT * FROM papa WHERE floracion LIKE'%" + colorFloracion + "%'";
        try {
            //inicializa la conexion para poder ejecutar una peticion a la base de datos
            con = (Connection) Conexion.getConexion();
            st = con.createStatement();
            //Ejecuta la consulta
            rs = st.executeQuery(consulta);
            //Verifica que la base no este vacia
            while (rs.next()) {
                //asigna los datos para de volver cada papa que cumpla con el color dado
                papa = new Papa(rs.getString("nombre"), rs.getString("especie"), rs.getString("zonaP"),
                        rs.getString("habitoC"), rs.getString("floracion"), rs.getString("bayas"),
                        rs.getString("tuberculos"));
                papas.add(papa);
            }
            //Cierra la conexion para proteger la base de datos
            st.close();
            Conexion.desconectar();
        } catch (SQLException ex) {
            // JOptionPane con el mensaje "No se pudo realizar la consulta"
        }
        return papas;
    }
    //Realiza la consulta sql para eliminar una papa con el nombre dado 
    public void eliminarPapa(String nombre) {
        String consulta = "DELETE FROM papa WHERE nombre = ?";

        try {
            //inicializa la conexion para poder ejecutar una peticion a la base de datos
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(consulta);
            //Completa los parmetros de la consulta
            ps.setString(1, nombre);
            //Ejecuta la consulta
            ps.executeUpdate();

            //Cierra la conexion para proteger la base de datos 
            ps.close();
            con.close();
        } catch (SQLException ex) {
            // JOptionPane con el mensaje "Error al intentar eliminar la papa"
        }
    }
    //Realiza la consulta sql para modificar una papa que este regitrada en la base de datos
    public void modificarPapa(Papa papaNueva) {
        String consulta = "UPDATE papa SET especie=?, zonaP=?, habitoC=?, floracion=?, bayas=?, tuberculos=? WHERE nombre=?";

        try {
            //inicializa la conexion para poder ejecutar una peticion a la base de datos
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(consulta);
            //Toma los datos para encontrar la papa a modificar y para modificar cada campo de la papa 
            ps.setString(1, papaNueva.getEspecie());
            ps.setString(2, papaNueva.getZonaP());
            ps.setString(3, papaNueva.getHabitoC());
            ps.setString(4, papaNueva.getFloracion());
            ps.setString(5, papaNueva.getBayas());
            ps.setString(6, papaNueva.getTuberculos());
            ps.setString(7, papaNueva.getNombre());
            //Ejecuta la consulta
            ps.executeUpdate();
            //Cierra la conexion para proteger la base de datos
            ps.close();
            con.close();
        } catch (SQLException ex) {
            // JOptionPane con el mensaje "Error al intentar modificar la papa"
        }
    }
    //Realiza la consulta sql para traer todas las papas que esten en la base de datos
    public ArrayList<Papa> listaDePapas() {
        ArrayList<Papa> papas = new ArrayList<Papa>();
        String consulta = "SELECT * FROM papa";
        try {
            //inicializa la conexion para poder ejecutar una peticion a la base de datos
            con = Conexion.getConexion();
            st = con.createStatement();
            //Ejecuta la consulta
            rs = st.executeQuery(consulta);
            //Verifica que la base no ese vacia 
            while (rs.next()) {
                //toma los parametros de cada papa para añadirlos en un arreglo de datos
                Papa papa = new Papa(rs.getString("nombre"), rs.getString("especie"), rs.getString("zonaP"),
                        rs.getString("habitoC"), rs.getString("floracion"), rs.getString("bayas"),
                        rs.getString("tuberculos"));

                papas.add(papa);
            }
            //Cierra la conexion para proteger la base de datos
            st.close();
            Conexion.desconectar();
        } catch (SQLException ex) {
            // JOptionPne con el mensaje "No se pudo realizar la consulta"
        }
        return papas;
    }
}
