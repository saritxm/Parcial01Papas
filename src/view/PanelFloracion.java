/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

/**
 *
 * @author Sara
 */
public class PanelFloracion extends javax.swing.JPanel {

    /**
     * Creates new form PanelFloración
     */
    public PanelFloracion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eLabelCFl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cajaColorCFL = new javax.swing.JTextField();
        cajaNumeroPapasCFL = new javax.swing.JTextField();
        btnConsultarFL = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eLabelCFl.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eLabelCFl.setText("Color Floración");
        add(eLabelCFl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel1.setText("Número de papas");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));
        add(cajaColorCFL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 210, -1));

        cajaNumeroPapasCFL.setEnabled(false);
        add(cajaNumeroPapasCFL, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 240, -1));

        btnConsultarFL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/consultarPFL.jpg"))); // NOI18N
        add(btnConsultarFL, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 170, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/panelFloracion.jpg"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 300));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    public javax.swing.JButton btnConsultarFL;
    public javax.swing.JTextField cajaColorCFL;
    public javax.swing.JTextField cajaNumeroPapasCFL;
    private javax.swing.JLabel eLabelCFl;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
