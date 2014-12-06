/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.role;

import javax.swing.JPanel;
import org.yueli.business.Business;
import org.yueli.business.enterprise.Enterprise;
import org.yueli.business.function.Function;
import org.yueli.business.network.Network;
import org.yueli.business.organization.Organization;
import org.yueli.business.room.RoomDirectory;
import org.yueli.business.useraccount.UserAccount;
import org.yueli.userinterface.operationroomadminworkarea.OperationRoomAdminWorkArea;

/**
 *
 * @author Lydia
 */
public class OperationRoomAdmin extends Role{
    private RoomDirectory roomList;
    
    public OperationRoomAdmin() {
        super(Role.RoleType.OperationRoomAdmin);
        privilegeList.add(new Function(9, "Operation Room Admin Work Area", OperationRoomAdminWorkArea.class));
        roomList = new RoomDirectory();
    }

    public RoomDirectory getRoomList() {
        return roomList;
    }

    public void setRoomList(RoomDirectory roomList) {
        this.roomList = roomList;
    }

    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Network network, Business business) {
        return new OperationRoomAdminWorkArea(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
