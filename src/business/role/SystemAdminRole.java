/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.role;

import business.Business;
import javax.swing.JPanel;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.useraccount.UserAccount;

/**
 *
 * @author Lydia
 */
public class SystemAdminRole extends Role{

    public SystemAdminRole() {
        super(Role.RoleType.SystemAdmin);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Business business) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
