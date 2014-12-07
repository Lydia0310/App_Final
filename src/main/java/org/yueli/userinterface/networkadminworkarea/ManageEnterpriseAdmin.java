/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.userinterface.networkadminworkarea;

import javax.swing.JOptionPane;
import  org.yueli.business.Business;
import org.yueli.business.enterprise.Enterprise;
import org.yueli.business.network.Network;
import org.yueli.business.useraccount.UserAccount;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.yueli.business.person.Person;
import org.yueli.business.role.FAMCAdmin;
import org.yueli.business.role.HospitalAdmin;
import org.yueli.business.role.NetworkAdmin;
import org.yueli.business.role.PrimaryCareAdmin;

/**
 *
 * @author Lydia
 */
public class ManageEnterpriseAdmin extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseAdmin
     */
    private JPanel userProcessContainer;
    private Business business;
    private UserAccount userAccount;
    public ManageEnterpriseAdmin(JPanel userProcessContainer,UserAccount userAccount, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.business = business;
        
        enterpriseNameJLabel.setVisible(false);
        usernameJLabel.setVisible(false);
        passwordJLabel.setVisible(false);
        firstNameJLabel.setVisible(false);
        lastNameJLabel.setVisible(false);
        
        enterpriseNamejComboBox.setVisible(false);
        userNameJTextField.setVisible(false);
        PasswordField.setVisible(false);
        firstNameJTextField.setVisible(false);
        lastNameJTextField.setVisible(false);
        populateEnterpriseCombo();
        populateEnterpriseAdminTable();
    }

    private void populateEnterpriseAdminTable(){
        DefaultTableModel model = (DefaultTableModel)enterpriseAdminJTable.getModel();
        model.setRowCount(0);
        
        for(Network network : business.getNetworkList()){
            for(Enterprise enterprise : network.getEnterpriseList().getEnterpriseList()){
                for(UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()){
                        Object[] row = new Object[3];
                        row[0] = enterprise.getName();
                        row[1] = network.getName();
                        row[2] = userAccount.getUsername();
                        
                        model.addRow(row);
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
        enterpriseAdminJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        enterpriseNameJLabel = new javax.swing.JLabel();
        usernameJLabel = new javax.swing.JLabel();
        passwordJLabel = new javax.swing.JLabel();
        firstNameJTextField = new javax.swing.JTextField();
        firstNameJLabel = new javax.swing.JLabel();
        userNameJTextField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        enterpriseNamejComboBox = new javax.swing.JComboBox();
        addJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lastNameJLabel = new javax.swing.JLabel();
        lastNameJTextField = new javax.swing.JTextField();
        createJButton = new javax.swing.JButton();

        enterpriseAdminJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Network", "UserName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseAdminJTable);
        if (enterpriseAdminJTable.getColumnModel().getColumnCount() > 0) {
            enterpriseAdminJTable.getColumnModel().getColumn(0).setResizable(false);
            enterpriseAdminJTable.getColumnModel().getColumn(1).setResizable(false);
            enterpriseAdminJTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setText("Enterprise Admin List:");

        enterpriseNameJLabel.setText("Enterprise Name: ");

        usernameJLabel.setText("Username:");

        passwordJLabel.setText("Password:");

        firstNameJLabel.setText("First Name:");

        addJButton.setText("Add Enterprise Admin");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lastNameJLabel.setText("Last Name:");

        createJButton.setText("Create");
        createJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 465, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 451, Short.MAX_VALUE)
                .addComponent(createJButton)
                .addGap(215, 215, 215))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(addJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterpriseNameJLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(enterpriseNamejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(firstNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lastNameJLabel)
                                    .addComponent(firstNameJLabel)
                                    .addComponent(passwordJLabel)
                                    .addComponent(usernameJLabel))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(addJButton)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseNameJLabel)
                    .addComponent(enterpriseNamejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameJLabel)
                    .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordJLabel)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameJLabel)
                    .addComponent(firstNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameJLabel)
                    .addComponent(lastNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(createJButton)
                .addGap(0, 74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJButtonActionPerformed
        // TODO add your handling code here:
        Enterprise enterprise = (Enterprise)enterpriseNamejComboBox.getSelectedItem();
        String username = userNameJTextField.getText();
        String password = String.valueOf(PasswordField.getPassword());
        String firstName = firstNameJTextField.getText();
        String lastName = lastNameJTextField.getText();
        
        Person person = enterprise.getPersonDirectory().addPerson();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        for(Network network : business.getNetworkList()){
            for(Enterprise enterprise1 : network.getEnterpriseList().getEnterpriseList()){
        if(enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Hospital){
            UserAccount account = enterprise.getUserAccountDirectory().addUserAccount(username, password, person, new HospitalAdmin());
            //business.getUserAccountDirectory().getUserAccountList().add(account);
        }
        if(enterprise.getEnterpriseType() == Enterprise.EnterpriseType.PrimaryCare){
            UserAccount account = enterprise.getUserAccountDirectory().addUserAccount(username, password, person, new PrimaryCareAdmin());
        }
        if(enterprise.getEnterpriseType() == Enterprise.EnterpriseType.FoundingAMC){
            UserAccount account = enterprise.getUserAccountDirectory().addUserAccount(username, password, person, new FAMCAdmin());
        }
        }
        }
    }//GEN-LAST:event_createJButtonActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        // TODO add your handling code here:
         
        enterpriseNameJLabel.setVisible(true);
        usernameJLabel.setVisible(true);
        passwordJLabel.setVisible(true);
        firstNameJLabel.setVisible(true);
        lastNameJLabel.setVisible(true);
        
        enterpriseNamejComboBox.setVisible(true);
        userNameJTextField.setVisible(true);
        PasswordField.setVisible(true);
        firstNameJTextField.setVisible(true);
        lastNameJTextField.setVisible(true);
        populateEnterpriseCombo();
        
    }//GEN-LAST:event_addJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populateEnterpriseAdminTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void populateEnterpriseCombo(){
        enterpriseNamejComboBox.removeAllItems();
         for(Network network : business.getNetworkList()){
        for(Enterprise enterprise : network.getEnterpriseList().getEnterpriseList() ){
            enterpriseNamejComboBox.addItem(enterprise);
        }
         }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton addJButton;
    private javax.swing.JButton createJButton;
    private javax.swing.JTable enterpriseAdminJTable;
    private javax.swing.JLabel enterpriseNameJLabel;
    private javax.swing.JComboBox enterpriseNamejComboBox;
    private javax.swing.JLabel firstNameJLabel;
    private javax.swing.JTextField firstNameJTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameJLabel;
    private javax.swing.JTextField lastNameJTextField;
    private javax.swing.JLabel passwordJLabel;
    private javax.swing.JTextField userNameJTextField;
    private javax.swing.JLabel usernameJLabel;
    // End of variables declaration//GEN-END:variables
}
