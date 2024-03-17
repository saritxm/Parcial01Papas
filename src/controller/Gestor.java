/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Carlos Riveros
 */
import java.util.ArrayList;
import java.io.File;
import model.Papa;
public class Gestor {

    private PapaDAO papaDao;
    private Archivos ar = new Archivos();

    public Gestor() {
        cargar();
        obtenerRegistrosPapa();
        buscarPapa();
    }

    private void obtenerRegistrosPapa() {
        papaDao = new PapaDAO();
        Papa papa;
        ArrayList<Papa> papas = papaDao.listaDePapas();
        if (!papas.isEmpty()) {
            int numeroPapa = 0;
            for (int i = 0; i < papas.size(); i++) {
                numeroPapa++;
                papa = papas.get(i);
                System.out.println("****************Papa No. " + numeroPapa + "**********");
                System.out.println("Nombre Papa: " + papa.getNombre());
                System.out.println("Especie Papa: " + papa.getEspecie());
                System.out.println("ZonaP papa: " + papa.getZonaP());
                System.out.println("*************************************************\n");
            }
        } else {
            System.out.println("Actualmente no existen registros de estudiantes");
        }
    }

    private void buscarPapa() {
        papaDao = new PapaDAO();
        String nombre = "ARBOLONA 1421";
        Papa papaLocalizada = papaDao.consultarPapa(nombre);
        if (papaLocalizada != null) {
            System.out.println("**************** Papa consultada *************************");
            System.out.println("Nombre Papa: " + papaLocalizada.getNombre());
            System.out.println("Especie Papa: " + papaLocalizada.getEspecie());
            System.out.println("ZonaP papa : " + papaLocalizada.getZonaP());
            System.out.println("*************************************************\n");

        } else {
            System.out.println("No existen un estudiante con ese codigo");
        }
    }
    private void cargar(){
        ar.setProp(new File("data/preload.properties"));
        ar.cargarPapas();
        ar.guardarPapas();
    }
}
