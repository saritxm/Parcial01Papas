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
import view.PanelConsultar;
import view.PanelInsertar;
import view.PanelMenu;
import view.PanelVer;
import view.VentanaP;
import view.VentanaPrincipal;
public class Gestor {

    private PapaDAO papaDao;
    private Archivos ar = new Archivos();
    private Papa p,p1;
    
    private VentanaPrincipal vPrincipal;
    private VentanaP vProperties;
    
    private PanelConsultar pConsultar;
    private PanelInsertar pInsertar;
    private PanelMenu pMenu;
    private PanelVer pVer;

    public Gestor() {
        cargar();
        obtenerRegistrosPapa();
        consultarPapa(p);
        modificarPapa(p1);
        eliminarPapa(p);
       //Instanciación de la vista 
       this.vPrincipal = new VentanaPrincipal();
       this.vProperties = new VentanaP();
       //Instanciacion de los paneles 
       this.pConsultar = new PanelConsultar();
       this.pInsertar = new PanelInsertar();
       this.pMenu = new PanelMenu();
       this.pVer = new PanelVer();
       //
       
        
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
            System.out.println("Actualmente no existen registros de papas");
        }
    }

    private void consultarPapa(Papa p) {
        papaDao = new PapaDAO();
        Papa papaLocalizada = papaDao.consultarPapa(p);
        if (papaLocalizada != null) {
            System.out.println("**************** Papa consultada *************************");
            System.out.println("Nombre Papa: " + papaLocalizada.getNombre());
            System.out.println("Especie Papa: " + papaLocalizada.getEspecie());
            System.out.println("ZonaP papa : " + papaLocalizada.getZonaP());
            System.out.println("*************************************************\n");

        } else {
            System.out.println("No existen una papa como la entregada");
        }
    }
    
    private void modificarPapa(Papa p){
        papaDao = new PapaDAO();
        papaDao.modificarPapa(p);
    }
    
    private void eliminarPapa(Papa p){
        papaDao = new PapaDAO();
        papaDao.eliminarPapa(p);
    }
    
    private void cargar(){
        ar.setProp(new File("data/preload.properties"));
        ar.cargarPapas();
        ar.guardarPapas();
    }
}
