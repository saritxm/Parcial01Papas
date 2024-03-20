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
<<<<<<< HEAD

    private static Connection cn = null; // Objeto para establecer la conexión con la base de datos
    private static String URLBD = "jdbc:mysql://localhost:3306/empresa"; // URL de la base de datos
    private static String usuario = "root"; // Nombre de usuario de la base de datos
    private static String contrasena = ""; // Contraseña de la base de datos
    
    // Método estático para obtener una conexión a la base de datos
    public static Connection getConexion() {
        try {
            // Intenta establecer la conexión con la base de datos utilizando los parámetros de conexión
=======
    // Toma la ruta de acceso a la base de datos
    private static Connection cn = null;
    private static String URLBD = "jdbc:mysql://localhost:3306/empresa";
    private static String usuario = "root";
    private static String contrasena = "";

    public static Connection getConexion() {
        try {
            //obtiene la conexion con la base de datos usando los datos dados
>>>>>>> 1fadda0e4cf58b23b68bebc1d5427a8532ec4f6f
            cn = DriverManager.getConnection(URLBD, usuario, contrasena);
        } catch (SQLException ex) {
            
        }
        return cn; // Devuelve la conexión establecida o null si ocurrió un error
    }
<<<<<<< HEAD
    // Método estático para desconectar la conexión a la base de datos
=======
    //cierra la conexion
>>>>>>> 1fadda0e4cf58b23b68bebc1d5427a8532ec4f6f
    public static void desconectar() {
        cn = null; // Establece el objeto Connection como null para cerrar la conexión
    }
}
