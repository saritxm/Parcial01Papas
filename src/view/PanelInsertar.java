/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

/**
 *
 * @author Sara
 */
public class PanelInsertar extends javax.swing.JPanel {

    /**
     * Creates new form PanelInsertar
     */
    public PanelInsertar() {
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        zonas = new javax.swing.ButtonGroup();
        btnInsertarI = new javax.swing.JButton();
        eZonaI = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        eNombreI = new javax.swing.JLabel();
        eEspecieI = new javax.swing.JLabel();
        eHabitoI = new javax.swing.JLabel();
        eFloracionI = new javax.swing.JLabel();
        eBayasI = new javax.swing.JLabel();
        eTuberculosI = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        cajaEspecie = new javax.swing.JTextField();
        cajaHabito = new javax.swing.JTextField();
        cajaFloracion = new javax.swing.JTextField();
        cajaBayas = new javax.swing.JTextField();
        cajaTuberculos = new javax.swing.JTextField();
        bNariñoI = new javax.swing.JRadioButton();
        bBoyacaI = new javax.swing.JRadioButton();
        bCundinamarcaI = new javax.swing.JRadioButton();
        btnSalirI = new javax.swing.JButton();
        btnLimpiarI = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInsertarI.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertarI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/insertarbtn.jpg"))); // NOI18N
        btnInsertarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarIActionPerformed(evt);
            }
        });
        add(btnInsertarI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 130, 40));

        eZonaI.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eZonaI.setForeground(new java.awt.Color(153, 255, 153));
        eZonaI.setText("Zona de Producción");
        add(eZonaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Insertar datos");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        eNombreI.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eNombreI.setForeground(new java.awt.Color(153, 255, 153));
        eNombreI.setText("Nombre");
        add(eNombreI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        eEspecieI.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eEspecieI.setForeground(new java.awt.Color(153, 255, 153));
        eEspecieI.setText("Especie");
        add(eEspecieI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        eHabitoI.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eHabitoI.setForeground(new java.awt.Color(153, 255, 153));
        eHabitoI.setText("Hábito de crecimiento");
        add(eHabitoI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        eFloracionI.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eFloracionI.setForeground(new java.awt.Color(153, 255, 153));
        eFloracionI.setText("Floración");
        add(eFloracionI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        eBayasI.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eBayasI.setForeground(new java.awt.Color(153, 255, 153));
        eBayasI.setText("Bayas");
        add(eBayasI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        eTuberculosI.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eTuberculosI.setForeground(new java.awt.Color(153, 255, 153));
        eTuberculosI.setText("Tubérculos");
        add(eTuberculosI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        cajaNombre.setBackground(new java.awt.Color(204, 255, 204));
        cajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreActionPerformed(evt);
            }
        });
        add(cajaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 200, -1));

        cajaEspecie.setBackground(new java.awt.Color(204, 255, 204));
        add(cajaEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 200, -1));

        cajaHabito.setBackground(new java.awt.Color(204, 255, 204));
        add(cajaHabito, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 200, -1));

        cajaFloracion.setBackground(new java.awt.Color(204, 255, 204));
        add(cajaFloracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 200, -1));

        cajaBayas.setBackground(new java.awt.Color(204, 255, 204));
        add(cajaBayas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 200, -1));

        cajaTuberculos.setBackground(new java.awt.Color(204, 255, 204));
        add(cajaTuberculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 200, -1));

        zonas.add(bNariñoI);
        bNariñoI.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        bNariñoI.setForeground(new java.awt.Color(204, 255, 204));
        bNariñoI.setText("Nariño");
        add(bNariñoI, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        zonas.add(bBoyacaI);
        bBoyacaI.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        bBoyacaI.setForeground(new java.awt.Color(204, 255, 204));
        bBoyacaI.setText("Boyacá ");
        add(bBoyacaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, -1));

        zonas.add(bCundinamarcaI);
        bCundinamarcaI.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        bCundinamarcaI.setForeground(new java.awt.Color(204, 255, 204));
        bCundinamarcaI.setText("Cundinamarca");
        add(bCundinamarcaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        btnSalirI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/salir.jpg"))); // NOI18N
        add(btnSalirI, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 90, 40));

        btnLimpiarI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/limpiarbtn.jpg"))); // NOI18N
        add(btnLimpiarI, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 110, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/insertar.jpg"))); // NOI18N
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 690, 390));
    }// </editor-fold>//GEN-END:initComponents

    private void cajaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombreActionPerformed

    private void btnInsertarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsertarIActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    public javax.swing.JRadioButton bBoyacaI;
    public javax.swing.JRadioButton bCundinamarcaI;
    public javax.swing.JRadioButton bNariñoI;
    public javax.swing.JButton btnInsertarI;
    public javax.swing.JButton btnLimpiarI;
    public javax.swing.JButton btnSalirI;
    private javax.swing.JTextField cajaBayas;
    private javax.swing.JTextField cajaEspecie;
    private javax.swing.JTextField cajaFloracion;
    private javax.swing.JTextField cajaHabito;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaTuberculos;
    private javax.swing.JLabel eBayasI;
    private javax.swing.JLabel eEspecieI;
    private javax.swing.JLabel eFloracionI;
    private javax.swing.JLabel eHabitoI;
    private javax.swing.JLabel eNombreI;
    private javax.swing.JLabel eTuberculosI;
    private javax.swing.JLabel eZonaI;
    private javax.swing.JLabel jLabel2;
    private javax.swing.ButtonGroup zonas;
    // End of variables declaration//GEN-END:variables
}
