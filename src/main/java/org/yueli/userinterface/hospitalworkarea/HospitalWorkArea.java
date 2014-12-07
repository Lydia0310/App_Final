/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.userinterface.hospitalworkarea;

import java.awt.CardLayout;
import javax.swing.JPanel;
import org.yueli.business.Business;
import org.yueli.business.enterprise.Enterprise;
import org.yueli.business.network.Network;
import org.yueli.business.organization.Organization;
import org.yueli.business.useraccount.UserAccount;
import org.yueli.userinterface.AppEntrance;

/**
 *
 * @author Lydia
 */
public class HospitalWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form HospitalWorkArea
     */
    private JPanel userProcessContainer;
    private Business business;
    private Network network;
    private Enterprise enterprise;
    private Organization organization;
    private UserAccount userAccount;
    
    public HospitalWorkArea() {
        initComponents();
        this.userProcessContainer = AppEntrance.getSlide();
        this.business = AppEntrance.getBusiness();
        this.userAccount = AppEntrance.getLoginUser();
        network = userAccount.getNetwork();
        enterprise = userAccount.getEnterprise();
        organization = userAccount.getOrganization();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewDeviceInventoryJButton = new javax.swing.JButton();
        viewOrderJButton = new javax.swing.JButton();
        browserDeviceJButton = new javax.swing.JButton();
        viewDeviceRequestJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        manageUserAccountJButton = new javax.swing.JButton();
        viewDeviceRequestJButton1 = new javax.swing.JButton();

        viewDeviceInventoryJButton.setText("View Device Inventory");
        viewDeviceInventoryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDeviceInventoryJButtonActionPerformed(evt);
            }
        });

        viewOrderJButton.setText("View Device Order ");
        viewOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderJButtonActionPerformed(evt);
            }
        });

        browserDeviceJButton.setText("Browser Device List");
        browserDeviceJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browserDeviceJButtonActionPerformed(evt);
            }
        });

        viewDeviceRequestJButton.setText("View Device Request");
        viewDeviceRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDeviceRequestJButtonActionPerformed(evt);
            }
        });

        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });

        manageUserAccountJButton.setText("Manage User Account");
        manageUserAccountJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserAccountJButtonActionPerformed(evt);
            }
        });

        viewDeviceRequestJButton1.setText("View Operation Request");
        viewDeviceRequestJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDeviceRequestJButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewOrderJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(manageUserAccountJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewDeviceInventoryJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                        .addComponent(browserDeviceJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewDeviceRequestJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(manageOrganizationJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewDeviceRequestJButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 262, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(manageOrganizationJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(manageUserAccountJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(viewDeviceInventoryJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(browserDeviceJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(viewOrderJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(viewDeviceRequestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(viewDeviceRequestJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewDeviceInventoryJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDeviceInventoryJButtonActionPerformed
        // TODO add your handling code here:
        ViewDeviceInventory viewDeviceInventory = new ViewDeviceInventory(userProcessContainer,network,userAccount, business);
        userProcessContainer.add("View Device Inventory", viewDeviceInventory);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewDeviceInventoryJButtonActionPerformed

    private void browserDeviceJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browserDeviceJButtonActionPerformed
        // TODO add your handling code here:
        BrowserDevice browserDevice = new BrowserDevice(userProcessContainer, business.getMasterOrderDirectory(), userAccount, business, network, organization);
        userProcessContainer.add("Browser Device", browserDevice);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_browserDeviceJButtonActionPerformed

    private void viewOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderJButtonActionPerformed
        // TODO add your handling code here
        ViewOrder viewOrder = new ViewOrder(userProcessContainer, business.getMasterOrderDirectory(), userAccount);
        userProcessContainer.add("View Order", viewOrder);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewOrderJButtonActionPerformed

    private void viewDeviceRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDeviceRequestJButtonActionPerformed
        // TODO add your handling code here:
        ViewDeviceRequest viewDeviceRequest = new ViewDeviceRequest(userProcessContainer, business, userAccount);
        userProcessContainer.add("View Device Request", viewDeviceRequest);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewDeviceRequestJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed
        // TODO add your handling code here:
        ManageOrganization manageOrganization = new ManageOrganization(userProcessContainer,business,enterprise.getOrganizationDirectory(),network,enterprise);
        userProcessContainer.add("Manage Organization", manageOrganization);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void manageUserAccountJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserAccountJButtonActionPerformed
        // TODO add your handling code here:
        ManageUserAccount manageUserAccount = new ManageUserAccount(userProcessContainer, business,network,enterprise, userAccount);
        userProcessContainer.add("Manage User Account", manageUserAccount);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageUserAccountJButtonActionPerformed

    private void viewDeviceRequestJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDeviceRequestJButton1ActionPerformed
        // TODO add your handling code here:
        ViewDeviceRequest viewDeviceRequest = new ViewDeviceRequest(userProcessContainer, business, userAccount);
        userProcessContainer.add("View Device Request", viewDeviceRequest);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewDeviceRequestJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browserDeviceJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton manageUserAccountJButton;
    private javax.swing.JButton viewDeviceInventoryJButton;
    private javax.swing.JButton viewDeviceRequestJButton;
    private javax.swing.JButton viewDeviceRequestJButton1;
    private javax.swing.JButton viewOrderJButton;
    // End of variables declaration//GEN-END:variables
}
