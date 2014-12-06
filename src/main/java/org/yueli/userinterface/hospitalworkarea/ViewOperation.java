/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.userinterface.hospitalworkarea;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.yueli.business.Business;
import org.yueli.business.network.Network;
import org.yueli.business.useraccount.UserAccount;
import org.yueli.userinterface.doctorworkarea.*;

/**
 *
 * @author Lydia
 */
public class ViewOperation extends javax.swing.JPanel {

    /**
     * Creates new form ViewOperation
     */
    private JPanel userProcessContainer;
    private Business business;
    private Network network;
    private UserAccount userAccount;
    public ViewOperation(JPanel userProcessContainer, Business business, Network network, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.network = network;
        this.userAccount = userAccount;
        populateOperationTable();
    }
    
    public void populateOperationTable(){
        DefaultTableModel model = (DefaultTableModel)operationTable.getModel();
        model.setRowCount(0);
        
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
        operationTable = new javax.swing.JTable();

        operationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Operation ID", "Operation Name", "Doctor Name", "Care Team ID", "Operation Room Number", "Beginning Time", "End Time", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(operationTable);
        if (operationTable.getColumnModel().getColumnCount() > 0) {
            operationTable.getColumnModel().getColumn(0).setResizable(false);
            operationTable.getColumnModel().getColumn(1).setResizable(false);
            operationTable.getColumnModel().getColumn(2).setResizable(false);
            operationTable.getColumnModel().getColumn(3).setResizable(false);
            operationTable.getColumnModel().getColumn(4).setResizable(false);
            operationTable.getColumnModel().getColumn(5).setResizable(false);
            operationTable.getColumnModel().getColumn(6).setResizable(false);
            operationTable.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable operationTable;
    // End of variables declaration//GEN-END:variables
}