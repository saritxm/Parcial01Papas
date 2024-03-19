package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import controller.PapaDAO;

public class ArchivosProp {
    private Properties prop;
    private PapaDAO papa = new PapaDAO();
    private ArrayList<Papa> papasCargadas;
    
    public ArchivosProp() {
        this.papasCargadas = new ArrayList<>();
        this.prop          = new Properties();
    }

    public void setProp(File f){
        try {
            this.prop.load(new FileInputStream(f));
        } catch (IOException e) {
            
        }
    }

    public ArrayList<Papa> getPapasCargadas() {
        return papasCargadas;
    }

    public void setPapasCargadas(ArrayList<Papa> papasCargadas) {
        this.papasCargadas = papasCargadas;
    }

    public void cargarPapas(){
        try {
            ArrayList<String> listaProp = new ArrayList<>();
            for(String key : prop.stringPropertyNames()){
                if(key.startsWith("p")){
                    if(!listaProp.contains(key.split("\\.")[0])){
                        listaProp.add(key.split("\\.")[0]);
                    }
                }
            }
            for(String i : listaProp){
                String nombre = prop.getProperty(i + ".nombre");
                String especie = prop.getProperty(i + ".especie");
                String prod   = prop.getProperty(i + ".zonaprod");
                papasCargadas.add(new Papa(nombre,especie,prod));
            }
        } catch (Exception e) {
        }
    }
    public void guardarPapas() throws SQLException{
        for(Papa p: papasCargadas){
            papa.agregarPapa(p);
        }
    }
    public void imprimirPapas(){
        for(Papa i : papasCargadas){
            System.out.println(i.toString());
        }
    }
}
