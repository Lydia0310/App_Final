/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.userinterface.networkadminworkarea;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.yueli.business.Business;
import org.yueli.business.enterprise.Enterprise;
import org.yueli.business.network.Network;
import org.yueli.business.organization.Organization;
import org.yueli.business.organization.SupplierDirectory;
import org.yueli.business.organization.SupplierOrganization;
import org.yueli.business.person.Person;
import org.yueli.business.role.SupplierAdmin;
import org.yueli.business.useraccount.UserAccount;

/**
 *
 * @author Lydia
 */
public class ManageSupplier extends javax.swing.JPanel {

    /**
     * Creates new form ManageSupplier
     */
    private JPanel userProcessContainer;
    private Business business;
    private Network network;
    private UserAccount userAccount;
    public ManageSupplier(JPanel userProcessContainer,UserAccount userAccount, Network network, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.userAccount = userAccount;
        this.network = network;
        populateSupplierTable();
    }
    public void populateSupplierTable(){
        DefaultTableModel model = (DefaultTableModel)supplierTable.getModel();
        model.setRowCount(0);
         for(Network network : business.getNetworkList()){
        for(SupplierOrganization so : network.getSupplierDirectory().getSupplierList()){
            for(UserAccount userAccount : so.getUserAccountDirectory().getUserAccountList()){
                Object row[] = new Object[3];
                row[0] = ((SupplierAdmin)userAccount.getRole()).getSupplierID();
                row[1] = ((SupplierAdmin)userAccount.getRole()).getSupplierName();
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
        supplierTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        supplierNameJTextField = new javax.swing.JTextField();
        addJButton = new javax.swing.JButton();
        lastNameJTextField = new javax.swing.JTextField();
        usernameJLabel = new javax.swing.JLabel();
        userNameJTextField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        passwordJLabel = new javax.swing.JLabel();
        firstNameJTextField = new javax.swing.JTextField();
        firstNameJLabel = new javax.swing.JLabel();
        lastNameJLabel = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();

        supplierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SupplierID", "Supplier Name", "User Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(supplierTable);
        if (supplierTable.getColumnModel().getColumnCount() > 0) {
            supplierTable.getColumnModel().getColumn(0).setResizable(false);
            supplierTable.getColumnModel().getColumn(1).setResizable(false);
            supplierTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setText("Supplier Name: ");

        addJButton.setText("Add");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        usernameJLabel.setText("Username:");

        passwordJLabel.setText("Password:");

        firstNameJLabel.setText("First Name:");

        lastNameJLabel.setText("Last Name:");

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lastNameJLabel)
                                .addComponent(firstNameJLabel)
                                .addComponent(passwordJLabel)
                                .addComponent(usernameJLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(supplierNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(firstNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lastNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(116, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addJButton)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(refresh)
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(refresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(supplierNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(addJButton)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        // TODO add your handling code here:
        String supplierName = supplierNameJTextField.getText();
        String username = userNameJTextField.getText();
        String password = String.valueOf(PasswordField.getPassword());
        String firstName = firstNameJTextField.getText();
        String lastName = lastNameJTextField.getText();
         for(Network network : business.getNetworkList()){
        Person person = business.getPersonDirectory().addPerson();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        UserAccount userAccount = business.getUserAccountDirectory().addUserAccount(username, password, person, new SupplierAdmin());
        network.getSupplierDirectory().addSupplier();
        ((SupplierAdmin)userAccount.getRole()).setSupplierName(supplierName);
         }
         populateSupplierTable();
    }//GEN-LAST:event_addJButtonActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        populateSupplierTable();
    }//GEN-LAST:event_refreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton addJButton;
    private javax.swing.JLabel firstNameJLabel;
    private javax.swing.JTextField firstNameJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameJLabel;
    private javax.swing.JTextField lastNameJTextField;
    private javax.swing.JLabel passwordJLabel;
    private javax.swing.JButton refresh;
    private javax.swing.JTextField supplierNameJTextField;
    private javax.swing.JTable supplierTable;
    private javax.swing.JTextField userNameJTextField;
    private javax.swing.JLabel usernameJLabel;
    // End of variables declaration//GEN-END:variables
}
