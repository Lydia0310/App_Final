/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.userinterface.supplierworkarea;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.yueli.business.device.Device;
import org.yueli.business.inventory.InventoryItem;
import org.yueli.business.role.SupplierAdmin;
import org.yueli.business.useraccount.UserAccount;

/**
 *
 * @author Lydia
 */
public class ManageDevicePanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDevicePanel
     */
     private JPanel userProcessContainer;
    private UserAccount userAccount;
    public ManageDevicePanel(JPanel userProcessContainer, UserAccount userAccount) {
        initComponents();
         initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        supplierNameJLabel.setText(((SupplierAdmin)userAccount.getRole()).getSupplierID());
        populateDeviceTable();
    }

     private void populateDeviceTable(){
        int rowCount = deviceTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)deviceTable.getModel();
        for(int i=rowCount-1; i>=0; i--){
            model.removeRow(i);
        }
        
        for(Device device : ((SupplierAdmin)userAccount.getRole()).getDeviceCatalog().getDeviceList()){
            Object row[] = new Object[3];
            row[0] = device;
            row[1] = device.getDeviceID();
            row[2] = device.getDevicePrice();
           
            model.addRow(row);
                    
        }
    }
     public void populateInventoryItemTable(){
         DefaultTableModel model = (DefaultTableModel)inventoryItemTable.getModel();
         model.setRowCount(0);
         
         for(InventoryItem inventoryItem : ((SupplierAdmin)userAccount.getRole()).getInventory().getInventoryItemList()){
             Object row[] = new Object[5];
             row[0] = inventoryItem.getDevice().getDeviceName();
             row[1] = inventoryItem.getDevice().getDeviceID();
             row[2] = inventoryItem.getQuantity();
             row[3] = inventoryItem.getDevice().getSupplierName();
             row[4] = inventoryItem.getDevice().getDevicePrice();
             model.addRow(row);
         }
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        deviceTable = new javax.swing.JTable();
        deleteJButton = new javax.swing.JButton();
        editJButton = new javax.swing.JButton();
        addQuantityJButton = new javax.swing.JButton();
        quantityJSpinner = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        supplierNameJLabel = new javax.swing.JLabel();
        refreshJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventoryItemTable = new javax.swing.JTable();

        deviceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Device Name", "Device ID", "Unit Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(deviceTable);

        deleteJButton.setText("Delete");
        deleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButtonActionPerformed(evt);
            }
        });

        editJButton.setText("Edit");
        editJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJButtonActionPerformed(evt);
            }
        });

        addQuantityJButton.setText("Add Quantity");
        addQuantityJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addQuantityJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(editJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(quantityJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addQuantityJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(deleteJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editJButton)))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addQuantityJButton)
                    .addComponent(quantityJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(242, Short.MAX_VALUE))
        );

        jLabel3.setText("Supplier Name: ");

        supplierNameJLabel.setText("jLabel2");

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        inventoryItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Device Name", "Device ID", "Quantity", "Supplier Name", "Unit Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(inventoryItemTable);
        if (inventoryItemTable.getColumnModel().getColumnCount() > 0) {
            inventoryItemTable.getColumnModel().getColumn(0).setResizable(false);
            inventoryItemTable.getColumnModel().getColumn(1).setResizable(false);
            inventoryItemTable.getColumnModel().getColumn(2).setResizable(false);
            inventoryItemTable.getColumnModel().getColumn(3).setResizable(false);
            inventoryItemTable.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(supplierNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshJButton)
                        .addGap(78, 78, 78))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 19, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 19, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(supplierNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(refreshJButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = deviceTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row to continue!","Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Device device = (Device)deviceTable.getValueAt(selectedRow, 0);
            ((SupplierAdmin)userAccount.getRole()).getDeviceCatalog().removeDevice(device);
            populateDeviceTable();
            InventoryItem inventoryItem = (InventoryItem)inventoryItemTable.getValueAt(selectedRow, 0);
            ((SupplierAdmin)userAccount.getRole()).getInventory().deleteInventoryItem(inventoryItem);
            populateInventoryItemTable();
        }
    }//GEN-LAST:event_deleteJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        // TODO add your handling code here:
        populateDeviceTable();
        populateInventoryItemTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void addQuantityJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addQuantityJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = deviceTable.getSelectedRow();
        int quantity = (Integer)quantityJSpinner.getValue();
        if(selectedRow <0 ){
            JOptionPane .showMessageDialog(null, "Please select a row to continue!");
        }
        else{
            InventoryItem inventoryItem = (InventoryItem)deviceTable.getValueAt(selectedRow, 0);
            inventoryItem.setInventoryQuantity(quantity);
            populateInventoryItemTable();
        }
        
    }//GEN-LAST:event_addQuantityJButtonActionPerformed

    private void editJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = inventoryItemTable.getSelectedRow();
        if(selectedRow <0 ){
            JOptionPane.showMessageDialog(null, "Please select a row in the Inventory Item table!");
        }
        else{
            InventoryItem inventoryItem = (InventoryItem)inventoryItemTable.getValueAt(selectedRow, 0);
            ManageDeviceDetail manageDeviceDetail = new ManageDeviceDetail(userProcessContainer, inventoryItem);
            userProcessContainer.add("Edit Device Detail", manageDeviceDetail);
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            
        }
    }//GEN-LAST:event_editJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addQuantityJButton;
    private javax.swing.JButton deleteJButton;
    private javax.swing.JTable deviceTable;
    private javax.swing.JButton editJButton;
    private javax.swing.JTable inventoryItemTable;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner quantityJSpinner;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JLabel supplierNameJLabel;
    // End of variables declaration//GEN-END:variables
}
