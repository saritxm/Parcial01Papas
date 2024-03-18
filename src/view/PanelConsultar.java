/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

/**
 *
 * @author Sara
 */
public class PanelConsultar extends javax.swing.JPanel {

    /**
     * Creates new form PanelConsultarE
     */
    public PanelConsultar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ZonasC = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        eNombreC = new javax.swing.JLabel();
        eEspecieC = new javax.swing.JLabel();
        eZonaC = new javax.swing.JLabel();
        eHabitoC = new javax.swing.JLabel();
        eFloracionC = new javax.swing.JLabel();
        eBayasC = new javax.swing.JLabel();
        eTuberculosC = new javax.swing.JLabel();
        cajaNombreC = new javax.swing.JTextField();
        cajaEspecieC = new javax.swing.JTextField();
        cajaHabitoC = new javax.swing.JTextField();
        cajaFloracionC = new javax.swing.JTextField();
        cajaBayasC = new javax.swing.JTextField();
        cajaTuberculosC = new javax.swing.JTextField();
        btnLimpiarC = new javax.swing.JButton();
        btnModificarC = new javax.swing.JButton();
        btnEliminarC = new javax.swing.JButton();
        btnGuardarC = new javax.swing.JButton();
        bNariñoC = new javax.swing.JRadioButton();
        bCundinamarcaC = new javax.swing.JRadioButton();
        bBoyacaC = new javax.swing.JRadioButton();
        Fondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("Consultar papa");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        eNombreC.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eNombreC.setForeground(new java.awt.Color(255, 204, 255));
        eNombreC.setText("Nombre");
        add(eNombreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        eEspecieC.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eEspecieC.setForeground(new java.awt.Color(255, 204, 255));
        eEspecieC.setText("Especie");
        add(eEspecieC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        eZonaC.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eZonaC.setForeground(new java.awt.Color(255, 204, 255));
        eZonaC.setText("Zona de Producción");
        add(eZonaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        eHabitoC.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eHabitoC.setForeground(new java.awt.Color(255, 204, 255));
        eHabitoC.setText("Hábito de crecimiento");
        add(eHabitoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        eFloracionC.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eFloracionC.setForeground(new java.awt.Color(255, 204, 255));
        eFloracionC.setText("Floración");
        add(eFloracionC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        eBayasC.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eBayasC.setForeground(new java.awt.Color(255, 204, 255));
        eBayasC.setText("Bayas");
        add(eBayasC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        eTuberculosC.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eTuberculosC.setForeground(new java.awt.Color(255, 204, 255));
        eTuberculosC.setText("Tubérculos");
        add(eTuberculosC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        cajaNombreC.setBackground(new java.awt.Color(255, 204, 255));
        cajaNombreC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreCActionPerformed(evt);
            }
        });
        add(cajaNombreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 200, -1));

        cajaEspecieC.setBackground(new java.awt.Color(255, 204, 255));
        cajaEspecieC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaEspecieCActionPerformed(evt);
            }
        });
        add(cajaEspecieC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 200, -1));

        cajaHabitoC.setBackground(new java.awt.Color(255, 204, 255));
        add(cajaHabitoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 200, -1));

        cajaFloracionC.setBackground(new java.awt.Color(255, 204, 255));
        add(cajaFloracionC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 200, -1));

        cajaBayasC.setBackground(new java.awt.Color(255, 204, 255));
        add(cajaBayasC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 200, -1));

        cajaTuberculosC.setBackground(new java.awt.Color(255, 204, 255));
        add(cajaTuberculosC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 200, -1));

        btnLimpiarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/limpiarbtnPanelC.jpg"))); // NOI18N
        add(btnLimpiarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 120, 40));

        btnModificarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/modificarbtn.jpg"))); // NOI18N
        add(btnModificarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 140, 40));

        btnEliminarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/eliminarbtn.jpg"))); // NOI18N
        add(btnEliminarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 130, 40));

        btnGuardarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/guardarbtn.jpg"))); // NOI18N
        add(btnGuardarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 130, 40));

        ZonasC.add(bNariñoC);
        bNariñoC.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        bNariñoC.setText("Nariño");
        bNariñoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNariñoCActionPerformed(evt);
            }
        });
        add(bNariñoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        ZonasC.add(bCundinamarcaC);
        bCundinamarcaC.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        bCundinamarcaC.setText("Cundinamarca ");
        add(bCundinamarcaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, -1, -1));

        ZonasC.add(bBoyacaC);
        bBoyacaC.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        bBoyacaC.setText("Boyacá");
        add(bBoyacaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/PanelC.jpg"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void cajaNombreCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombreCActionPerformed

    private void bNariñoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNariñoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bNariñoCActionPerformed

    private void cajaEspecieCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaEspecieCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaEspecieCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.ButtonGroup ZonasC;
    public javax.swing.JRadioButton bBoyacaC;
    public javax.swing.JRadioButton bCundinamarcaC;
    public javax.swing.JRadioButton bNariñoC;
    public javax.swing.JButton btnEliminarC;
    public javax.swing.JButton btnGuardarC;
    public javax.swing.JButton btnLimpiarC;
    private javax.swing.JButton btnModificarC;
    public javax.swing.JTextField cajaBayasC;
    public javax.swing.JTextField cajaEspecieC;
    public javax.swing.JTextField cajaFloracionC;
    public javax.swing.JTextField cajaHabitoC;
    public javax.swing.JTextField cajaNombreC;
    public javax.swing.JTextField cajaTuberculosC;
    private javax.swing.JLabel eBayasC;
    private javax.swing.JLabel eEspecieC;
    private javax.swing.JLabel eFloracionC;
    private javax.swing.JLabel eHabitoC;
    private javax.swing.JLabel eNombreC;
    private javax.swing.JLabel eTuberculosC;
    private javax.swing.JLabel eZonaC;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
