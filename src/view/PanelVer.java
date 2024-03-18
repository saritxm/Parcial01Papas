/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

/**
 *
 * @author Sara
 */
public class PanelVer extends javax.swing.JPanel {

    /**
     * Creates new form PanelConsultar
     */
    public PanelVer() {
        initComponents();
        deshabilitarAll();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioZonas = new javax.swing.ButtonGroup();
        eNombreV = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        eEspecieV = new javax.swing.JLabel();
        eHabitoV = new javax.swing.JLabel();
        eFloracionV = new javax.swing.JLabel();
        eBayasV = new javax.swing.JLabel();
        eTuberculosV = new javax.swing.JLabel();
        cajaNombreV = new javax.swing.JTextField();
        cajaEspecieV = new javax.swing.JTextField();
        cajaHabitoV = new javax.swing.JTextField();
        cajaFloracionV = new javax.swing.JTextField();
        cajaBayasV = new javax.swing.JTextField();
        cajaTuberculosV = new javax.swing.JTextField();
        eZonaV = new javax.swing.JLabel();
        bNariñoV = new javax.swing.JRadioButton();
        bBoyacaV = new javax.swing.JRadioButton();
        bCundinamarcaV = new javax.swing.JRadioButton();
        jComboBoxV = new javax.swing.JComboBox<>();
        Fondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eNombreV.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eNombreV.setForeground(new java.awt.Color(255, 204, 102));
        eNombreV.setText("Nombre");
        add(eNombreV, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ver");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        eEspecieV.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eEspecieV.setForeground(new java.awt.Color(255, 204, 102));
        eEspecieV.setText("Especie");
        add(eEspecieV, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        eHabitoV.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eHabitoV.setForeground(new java.awt.Color(255, 204, 102));
        eHabitoV.setText("Hábito de crecimiento");
        add(eHabitoV, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        eFloracionV.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eFloracionV.setForeground(new java.awt.Color(255, 204, 102));
        eFloracionV.setText("Floración");
        add(eFloracionV, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        eBayasV.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eBayasV.setForeground(new java.awt.Color(255, 204, 102));
        eBayasV.setText("Bayas");
        add(eBayasV, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        eTuberculosV.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eTuberculosV.setForeground(new java.awt.Color(255, 204, 102));
        eTuberculosV.setText("Tubérculos");
        add(eTuberculosV, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        cajaNombreV.setBackground(new java.awt.Color(244, 219, 168));
        cajaNombreV.setDisabledTextColor(new java.awt.Color(244, 219, 168));
        add(cajaNombreV, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 200, -1));

        cajaEspecieV.setBackground(new java.awt.Color(244, 219, 168));
        cajaEspecieV.setDisabledTextColor(new java.awt.Color(244, 219, 168));
        add(cajaEspecieV, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 200, -1));

        cajaHabitoV.setBackground(new java.awt.Color(244, 219, 168));
        cajaHabitoV.setDisabledTextColor(new java.awt.Color(244, 219, 168));
        add(cajaHabitoV, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 200, -1));

        cajaFloracionV.setBackground(new java.awt.Color(244, 219, 168));
        cajaFloracionV.setDisabledTextColor(new java.awt.Color(244, 219, 168));
        add(cajaFloracionV, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 200, -1));

        cajaBayasV.setBackground(new java.awt.Color(244, 219, 168));
        cajaBayasV.setDisabledTextColor(new java.awt.Color(244, 219, 168));
        add(cajaBayasV, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 200, -1));

        cajaTuberculosV.setBackground(new java.awt.Color(244, 219, 168));
        cajaTuberculosV.setDisabledTextColor(new java.awt.Color(244, 219, 168));
        add(cajaTuberculosV, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 200, -1));

        eZonaV.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eZonaV.setForeground(new java.awt.Color(255, 204, 102));
        eZonaV.setText("Zona de Producción");
        add(eZonaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

        radioZonas.add(bNariñoV);
        bNariñoV.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        bNariñoV.setForeground(new java.awt.Color(245, 219, 167));
        bNariñoV.setText("Nariño");
        add(bNariñoV, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, -1));

        radioZonas.add(bBoyacaV);
        bBoyacaV.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        bBoyacaV.setForeground(new java.awt.Color(244, 219, 168));
        bBoyacaV.setText("Boyacá");
        add(bBoyacaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, -1, -1));

        radioZonas.add(bCundinamarcaV);
        bCundinamarcaV.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        bCundinamarcaV.setForeground(new java.awt.Color(244, 219, 168));
        bCundinamarcaV.setText("Cundinamarca");
        add(bCundinamarcaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, -1));

        jComboBoxV.setBackground(new java.awt.Color(246, 201, 111));
        jComboBoxV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBoxV, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 180, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/panelVer.jpg"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 370));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    public javax.swing.JRadioButton bBoyacaV;
    public javax.swing.JRadioButton bCundinamarcaV;
    public javax.swing.JRadioButton bNariñoV;
    public javax.swing.JTextField cajaBayasV;
    public javax.swing.JTextField cajaEspecieV;
    public javax.swing.JTextField cajaFloracionV;
    public javax.swing.JTextField cajaHabitoV;
    public javax.swing.JTextField cajaNombreV;
    public javax.swing.JTextField cajaTuberculosV;
    private javax.swing.JLabel eBayasV;
    private javax.swing.JLabel eEspecieV;
    private javax.swing.JLabel eFloracionV;
    private javax.swing.JLabel eHabitoV;
    private javax.swing.JLabel eNombreV;
    private javax.swing.JLabel eTuberculosV;
    private javax.swing.JLabel eZonaV;
    public javax.swing.JComboBox<String> jComboBoxV;
    private javax.swing.JLabel jLabel1;
    public javax.swing.ButtonGroup radioZonas;
    // End of variables declaration//GEN-END:variables

    private void deshabilitarAll(){
        cajaBayasV.setEditable(false);
        cajaEspecieV.setEditable(false);
        cajaFloracionV.setEditable(false);
        cajaHabitoV.setEditable(false);
        cajaNombreV.setEditable(false);
        cajaTuberculosV.setEditable(false);

        bBoyacaV.setEnabled(false);
        bCundinamarcaV.setEnabled(false);
        bNariñoV.setEnabled(false);
    }
}
