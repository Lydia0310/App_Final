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
import  org.yueli.userinterface.supplierworkarea.SupplierWorkArea;

/**
 *
 * @author Lydia
 */
public class SupplierAdmin extends Role {

    public SupplierAdmin(){
        super(Role.RoleType.SupplierAdmin);
        
        privilegeList.add(new Function("Manage Device","userinterface.supplierworkarea.ManageDevice"));
        privilegeList.add(new Function("View Device Dispatching Request","userinterface.supplierworkarea.ViewDeviceRequest"));
        privilegeList.add(new Function("View Order","userinterface.supplierworkarea.ViewOrder"));
        
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Business business) {
        return new SupplierWorkArea(); //To change body of generated methods, choose Tools | Templates.
    }
  
    
}
