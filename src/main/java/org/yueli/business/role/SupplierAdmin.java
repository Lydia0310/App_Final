/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.role;

import org.yueli.business.Business;
import org.yueli.business.enterprise.Enterprise;
import org.yueli.business.function.Function;
import org.yueli.business.organization.Organization;
import org.yueli.business.useraccount.UserAccount;

import javax.swing.JPanel;
import org.yueli.business.device.DeviceDirectory;
import org.yueli.business.inventory.Inventory;
import org.yueli.business.network.Network;
import  org.yueli.userinterface.supplierworkarea.SupplierWorkArea;

/**
 *
 * @author Lydia
 */
public class SupplierAdmin extends Role {

//    private DeviceDirectory deviceCatalog;
//    private Inventory inventory;
    
    
    public SupplierAdmin(){
        super(Role.RoleType.SupplierAdmin);
        
       
//        inventory = new Inventory();
//        deviceCatalog = new DeviceDirectory();
        
        privilegeList.add(new Function(5, "Supplier Work Area",SupplierWorkArea.class));
        
        
    }

//    public Inventory getInventory() {
//        return inventory;
//    }
//
//    public void setInventory(Inventory inventory) {
//        this.inventory = inventory;
//    }
//
//    
//    public DeviceDirectory getDeviceCatalog() {
//        return deviceCatalog;
//    }
//
//    public void setDeviceCatalog(DeviceDirectory deviceCatalog) {
//        this.deviceCatalog = deviceCatalog;
//    }

   
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Network network, Business business) {
         return new SupplierWorkArea();//To change body of generated methods, choose Tools | Templates.
    }
    
    


    
}
