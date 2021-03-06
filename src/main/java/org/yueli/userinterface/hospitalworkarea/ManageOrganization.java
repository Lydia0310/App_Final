/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.userinterface.hospitalworkarea;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import org.yueli.business.Business;
import org.yueli.business.enterprise.Enterprise;
import org.yueli.business.network.Network;
import org.yueli.business.organization.Organization;
import org.yueli.business.organization.Organization.Type;
import org.yueli.business.organization.OrganizationDirectory;

/**
 * @author Lydia
 */
public class ManageOrganization extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganization
     */

    private JPanel userProcessContainer;
    private Business business;
    private Network network;
    private Enterprise enterprise;
    private OrganizationDirectory organizationDirectory;

    public ManageOrganization(JPanel userProcessContainer, Business business, OrganizationDirectory organizationDirectory, Network network, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.network = network;
        this.enterprise = enterprise;
        this.organizationDirectory = organizationDirectory;
        populateOrganizationCombo();
        populateOrganizationTable();
    }

    public void populateOrganizationCombo() {
        organizationCombo.removeAllItems();
        organizationCombo.addItem(Organization.Type.Doctor);
        organizationCombo.addItem(Organization.Type.CareTeam);
        organizationCombo.addItem(Organization.Type.OperationRoomAdmin);
        organizationCombo.addItem(Organization.Type.Warehouse);
//        for(Type type : Organization.Type.values()){
//            
//            if(!((type.getValue().equals(Type.SysAdmin.getValue()))&&(type.getValue().equals(Type.Supplier.getValue())))){
//                organizationCombo.addItem(type);
//            }
//        }
    }

    public void populateOrganizationTable() {
        DefaultTableModel model = (DefaultTableModel) organizationTable.getModel();
        model.setRowCount(0);
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getName();
            model.addRow(row);
            populateOrganizationCombo();

        }
//        for(Organization organization : organizationDirectory.getOrganizationList()){
//             Object[] row = new Object [2];
//                    row[0] = organization.getOrganizationID();
//                    row[1] = organization.getName();
//                    model.addRow(row);
//                    populateOrganizationCombo();
//        }
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
        organizationTable = new javax.swing.JTable();
        organizationCombo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        addJButton = new javax.swing.JButton();

        organizationTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Organization ID", "Organization Name"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                    false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationTable);
        if (organizationTable.getColumnModel().getColumnCount() > 0) {
            organizationTable.getColumnModel().getColumn(0).setResizable(false);
            organizationTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setText("Organization Type:");

        addJButton.setText("Add");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(39, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(41, 41, 41)
                                                .addComponent(organizationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(185, 185, 185))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(addJButton)
                                                .addGap(76, 76, 76))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(organizationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addComponent(addJButton)
                                .addContainerGap(143, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        // TODO add your handling code here:
        Type type = (Type) organizationCombo.getSelectedItem();
        enterprise.getOrganizationDirectory().addOrganization(type);

        //  organizationDirectory.addOrganization(type);


        populateOrganizationTable();
    }//GEN-LAST:event_addJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationCombo;
    private javax.swing.JTable organizationTable;
    // End of variables declaration//GEN-END:variables
}
