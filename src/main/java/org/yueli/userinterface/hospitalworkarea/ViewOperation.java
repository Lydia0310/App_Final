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
import org.yueli.business.enterprise.Enterprise;
import org.yueli.business.enterprise.HospitalEnterprise;
import org.yueli.business.network.Network;
import org.yueli.business.operation.Operation;
import org.yueli.business.organization.Organization;
import org.yueli.business.useraccount.UserAccount;
import org.yueli.business.workqueue.OperationRequest;
import org.yueli.business.workqueue.WorkRequest;
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
        checkOperationRequestStatus();
        populateOperationTable();
        
        
    }
    
    public void checkOperationRequestStatus(){
         for(Network network : business.getNetworkDirectory().getNetworkList()){
            for(Enterprise enterprise : network.getEnterpriseList().getEnterpriseList()){
                if(enterprise instanceof HospitalEnterprise ){
                for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                    for(UserAccount userAccount : organization.getUserAccountDirectory().getUserAccountList()){
                        for(WorkRequest workRequest : userAccount.getWorkQueue().getWorkRequestList()){
                            if(workRequest instanceof OperationRequest){
                                if(((OperationRequest)workRequest).isCareTeamRequestIsCompeleted()&&((OperationRequest)workRequest).isDeviceRequestIsCompeleted()&&((OperationRequest)workRequest).isOperationRoomRequestIsCompeleted()){
                                    JOptionPane.showMessageDialog(null,"Complete Operation Request");
                                    break;
                                }
                                if(((OperationRequest)workRequest).isCareTeamRequestIsCompeleted()&&((OperationRequest)workRequest).isDeviceRequestIsCompeleted()){
                                     JOptionPane.showMessageDialog(null,"Waiting for operation room request approve");
                                     break;
                                }
                                if(((OperationRequest)workRequest).isCareTeamRequestIsCompeleted()&&((OperationRequest)workRequest).isOperationRoomRequestIsCompeleted()){
                                    JOptionPane.showMessageDialog(null,"Waiting for device request approve");
                                    break;
                                }
                                if(((OperationRequest)workRequest).isDeviceRequestIsCompeleted()&&((OperationRequest)workRequest).isOperationRoomRequestIsCompeleted()){
                                    JOptionPane.showMessageDialog(null, "Waiting for care team request approve");
                                    break;
                                }
                                if(((OperationRequest)workRequest).isCareTeamRequestIsCompeleted()){
                                    JOptionPane.showMessageDialog(null,"Waiting for operation room request and device request approve");
                                    break;
                                }
                                if(((OperationRequest)workRequest).isDeviceRequestIsCompeleted()){
                                    JOptionPane.showMessageDialog(null, "Waiting for operation room request and care team request approve");
                                    break;
                                }
                                if(((OperationRequest)workRequest).isOperationRoomRequestIsCompeleted()){
                                    JOptionPane.showMessageDialog(null, "Waiting for device request and care team request approve");
                                    break;
                                }
                                
                            }
                        }
                    }
                }
                }
            }
         }
    }
    
    public void populateOperationTable(){
        DefaultTableModel model = (DefaultTableModel)operationTable.getModel();
        model.setRowCount(0);
        for(Network network : business.getNetworkDirectory().getNetworkList()){
            for(Enterprise enterprise : network.getEnterpriseList().getEnterpriseList()){
                if(enterprise instanceof HospitalEnterprise ){
                for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                    for(UserAccount userAccount : organization.getUserAccountDirectory().getUserAccountList()){
                        for(WorkRequest workRequest : userAccount.getWorkQueue().getWorkRequestList()){
                            if(workRequest instanceof OperationRequest){
                                for(Operation operation : ((HospitalEnterprise)enterprise).getOperationList().getOperationList()){
                                    Object row[] = new Object[7];
                                    row[0] = operation.getOperationID();
                                    row[1] = operation.getDoctor();
                                    row[2] = operation.getCareTeam();
                                    row[3] = ((OperationRequest)workRequest).getOperationRoomNumber();
                                    row[4] = ((OperationRequest)workRequest).getBeginningTime();
                                    row[5] = ((OperationRequest)workRequest).getEndTime();
                                    row[6] = ((OperationRequest)workRequest).getOperationRequestStatus();
                                }
                            }
                        }
                    }
                }
            }
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
        operationTable = new javax.swing.JTable();

        operationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Operation ID", "Doctor Name", "Care Team ID", "Operation Room Number", "Beginning Time", "End Time", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
