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
import org.yueli.userinterface.primarycareworkarea.PrimaryCareWorkArea;

/**
 *
 * @author Lydia
 */
public class PrimaryCareAdmin extends Role{

    private String primaryCareID;
    private static int count = 0;
    private Inventory inventory;
    
    public PrimaryCareAdmin() {
        super(Role.RoleType.PrimaryCareAdmin);
        count++;
        primaryCareID = String.valueOf(count);
        privilegeList.add(new Function("Primary Care Admin Work Area", "org.yueli.userinterface.primarycareworkarea.PrimaryCareWorkArea"));
    }

    public String getPrimaryCareID() {
        return primaryCareID;
    }

    public void setPrimaryCareID(String primaryCareID) {
        this.primaryCareID = primaryCareID;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Network network, Business business) {
         return new PrimaryCareWorkArea(userProcessContainer,business,network,userAccount);
    }

    

    
}
