package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import model.Papas;

public class Archivos {
    private Properties prop;
    private ArrayList<Papas> papasCargadas;
    
    public Archivos() {
        this.papasCargadas = new ArrayList<>();
        this.prop          = new Properties();
    }

    public void setProp(File f){
        try {
            this.prop.load(new FileInputStream(f));
        } catch (IOException e) {
            
        }
    }

    public ArrayList<Papas> getPapasCargadas() {
        return papasCargadas;
    }

    public void setPapasCargadas(ArrayList<Papas> papasCargadas) {
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
                String nombre = prop.getProperty(i + ".name");
                String epecie = prop.getProperty(i + ".especie");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    
}
