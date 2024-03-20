/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Carlos Riveros
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    // Toma la ruta de acceso a la base de datos
    private static Connection cn = null;
    private static String URLBD = "jdbc:mysql://localhost:3306/empresa";
    private static String usuario = "root";
    private static String contrasena = "";

    public static Connection getConexion() {
        try {
            //obtiene la conexion con la base de datos usando los datos dados
            cn = DriverManager.getConnection(URLBD, usuario, contrasena);
        } catch (SQLException ex) {
            
        }
        return cn;
    }
    //cierra la conexion
    public static void desconectar() {
        cn = null;
    }
}
