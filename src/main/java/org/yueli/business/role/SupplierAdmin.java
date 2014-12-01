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
import  org.yueli.userinterface.supplierworkarea.SupplierWorkArea;

/**
 *
 * @author Lydia
 */
public class SupplierAdmin extends Role {

    private DeviceDirectory deviceCatalog;
    private String supplierID;
    private static int count = 0;
    
    public SupplierAdmin(){
        super(Role.RoleType.SupplierAdmin);
        
        count++;
        supplierID = String.valueOf(count);
        deviceCatalog = new DeviceDirectory();
        
        privilegeList.add(new Function("Supplier Work Area","org.yueli.userinterface.supplierworkarea.SupplierWorkArea"));
        
        
    }

    public DeviceDirectory getDeviceCatalog() {
        return deviceCatalog;
    }

    public void setDeviceCatalog(DeviceDirectory deviceCatalog) {
        this.deviceCatalog = deviceCatalog;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }
    
    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Business business) {
        return new SupplierWorkArea(); //To change body of generated methods, choose Tools | Templates.
    }
  
    
}
