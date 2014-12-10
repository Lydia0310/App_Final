/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.userinterface.hospitalworkarea;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.yueli.business.Business;
import org.yueli.business.inventory.InventoryItem;
import org.yueli.business.network.Network;
import org.yueli.business.role.HospitalAdmin;
import org.yueli.business.useraccount.UserAccount;
import org.yueli.business.workqueue.DeviceRequest;
import org.yueli.business.workqueue.WorkRequest;

/**
 *
 * @author Lydia
 */
public class ViewDeviceRequest extends javax.swing.JPanel {

    /**
     * Creates new form ViewDeviceRequest
     */
    private JPanel userProcessContainer;
    private Business business;
    private Network network;
    private UserAccount userAccount;
    
    public ViewDeviceRequest(JPanel userProcessContainer, Business business,Network network, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.userAccount = userAccount;
        this.network = network;
        populateDeviceRequestTable();
    }
    
    public void populateDeviceRequestTable(){
        DefaultTableModel model = (DefaultTableModel)deviceRequestJTable.getModel();
        model.setRowCount(0);
        
        for(WorkRequest workRequest : network.getWorkQueue().getWorkRequestList()){
            if(workRequest instanceof DeviceRequest){
            Object[] row = new Object[5];
            row[0] = workRequest;
            DeviceRequest deviceRequest = (DeviceRequest)workRequest;
            row[1] = deviceRequest.getInventoryItem().getDevice().getDeviceName();
            row[2] = deviceRequest.getSender();
            row[3] = deviceRequest.getRequestQuantity();
            row[4] = deviceRequest.getDeviceRequestStatus();
            model.addRow(row);
            }
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

        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        deviceRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();

        backJButton.setText("<< Back");

        deviceRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RequestID", "Device Name", "Sender Name", "Request Quantity", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(deviceRequestJTable);
        if (deviceRequestJTable.getColumnModel().getColumnCount() > 0) {
            deviceRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            deviceRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            deviceRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            deviceRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            deviceRequestJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 46, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(refreshJButton)
                                .addGap(59, 59, 59))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(assignJButton)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(refreshJButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(assignJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        // TODO add your handling code here:
        populateDeviceRequestTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
        // TODO add your handling code here:
        //Compare requestQuantity and inventoryQuantity
        int selectedRow = deviceRequestJTable.getSelectedRow();
        if(selectedRow <0 ){
            JOptionPane.showMessageDialog(null, "Please a row to continue!");
        }
        else{
            DeviceRequest deviceRequest = (DeviceRequest)deviceRequestJTable.getValueAt(selectedRow, 0);
            
            for(InventoryItem inventoryItem : ((HospitalAdmin)userAccount.getRole()).getInventory().getInventoryItemList() ){
                if(inventoryItem.getDevice().getDeviceName().equals(deviceRequest.getInventoryItem().getDevice().getDeviceName())){
                    if(deviceRequest.getRequestQuantity()> inventoryItem.getQuantity()){
                        JOptionPane.showMessageDialog(null, "The inventory quantity is not enough!");
                        break;
                    }
                    else{
                            deviceRequest.setDeviceRequestStatus("Completed");
                            deviceRequest.setReciever(userAccount);
                            deviceRequest.setResolveDate(deviceRequest.getTimestamp());
                             //Change the inventory
                            int currentQuantity = inventoryItem.getQuantity() - deviceRequest.getRequestQuantity();
                            inventoryItem.setInventoryQuantity(currentQuantity);
                    }
                }
            }
        }
    }//GEN-LAST:event_assignJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JTable deviceRequestJTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshJButton;
    // End of variables declaration//GEN-END:variables
}
