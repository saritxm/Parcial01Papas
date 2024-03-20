package model;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class ArchivoAleatorio {

    private RandomAccessFile archivo; // Archivo de acceso aleatorio
    private ArrayList<Papa> papas; // Lista de papas
    private int tamreg = 1590; // Tamaño de cada registro en el archivo en bytes
    // 40 nombre 40 especie 30 zona prod 40 crecimiento 400 floracion 400 bayas 400 tuberculos

    // Constructor
    public ArchivoAleatorio() {
    }
    // Método para establecer el archivo de acceso aleatorio
    public void setArchivo(File f) throws IOException {
        this.archivo = new RandomAccessFile(f, "rw"); // Abre el archivo en modo de lectura y escritura
    }
    // Método para establecer la lista de papas
    public void setPapas(ArrayList<Papa> papas) {
        this.papas = papas;
    }
    // Método para guardar los datos de las papas en el archivo
    public void guardar() throws IOException {
        archivo.setLength(0); // Borra el contenido del archivo
         // Escribe los datos de la papa en el archivo, llenando con espacios si es necesario
        for (Papa i : papas) {
            archivo.writeChars(llenarEspacios200(i.getNombre(), 20));
            archivo.writeChars(llenarEspacios200(i.getEspecie(), 20));
            archivo.writeChars(llenarEspacios200(i.getZonaP(), 15));
            archivo.writeChars(llenarEspacios200(i.getHabitoC(), 20));
            archivo.writeChars(llenarEspacios200(i.getFloracion(), 200));
            archivo.writeChars(llenarEspacios200(i.getBayas(), 200));
            archivo.writeChars(llenarEspacios200(i.getTuberculos(), 200));
        }
        // Cierra el archivo después de escribir todos los datos
        archivo.close();
    }
    // Método para llenar con espacios hasta alcanzar una longitud específica
    private String llenarEspacios200(String x, int esp) {
        if (x.length() < esp) { // Si la cadena es más corta que la longitud especificada
            for (int i = x.length(); i < esp; i++) { // Rellena con espacios hasta alcanzar la longitud
                x = x + " ";
            }
        } else { // Si la cadena es más larga que la longitud especificada
            x = x.substring(0, esp); // Corta la cadena para ajustarse a la longitud 
        }
        return x;
    }

}
