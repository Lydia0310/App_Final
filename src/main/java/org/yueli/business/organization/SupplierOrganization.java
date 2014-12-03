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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
