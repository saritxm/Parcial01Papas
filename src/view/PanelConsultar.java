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
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cajaNombrePc = new javax.swing.JTextField();
        cajaEspeciePc = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        Fondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setBackground(new java.awt.Color(204, 255, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 170, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("Consultar papa");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 255));
        jLabel3.setText("Nombre");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 255));
        jLabel4.setText("Especie");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 255));
        jLabel5.setText("Zona de Producción");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 255));
        jLabel1.setText("Hábito de crecimiento");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 255));
        jLabel6.setText("Floración");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 255));
        jLabel7.setText("Bayas");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 255));
        jLabel8.setText("Tubérculos");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        cajaNombrePc.setBackground(new java.awt.Color(255, 204, 255));
        cajaNombrePc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombrePcActionPerformed(evt);
            }
        });
        add(cajaNombrePc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 200, -1));

        cajaEspeciePc.setBackground(new java.awt.Color(255, 204, 255));
        add(cajaEspeciePc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 200, -1));

        jTextField4.setBackground(new java.awt.Color(255, 204, 255));
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 200, -1));

        jTextField5.setBackground(new java.awt.Color(255, 204, 255));
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 200, -1));

        jTextField6.setBackground(new java.awt.Color(255, 204, 255));
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 200, -1));

        jTextField7.setBackground(new java.awt.Color(255, 204, 255));
        add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 200, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/limpiarbtnPanelC.jpg"))); // NOI18N
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 120, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/modificarbtn.jpg"))); // NOI18N
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 140, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/eliminarbtn.jpg"))); // NOI18N
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 130, 40));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/guardarbtn.jpg"))); // NOI18N
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 130, 40));

        ZonasC.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jRadioButton1.setText("Nariño");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        ZonasC.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jRadioButton2.setText("Cundinamarca ");
        add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, -1, -1));

        ZonasC.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jRadioButton3.setText("Boyacá");
        add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/PanelC.jpg"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void cajaNombrePcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombrePcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombrePcActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.ButtonGroup ZonasC;
    private javax.swing.JTextField cajaEspeciePc;
    private javax.swing.JTextField cajaNombrePc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
