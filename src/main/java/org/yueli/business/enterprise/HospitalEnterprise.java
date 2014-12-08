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
import org.yueli.business.careteam.CareTeamDirectory;
import org.yueli.business.inventory.Inventory;

import org.yueli.business.organization.DoctorDirectory;
import org.yueli.business.role.HospitalAdmin;


/**
 *
 * @author Lydia
 */
public class HospitalEnterprise extends Enterprise {

    private RoomDirectory roomList;
    private OperationDirectory operationList;
    private Inventory inventory;
    private DoctorDirectory doctorList;
    private CareTeamDirectory careTeamDirectory;
    
    
    public HospitalEnterprise(String name){
        super(name, EnterpriseType.Hospital);
        roomList = new RoomDirectory();
        operationList = new OperationDirectory();
        inventory = new Inventory();
        careTeamDirectory = new CareTeamDirectory();
    }

    public CareTeamDirectory getCareTeamDirectory() {
        return careTeamDirectory;
    }

    public void setCareTeamDirectory(CareTeamDirectory careTeamDirectory) {
        this.careTeamDirectory = careTeamDirectory;
    }

    
    public RoomDirectory getRoomDirectory() {
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

    public DoctorDirectory getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(DoctorDirectory doctorList) {
        this.doctorList = doctorList;
    }


    
    
    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HospitalAdmin());
        return roles;
    }
    
}
