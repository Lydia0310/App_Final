/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.userinterface.hospitalworkarea;

import javax.swing.JPanel;
import org.yueli.business.order.OrderItem;

/**
 *
 * @author Lydia
 */
public class EditDeviceOrder extends javax.swing.JPanel {

    /**
     * Creates new form EditDeviceOrder
     */
    private JPanel userProcessContainer;
    private OrderItem orderItem;
    public EditDeviceOrder(JPanel userProcessContainer, OrderItem orderItem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.orderItem = orderItem;
        deviceNameJTextField1.setText(orderItem.getInventoryItem().getDevice().getDeviceName());
        int quantity = orderItem.getOrderQuantity();
        int price = orderItem.getInventoryItem().getDevice().getDevicePrice();
        quantityJSpinner.setValue(quantity);
        unitPriceJTextField.setText(String.valueOf(price));
        int totalPrice = price * quantity;
        totalPriceJTextField.setText(String.valueOf(totalPrice));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        unitPriceJTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        totalPriceJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        deviceNameJTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        doneJButton = new javax.swing.JButton();
        quantityJSpinner = new javax.swing.JSpinner();

        jLabel9.setText("Unit Price:");

        unitPriceJTextField.setEditable(false);
        unitPriceJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitPriceJTextFieldActionPerformed(evt);
            }
        });

        jLabel10.setText("Total Price:");

        totalPriceJTextField.setEditable(false);

        jLabel7.setText("Device Name: ");

        deviceNameJTextField1.setEditable(false);

        jLabel8.setText("Quantity:");

        doneJButton.setText("Done");
        doneJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(195, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deviceNameJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unitPriceJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalPriceJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(166, 166, 166))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(doneJButton)
                        .addGap(94, 94, 94))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(deviceNameJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(quantityJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(unitPriceJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(totalPriceJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(doneJButton)
                .addGap(64, 64, 64))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void unitPriceJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitPriceJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitPriceJTextFieldActionPerformed

    private void doneJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneJButtonActionPerformed
        // TODO add your handling code here:
        int availability = orderItem.getInventoryItem().getQuantity();
        int quantity = orderItem.getOrderQuantity();
        int now_availability = quantity + availability - (Integer)quantityJSpinner.getValue();
        orderItem.getInventoryItem().setInventoryQuantity(now_availability);
        orderItem.setOrderQuantity((Integer)quantityJSpinner.getValue());
    }//GEN-LAST:event_doneJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField deviceNameJTextField1;
    private javax.swing.JButton doneJButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner quantityJSpinner;
    private javax.swing.JTextField totalPriceJTextField;
    private javax.swing.JTextField unitPriceJTextField;
    // End of variables declaration//GEN-END:variables
}
