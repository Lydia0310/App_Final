/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.userinterface.hospitalworkarea;

import javax.swing.JPanel;
import org.yueli.business.device.Device;
import org.yueli.business.inventory.InventoryItem;

/**
 *
 * @author Lydia
 */
public class ViewDeviceDetail extends javax.swing.JPanel {

    /**
     * Creates new form ViewDeviceDetail
     */
    private JPanel userProcessContainer;
    private InventoryItem inventoryItem;
    public ViewDeviceDetail(JPanel userProcessContainer, InventoryItem inventoryItem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.inventoryItem = inventoryItem;
        deviceNameJTextField1.setText(inventoryItem.getDevice().getDeviceName());
        deviceFunctionJTextField1.setText(inventoryItem.getDevice().getFunction());
        unitPriceJTextField1.setText(String.valueOf(inventoryItem.getDevice().getDevicePrice()));
        descriptionJTextField.setText(inventoryItem.getDevice().getDescription());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        deviceNameJTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        deviceFunctionJTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        stockCountJTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        unitPriceJTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        descriptionJTextField = new javax.swing.JTextField();

        jLabel7.setText("Device Name: ");

        deviceNameJTextField1.setEditable(false);

        jLabel8.setText("Device Function:");

        deviceFunctionJTextField1.setEditable(false);

        jLabel9.setText("Device Stock Count:");

        stockCountJTextField1.setEditable(false);
        stockCountJTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockCountJTextField1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Unit Price:");

        unitPriceJTextField1.setEditable(false);

        jLabel11.setText("Description:");

        descriptionJTextField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deviceNameJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deviceFunctionJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockCountJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitPriceJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descriptionJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(deviceNameJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(deviceFunctionJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(stockCountJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(unitPriceJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(descriptionJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void stockCountJTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockCountJTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockCountJTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField descriptionJTextField;
    private javax.swing.JTextField deviceFunctionJTextField1;
    private javax.swing.JTextField deviceNameJTextField1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField stockCountJTextField1;
    private javax.swing.JTextField unitPriceJTextField1;
    // End of variables declaration//GEN-END:variables
}
