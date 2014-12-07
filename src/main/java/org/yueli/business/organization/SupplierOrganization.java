/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.organization;

import org.yueli.business.device.DeviceDirectory;

import org.yueli.business.role.Role;
import java.util.ArrayList;
import org.yueli.business.inventory.Inventory;
import org.yueli.business.role.SupplierAdmin;


/**
 *
 * @author Lydia
 */
public class SupplierOrganization extends Organization{

    private Inventory inventory;
    
    public SupplierOrganization(){
        super(Type.Supplier.getValue());
        inventory = new Inventory();
    }
    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SupplierAdmin());
        return roles;
    }
    
}
