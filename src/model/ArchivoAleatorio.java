package model;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class ArchivoAleatorio {
    private RandomAccessFile archivo;
    private ArrayList<Papa> papas;
    private int tamreg = 1590; //40 nombre 40 especie 30 zona prod 40 crecimiento 400 floracion 400 bayas 400 tuberculos

    public ArchivoAleatorio(){

    }

    public void setArchivo(File f) throws IOException{
        this.archivo = new RandomAccessFile(f,"rw");
    }

    public void setPapas(ArrayList<Papa> papas) {
        this.papas = papas;
    }

    public void guardar() throws IOException{
        archivo.setLength(0);
        for(Papa i : papas){
            archivo.writeChars(llenarEspacios200(i.getNombre(), 20));
            archivo.writeChars(llenarEspacios200(i.getEspecie(), 20));
            archivo.writeChars(llenarEspacios200(i.getZonaP(), 15));
            archivo.writeChars(llenarEspacios200(i.getHabitoC(), 20));
            archivo.writeChars(llenarEspacios200(i.getFloracion(), 200));
            archivo.writeChars(llenarEspacios200(i.getBayas(), 200));
            archivo.writeChars(llenarEspacios200(i.getTuberculos(), 200));
        }
        archivo.close();
    }

    private String llenarEspacios200(String x, int esp){
        if (x.length() < esp) {
            for (int i = x.length(); i < esp; i++) {
                x = x + " ";
            }
        } else {
            x = x.substring(0, esp);
        }
        return x;
    }

    

}
