/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.enterprise;

import java.util.ArrayList;
import org.yueli.business.inventory.Inventory;
import org.yueli.business.role.PrimaryCareAdmin;
import org.yueli.business.role.Role;

/**
 *
 * @author Lydia
 */
public class PrimaryCare extends Enterprise{

    private Inventory inventory;
    
    public PrimaryCare(String name) {
        super(name, EnterpriseType.PrimaryCare);
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
         ArrayList<Role> roles = new ArrayList();
        roles.add(new PrimaryCareAdmin());
        return roles;
    }
    
}
