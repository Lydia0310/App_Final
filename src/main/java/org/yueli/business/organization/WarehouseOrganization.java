/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.organization;

import org.yueli.business.role.Role;
import org.yueli.business.role.WarehouseAdmin;
import java.util.ArrayList;




/**
 *
 * @author Lydia
 */
public class WarehouseOrganization extends Organization{
    public WarehouseOrganization(){
        super(Type.Warehouse.getValue());
    }

   

    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new WarehouseAdmin());
        return roles;
    }
}
