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
import org.yueli.business.inventory.Inventory;
import org.yueli.business.network.Network;
import org.yueli.business.organization.Organization;
import org.yueli.business.useraccount.UserAccount;
import org.yueli.userinterface.famcworkarea.FAMCAdminWorkArea;

/**
 *
 * @author Lydia
 */
public class FAMCAdmin extends Role{

    private String famcID;
    private static int count = 0;
    private Inventory inventory;
    public FAMCAdmin() {
        super(Role.RoleType.FAMCAdmin);
        count++;
        famcID = String.valueOf(count);
        inventory = new Inventory();
        privilegeList.add(new Function(3, "Funding Academic Medical Center Admin Work Area", FAMCAdminWorkArea.class));
                
    }

    public String getFamcID() {
        return famcID;
    }

    public void setFamcID(String famcID) {
        this.famcID = famcID;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Network network, Business business) {
       return new FAMCAdminWorkArea();
    }


    
}
