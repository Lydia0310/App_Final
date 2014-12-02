/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.userinterface.supplierworkarea;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.yueli.business.Business;
import org.yueli.business.enterprise.Enterprise;
import org.yueli.business.enterprise.HospitalEnterprise;
import org.yueli.business.network.Network;
import org.yueli.business.order.Order;
import org.yueli.business.order.OrderItem;
import org.yueli.business.organization.Organization;
import org.yueli.business.role.FAMCAdmin;
import org.yueli.business.role.HospitalAdmin;
import org.yueli.business.role.PrimaryCareAdmin;
import org.yueli.business.useraccount.UserAccount;
import org.yueli.business.workqueue.OrderRequest;

/**
 *
 * @author Lydia
 */
public class ViewOrder extends javax.swing.JPanel {

    /**
     * Creates new form ViewOrder
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Business business;
    public ViewOrder(JPanel userProcessContainer, UserAccount userAccount,Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.business = business;
        populateEnterpriseTypeCombo();
        populateOrderTable();
    }
    
    public void populateEnterpriseTypeCombo(){
        enterpriseJCombo.removeAllItems();
        
        for(Network network: business.getNetworkList()){
            for(Enterprise enterprise : network.getEnterpriseList().getEnterpriseList())
                for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList() ){
                    for(UserAccount userAccount : organization.getUserAccountDirectory().getUserAccountList()){
                        enterpriseJCombo.addItem(userAccount);
                    }
                }
            }
        }
    
    
    public void populateOrderTable(){
        UserAccount userAccount= (UserAccount)enterpriseJCombo.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel)orderJTable.getModel();
        model.setRowCount(0);
        
        for(Order order : business.getMasterOrderDirectory().getMasterOrderList()){
            if(order.getOrderEnterpriseID().equals(((HospitalAdmin)userAccount.getRole()).getHospitalID()) ||
               order.getOrderEnterpriseID().equals(((PrimaryCareAdmin)userAccount.getRole()).getPrimaryCareID())||
               order.getOrderEnterpriseID().equals(((FAMCAdmin)userAccount.getRole()).getFamcID())){
                Object row[] = new Object[1];
                row[0] = order;
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

        jLabel1 = new javax.swing.JLabel();
        enterpriseJCombo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderJTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderDetailJTable = new javax.swing.JTable();
        viewJButton = new javax.swing.JButton();
        approveJButton = new javax.swing.JButton();
        declineJButton = new javax.swing.JButton();

        jLabel1.setText("Enterprise:");

        orderJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderJTable);
        if (orderJTable.getColumnModel().getColumnCount() > 0) {
            orderJTable.getColumnModel().getColumn(0).setResizable(false);
        }

        orderDetailJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Device Name", "Quantity", "Unit Price", "Total Price", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderDetailJTable);
        if (orderDetailJTable.getColumnModel().getColumnCount() > 0) {
            orderDetailJTable.getColumnModel().getColumn(0).setResizable(false);
            orderDetailJTable.getColumnModel().getColumn(1).setResizable(false);
            orderDetailJTable.getColumnModel().getColumn(2).setResizable(false);
            orderDetailJTable.getColumnModel().getColumn(3).setResizable(false);
            orderDetailJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        viewJButton.setText("View");
        viewJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewJButtonActionPerformed(evt);
            }
        });

        approveJButton.setText("Approve");
        approveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveJButtonActionPerformed(evt);
            }
        });

        declineJButton.setText("Decline");
        declineJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(enterpriseJCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(viewJButton)))))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(approveJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(declineJButton)
                .addGap(189, 189, 189))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(enterpriseJCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(viewJButton)))
                .addGap(62, 62, 62)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(approveJButton)
                    .addComponent(declineJButton))
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderJTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)orderDetailJTable.getModel();
        model.setRowCount(0);
        if(selectedRow <0){
            JOptionPane.showMessageDialog(null, "Please select a row to view!");
        }
        else{
            OrderRequest orderRequest = (OrderRequest)orderJTable.getValueAt(selectedRow, 0);
            for(OrderItem orderItem : orderRequest.getOrder().getOrderItemList()){
                Object row[] = new Object[5];
                row[0] = orderItem;
                row[1] = orderItem.getQuantity();
                row[2] = orderItem.getDevice().getDevicePrice();
                row[3] = orderItem.getDevice().getDevicePrice() * orderItem.getQuantity();
                row[4] = orderRequest.getOrderStatus();
                model.addRow(row);
            }
        }
    }//GEN-LAST:event_viewJButtonActionPerformed

    private void approveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderJTable.getSelectedRow();
        if(selectedRow <0){
            JOptionPane.showMessageDialog(null, "Please select a row to continue!");
        }
        else{
            OrderRequest orderRequest = (OrderRequest)orderJTable.getValueAt(selectedRow, 0);
            orderRequest.setOrderStatus("Completed");
        }
    }//GEN-LAST:event_approveJButtonActionPerformed

    private void declineJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderJTable.getSelectedRow();
        if(selectedRow <0){
            JOptionPane.showMessageDialog(null, "Please select a row to continue!");
        }
        else{
            OrderRequest orderRequest = (OrderRequest)orderJTable.getValueAt(selectedRow, 0);
            orderRequest.setOrderStatus("Canceled");
            
        }
    }//GEN-LAST:event_declineJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveJButton;
    private javax.swing.JButton declineJButton;
    private javax.swing.JComboBox enterpriseJCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orderDetailJTable;
    private javax.swing.JTable orderJTable;
    private javax.swing.JButton viewJButton;
    // End of variables declaration//GEN-END:variables
}
