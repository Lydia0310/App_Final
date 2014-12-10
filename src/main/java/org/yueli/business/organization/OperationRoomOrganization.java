/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yueli.business.organization;

import java.util.ArrayList;
import org.yueli.business.role.OperationRoomAdmin;
import org.yueli.business.role.Role;
import org.yueli.business.role.WarehouseAdmin;
import org.yueli.business.room.RoomDirectory;

/**
 *
 * @author Lydia
 */
public class OperationRoomOrganization extends Organization{

    private RoomDirectory roomDirectory;
    
    public OperationRoomOrganization() {
        super(Type.OperationRoomAdmin.getValue());
        roomDirectory = new RoomDirectory();
    }

    public RoomDirectory getRoomDirectory() {
        return roomDirectory;
    }

    public void setRoomDirectory(RoomDirectory roomDirectory) {
        this.roomDirectory = roomDirectory;
    }

    
    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new OperationRoomAdmin());
        return roles;
    }
    
}
