package view;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
// Proporciona funcionalidad para trabajar con archivos.

public class FileC {
    public JFileChooser fProp; // JFileChooser para el archivo de propiedades
    public JFileChooser fResult; // JFileChooser para el archivo de acceso aleatorio

    public FileC() {
        // Constructor vacío
    }

    // Método para configurar el JFileChooser para el archivo de propiedades
    public void fileP() {
        fProp = new JFileChooser(System.getProperty("user.dir")); // Crea un JFileChooser en el directorio del usuario
                                                            
        fProp.setDialogTitle("Seleccionar el archivo de propiedades");
    }

    // Método para configurar el JFileChooser para el archivo de acceso aleatorio
    public void fileR() {
        fResult = new JFileChooser(System.getProperty("user.dir"));
        fResult.setDialogTitle("Seleccionar el archivo de acceso aleatorio");
    }

    // Método para mostrar un mensaje de error
    public void error() {
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error inesperado", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
}
