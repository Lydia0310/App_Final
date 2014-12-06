/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.userinterface.operationroomadminworkarea;


import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.yueli.business.Business;
import org.yueli.business.enterprise.Enterprise;
import org.yueli.business.network.Network;
import org.yueli.business.room.OperationRoom;
import org.yueli.business.room.Room;
import org.yueli.business.useraccount.UserAccount;

/**
 *
 * @author Lydia
 */
public class ManageOperationRoom extends javax.swing.JPanel {

    /**
     * Creates new form ManageOperationRoom
     */
    private JPanel userProcessContainer;
    private Business business;
    private Network network;
    private Enterprise enterprise;
    private UserAccount userAccount;
    public ManageOperationRoom(JPanel userProcessContainer, Business business, Network network, Enterprise enterprise, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.network = network;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        populateOperationRoomTable();
    }
    public void populateOperationRoomTable(){
        DefaultTableModel model = (DefaultTableModel)operationRoomTable.getModel();
        model.setRowCount(0);
        for(Room room : enterprise.getRoomList().getRoomList()){
            if(room.getType().equals(Room.RoomType.OperationRoom)){
                Object row[] = new Object[1];
                row[0] = ((OperationRoom)room).getOperationRoomNumber();
                model.addRow(row);
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
        operationRoomTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        operationRoomNumberJTextField = new javax.swing.JTextField();
        createJButton = new javax.swing.JButton();

        operationRoomTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Operation Room Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(operationRoomTable);
        if (operationRoomTable.getColumnModel().getColumnCount() > 0) {
            operationRoomTable.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel1.setText("Operation Room Number:");

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
                .addGap(216, 216, 216)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(operationRoomNumberJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(createJButton)
                        .addGap(167, 167, 167))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(operationRoomNumberJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(createJButton)
                .addContainerGap(189, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJButtonActionPerformed
        // TODO add your handling code here:
        String operationRoomNumber = operationRoomNumberJTextField.getText();
        Room room = enterprise.getRoomList().addRoom(operationRoomNumber, Room.RoomType.OperationRoom);
        populateOperationRoomTable();
    }//GEN-LAST:event_createJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField operationRoomNumberJTextField;
    private javax.swing.JTable operationRoomTable;
    // End of variables declaration//GEN-END:variables
}
