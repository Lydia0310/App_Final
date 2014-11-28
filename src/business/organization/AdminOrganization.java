/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.organization;

import business.role.Role;
import business.role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Lydia
 */
public class AdminOrganization extends Organization{
    public AdminOrganization(){
        super(Type.SysAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRoles() {
       ArrayList<Role> roles = new ArrayList<Role>();
       roles.add(new SystemAdminRole());
       return roles;
    }
}
