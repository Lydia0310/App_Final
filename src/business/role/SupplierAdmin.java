/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.role;

import business.Business;
import business.enterprise.Enterprise;
import business.function.Function;
import business.organization.Organization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Lydia
 */
public class SupplierAdmin extends Role{

    public SupplierAdmin(){
        super(Role.RoleType.SupplierAdmin);
        
        privilegeList.add(new Function("Manage Device","ManageDevice"));
        privilegeList.add(new Function("View Device Dispatching Request","ViewDeviceRequest"));
        privilegeList.add(new Function("View Order","ViewOrder"));
        
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Business business) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    
}
