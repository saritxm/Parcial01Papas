/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author Sara
 */
public class PanelNombre extends javax.swing.JPanel {
    // Panel que permite realizar una consulta a nivel del nombre de la papa
    /**
     * Creates new form PanelNombre
     */
    public PanelNombre() {
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

        bZonasCN = new javax.swing.ButtonGroup();
        eNombreCN = new javax.swing.JLabel();
        eEspecieCN = new javax.swing.JLabel();
        eHabitoCN = new javax.swing.JLabel();
        eFloracionCN = new javax.swing.JLabel();
        eBayasCN = new javax.swing.JLabel();
        eTuberculosCN = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cajaNombreCN = new javax.swing.JTextField();
        cajaEspecieCN = new javax.swing.JTextField();
        cajaHabitoCN = new javax.swing.JTextField();
        cajaFloracionCN = new javax.swing.JTextField();
        cajaBayasCN = new javax.swing.JTextField();
        cajaTuberculosCN = new javax.swing.JTextField();
        bBoyacaCN = new javax.swing.JRadioButton();
        bCundinamarcaCN = new javax.swing.JRadioButton();
        bNariñoCN = new javax.swing.JRadioButton();
        btnConsultarCN = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eNombreCN.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        eNombreCN.setForeground(new java.awt.Color(255, 255, 255));
        eNombreCN.setText("Nombre");
        add(eNombreCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 70, -1));

        eEspecieCN.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        eEspecieCN.setForeground(new java.awt.Color(255, 255, 255));
        eEspecieCN.setText("Especie");
        add(eEspecieCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        eHabitoCN.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        eHabitoCN.setForeground(new java.awt.Color(255, 255, 255));
        eHabitoCN.setText("Hábito de crecimiento");
        add(eHabitoCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        eFloracionCN.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        eFloracionCN.setForeground(new java.awt.Color(255, 255, 255));
        eFloracionCN.setText("Floración ");
        add(eFloracionCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        eBayasCN.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        eBayasCN.setForeground(new java.awt.Color(255, 255, 255));
        eBayasCN.setText("Bayas");
        add(eBayasCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        eTuberculosCN.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        eTuberculosCN.setForeground(new java.awt.Color(255, 255, 255));
        eTuberculosCN.setText("Tubérculos");
        add(eTuberculosCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Zona de Producción");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));
        add(cajaNombreCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 200, -1));

        cajaEspecieCN.setEditable(false);
        add(cajaEspecieCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 200, -1));

        cajaHabitoCN.setEditable(false);
        add(cajaHabitoCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 200, -1));

        cajaFloracionCN.setEditable(false);
        add(cajaFloracionCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 200, -1));

        cajaBayasCN.setEditable(false);
        add(cajaBayasCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 200, -1));

        cajaTuberculosCN.setEditable(false);
        add(cajaTuberculosCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 200, -1));

        bZonasCN.add(bBoyacaCN);
        bBoyacaCN.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        bBoyacaCN.setText("Boyacá");
        bBoyacaCN.setEnabled(false);
        bBoyacaCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBoyacaCNActionPerformed(evt);
            }
        });
        add(bBoyacaCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        bZonasCN.add(bCundinamarcaCN);
        bCundinamarcaCN.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        bCundinamarcaCN.setText("Cundinamarca");
        bCundinamarcaCN.setEnabled(false);
        bCundinamarcaCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCundinamarcaCNActionPerformed(evt);
            }
        });
        add(bCundinamarcaCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, -1, -1));

        bZonasCN.add(bNariñoCN);
        bNariñoCN.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        bNariñoCN.setText("Nariño");
        bNariñoCN.setEnabled(false);
        add(bNariñoCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        btnConsultarCN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/btnconsultarCN.jpg"))); // NOI18N
        add(btnConsultarCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 130, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/panelNombre.jpg"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 300));
    }// </editor-fold>//GEN-END:initComponents

    private void bCundinamarcaCNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bCundinamarcaCNActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_bCundinamarcaCNActionPerformed

    private void bBoyacaCNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bBoyacaCNActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_bBoyacaCNActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    public javax.swing.JRadioButton bBoyacaCN;
    public javax.swing.JRadioButton bCundinamarcaCN;
    public javax.swing.JRadioButton bNariñoCN;
    private javax.swing.ButtonGroup bZonasCN;
    public javax.swing.JButton btnConsultarCN;
    public javax.swing.JTextField cajaBayasCN;
    public javax.swing.JTextField cajaEspecieCN;
    public javax.swing.JTextField cajaFloracionCN;
    public javax.swing.JTextField cajaHabitoCN;
    public javax.swing.JTextField cajaNombreCN;
    public javax.swing.JTextField cajaTuberculosCN;
    private javax.swing.JLabel eBayasCN;
    private javax.swing.JLabel eEspecieCN;
    private javax.swing.JLabel eFloracionCN;
    private javax.swing.JLabel eHabitoCN;
    private javax.swing.JLabel eNombreCN;
    private javax.swing.JLabel eTuberculosCN;
    private javax.swing.JLabel jLabel7;

    // End of variables declaration//GEN-END:variables
    // Metodo que muestra un mensaje
    public void noHay() {
        JOptionPane.showMessageDialog(null, "No hay papas con este nombre", "NO HAY", JOptionPane.INFORMATION_MESSAGE);
    }
}
