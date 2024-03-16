/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JLabel;

/**
 *
 * @author Sara
 */
public class PanelMenu extends javax.swing.JPanel {

    private JLabel etitulo;

    public PanelMenu() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBackground(new Color(137,207,243));
		setPreferredSize(new java.awt.Dimension(218,540));
		setOpaque(true);
        initComponents();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        etitulo = new JLabel("Menu");
		etitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
		etitulo.setFont(new Font("Open Sans", Font.BOLD, 45));
		etitulo.setForeground(Color.WHITE);
		add(etitulo);

        
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
