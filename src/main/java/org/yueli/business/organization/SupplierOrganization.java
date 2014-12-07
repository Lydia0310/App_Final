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
    private DeviceDirectory deviceCatalog;
    private String supplierID;
    private String supplierName;
    private static int count = 0;
    
    public SupplierOrganization(){
        super(Type.Supplier.getValue());
        inventory = new Inventory();
        deviceCatalog = new DeviceDirectory();
        count++;
        supplierID = String.valueOf(count);
    }

    public DeviceDirectory getDeviceCatalog() {
        return deviceCatalog;
    }

    public void setDeviceCatalog(DeviceDirectory deviceCatalog) {
        this.deviceCatalog = deviceCatalog;
    }

    
    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SupplierAdmin());
        return roles;
    }
    public String toString(){
        return supplierID;
    }
}
