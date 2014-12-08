/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yueli.userinterface.famcworkarea;

import org.yueli.userinterface.primarycareworkarea.*;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.yueli.business.Business;
import org.yueli.business.inventory.InventoryItem;
import org.yueli.business.network.Network;
import org.yueli.business.order.MasterOrderDirectory;
import org.yueli.business.order.Order;
import org.yueli.business.order.OrderItem;
import org.yueli.business.organization.Organization;
import org.yueli.business.organization.SupplierOrganization;
import org.yueli.business.role.FAMCAdmin;
import org.yueli.business.role.PrimaryCareAdmin;
import org.yueli.business.useraccount.UserAccount;
import org.yueli.business.workqueue.OrderRequest;
import org.yueli.userinterface.hospitalworkarea.ViewDeviceDetail;

/**
 *
 * @author Lydia
 */
public class BrowseDevice extends javax.swing.JPanel {

    /**
     * Creates new form BrowseDevice
     */
      private JPanel userProcessContainer;
    private Business business;
    private Network network;
    private Organization organization;
    private UserAccount userAccount;
    private Order order;
    private MasterOrderDirectory masterOrderDirectory;
    Boolean isCheckedOut = false;
    public BrowseDevice(JPanel userProcessContainer, MasterOrderDirectory masterOrderDirectory, UserAccount userAccount,Business business, Network network, Organization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.masterOrderDirectory = masterOrderDirectory;
        this.userAccount = userAccount;
        this.business = business;
        this.network = network;
        this.organization = organization;
        order = new Order();
        jLabel2.setText(userAccount.getPerson().getFirstName());
                    
        populateSupplierCombo();
        populateDeviceTable();
    }
private void populateSupplierCombo(){
        supplierNameComboBox.removeAllItems();
        for(Network network : business.getNetworkDirectory().getNetworkList()){
            
                for(SupplierOrganization  so : network.getSupplierDirectory().getSupplierList()){

                    supplierNameComboBox.addItem(so);
                    
                }
            
        }
    }
 private void populateDeviceTable(){
        SupplierOrganization so = (SupplierOrganization)supplierNameComboBox.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel)deviceJTable.getModel();
        model.setRowCount(0);
        

            for (InventoryItem inventoryItem : so.getInventory().getInventoryItemList()){
                Object[] row = new Object[4];
                row[0] = inventoryItem;
                row[1] = inventoryItem.getDevice().getFunction();
                row[2] = inventoryItem.getQuantity();
                row[3] = inventoryItem.getDevice().getDevicePrice();
                model.addRow(row);
            }

    }
    private void populateDeviceTable(String name){
        DefaultTableModel model = (DefaultTableModel)deviceJTable.getModel();
        model.setRowCount(0);
        for(Network network : business.getNetworkDirectory().getNetworkList()){
            for(SupplierOrganization so : network.getSupplierDirectory().getSupplierList()){
                for(UserAccount userAccount : so.getUserAccountDirectory().getUserAccountList()){
                    for(InventoryItem inventoryItem : ((SupplierOrganization)organization).getInventory().getInventoryItemList()){
                        Object[] row = new Object[4];
                        row[0] = inventoryItem;
                        row[1] = inventoryItem.getDevice().getFunction();
                        row[2] = inventoryItem.getQuantity();
                        row[3] = inventoryItem.getDevice().getDevicePrice();
                        model.addRow(row);
                    }
                }
            }
        }
    
    }
    
    public void populateOrderTable(){
        DefaultTableModel model = (DefaultTableModel) orderJTable.getModel();
        model.setRowCount(0);

            for (OrderItem orderItem : order.getOrderItemList()) {
                Object[] row = new Object[4];
                row[0] = orderItem;
                row[1] = orderItem.getOrderQuantity();
                row[2] = orderItem.getInventoryItem().getDevice().getDevicePrice();
                row[3] = orderItem.getOrderQuantity() * orderItem.getInventoryItem().getDevice().getDevicePrice();
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

        addJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderJTable = new javax.swing.JTable();
        supplierNameComboBox = new javax.swing.JComboBox();
        searchJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        searchJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        deleteJButtton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        refreshOrderJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        deviceJTable = new javax.swing.JTable();
        checkoutJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        viewDetailJButton = new javax.swing.JButton();
        quantityJSpinner = new javax.swing.JSpinner();

        addJButton.setText("Add");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Supplier Name:");

        orderJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Device Name", "Quantity", "Unit Price", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderJTable);

        jLabel3.setText("Order:");

        searchJButton.setText("Search");
        searchJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        deleteJButtton.setText("Delete");
        deleteJButtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButttonActionPerformed(evt);
            }
        });

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        refreshOrderJButton.setText("Refresh");
        refreshOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshOrderJButtonActionPerformed(evt);
            }
        });

        deviceJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Device Name", "Function", "Availability", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(deviceJTable);

        checkoutJButton.setText("Checkout");
        checkoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutJButtonActionPerformed(evt);
            }
        });

        backJButton.setText("<< Back");

        viewDetailJButton.setText("View Device Detail");
        viewDetailJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(supplierNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(searchJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(51, 51, 51))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(searchJButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(refreshJButton)
                                .addGap(60, 60, 60))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteJButtton)
                .addGap(26, 26, 26)
                .addComponent(refreshOrderJButton)
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkoutJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(viewDetailJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(quantityJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addJButton)))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supplierNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchJButton)
                    .addComponent(refreshJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewDetailJButton)
                    .addComponent(quantityJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteJButtton)
                            .addComponent(refreshOrderJButton))
                        .addGap(18, 18, 18)
                        .addComponent(checkoutJButton)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = deviceJTable.getSelectedRow();
        int quantity = (Integer)quantityJSpinner.getValue();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            InventoryItem  inventoryItem = (InventoryItem)deviceJTable.getValueAt(selectedRow, 0);
            if(quantity <= 0 || quantity > inventoryItem.getQuantity()){
                JOptionPane.showMessageDialog(null, "The stock is not enough", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            Boolean isInculded = false;

            for(OrderItem orderItem : order.getOrderItemList()) {
                if (orderItem.getInventoryItem().getDevice().getDeviceName().equals(inventoryItem.getDevice().getDeviceName())) {
                    int oldQuantity = orderItem.getOrderQuantity();
                    int newQuantity = (Integer) quantityJSpinner.getValue();
                    int availiability = inventoryItem.getQuantity();
                    int totalQuantity = oldQuantity + newQuantity;
                    orderItem.setOrderQuantity(totalQuantity);
                    int newAvailiability = inventoryItem.getQuantity() - newQuantity;
                    inventoryItem.setInventoryQuantity(newAvailiability);
                    isInculded = true;

                }
            }
            if(!isInculded){
                OrderItem orderItem1 = order.addOrderItem();
                orderItem1.setInventoryItem(inventoryItem);
                int quantity_notIncluded = (Integer)quantityJSpinner.getValue();
                orderItem1.setOrderQuantity(quantity_notIncluded);
                int new_availiability = inventoryItem.getQuantity() - quantity_notIncluded;
                inventoryItem.setInventoryQuantity(new_availiability);

            }

            populateDeviceTable();
            populateOrderTable();

        }
    }//GEN-LAST:event_addJButtonActionPerformed

    private void searchJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJButtonActionPerformed
        // TODO add your handling code here:
        String deviceName = searchJTextField.getText();
        populateDeviceTable(deviceName);
    }//GEN-LAST:event_searchJButtonActionPerformed

    private void deleteJButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButttonActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderJTable.getSelectedRow();
        if(selectedRow <0){
            JOptionPane.showMessageDialog(null, "Please select a row to delete!","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            OrderItem orderItem = (OrderItem)orderJTable.getValueAt(selectedRow, 0);
            order.deleteOrderItem(orderItem);
        }
    }//GEN-LAST:event_deleteJButttonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        // TODO add your handling code here:
        populateDeviceTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void refreshOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshOrderJButtonActionPerformed
        // TODO add your handling code here:
        populateOrderTable();
    }//GEN-LAST:event_refreshOrderJButtonActionPerformed

    private void checkoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutJButtonActionPerformed
        // TODO add your handling code here:
        masterOrderDirectory.addOrder(order);
        order.setOrderEnterpriseID(((FAMCAdmin)userAccount.getRole()).getFamcID());

        if(order != null){
            OrderRequest orderRequest = new OrderRequest();
            orderRequest.setSender(userAccount);
            orderRequest.setOrder(order);
            orderRequest.setOrderStatus("Sent");
            orderRequest.setRequestDate(orderRequest.getTimestamp());

            Organization organization = null;
            for(Organization organization1 : network.getSupplierDirectory().getSupplierList()){
                if(organization1.getName().equals(((SupplierOrganization)supplierNameComboBox.getSelectedItem()).getName())){
                    organization = organization1;
                    break;
                }
            }
            if(organization != null){
                organization.getWorkQueue().getWorkRequestList().add(orderRequest);
                userAccount.getWorkQueue().getWorkRequestList().add(orderRequest);

            }
            JOptionPane.showMessageDialog(null, "You have successfully checked out!");

        }
        else{
            JOptionPane.showMessageDialog(null, "There is some error checking out!");
            return;
        }
        if(!isCheckedOut){
            Order o = new Order();
            populateDeviceTable();
            populateOrderTable();

        }

    }//GEN-LAST:event_checkoutJButtonActionPerformed

    private void viewDetailJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = deviceJTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row to view!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            InventoryItem inventoryItem = (InventoryItem)deviceJTable.getValueAt(selectedRow, 0);
            ViewDeviceDetail viewDeviceDetail = new ViewDeviceDetail(userProcessContainer, inventoryItem);
            userProcessContainer.add("View Device Detail", viewDeviceDetail);
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_viewDetailJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton checkoutJButton;
    private javax.swing.JButton deleteJButtton;
    private javax.swing.JTable deviceJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orderJTable;
    private javax.swing.JSpinner quantityJSpinner;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton refreshOrderJButton;
    private javax.swing.JButton searchJButton;
    private javax.swing.JTextField searchJTextField;
    private javax.swing.JComboBox supplierNameComboBox;
    private javax.swing.JButton viewDetailJButton;
    // End of variables declaration//GEN-END:variables
}
