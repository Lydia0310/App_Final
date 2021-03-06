/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.userinterface.operationroomadminworkarea;

import java.awt.CardLayout;
import javax.swing.JPanel;
import org.yueli.business.Business;
import org.yueli.business.enterprise.Enterprise;
import org.yueli.business.network.Network;
import org.yueli.business.useraccount.UserAccount;
import org.yueli.userinterface.AppEntrance;

/**
 *
 * @author Lydia
 */
public class OperationRoomAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form OperationRoomAdminWorkArea
     */
    private JPanel userProcessContainer;
    private Business business;
    private Network network;
    private Enterprise enterprise;
    private UserAccount userAccount;
    public OperationRoomAdminWorkArea() {
        initComponents();
        this.userProcessContainer = AppEntrance.getSlide();
        this.business = AppEntrance.getBusiness();
        this.userAccount = AppEntrance.getLoginUser();
        this.network = userAccount.getNetwork();
        this.enterprise = userAccount.getEnterprise();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageOperationRoomJButton = new javax.swing.JButton();
        viewOperationRoomRequestJButton = new javax.swing.JButton();
        manageOperationRoomScheduleJButton = new javax.swing.JButton();

        manageOperationRoomJButton.setText("Manage Operation Room");
        manageOperationRoomJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOperationRoomJButtonActionPerformed(evt);
            }
        });

        viewOperationRoomRequestJButton.setText("View Operation Room Request");
        viewOperationRoomRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOperationRoomRequestJButtonActionPerformed(evt);
            }
        });

        manageOperationRoomScheduleJButton.setText("Manage Operation Room Schedule");
        manageOperationRoomScheduleJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOperationRoomScheduleJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageOperationRoomScheduleJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewOperationRoomRequestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageOperationRoomJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(manageOperationRoomJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(manageOperationRoomScheduleJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(viewOperationRoomRequestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageOperationRoomScheduleJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOperationRoomScheduleJButtonActionPerformed
        // TODO add your handling code here:
        ManageOperationRoomSchedule manageOperationRoomSchedule = new ManageOperationRoomSchedule(userProcessContainer, business, network, enterprise, userAccount);
        userProcessContainer.add("Manage Operation Room Schedule", manageOperationRoomSchedule);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOperationRoomScheduleJButtonActionPerformed

    private void manageOperationRoomJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOperationRoomJButtonActionPerformed
        // TODO add your handling code here:
        ManageOperationRoom manageOperationRoom = new ManageOperationRoom(userProcessContainer, business, network, enterprise, userAccount);
        userProcessContainer.add("Manage Operation Room", manageOperationRoom);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOperationRoomJButtonActionPerformed

    private void viewOperationRoomRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOperationRoomRequestJButtonActionPerformed
        // TODO add your handling code here:
        ViewOperationRoomRequest viewOperationRoomRequest = new ViewOperationRoomRequest(userProcessContainer, business, network, enterprise, userAccount);
        userProcessContainer.add("View Operation Room Request", viewOperationRoomRequest);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewOperationRoomRequestJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton manageOperationRoomJButton;
    private javax.swing.JButton manageOperationRoomScheduleJButton;
    private javax.swing.JButton viewOperationRoomRequestJButton;
    // End of variables declaration//GEN-END:variables
}
