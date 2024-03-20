/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

/**
 *
 * @author Sara
 */
public class PanelZonas extends javax.swing.JPanel {
    // Panel que permite realizar una consulta a nivel de las zonas de producción.
    /**
     * Creates new form PanelZonas
     */
    public PanelZonas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ZonasCZ = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        bNariñoCZ = new javax.swing.JRadioButton();
        bBoyacaCZ = new javax.swing.JRadioButton();
        bCundinamarcaCZ = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        cajaNumeroPapasCFL = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Elija la zona a consultar:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        ZonasCZ.add(bNariñoCZ);
        bNariñoCZ.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        bNariñoCZ.setText("Nariño");
        add(bNariñoCZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        ZonasCZ.add(bBoyacaCZ);
        bBoyacaCZ.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        bBoyacaCZ.setText("Boyacá");
        add(bBoyacaCZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        ZonasCZ.add(bCundinamarcaCZ);
        bCundinamarcaCZ.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        bCundinamarcaCZ.setText("Cundinamarca");
        add(bCundinamarcaCZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel2.setText("Número de papas");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        cajaNumeroPapasCFL.setEnabled(false);
        add(cajaNumeroPapasCFL, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 240, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/panelZonas.jpg"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 300));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.ButtonGroup ZonasCZ;
    public javax.swing.JRadioButton bBoyacaCZ;
    public javax.swing.JRadioButton bCundinamarcaCZ;
    public javax.swing.JRadioButton bNariñoCZ;
    public javax.swing.JTextField cajaNumeroPapasCFL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
