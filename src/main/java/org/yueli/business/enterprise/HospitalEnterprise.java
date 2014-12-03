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
import org.yueli.business.inventory.Inventory;


/**
 *
 * @author Lydia
 */
public class HospitalEnterprise extends Enterprise {

    private RoomDirectory roomList;
    private OperationDirectory operationList;
    private Inventory inventory;
    
    public HospitalEnterprise(String name){
        super(name, EnterpriseType.Hospital);
        roomList = new RoomDirectory();
        operationList = new OperationDirectory();
        inventory = new Inventory();
    }

    public RoomDirectory getRoomList() {
        return roomList;
    }

    public OperationDirectory getOperationList() {
        return operationList;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRoles() {
       return null; 
    }
    
}
