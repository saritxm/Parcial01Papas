/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author Sara
 */
public class VentanaP extends javax.swing.JFrame {
    // Ventana que permite el ingreso de los demas campos de las papas del archivo de propiedades
    /**
     * Creates new form VentanaP
     */
    public VentanaP() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        zonasP = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        eNombreP = new javax.swing.JLabel();
        eEspecieP = new javax.swing.JLabel();
        eHabitoP = new javax.swing.JLabel();
        eFloracionP = new javax.swing.JLabel();
        eBayasP = new javax.swing.JLabel();
        eTuberculosP = new javax.swing.JLabel();
        eZonasP = new javax.swing.JLabel();
        cajaNombreP = new javax.swing.JTextField();
        cajaEspecieP = new javax.swing.JTextField();
        cajaHabitoP = new javax.swing.JTextField();
        cajaFloracionP = new javax.swing.JTextField();
        cajaBayasP = new javax.swing.JTextField();
        cajaTuberculosP = new javax.swing.JTextField();
        bNariñoP = new javax.swing.JRadioButton();
        bBoyacaP = new javax.swing.JRadioButton();
        bCundinamarcaP = new javax.swing.JRadioButton();
        btnSiguienteP = new javax.swing.JButton();
        FondoP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eNombreP.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eNombreP.setForeground(new java.awt.Color(204, 255, 255));
        eNombreP.setText("Nombre");
        jPanel1.add(eNombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        eEspecieP.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eEspecieP.setForeground(new java.awt.Color(204, 255, 255));
        eEspecieP.setText("Especie");
        jPanel1.add(eEspecieP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        eHabitoP.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eHabitoP.setForeground(new java.awt.Color(204, 255, 255));
        eHabitoP.setText("Hábito de crecimiento");
        jPanel1.add(eHabitoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        eFloracionP.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eFloracionP.setForeground(new java.awt.Color(204, 255, 255));
        eFloracionP.setText("Floración");
        jPanel1.add(eFloracionP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        eBayasP.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eBayasP.setForeground(new java.awt.Color(204, 255, 255));
        eBayasP.setText("Bayas");
        jPanel1.add(eBayasP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        eTuberculosP.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eTuberculosP.setForeground(new java.awt.Color(204, 255, 255));
        eTuberculosP.setText("Tubérculos");
        jPanel1.add(eTuberculosP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        eZonasP.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        eZonasP.setForeground(new java.awt.Color(204, 255, 255));
        eZonasP.setText("Zona de Producción");
        jPanel1.add(eZonasP, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, -1, -1));

        cajaNombreP.setEditable(false);
        cajaNombreP.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.add(cajaNombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 200, -1));

        cajaEspecieP.setEditable(false);
        cajaEspecieP.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.add(cajaEspecieP, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 200, -1));

        cajaHabitoP.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.add(cajaHabitoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 200, -1));

        cajaFloracionP.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.add(cajaFloracionP, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 200, -1));

        cajaBayasP.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.add(cajaBayasP, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 200, -1));

        cajaTuberculosP.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.add(cajaTuberculosP, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 200, -1));

        zonasP.add(bNariñoP);
        bNariñoP.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        bNariñoP.setForeground(new java.awt.Color(204, 255, 255));
        bNariñoP.setText("Nariño");
        bNariñoP.setEnabled(false);
        jPanel1.add(bNariñoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, -1, -1));

        zonasP.add(bBoyacaP);
        bBoyacaP.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        bBoyacaP.setForeground(new java.awt.Color(204, 255, 255));
        bBoyacaP.setText("Boyacá");
        bBoyacaP.setEnabled(false);
        jPanel1.add(bBoyacaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, -1, -1));

        zonasP.add(bCundinamarcaP);
        bCundinamarcaP.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        bCundinamarcaP.setForeground(new java.awt.Color(204, 255, 255));
        bCundinamarcaP.setText("Cundinamarca");
        bCundinamarcaP.setEnabled(false);
        jPanel1.add(bCundinamarcaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, -1, -1));

        btnSiguienteP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/btnSiguiente.jpg"))); // NOI18N
        jPanel1.add(btnSiguienteP, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 130, 40));

        FondoP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/VentanaProperties.jpg"))); // NOI18N
        jPanel1.add(FondoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoP;
    public javax.swing.JRadioButton bBoyacaP;
    public javax.swing.JRadioButton bCundinamarcaP;
    public javax.swing.JRadioButton bNariñoP;
    public javax.swing.JButton btnSiguienteP;
    public javax.swing.JTextField cajaBayasP;
    public javax.swing.JTextField cajaEspecieP;
    public javax.swing.JTextField cajaFloracionP;
    public javax.swing.JTextField cajaHabitoP;
    public javax.swing.JTextField cajaNombreP;
    public javax.swing.JTextField cajaTuberculosP;
    private javax.swing.JLabel eBayasP;
    private javax.swing.JLabel eEspecieP;
    private javax.swing.JLabel eFloracionP;
    private javax.swing.JLabel eHabitoP;
    private javax.swing.JLabel eNombreP;
    private javax.swing.JLabel eTuberculosP;
    private javax.swing.JLabel eZonasP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.ButtonGroup zonasP;
    // End of variables declaration//GEN-END:variables
    // Muestra un mensaje de error cuando hay campos vacíos.
    public void camposVacios(){
        JOptionPane.showMessageDialog(null, "Llene todos lo campos por favor", "CAMPOS VACIOS", JOptionPane.ERROR_MESSAGE);
    }
    //Limpia los campos de entrada de datos.
    public void limpiar(){
        cajaBayasP.setText("");
        cajaEspecieP.setText("");
        cajaFloracionP.setText("");
        cajaHabitoP.setText("");
        cajaNombreP.setText("");
        cajaTuberculosP.setText("");
        zonasP.setSelected(zonasP.getSelection(), false); // Desmarca cualquier selección de zonas
        
    }
}
