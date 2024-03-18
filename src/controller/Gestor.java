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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import model.ArchivosProp;
import model.Papa;
import view.VentanaP;
import view.VentanaPrincipal;
public class Gestor implements ActionListener {

    private PapaDAO papaDao;
    private ArchivosProp ar = new ArchivosProp();
    private ArrayList<Papa> papasCargadas;
    
    private VentanaPrincipal vPrincipal;
    private VentanaP vProperties;

    public Gestor() {
        
       //Instanciación de la vista 
       this.vPrincipal = new VentanaPrincipal();
       this.vProperties = new VentanaP();
       this.papaDao = new PapaDAO();
       //Instanciacion de los paneles 

       //Escucha a los botones y radioButtons
       
       this.vPrincipal.getpConsultar().btnGuardarC.addActionListener(this);
       

       this.vPrincipal.getpConsultar().bNariñoC.addActionListener(this);
       this.vPrincipal.getpConsultar().bBoyacaC.addActionListener(this);
       this.vPrincipal.getpConsultar().bCundinamarcaC.addActionListener(this);
        
        this.vPrincipal.getpInsertar().btnLimpiarI.addActionListener(this);
        this.vPrincipal.getpInsertar().btnInsertarI.addActionListener(this);

        this.vPrincipal.getpInsertar().bNariñoI.addActionListener(this);
        this.vPrincipal.getpInsertar().bBoyacaI.addActionListener(this);
        this.vPrincipal.getpInsertar().bCundinamarcaI.addActionListener(this);
        
        this.vPrincipal.getpMenu().getBtnConsultarM().addActionListener(this);
        this.vPrincipal.getpMenu().getBtnInsertarM().addActionListener(this);
        this.vPrincipal.getpMenu().getBtnVerM().addActionListener(this);
        this.vPrincipal.getpMenu().getBtnSalirGeneral().addActionListener(this);

        this.vPrincipal.getpVer().jComboBoxV.addActionListener(this);

        this.vProperties.btnSiguienteP.addActionListener(this);
        this.vProperties.bNariñoP.addActionListener(this);
        this.vProperties.bBoyacaP.addActionListener(this);
        this.vProperties.bCundinamarcaP.addActionListener(this);

        papasCargadas = new ArrayList<>(papaDao.listaDePapas());
        obtenerRegistrosPapa();
        initialize();
    }

    private void obtenerRegistrosPapa() {
       try {
         this.vPrincipal.getpVer().jComboBoxV.removeAllItems();
         for(Papa i : papasCargadas){
             this.vPrincipal.getpVer().jComboBoxV.addItem(i.getNombre());
         }    
       } catch (Exception e) {
        // TODO: handle exception
       } 
    }

    private void asigancionVerAll(){
        this.vPrincipal.getpVer().radioZonas.setSelected(this.vPrincipal.getpVer().radioZonas.getSelection(), false);
        Papa p = papasCargadas.get(vPrincipal.getpVer().jComboBoxV.getSelectedIndex());
        this.vPrincipal.getpVer().cajaNombreV.setText(p.getNombre());
        this.vPrincipal.getpVer().cajaEspecieV.setText(p.getEspecie());
        this.vPrincipal.getpVer().cajaBayasV.setText(p.getBayas());
        this.vPrincipal.getpVer().cajaFloracionV.setText(p.getFloracion());
        this.vPrincipal.getpVer().cajaTuberculosV.setText(p.getTuberculos());
        this.vPrincipal.getpVer().cajaHabitoV.setText(p.getHabitoC());
        if(p.getZonaP().equals("NariÃ±o")) this.vPrincipal.getpVer().bNariñoV.setSelected(true);
        else if (p.getZonaP().equals("Cundinamarca"))this.vPrincipal.getpVer().bCundinamarcaV.setSelected(true);
        else if (p.getZonaP().equals("Boyaca"))this.vPrincipal.getpVer().bBoyacaV.setSelected(true);
    }

    private void consultarPapa(Papa p) {
        
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

    private void initialize(){
        vPrincipal.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.vPrincipal.pMenuE.btnConsultarM){
            this.vPrincipal.showConsultar();
            
        }
        else if(e.getSource() == this.vPrincipal.pMenuE.btnInsertarM){
            this.vPrincipal.showInsertar();
        }
        else if(e.getSource() == this.vPrincipal.pMenuE.btnVerM){
            obtenerRegistrosPapa();
            this.vPrincipal.showVer();        
        }
        else if(e.getSource() == this.vPrincipal.getpVer().jComboBoxV){
            try {
                asigancionVerAll();
            } catch (Exception e2) {
                
            }
        }
    }
}
