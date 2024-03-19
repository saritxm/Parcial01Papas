package view;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FileC {
    public JFileChooser fProp;
    public JFileChooser fResult;
    public FileC(){

    }

    public void fileP(){
        fProp= new JFileChooser(System.getProperty("user.dir"));
        fProp.setDialogTitle("Seleccionar el archivo de propiedades");
    } 

    public void fileR(){
        fResult= new JFileChooser(System.getProperty("user.dir"));
        fResult.setDialogTitle("Seleccionar el archivo de acceso aleatorio");
    }

    public void error(){
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error inesperado","ERROR",JOptionPane.ERROR_MESSAGE);
    }
}
