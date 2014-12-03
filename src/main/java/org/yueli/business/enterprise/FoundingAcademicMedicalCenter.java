/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.enterprise;

import java.util.ArrayList;
import javax.swing.JPanel;
import org.yueli.business.Business;
import org.yueli.business.inventory.Inventory;
import org.yueli.business.network.Network;
import org.yueli.business.role.Role;
import org.yueli.business.useraccount.UserAccount;
import org.yueli.userinterface.famcworkarea.FAMCAdminWorkArea;

/**
 *
 * @author Lydia
 */
public class FoundingAcademicMedicalCenter extends Enterprise{

    private Inventory inventory;
    public FoundingAcademicMedicalCenter(String name) {
        super(name,EnterpriseType.FoundingAMC);
        inventory = new Inventory();
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
