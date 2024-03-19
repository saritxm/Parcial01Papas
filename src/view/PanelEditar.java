/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

/**
 *
 * @author Sara
 */
public class PanelEditar extends javax.swing.JPanel {

    /**
     * Creates new form PanelEditar
     */
    public PanelEditar() {
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

        eEditarE = new javax.swing.JLabel();
        eNombreE = new javax.swing.JLabel();
        eEspecieE = new javax.swing.JLabel();
        eHabitoE = new javax.swing.JLabel();
        eFloracionE = new javax.swing.JLabel();
        eBayasE = new javax.swing.JLabel();
        eTuberculosE = new javax.swing.JLabel();
        cajaNombreE = new javax.swing.JTextField();
        cajaEspecieE = new javax.swing.JTextField();
        cajaHabitoE = new javax.swing.JTextField();
        cajaFloracionE = new javax.swing.JTextField();
        cajaBayasE = new javax.swing.JTextField();
        cajaTuberculosE = new javax.swing.JTextField();
        jComboBoxpEditar = new javax.swing.JComboBox<>();
        eZonasE = new javax.swing.JLabel();
        bNariñoE = new javax.swing.JRadioButton();
        bBoyacaE = new javax.swing.JRadioButton();
        bCundinamarcaE = new javax.swing.JRadioButton();
        btnModificarE = new javax.swing.JButton();
        btnEliminarE = new javax.swing.JButton();
        btnGuardarE = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eEditarE.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        eEditarE.setForeground(new java.awt.Color(255, 255, 255));
        eEditarE.setText("Editar Información");
        add(eEditarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        eNombreE.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eNombreE.setForeground(new java.awt.Color(255, 255, 255));
        eNombreE.setText("Nombre");
        add(eNombreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        eEspecieE.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eEspecieE.setForeground(new java.awt.Color(255, 255, 255));
        eEspecieE.setText("Especie");
        add(eEspecieE, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        eHabitoE.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eHabitoE.setForeground(new java.awt.Color(255, 255, 255));
        eHabitoE.setText("Hábito de crecimiento");
        add(eHabitoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        eFloracionE.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eFloracionE.setForeground(new java.awt.Color(255, 255, 255));
        eFloracionE.setText("Floración");
        add(eFloracionE, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        eBayasE.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eBayasE.setForeground(new java.awt.Color(255, 255, 255));
        eBayasE.setText("Bayas");
        add(eBayasE, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        eTuberculosE.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eTuberculosE.setForeground(new java.awt.Color(255, 255, 255));
        eTuberculosE.setText("Tubérculos");
        add(eTuberculosE, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));
        add(cajaNombreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 180, -1));
        add(cajaEspecieE, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 180, -1));
        add(cajaHabitoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 180, -1));
        add(cajaFloracionE, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 180, -1));
        add(cajaBayasE, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 180, -1));
        add(cajaTuberculosE, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 180, -1));

        jComboBoxpEditar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBoxpEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 230, -1));

        eZonasE.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eZonasE.setForeground(new java.awt.Color(255, 255, 255));
        eZonasE.setText("Zona de Producción");
        add(eZonasE, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 170, -1));

        bNariñoE.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        bNariñoE.setText("Nariño");
        bNariñoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNariñoEActionPerformed(evt);
            }
        });
        add(bNariñoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        bBoyacaE.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        bBoyacaE.setText("Boyacá");
        add(bBoyacaE, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, -1, -1));

        bCundinamarcaE.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        bCundinamarcaE.setText("Cundinamarca");
        add(bCundinamarcaE, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, -1));

        btnModificarE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/modificar.jpg"))); // NOI18N
        add(btnModificarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 160, 50));

        btnEliminarE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Eliminar.jpg"))); // NOI18N
        add(btnEliminarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 150, 40));

        btnGuardarE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/guardar.jpg"))); // NOI18N
        add(btnGuardarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 130, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/PanelEditar.jpg"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 370));
    }// </editor-fold>//GEN-END:initComponents

    private void bNariñoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNariñoEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bNariñoEActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    public javax.swing.JRadioButton bBoyacaE;
    public javax.swing.JRadioButton bCundinamarcaE;
    public javax.swing.JRadioButton bNariñoE;
    public javax.swing.JButton btnEliminarE;
    public javax.swing.JButton btnGuardarE;
    public javax.swing.JButton btnModificarE;
    public javax.swing.JTextField cajaBayasE;
    public javax.swing.JTextField cajaEspecieE;
    public javax.swing.JTextField cajaFloracionE;
    public javax.swing.JTextField cajaHabitoE;
    public javax.swing.JTextField cajaNombreE;
    public javax.swing.JTextField cajaTuberculosE;
    private javax.swing.JLabel eBayasE;
    private javax.swing.JLabel eEditarE;
    private javax.swing.JLabel eEspecieE;
    private javax.swing.JLabel eFloracionE;
    private javax.swing.JLabel eHabitoE;
    private javax.swing.JLabel eNombreE;
    private javax.swing.JLabel eTuberculosE;
    private javax.swing.JLabel eZonasE;
    private javax.swing.JComboBox<String> jComboBoxpEditar;
    // End of variables declaration//GEN-END:variables
}
