package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import controller.PapaDAO;

public class ArchivosProp {
    private Properties prop; // Propiedades del archivo
    private PapaDAO papa = new PapaDAO(); // Objeto para acceder a la base de datos de Papas
    private ArrayList<Papa> papasCargadas; // Lista de Papas cargadas desde el archivo de propiedades

    // Constructor de la clase
    public ArchivosProp() {
        this.papasCargadas = new ArrayList<>(); // Inicializa la lista de Papas cargadas
        this.prop = new Properties(); // Inicializa el objeto de propiedades
    }
    // Método para establecer el archivo de propiedades
    public void setProp(File f) {
        try {
            this.prop.load(new FileInputStream(f)); // Carga el archivo de propiedades
        } catch (IOException e) {

        }
    }
    // Métodos getter y setter para la lista de Papas cargadas
    public ArrayList<Papa> getPapasCargadas() {
        return papasCargadas;
    }

    public void setPapasCargadas(ArrayList<Papa> papasCargadas) {
        this.papasCargadas = papasCargadas;
    }
    // Método para cargar las Papas desde el archivo de propiedades
    public void cargarPapas() {
        try {
            ArrayList<String> listaProp = new ArrayList<>(); // Lista para almacenar las claves de las Papas en el archivo
            for (String key : prop.stringPropertyNames()) {
                if (key.startsWith("p")) { // Si la clave comienza con "p" (indicando una papa)
                    if (!listaProp.contains(key.split("\\.")[0])) { // Verifica si la lista ya contiene la clave principal (para evitar duplicados)
                        listaProp.add(key.split("\\.")[0]); // Agrega la clave principal a la lista
                    }
                }
            }
            for (String i : listaProp) {
                String nombre = prop.getProperty(i + ".nombre"); // Obtiene el nombre de la papa
                String especie = prop.getProperty(i + ".especie"); // Obtiene la especie de la papa
                String prod = prop.getProperty(i + ".zonaprod"); // Obtiene la zona de producción de la papa
                papasCargadas.add(new Papa(nombre, especie, prod));// Crea un objeto Papa y lo agrega a la lista de Papas cargadas
            }
        } catch (Exception e) {
        }
    }
    // Método para guardar las Papas en la base de datos
    public void guardarPapas() throws SQLException {
        for (Papa p : papasCargadas) {
            papa.agregarPapa(p);
        }
    }

}
