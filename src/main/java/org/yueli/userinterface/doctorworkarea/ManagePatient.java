/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.userinterface.doctorworkarea;

import java.nio.file.attribute.UserPrincipal;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.yueli.business.Business;
import org.yueli.business.enterprise.Enterprise;
import org.yueli.business.enterprise.HospitalEnterprise;
import org.yueli.business.network.Network;
import org.yueli.business.patient.Patient;
import org.yueli.business.role.DoctorRole;
import org.yueli.business.useraccount.UserAccount;
import org.yueli.business.workqueue.OperationRequest;

/**
 *
 * @author Lydia
 */
public class ManagePatient extends javax.swing.JPanel {

    /**
     * Creates new form ManagePatient
     */
    private JPanel userProcessContainer;
    private Business business;
    private Network network;
    private Enterprise enterprise;
    private UserAccount userAccount;
    
    public ManagePatient(JPanel userProcessContainer, Business business, Network network, Enterprise enterprise, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.network = network;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        patientNameJLabel.setVisible(false);
        patientNameJTextField.setVisible(false);
        submitJButton.setVisible(false);
        populatePatientTable();
    }
    
    public void populatePatientTable(){
        DefaultTableModel model = (DefaultTableModel)patientTable.getModel();
        model.setRowCount(0);
        
        for(Patient patient : ((DoctorRole)userAccount.getRole()).getPatientDirectory().getPatientList()){
            Object[] row = new Object[3];
            row[0] = patient.getPatientID();
            row[1] = patient.getPatientName();
            row[2] = ((DoctorRole)userAccount.getRole()).getDocotorID();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        patientNameJLabel = new javax.swing.JLabel();
        createJButton = new javax.swing.JButton();
        patientNameJTextField = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        assignOperationJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Patient Name", "Doctor ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(patientTable);
        if (patientTable.getColumnModel().getColumnCount() > 0) {
            patientTable.getColumnModel().getColumn(0).setResizable(false);
            patientTable.getColumnModel().getColumn(1).setResizable(false);
            patientTable.getColumnModel().getColumn(2).setResizable(false);
        }

        patientNameJLabel.setText("Patient Name: ");

        createJButton.setText("Create");
        createJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJButtonActionPerformed(evt);
            }
        });

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        assignOperationJButton.setText("Assign a operation");
        assignOperationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignOperationJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Beginning Time:");

        jLabel2.setText("End Time:");

        jLabel3.setText("(hh:mm:ss)");

        jLabel4.setText("(hh:mm:ss)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshJButton)
                .addGap(167, 167, 167))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(createJButton)
                        .addGap(333, 333, 333)
                        .addComponent(assignOperationJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 273, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addComponent(submitJButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(patientNameJLabel)
                                .addGap(48, 48, 48)
                                .addComponent(patientNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(refreshJButton)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createJButton)
                    .addComponent(assignOperationJButton))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientNameJLabel)
                            .addComponent(patientNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addComponent(submitJButton)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        // TODO add your handling code here:
        String patientName = patientNameJTextField.getText();
        Patient patient = ((DoctorRole)userAccount.getRole()).getPatientDirectory().addPatient();
        patient.setPatientName(patientName);
        populatePatientTable();
        
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void createJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJButtonActionPerformed
        // TODO add your handling code here:
        patientNameJLabel.setVisible(true);
        patientNameJTextField.setVisible(true);
        submitJButton.setVisible(true);
        
    }//GEN-LAST:event_createJButtonActionPerformed

    private void assignOperationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignOperationJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = patientTable.getSelectedRow();
        if(selectedRow <0 ){
            JOptionPane.showMessageDialog(null, "Please select a row to continue!");     
        }
        else{
            Patient patient = (Patient)patientTable.getValueAt(selectedRow, 0);
            ((HospitalEnterprise)userAccount.getEnterprise()).getOperationList().addOperation().setPatient(patient);
            OperationRequest operationRequest = new OperationRequest();
            operationRequest.setSender(userAccount);
            operationRequest.setRequestDate(operationRequest.getTimestamp());
            operationRequest.setDoctorName(userAccount.getPerson().getFirstName());
            operationRequest.setOperationRequestStatue("Pending");
        }
    }//GEN-LAST:event_assignOperationJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        // TODO add your handling code here:
        populatePatientTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignOperationJButton;
    private javax.swing.JButton createJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel patientNameJLabel;
    private javax.swing.JTextField patientNameJTextField;
    private javax.swing.JTable patientTable;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
