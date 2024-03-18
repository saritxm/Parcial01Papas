/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;


/**
 *
 * @author Sara
 */
public class PanelMenu extends javax.swing.JPanel {



    public PanelMenu() {
        initComponents();
        btnConsultarM.setActionCommand("CONSULTAR");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInsertarM = new javax.swing.JButton();
        btnVerM = new javax.swing.JButton();
        btnConsultarM = new javax.swing.JButton();
        btnSalirGeneral = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0,0,0,0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInsertarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/btninsertar.jpg"))); // NOI18N
        add(btnInsertarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 40));

        btnVerM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/verbtn.jpg"))); // NOI18N
        add(btnVerM, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, 40));

        btnConsultarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/btnconsultar.jpg"))); // NOI18N
        add(btnConsultarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 170, 40));

        btnSalirGeneral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/salirbtn.jpg"))); // NOI18N
        add(btnSalirGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 100, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pmenu.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 370));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnConsultarM;
    public javax.swing.JButton btnInsertarM;
    public javax.swing.JButton btnSalirGeneral;
    public javax.swing.JButton btnVerM;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    public javax.swing.JButton getBtnConsultarM() {
        return btnConsultarM;
    }

    public javax.swing.JButton getBtnInsertarM() {
        return btnInsertarM;
    }

    public javax.swing.JButton getBtnSalirGeneral() {
        return btnSalirGeneral;
    }

    public javax.swing.JButton getBtnVerM() {
        return btnVerM;
    }

    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }
}
