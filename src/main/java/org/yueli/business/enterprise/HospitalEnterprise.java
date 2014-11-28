/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.enterprise;

import org.yueli.business.operation.OperationDirectory;
import  org.yueli.business.role.Role;
import org.yueli.business.room.RoomDirectory;
import org.yueli.business.enterprise.Enterprise;

import java.util.ArrayList;


/**
 *
 * @author Lydia
 */
public class HospitalEnterprise extends Enterprise {

    private RoomDirectory roomList;
    private OperationDirectory operationList;
    
    public HospitalEnterprise(String name){
        super(name, EnterpriseType.Hospital);
    }

    public RoomDirectory getRoomList() {
        return roomList;
    }

    public OperationDirectory getOperationList() {
        return operationList;
    }
    
    @Override
    public ArrayList<Role> getSupportedRoles() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
