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

import model.ArchivoAleatorio;
import model.ArchivosProp;
import model.Papa;
import view.FileC;
import view.PapaConsultada;
import view.VentanaP;
import view.VentanaPrincipal;

public class Gestor implements ActionListener {

    private PapaDAO papaDao;
    private ArchivosProp ar;
    private ArchivoAleatorio al;
    private ArrayList<Papa> papasCargadas;

    private VentanaPrincipal vPrincipal;
    private VentanaP vProperties;
    private PapaConsultada consulta;
    private FileC vArchivos;

    private File fProp;
    private File fResult;

    private int x = 0;

    public Gestor() {
        // Instaciacion de clases para el manejo de archivos y DB
        this.papaDao = new PapaDAO();
        this.vArchivos = new FileC();
        this.ar = new ArchivosProp();
        this.al = new ArchivoAleatorio();

        // Instanciación de la vista
        this.vPrincipal = new VentanaPrincipal();
        this.consulta = new PapaConsultada();
        this.vProperties = new VentanaP();

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

        // Escucha a los botones y radio buttons de los paneles especificos
        // Panel Nombre
        this.vPrincipal.getpConsultar().pNombre.btnConsultarCN.addActionListener(this);
        this.vPrincipal.getpConsultar().pNombre.bNariñoCN.addActionListener(this);
        this.vPrincipal.getpConsultar().pNombre.bBoyacaCN.addActionListener(this);
        this.vPrincipal.getpConsultar().pNombre.bCundinamarcaCN.addActionListener(this);
        // Panel especia
        this.vPrincipal.getpConsultar().pEspecie.jComboBoxEspecie.addActionListener(this);
        this.vPrincipal.getpConsultar().pEspecie.btnConsultarEspecie.addActionListener(this);
        // Panel Zonas
        this.vPrincipal.getpConsultar().pZonas.bNariñoCZ.addActionListener(this);
        this.vPrincipal.getpConsultar().pZonas.bBoyacaCZ.addActionListener(this);
        this.vPrincipal.getpConsultar().pZonas.bCundinamarcaCZ.addActionListener(this);
        // Panel Forma
        this.vPrincipal.getpConsultar().pForma.jComboBoxPapasCF.addActionListener(this);
        this.vPrincipal.getpConsultar().pForma.btnConsultarF.addActionListener(this);
        // Panel floracion
        this.vPrincipal.getpConsultar().pFloracion.btnConsultarFL.addActionListener(this);
        // Panel menu
        this.vPrincipal.getpMenu().getBtnConsultarM().addActionListener(this);
        this.vPrincipal.getpMenu().getBtnInsertarM().addActionListener(this);
        this.vPrincipal.getpMenu().getBtnVerM().addActionListener(this);
        this.vPrincipal.getpMenu().getBtnSalirGeneral().addActionListener(this);
        this.vPrincipal.getpMenu().getBtnEditarM().addActionListener(this);
        // Boton desplegable de ver todos
        this.vPrincipal.getpVer().jComboBoxV.addActionListener(this);
        // Del panel Editar
        this.vPrincipal.getpEditar().btnModificarE.addActionListener(this);
        this.vPrincipal.getpEditar().btnEliminarE.addActionListener(this);
        this.vPrincipal.getpEditar().bNariñoE.addActionListener(this);
        this.vPrincipal.getpEditar().bBoyacaE.addActionListener(this);
        this.vPrincipal.getpEditar().bCundinamarcaE.addActionListener(this);
        this.vPrincipal.getpEditar().jComboBoxpEditar.addActionListener(this);

        // Papa consultada
        this.consulta.jButton1.addActionListener(this);

        this.vProperties.btnSiguienteP.addActionListener(this);
        this.vProperties.bNariñoP.addActionListener(this);
        this.vProperties.bBoyacaP.addActionListener(this);
        this.vProperties.bCundinamarcaP.addActionListener(this);

        initialize();
    }

    private void cargar(){
        papasCargadas = new ArrayList<>(papaDao.listaDePapas());
    }

    private void papasProp(Papa p) {
        vProperties.cajaNombreP.setText(p.getNombre());
        vProperties.cajaEspecieP.setText(p.getEspecie());
        if (p.getZonaP().equals("NariÃ±o"))
            vProperties.bNariñoP.setSelected(true);
        else if (p.getZonaP().equals("Cundinamarca"))
            vProperties.bCundinamarcaP.setSelected(true);
        else if (p.getZonaP().equals("Boyaca"))
            vProperties.bBoyacaP.setSelected(true);
    }

    private void obtenerRegistrosPapa() {
        try {
            cargar();
            this.vPrincipal.getpVer().jComboBoxV.removeAllItems();
            for (Papa i : papasCargadas) {
                this.vPrincipal.getpVer().jComboBoxV.addItem(i.getNombre());
            }
        } catch (Exception e) {
        }
    }

    private void obtenerRegistrosPapa2() {
        try {
            cargar();
            this.vPrincipal.getpEditar().jComboBoxpEditar.removeAllItems();
            for (Papa i : papasCargadas) {
                this.vPrincipal.getpEditar().jComboBoxpEditar.addItem(i.getNombre());
            }
        } catch (Exception e) {
        }
    }

    // Asignacion de los campos de la consulta de todas las papas
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

    private void asignacionEditar() {
        this.vPrincipal.getpEditar().ZonasbE.setSelected(this.vPrincipal.getpEditar().ZonasbE.getSelection(), false);
        Papa p = papasCargadas.get(vPrincipal.getpEditar().jComboBoxpEditar.getSelectedIndex());
        this.vPrincipal.getpEditar().cajaNombreE.setText(p.getNombre());
        this.vPrincipal.getpEditar().cajaEspecieE.setText(p.getEspecie());
        this.vPrincipal.getpEditar().cajaBayasE.setText(p.getBayas());
        this.vPrincipal.getpEditar().cajaFloracionE.setText(p.getFloracion());
        this.vPrincipal.getpEditar().cajaTuberculosE.setText(p.getTuberculos());
        this.vPrincipal.getpEditar().cajaHabitoE.setText(p.getHabitoC());
        if (p.getZonaP().equals("NariÃ±o"))
        this.vPrincipal.getpEditar().bNariñoE.setSelected(true);
        else if (p.getZonaP().equals("Cundinamarca"))
        this.vPrincipal.getpEditar().bCundinamarcaE.setSelected(true);
        else if (p.getZonaP().equals("Boyaca"))
        this.vPrincipal.getpEditar().bBoyacaE.setSelected(true);
    }

    // Asignacion por papa especifica
    private void asigancionVerConsulta(Papa p) {
        this.consulta.cajaNombreP.setText(p.getNombre());
        this.consulta.cajaEspecieP.setText(p.getEspecie());
        this.consulta.cajaBayasP.setText(p.getBayas());
        this.consulta.cajaFloracionP.setText(p.getFloracion());
        this.consulta.cajaTuberculosP.setText(p.getTuberculos());
        this.consulta.cajaHabitoP.setText(p.getHabitoC());
        if (p.getZonaP().equals("NariÃ±o"))
            this.consulta.bNariñoP.setSelected(true);
        else if (p.getZonaP().equals("Cundinamarca"))
            this.consulta.bCundinamarcaP.setSelected(true);
        else if (p.getZonaP().equals("Boyaca"))
            this.consulta.bBoyacaP.setSelected(true);
        this.consulta.setVisible(true);
    }

    // Asignacion y consulta de la papa por nombre
    private void consultarPorNombre(String x) {
        Papa p = papaDao.consultarPapaPorNombre(x);
        if (p == null)
            this.vPrincipal.pConsultar.pNombre.noHay();
        else {
            this.vPrincipal.pConsultar.pNombre.cajaEspecieCN.setText(p.getEspecie());
            this.vPrincipal.pConsultar.pNombre.cajaTuberculosCN.setText(p.getTuberculos());
            this.vPrincipal.pConsultar.pNombre.cajaBayasCN.setText(p.getBayas());
            this.vPrincipal.pConsultar.pNombre.cajaFloracionCN.setText(p.getFloracion());
            this.vPrincipal.pConsultar.pNombre.cajaHabitoCN.setText(p.getHabitoC());
            if (p.getZonaP().equals("NariÃ±o"))
                this.vPrincipal.pConsultar.pNombre.bNariñoCN.setSelected(true);
            else if (p.getZonaP().equals("Cundinamarca"))
                this.vPrincipal.pConsultar.pNombre.bCundinamarcaCN.setSelected(true);
            else if (p.getZonaP().equals("Boyaca"))
                this.vPrincipal.pConsultar.pNombre.bBoyacaCN.setSelected(true);
        }
    }



    // Consulta por espacie
    private void consultarPorEspecie(String x) {
        this.vPrincipal.pConsultar.pEspecie.jComboBoxEspecie.removeAllItems();
        papasCargadas = new ArrayList<>(papaDao.consultarPapaPorEspecie(x));
        for (Papa i : papasCargadas)
            this.vPrincipal.pConsultar.pEspecie.jComboBoxEspecie.addItem(i.getNombre());
    }

    // Segun zona prod
    private void consultaZonaProd(String string) {
        this.vPrincipal.pConsultar.pZonas.cajaNumeroPapasCFL
                .setText(String.valueOf(papaDao.consultarPapasPorZona(string)));
    }

    // Segun forma
    private void consultarPorForma(String f) {
        this.vPrincipal.pConsultar.pForma.jComboBoxPapasCF.removeAllItems();
        papasCargadas = new ArrayList<>(papaDao.consultarPapaPorTuberculo(f));
        for (Papa i : papasCargadas)
            this.vPrincipal.pConsultar.pForma.jComboBoxPapasCF.addItem(i.getNombre());
    }

    // Segun color
    private void consultaColor(String f) {
        this.vPrincipal.pConsultar.pFloracion.cajaNumeroPapasCFL
                .setText(String.valueOf(papaDao.consultarPapaPorFloracion(f).size()));
    }

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
            vPrincipal.getpEditar();
            vPrincipal.getpInsertar().papaIngresada();
        } catch (NullPointerException e) {
            vPrincipal.getpInsertar().camposVacios();
        } catch (SQLException e2) {
            vPrincipal.getpInsertar().papaRepetida();
        }
    }
    //Editar una papa
    private void editarPapa() {
        try {
            Papa p = new Papa();
            p.setNombre(vPrincipal.getpEditar().cajaNombreE.getText());
            p.setEspecie(vPrincipal.getpEditar().cajaEspecieE.getText());
            p.setBayas(vPrincipal.getpEditar().cajaBayasE.getText());
            p.setHabitoC(vPrincipal.getpEditar().cajaHabitoE.getText());
            p.setFloracion(vPrincipal.getpEditar().cajaFloracionE.getText());
            p.setTuberculos(vPrincipal.getpEditar().cajaTuberculosE.getText());
            if (vPrincipal.getpEditar().bNariñoE.isSelected())
                p.setZonaP("NariÃ±o");
            else if (vPrincipal.getpEditar().bCundinamarcaE.isSelected())
                p.setZonaP("Cundinamarca");
            else if (vPrincipal.getpEditar().bBoyacaE.isSelected())
                p.setZonaP("Boyaca");

            papaDao.modificarPapa(p);
            cargar();
            vPrincipal.getpEditar().modificacion();
        } catch (NullPointerException e) {
            vPrincipal.getpInsertar().camposVacios();
        }
    }

    private void initialize() {
        vArchivos.fileP();
        vArchivos.fProp.showOpenDialog(vArchivos.fProp);
        this.fProp = vArchivos.fProp.getSelectedFile();
        ar.setProp(fProp);
        ar.cargarPapas();
        try {
            ar.guardarPapas();
        } catch (Exception e) {
        }
        vArchivos.fileR();
        vArchivos.fResult.showOpenDialog(vArchivos.fResult);
        this.fResult = vArchivos.fResult.getSelectedFile();
        try {
            al.setArchivo(fResult);
        } catch (Exception e) {
            vArchivos.error();
        }
        papasCargadas = new ArrayList<>(ar.getPapasCargadas());
        papasProp(papasCargadas.get(0));
        vProperties.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        consulta.setVisible(false);
        // Panel menu
        if (e.getSource() == this.vPrincipal.pMenuE.btnConsultarM) {
            this.vPrincipal.showConsultar();
        } else if (e.getSource() == this.vPrincipal.pMenuE.btnInsertarM) {
            this.vPrincipal.showInsertar();
        } else if (e.getSource() == this.vPrincipal.pMenuE.btnEditarM) {
            obtenerRegistrosPapa2();
            this.vPrincipal.showEditar();
        } else if (e.getSource() == this.vPrincipal.pMenuE.btnVerM) {
            obtenerRegistrosPapa();
            this.vPrincipal.showVer();
        } else if (e.getSource() == this.vPrincipal.getpVer().jComboBoxV) {
            try {
                asigancionVerAll();
            } catch (Exception e2) {
            }
            // Insertar una papa
        } else if (e.getSource() == vPrincipal.getpInsertar().btnInsertarI) {
            insertarPapa();
        }
        // Panel Consultar
        else if (e.getSource() == this.vPrincipal.pConsultar.btnSNombre) {
            this.vPrincipal.pConsultar.showNombre();
        } else if (e.getSource() == this.vPrincipal.pConsultar.btnSEspecie) {
            this.vPrincipal.pConsultar.pEspecie.jComboBoxEspecie.removeAllItems();
            this.vPrincipal.pConsultar.showEspecie();
        } else if (e.getSource() == this.vPrincipal.pConsultar.btnSZona) {
            this.vPrincipal.pConsultar.showZonas();
        } else if (e.getSource() == this.vPrincipal.pConsultar.btnSForma) {
            this.vPrincipal.pConsultar.pForma.jComboBoxPapasCF.removeAllItems();
            this.vPrincipal.pConsultar.showForma();
        } else if (e.getSource() == this.vPrincipal.pConsultar.btnSFloracion) {
            this.vPrincipal.pConsultar.showFloracion();
        }
        //Editar una papa
        // Panel editar una papa
        else if (e.getSource() == this.vPrincipal.pEditar.jComboBoxpEditar) {
            try {
                asignacionEditar();
            } catch (Exception e2) {   
            }
        } else if (e.getSource() == vPrincipal.getpEditar().btnModificarE) {     
            editarPapa();
        }
        else if (e.getSource() == vPrincipal.getpEditar().btnEliminarE) {
            
            papaDao.eliminarPapa(papasCargadas.get(vPrincipal.getpEditar().jComboBoxpEditar.getSelectedIndex()).getNombre());
            
            
            vPrincipal.getpEditar().eliminada();
            cargar();
            obtenerRegistrosPapa2();
            try {
                asignacionEditar();
            } catch (Exception e2) {
                   
            }
        }
        // Consultas
        // Segun nombre
        else if (e.getSource() == this.vPrincipal.pConsultar.pNombre.btnConsultarCN) {
            String nombreC = this.vPrincipal.pConsultar.pNombre.cajaNombreCN.getText();
            consultarPorNombre(nombreC);
        }
        // Segun especie
        else if (e.getSource() == this.vPrincipal.pConsultar.pEspecie.btnConsultarEspecie) {
            String espacieC = this.vPrincipal.pConsultar.pEspecie.cajaEspecieCE.getText();
            consultarPorEspecie(espacieC);
        } else if (e.getSource() == this.vPrincipal.pConsultar.pEspecie.jComboBoxEspecie) {
            try {
                this.consulta.zonasP.setSelected(this.consulta.zonasP.getSelection(), false);
                Papa p = papasCargadas.get(vPrincipal.pConsultar.pEspecie.jComboBoxEspecie.getSelectedIndex());
                asigancionVerConsulta(p);
            } catch (Exception e2) {
            }
        }
        // Segun zona
        else if (e.getSource() == this.vPrincipal.pConsultar.pZonas.bBoyacaCZ) {
            consultaZonaProd("boyaca");
        } else if (e.getSource() == this.vPrincipal.pConsultar.pZonas.bCundinamarcaCZ) {
            consultaZonaProd("cundinamarca");
        } else if (e.getSource() == this.vPrincipal.pConsultar.pZonas.bNariñoCZ) {
            consultaZonaProd("NariÃ±o");
        }
        // Segun tuberculo
        else if (e.getSource() == this.vPrincipal.pConsultar.pForma.btnConsultarF) {
            String f = this.vPrincipal.pConsultar.pForma.cajaFormaCF.getText();
            consultarPorForma(f);
        } else if (e.getSource() == this.vPrincipal.pConsultar.pForma.jComboBoxPapasCF) {
            try {
                this.consulta.zonasP.setSelected(this.consulta.zonasP.getSelection(), false);
                Papa p = papasCargadas.get(this.vPrincipal.pConsultar.pForma.jComboBoxPapasCF.getSelectedIndex());
                asigancionVerConsulta(p);
            } catch (Exception e2) {
            }
        }
        // Segun floracion
        else if (e.getSource() == this.vPrincipal.pConsultar.pFloracion.btnConsultarFL) {
            String f = this.vPrincipal.pConsultar.pFloracion.cajaColorCFL.getText();
            consultaColor(f);
        }
        // Carga de archivos de propiedades
        else if (e.getSource() == this.vProperties.btnSiguienteP) {

            try {
                papasCargadas.get(x).setTuberculos(this.vProperties.cajaTuberculosP.getText());
                papasCargadas.get(x).setBayas(this.vProperties.cajaBayasP.getText());
                papasCargadas.get(x).setFloracion(this.vProperties.cajaFloracionP.getText());
                papasCargadas.get(x).setHabitoC(this.vProperties.cajaHabitoP.getText());
                papaDao.modificarPapa(papasCargadas.get(x));
                this.vProperties.limpiar();
                x++;
                papasProp(papasCargadas.get(x));
            } catch (NullPointerException e2) {
                vProperties.camposVacios();
            } catch (IndexOutOfBoundsException e3) {
                vProperties.dispose();
                vPrincipal.setVisible(true);
            }
        }

        //Boton salir
        else if (e.getSource() == this.vPrincipal.getpMenu().btnSalirGeneral){
            cargar();
            al.setPapas(papasCargadas);
            try {
                al.guardar();
            } catch (Exception e2) {
                vArchivos.error();
            }
            vPrincipal.dispose();
            consulta.dispose();
        }
    }

}
