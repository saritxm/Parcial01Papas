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
import java.sql.SQLException;

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

        // Instanciación de la vista
        this.vPrincipal = new VentanaPrincipal();
        this.vProperties = new VentanaP();
        this.papaDao = new PapaDAO();
        // Instanciacion de los paneles

        // Escucha a los botones y radioButtons
        this.vPrincipal.getpConsultar().btnSNombre.addActionListener(this);
        this.vPrincipal.getpConsultar().btnSEspecie.addActionListener(this);
        this.vPrincipal.getpConsultar().btnSZona.addActionListener(this);
        this.vPrincipal.getpConsultar().btnSForma.addActionListener(this);
        this.vPrincipal.getpConsultar().btnSFloracion.addActionListener(this);

        this.vPrincipal.getpInsertar().btnLimpiarI.addActionListener(this);
        this.vPrincipal.getpInsertar().btnInsertarI.addActionListener(this);
        this.vPrincipal.getpInsertar().bNariñoI.addActionListener(this);
        this.vPrincipal.getpInsertar().bBoyacaI.addActionListener(this);
        this.vPrincipal.getpInsertar().bCundinamarcaI.addActionListener(this);
        
        //Escucha a los botones y radio buttons de los paneles especificos 
        //Panel Nombre
        this.vPrincipal.getpConsultar().pNombre.btnConsultarCN.addActionListener(this);
        this.vPrincipal.getpConsultar().pNombre.bNariñoCN.addActionListener(this);
        this.vPrincipal.getpConsultar().pNombre.bBoyacaCN.addActionListener(this);
        this.vPrincipal.getpConsultar().pNombre.bCundinamarcaCN.addActionListener(this);

        this.vPrincipal.getpConsultar().pEspecie.jComboBoxEspecie.addActionListener(this);
        this.vPrincipal.getpConsultar().pEspecie.btnConsultarEspecie.addActionListener(this);
        //Panel Zonas
        this.vPrincipal.getpConsultar().pZonas.bNariñoCZ.addActionListener(this);
        this.vPrincipal.getpConsultar().pZonas.bBoyacaCZ.addActionListener(this);
        this.vPrincipal.getpConsultar().pZonas.bCundinamarcaCZ.addActionListener(this);

        this.vPrincipal.getpConsultar().pForma.jComboBoxPapasCF.addActionListener(this);
        this.vPrincipal.getpConsultar().pForma.btnConsultarF.addActionListener(this);

        this.vPrincipal.getpConsultar().pFloracion.btnConsultarFL.addActionListener(this);

        this.vPrincipal.getpMenu().getBtnConsultarM().addActionListener(this);
        this.vPrincipal.getpMenu().getBtnInsertarM().addActionListener(this);
        this.vPrincipal.getpMenu().getBtnVerM().addActionListener(this);
        this.vPrincipal.getpMenu().getBtnSalirGeneral().addActionListener(this);
        this.vPrincipal.getpMenu().getBtnEditarM().addActionListener(this);

        this.vPrincipal.getpVer().jComboBoxV.addActionListener(this);
//Del panel Editar
        this.vPrincipal.getpEditar().btnModificarE.addActionListener(this);
        this.vPrincipal.getpEditar().btnEliminarE.addActionListener(this);
        this.vPrincipal.getpEditar().btnGuardarE.addActionListener(this);
        this.vPrincipal.getpEditar().bNariñoE.addActionListener(this);
        this.vPrincipal.getpEditar().bBoyacaE.addActionListener(this);
        this.vPrincipal.getpEditar().bCundinamarcaE.addActionListener(this);
        this.vPrincipal.getpEditar().jComboBoxpEditar.addActionListener(this);

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
            for (Papa i : papasCargadas) {
                this.vPrincipal.getpVer().jComboBoxV.addItem(i.getNombre());
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    private void asigancionVerAll() {
        this.vPrincipal.getpVer().radioZonas.setSelected(this.vPrincipal.getpVer().radioZonas.getSelection(), false);
        Papa p = papasCargadas.get(vPrincipal.getpVer().jComboBoxV.getSelectedIndex());
        this.vPrincipal.getpVer().cajaNombreV.setText(p.getNombre());
        this.vPrincipal.getpVer().cajaEspecieV.setText(p.getEspecie());
        this.vPrincipal.getpVer().cajaBayasV.setText(p.getBayas());
        this.vPrincipal.getpVer().cajaFloracionV.setText(p.getFloracion());
        this.vPrincipal.getpVer().cajaTuberculosV.setText(p.getTuberculos());
        this.vPrincipal.getpVer().cajaHabitoV.setText(p.getHabitoC());
        if (p.getZonaP().equals("NariÃ±o"))
            this.vPrincipal.getpVer().bNariñoV.setSelected(true);
        else if (p.getZonaP().equals("Cundinamarca"))
            this.vPrincipal.getpVer().bCundinamarcaV.setSelected(true);
        else if (p.getZonaP().equals("Boyaca"))
            this.vPrincipal.getpVer().bBoyacaV.setSelected(true);
    }

    // Estoy en el baño, ya vengo
    // <----------------------------------------------------------
    private void insertarPapa() {
        try {
            Papa p = new Papa();
            p.setNombre(vPrincipal.getpInsertar().cajaNombre.getText());
            p.setEspecie(vPrincipal.getpInsertar().cajaEspecie.getText());
            p.setBayas(vPrincipal.getpInsertar().cajaBayas.getText());
            p.setHabitoC(vPrincipal.getpInsertar().cajaHabito.getText());
            p.setFloracion(vPrincipal.getpInsertar().cajaFloracion.getText());
            p.setTuberculos(vPrincipal.getpInsertar().cajaTuberculos.getText());
            if (this.vPrincipal.getpInsertar().bNariñoI.isSelected())
                p.setZonaP("NariÃ±o");
            else if (this.vPrincipal.getpInsertar().bCundinamarcaI.isSelected())
                p.setZonaP("Cundinamarca");
            else if (this.vPrincipal.getpInsertar().bBoyacaI.isSelected())
                p.setZonaP("Boyaca");

            papaDao.agregarPapa(p);
            papasCargadas = new ArrayList<>(papaDao.listaDePapas());
            vPrincipal.getpInsertar().papaIngresada();
        } catch (NullPointerException e) {
            vPrincipal.getpInsertar().camposVacios();
        } catch (SQLException e2) {
            vPrincipal.getpInsertar().papaRepetida();
        }
    }

    private void modificarPapa(Papa p) {

        papaDao.modificarPapa(p);
    }

    private void initialize() {
        vPrincipal.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vPrincipal.pMenuE.btnConsultarM) {
            this.vPrincipal.showConsultar();
        } else if (e.getSource() == this.vPrincipal.pMenuE.btnInsertarM) {
            this.vPrincipal.showInsertar();
        }else if (e.getSource() == this.vPrincipal.pMenuE.btnEditarM) {
            this.vPrincipal.showEditar();
        } else if (e.getSource() == this.vPrincipal.pMenuE.btnVerM) {
            obtenerRegistrosPapa();
            this.vPrincipal.showVer();
        } else if (e.getSource() == this.vPrincipal.getpVer().jComboBoxV) {
            try {
                asigancionVerAll();
            } catch (Exception e2) {
            }
        } else if (e.getSource() == vPrincipal.getpInsertar().btnInsertarI) {
            insertarPapa();

            // Panel Consultar
        } else if (e.getSource() == this.vPrincipal.pConsultar.btnSNombre) {
            this.vPrincipal.pConsultar.showNombre();
        } else if (e.getSource() == this.vPrincipal.pConsultar.btnSEspecie) {
            this.vPrincipal.pConsultar.showEspecie();
        } else if (e.getSource() == this.vPrincipal.pConsultar.btnSZona) {
            this.vPrincipal.pConsultar.showZonas();
        } else if (e.getSource() == this.vPrincipal.pConsultar.btnSForma) {
            this.vPrincipal.pConsultar.showForma();
        } else if (e.getSource() == this.vPrincipal.pConsultar.btnSFloracion) {
            this.vPrincipal.pConsultar.showFloracion();
        }
    }
}
