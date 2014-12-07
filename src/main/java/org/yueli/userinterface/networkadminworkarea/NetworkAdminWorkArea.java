/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.userinterface.networkadminworkarea;

import java.awt.CardLayout;
import javax.swing.JPanel;
import org.yueli.business.Business;
import org.yueli.business.network.Network;
import org.yueli.business.useraccount.UserAccount;
import org.yueli.userinterface.AppEntrance;

/**
 *
 * @author Lydia
 */
public class NetworkAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form NetworkAdminWorkArea
     */
    private JPanel userProcessContainer;
    private Business business;
    private Network network;
    private UserAccount userAccount;
    public NetworkAdminWorkArea() {
        initComponents();
        this.userProcessContainer = AppEntrance.getSlide();
        this.business = AppEntrance.getBusiness();
        this.userAccount = AppEntrance.getLoginUser();
        userAccount.getNetwork();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageEnterpriseJButton = new javax.swing.JButton();
        manageEnterpriseAdminJButton = new javax.swing.JButton();
        manageSupplierJButton = new javax.swing.JButton();

        manageEnterpriseJButton.setText("Manage Enterprise");
        manageEnterpriseJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEnterpriseJButtonActionPerformed(evt);
            }
        });

        manageEnterpriseAdminJButton.setText("Manage Enterprise Admin");
        manageEnterpriseAdminJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEnterpriseAdminJButtonActionPerformed(evt);
            }
        });

        manageSupplierJButton.setText("Manage Supplier");
        manageSupplierJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageSupplierJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageEnterpriseJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageEnterpriseAdminJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageSupplierJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(269, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(manageEnterpriseJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(manageEnterpriseAdminJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(manageSupplierJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageEnterpriseJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEnterpriseJButtonActionPerformed
        // TODO add your handling code here:
        ManageEnterprise manageEnterprise = new ManageEnterprise(userProcessContainer, userAccount ,business, network);
        userProcessContainer.add("Manage Enterprise", manageEnterprise);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageEnterpriseJButtonActionPerformed

    private void manageEnterpriseAdminJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEnterpriseAdminJButtonActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseAdmin manageEnterpriseAdmin = new ManageEnterpriseAdmin(userProcessContainer,userAccount, business);
        userProcessContainer.add("Manage EnterpriseAdmin", manageEnterpriseAdmin);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEnterpriseAdminJButtonActionPerformed

    private void manageSupplierJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageSupplierJButtonActionPerformed
        // TODO add your handling code here:
        ManageSupplier manageSupplier = new ManageSupplier(userProcessContainer, userAccount,network, business);
        userProcessContainer.add("Manage Supplier", manageSupplier);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageSupplierJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton manageEnterpriseAdminJButton;
    private javax.swing.JButton manageEnterpriseJButton;
    private javax.swing.JButton manageSupplierJButton;
    // End of variables declaration//GEN-END:variables
}
