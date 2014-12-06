/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.userinterface.warehouseworkarea;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.yueli.business.Business;
import org.yueli.business.enterprise.Enterprise;
import org.yueli.business.enterprise.FoundingAcademicMedicalCenter;
import org.yueli.business.enterprise.HospitalEnterprise;
import org.yueli.business.enterprise.PrimaryCare;
import org.yueli.business.inventory.InventoryItem;
import org.yueli.business.network.Network;
import org.yueli.business.order.Order;
import org.yueli.business.order.OrderItem;
import org.yueli.business.room.Room;
import org.yueli.business.room.StorageRoom;
import org.yueli.business.useraccount.UserAccount;

/**
 *
 * @author Lydia
 */
public class AssignDevice extends javax.swing.JPanel {

    /**
     * Creates new form ArrangeDevice
     */
    private JPanel userProcessContainer;
    private Business business;
    private Network network;
    private UserAccount userAccount;
    private Enterprise enterprise;
    public AssignDevice(JPanel userProcessContainer, Business business, Network network, Enterprise enterprise, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.network = network;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        populateDeviceTable();
        populateRoomTable();
        populateRoomNumberCombo();
    }
    
    public void populateDeviceTable(){
        DefaultTableModel model = (DefaultTableModel)deviceTable.getModel();
        model.setRowCount(0);
        
        for(Order order : business.getMasterOrderDirectory().getMasterOrderList()){
            for(OrderItem orderItem : order.getOrderItemList()){
                if(!orderItem.getInventoryItem().getDevice().isIsAssigned()){
                    Object row[] = new Object[2];
                    row[0] = orderItem.getInventoryItem().getDevice().getDeviceName();
                    row[1] = orderItem.getInventoryItem().getDevice().getDeviceID();
                    model.addRow(row);
                }
            }
        }
    }

    public void populateRoomTable(){
        DefaultTableModel model = (DefaultTableModel)roomTable.getModel();
        model.setRowCount(0);
        if(enterprise instanceof HospitalEnterprise ){
         for(Room room : enterprise.getRoomList().getRoomList()){
            if(room.getType() == Room.RoomType.StorageRoom){
                Object row[] = new Object[3];
                row[0] = room.getRoomID();
                row[1] = ((StorageRoom)room).getStorageRoomNumber();
                row[2] = ((StorageRoom)room).getStorageRoomStatus();
                model.addRow(row);
             }
        }
    }
    }
    
    public void populateRoomNumberCombo(){
        roomNumberCombo.removeAllItems();
        for(Room room : enterprise.getRoomList().getRoomList()){
            if(room.getType() == Room.RoomType.StorageRoom && !(((StorageRoom)room).isIsFull())){
                roomNumberCombo.addItem(((StorageRoom)room).getStorageRoomNumber());
            }
        }
    }
    
    public void populateAssignDeviceTable(){
    
        DefaultTableModel model = (DefaultTableModel)assignDeviceTable.getModel();
        model.setRowCount(0);
        if(enterprise instanceof HospitalEnterprise ){
            for(InventoryItem inventoryItem : ((HospitalEnterprise)enterprise).getInventory().getInventoryItemList()){
                Object row[] = new Object[3];
                row[0] = inventoryItem.getDevice().getLocation();
                row[1] = inventoryItem.getDevice().getDeviceName();
                row[2] = inventoryItem.getQuantity();
                model.addRow(row);
            }
        }
        
        if(enterprise instanceof PrimaryCare){
             for(InventoryItem inventoryItem : ((PrimaryCare)enterprise).getInventory().getInventoryItemList()){
                Object row[] = new Object[3];
                row[0] = inventoryItem.getDevice().getLocation();
                row[1] = inventoryItem.getDevice().getDeviceName();
                row[2] = inventoryItem.getQuantity();
                model.addRow(row);
            }
        }
        
        if(enterprise instanceof FoundingAcademicMedicalCenter){
             for(InventoryItem inventoryItem : ((FoundingAcademicMedicalCenter)enterprise).getInventory().getInventoryItemList()){
                Object row[] = new Object[3];
                row[0] = inventoryItem.getDevice().getLocation();
                row[1] = inventoryItem.getDevice().getDeviceName();
                row[2] = inventoryItem.getQuantity();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        deviceTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        roomTable = new javax.swing.JTable();
        assignRoomJButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        assignDeviceTable = new javax.swing.JTable();
        refreshJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        roomNumberCombo = new javax.swing.JComboBox();

        deviceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Device Name", "Device ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(deviceTable);
        if (deviceTable.getColumnModel().getColumnCount() > 0) {
            deviceTable.getColumnModel().getColumn(0).setResizable(false);
            deviceTable.getColumnModel().getColumn(1).setResizable(false);
        }

        roomTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room ID", "Room Number", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(roomTable);
        if (roomTable.getColumnModel().getColumnCount() > 0) {
            roomTable.getColumnModel().getColumn(0).setResizable(false);
            roomTable.getColumnModel().getColumn(1).setResizable(false);
            roomTable.getColumnModel().getColumn(2).setResizable(false);
        }

        assignRoomJButton.setText("Assign to a Storage Room");
        assignRoomJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignRoomJButtonActionPerformed(evt);
            }
        });

        assignDeviceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Number", "Device Name", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(assignDeviceTable);
        if (assignDeviceTable.getColumnModel().getColumnCount() > 0) {
            assignDeviceTable.getColumnModel().getColumn(0).setResizable(false);
            assignDeviceTable.getColumnModel().getColumn(1).setResizable(false);
            assignDeviceTable.getColumnModel().getColumn(2).setResizable(false);
        }

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Room Number: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roomNumberCombo, 0, 96, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(assignRoomJButton)
                .addGap(116, 116, 116)
                .addComponent(refreshJButton)
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignRoomJButton)
                    .addComponent(refreshJButton)
                    .addComponent(jLabel1)
                    .addComponent(roomNumberCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignRoomJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignRoomJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = deviceTable.getSelectedRow();
        if(selectedRow <0 ){
            JOptionPane.showMessageDialog(null, "Please select a row to continue!");
        }
        else{
            InventoryItem inventoryItem = (InventoryItem)deviceTable.getValueAt(selectedRow, 0);
            Room assignRoomNumber = (Room)roomNumberCombo.getSelectedItem();
            inventoryItem.getDevice().setLocation(((StorageRoom)assignRoomNumber).getStorageRoomNumber());
            inventoryItem.getDevice().setIsAssigned(true);
            populateAssignDeviceTable();
            populateRoomTable();
            populateRoomNumberCombo();
        }
    }//GEN-LAST:event_assignRoomJButtonActionPerformed

    
    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        // TODO add your handling code here:
        populateAssignDeviceTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable assignDeviceTable;
    private javax.swing.JButton assignRoomJButton;
    private javax.swing.JTable deviceTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JComboBox roomNumberCombo;
    private javax.swing.JTable roomTable;
    // End of variables declaration//GEN-END:variables
}
