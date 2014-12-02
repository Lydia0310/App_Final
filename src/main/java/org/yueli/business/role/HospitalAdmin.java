/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.role;

import  org.yueli.business.Business;
import org.yueli.business.enterprise.Enterprise;
import org.yueli.business.function.Function;
import org.yueli.business.organization.Organization;
import org.yueli.business.useraccount.UserAccount;
import javax.swing.JPanel;
import org.yueli.business.inventory.Inventory;
import org.yueli.business.network.Network;
import org.yueli.userinterface.hospitalworkarea.HospitalWorkArea;

/**
 *
 * @author Lydia
 */
public class HospitalAdmin extends Role{

    private String hospitalID;
    private static int count =0;
    private Inventory inventory;
            
    public HospitalAdmin(){
        super(Role.RoleType.HospitalAdmin);
        privilegeList.add(new Function("Hospital Work Area","org.yueli.userinterface.hospitalworkarea.HospitalWorkArea"));
        count++;
        hospitalID = String.valueOf(count);
    }

    public String getHospitalID() {
        return hospitalID;
    }

    public void setHospitalID(String hospitalID) {
        this.hospitalID = hospitalID;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Network network, Business business) {
        return new HospitalWorkArea();
    }

    
    

   
    
}
