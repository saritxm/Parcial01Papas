package controller;

import java.io.File;

public class Launcher {
    public static void main(String[] args) {
        Archivos p =  new Archivos();
        p.setProp(new File("data/preload.properties"));
        p.cargarPapas();
        p.imprimirPapas();
    }
}
