/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.userinterface.doctorworkarea;

import javax.swing.JPanel;
import org.yueli.business.Business;
import org.yueli.business.enterprise.Enterprise;
import org.yueli.business.network.Network;
import org.yueli.business.role.DoctorRole;
import org.yueli.business.schedule.Schedule;
import org.yueli.business.useraccount.UserAccount;

/**
 *
 * @author Lydia
 */
public class ManageDoctorSchedule extends javax.swing.JPanel {

    /**
     * Creates new form ManageDocorSchedule
     */
    private JPanel userProcessContainer;
    private Business business;
    private Network network;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Schedule schedule;
    public ManageDoctorSchedule() {
        initComponents();
        
        doctorNameJLabel.setText(userAccount.getPerson().getFirstName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        doctorNameJLabel = new javax.swing.JLabel();
        dateJLabel = new javax.swing.JLabel();
        beginningTimeJLabel = new javax.swing.JLabel();
        endTimeJLabel = new javax.swing.JLabel();
        yearJTextField = new javax.swing.JTextField();
        dashJLabel = new javax.swing.JLabel();
        monthJTextField = new javax.swing.JTextField();
        dashJLabel1 = new javax.swing.JLabel();
        dateJTextField = new javax.swing.JTextField();
        formateJLabel = new javax.swing.JLabel();
        hourJTextField = new javax.swing.JTextField();
        minuteJTextField = new javax.swing.JTextField();
        secondJTextField = new javax.swing.JTextField();
        colonJLabel1 = new javax.swing.JLabel();
        colonJLabel = new javax.swing.JLabel();
        beginningTimeFormateJLabel = new javax.swing.JLabel();
        endTimeFormateJLabel = new javax.swing.JLabel();
        hourJTextField1 = new javax.swing.JTextField();
        minuteJTextField1 = new javax.swing.JTextField();
        secondjTextField1 = new javax.swing.JTextField();
        colonJLabel3 = new javax.swing.JLabel();
        colonJLabel2 = new javax.swing.JLabel();
        doneJButton = new javax.swing.JButton();

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Doctor Name:");

        doctorNameJLabel.setText("jLabel2");

        dateJLabel.setText("Date:");

        beginningTimeJLabel.setText("Beginning Time:");

        endTimeJLabel.setText("End Time:");

        dashJLabel.setText("-");

        monthJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthJTextFieldActionPerformed(evt);
            }
        });

        dashJLabel1.setText("-");

        formateJLabel.setText("(YYYY-MM-DD)");

        colonJLabel1.setText(":");

        colonJLabel.setText(":");

        beginningTimeFormateJLabel.setText("(hh:mm:ss)");

        endTimeFormateJLabel.setText("(hh:mm:ss)");

        colonJLabel3.setText(":");

        colonJLabel2.setText(":");

        doneJButton.setText("Done");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(beginningTimeJLabel)
                    .addComponent(dateJLabel)
                    .addComponent(endTimeJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(yearJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dashJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monthJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dashJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(formateJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hourJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(colonJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minuteJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(colonJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(secondJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(beginningTimeFormateJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hourJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(colonJLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minuteJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(colonJLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(secondjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(endTimeFormateJLabel)))
                .addGap(229, 229, 229))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(165, 539, Short.MAX_VALUE)
                .addComponent(doneJButton)
                .addGap(157, 157, 157))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(doctorNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorNameJLabel))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateJLabel)
                    .addComponent(yearJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dashJLabel)
                    .addComponent(monthJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dashJLabel1)
                    .addComponent(dateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formateJLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(beginningTimeJLabel)
                    .addComponent(hourJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minuteJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secondJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colonJLabel)
                    .addComponent(colonJLabel1)
                    .addComponent(beginningTimeFormateJLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endTimeJLabel)
                    .addComponent(hourJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minuteJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secondjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colonJLabel2)
                    .addComponent(colonJLabel3)
                    .addComponent(endTimeFormateJLabel))
                .addGap(18, 18, 18)
                .addComponent(doneJButton)
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void monthJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthJTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel beginningTimeFormateJLabel;
    private javax.swing.JLabel beginningTimeJLabel;
    private javax.swing.JLabel colonJLabel;
    private javax.swing.JLabel colonJLabel1;
    private javax.swing.JLabel colonJLabel2;
    private javax.swing.JLabel colonJLabel3;
    private javax.swing.JLabel dashJLabel;
    private javax.swing.JLabel dashJLabel1;
    private javax.swing.JLabel dateJLabel;
    private javax.swing.JTextField dateJTextField;
    private javax.swing.JLabel doctorNameJLabel;
    private javax.swing.JButton doneJButton;
    private javax.swing.JLabel endTimeFormateJLabel;
    private javax.swing.JLabel endTimeJLabel;
    private javax.swing.JLabel formateJLabel;
    private javax.swing.JTextField hourJTextField;
    private javax.swing.JTextField hourJTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField minuteJTextField;
    private javax.swing.JTextField minuteJTextField1;
    private javax.swing.JTextField monthJTextField;
    private javax.swing.JTextField secondJTextField;
    private javax.swing.JTextField secondjTextField1;
    private javax.swing.JTextField yearJTextField;
    // End of variables declaration//GEN-END:variables
}
